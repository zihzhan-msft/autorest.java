package com.azure.autorest.template.llc;

import com.azure.autorest.extension.base.model.codemodel.RequestParameterLocation;
import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.model.clientmodel.AsyncSyncClient;
import com.azure.autorest.model.clientmodel.ClientMethod;
import com.azure.autorest.model.clientmodel.ListType;
import com.azure.autorest.model.clientmodel.ProxyMethodParameter;
import com.azure.autorest.model.clientmodel.ServiceClientProperty;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.model.javamodel.JavaVisibility;
import com.azure.autorest.template.IJavaTemplate;
import com.azure.autorest.template.Templates;
import com.azure.autorest.util.ClientModelUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Template to create a synchronous client.
 */
public class LowLevelClientTemplate implements IJavaTemplate<AsyncSyncClient, JavaFile>  {

    private static LowLevelClientTemplate _instance = new LowLevelClientTemplate();
    private LowLevelClientTemplate() {
    }

    public static LowLevelClientTemplate getInstance() {
      return _instance;
    }

    @Override
    public final void write(AsyncSyncClient client, JavaFile javaFile) {
        Set<String> imports = new HashSet<>();
        client.getServiceClient().addImportsTo(imports, true, false, JavaSettings.getInstance());
        imports.add(client.getServiceClient().getPackage() + "." + client.getServiceClient().getClassName());
        if (client.getMethodGroupClient() != null) {
            client.getMethodGroupClient().addImportsTo(imports, true, JavaSettings.getInstance());
            imports.add(client.getMethodGroupClient().getPackage() + "." + client.getMethodGroupClient().getClassName());
        }
        imports.add("com.azure.core.annotation.ServiceClient");

        javaFile.declareImport(imports);
        javaFile.javadocComment(comment ->
            comment.description(String.format("Initializes a new instance of the %1$s type.",
                client.getClassName())));

        javaFile.annotation(String.format("ServiceClient(builder = %s.class)", client.getServiceClient().getInterfaceName() + ClientModelUtil.getBuilderSuffix()));
        javaFile.publicFinalClass(client.getClassName(), classBlock -> {

            for (ServiceClientProperty property : client.getServiceClient().getProperties()) {
                classBlock.privateFinalMemberVariable(property.getType().toString(), property.getName());
            }

            // Service Client Constructor
            classBlock.javadocComment(comment -> {
                comment.description(String.format("Initializes an instance of %1$s client.", client.getClassName()));
                    for (ServiceClientProperty property : client.getServiceClient().getProperties()) {
                        comment.param(property.getName(), property.getDescription());
                    }
            });

            String constructorArgs = client.getServiceClient().getProperties().stream()
                    .map(p -> p.getType() + " " + p.getName())
                    .collect(Collectors.joining(", "));

            classBlock.constructor(JavaVisibility.PackagePrivate,
                    client.getClassName() + "(" + constructorArgs + ")",
                    constructor -> {
                for (ServiceClientProperty property : client.getServiceClient().getProperties()) {
                    constructor.line("this.%1$s = %1$s;", property.getName());
                }
            });

            List<ClientMethod> methods;
            if (client.getMethodGroupClient() != null) {
                methods = client.getMethodGroupClient().getClientMethods();
            } else {
                methods = client.getServiceClient().getClientMethods();
            }
            for (ClientMethod method : methods) {
                Templates.getLlcMethodTemplate().write(method, classBlock);
            }

            if (methods.stream().flatMap(m -> m.getProxyMethod().getParameters().stream())
                    .filter(ProxyMethodParameter::getIsRequired)
                    .filter(p -> p.getRequestParameterLocation() == RequestParameterLocation.Query
                            || p.getRequestParameterLocation() == RequestParameterLocation.Path
                            || p.getRequestParameterLocation() == RequestParameterLocation.Header)
                    .anyMatch(p -> p.getClientType() instanceof ListType)) {
                classBlock.privateMethod("String serializeIterable(Iterable<?> iterable, CollectionFormat format)", methodBlock -> {
                    methodBlock.ifBlock("iterable == null", ifBlock -> {
                        ifBlock.methodReturn("null");
                    });
                    methodBlock.line("return StreamSupport.stream(iterable.spliterator(), false)");
                    methodBlock.increaseIndent();
                    methodBlock.line(".map(item -> item == null ? \"\" : new String(serializer.serializeToBytes(item), StandardCharsets.UTF_8))");
                    methodBlock.line(".map(serialized -> serialized.replace(\"^\\\"*|\\\"*$\", \"\"))");
                    methodBlock.line(".collect(Collectors.joining(format.getDelimiter()));");
                });
            }
        });
    }
}
