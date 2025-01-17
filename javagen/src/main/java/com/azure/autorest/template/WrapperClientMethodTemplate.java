package com.azure.autorest.template;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.ClientMethod;
import com.azure.autorest.model.clientmodel.ClientMethodParameter;
import com.azure.autorest.model.clientmodel.ClientMethodType;
import com.azure.autorest.model.clientmodel.PrimitiveType;
import com.azure.autorest.model.clientmodel.ProxyMethod;
import com.azure.autorest.model.javamodel.JavaType;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Template to generate client methods that are wrappers around the client methods generated by
 * {@link ClientMethodTemplate}.
 *
 */
public class WrapperClientMethodTemplate extends ClientMethodTemplateBase {

    private static final WrapperClientMethodTemplate instance = new WrapperClientMethodTemplate();

    private WrapperClientMethodTemplate() {
    }

    public static WrapperClientMethodTemplate getInstance() {
        return instance;
    }

    @Override
    public void write(ClientMethod clientMethod, JavaType typeBlock) {
        JavaSettings settings = JavaSettings.getInstance();

        if (clientMethod.getType() == ClientMethodType.PagingAsyncSinglePage) return;

        ProxyMethod restAPIMethod = clientMethod.getProxyMethod();
        if (settings.isLowLevelClient()) {
            typeBlock.javadocComment(comment -> generateProtocolMethodJavadoc(clientMethod, comment));
        } else {
            generateJavadoc(clientMethod, typeBlock, restAPIMethod);
        }

        switch (clientMethod.getType()) {
            case PagingSync:
            case PagingAsync:
                typeBlock.annotation("ServiceMethod(returns = ReturnType.COLLECTION)");
                break;
            default:
                typeBlock.annotation("ServiceMethod(returns = ReturnType.SINGLE)");
                break;
        }

        String methodName = clientMethod.getName();
        if (clientMethod.getType().name().contains("Async") && methodName.endsWith("Async")) {
            methodName = methodName.substring(0, methodName.length() - "Async".length());
        }
        String declaration = String.format("%1$s %2$s(%3$s)", clientMethod.getReturnValue().getType(), methodName, clientMethod.getParametersDeclaration());
        typeBlock.publicMethod(declaration, function -> {

            boolean shouldReturn = true;
            if (clientMethod.getReturnValue() != null && clientMethod.getReturnValue().getType() instanceof PrimitiveType) {
                PrimitiveType type = (PrimitiveType) clientMethod.getReturnValue().getType();
                if (type.asNullable() == ClassType.Void) {
                    shouldReturn = false;
                }
            }

            List<ClientMethodParameter> parameters = clientMethod.getMethodInputParameters();
            function
                    .line((shouldReturn ? "return " : "") + "this.serviceClient.%1$s(%2$s);", clientMethod.getName(),
                            parameters.stream().map(ClientMethodParameter::getName).collect(Collectors.joining(", ")));
        });
    }

    protected void generateJavadoc(ClientMethod clientMethod, JavaType typeBlock, ProxyMethod restAPIMethod) {
        typeBlock.javadocComment(comment -> {
            comment.description(clientMethod.getDescription());
            List<ClientMethodParameter> methodParameters = clientMethod.getMethodInputParameters();
            for (ClientMethodParameter parameter : methodParameters) {
                comment.param(parameter.getName(), parameter.getDescription());
            }
            if (clientMethod.getParametersDeclaration() != null && !clientMethod.getParametersDeclaration().isEmpty()) {
                comment.methodThrows("IllegalArgumentException", "thrown if parameters fail the validation");
            }
            if (restAPIMethod.getUnexpectedResponseExceptionType() != null) {
                comment.methodThrows(restAPIMethod.getUnexpectedResponseExceptionType().toString(),
                        "thrown if the request is rejected by server");
            }
            comment.methodThrows("RuntimeException", "all other wrapped checked exceptions if the request fails to be sent");
            comment.methodReturns(clientMethod.getReturnValue().getDescription());
        });
    }
}
