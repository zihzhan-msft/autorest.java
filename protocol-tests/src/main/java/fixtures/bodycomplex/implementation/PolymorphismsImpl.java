package fixtures.bodycomplex.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Polymorphisms. */
public final class PolymorphismsImpl {
    /** The proxy service used to perform REST calls. */
    private final PolymorphismsService service;

    /** The service client containing this operation class. */
    private final AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of PolymorphismsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PolymorphismsImpl(AutoRestComplexTestServiceImpl client) {
        this.service =
                RestProxy.create(PolymorphismsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestComplexTestServicePolymorphisms to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestComplexTestS")
    private interface PolymorphismsService {
        @Get("/complex/polymorphism/valid")
        Mono<Response<BinaryData>> getValid(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/polymorphism/valid")
        Mono<Response<Void>> putValid(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/polymorphism/dotsyntax")
        Mono<Response<BinaryData>> getDotSyntax(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/complex/polymorphism/composedWithDiscriminator")
        Mono<Response<BinaryData>> getComposedWithDiscriminator(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/complex/polymorphism/composedWithoutDiscriminator")
        Mono<Response<BinaryData>> getComposedWithoutDiscriminator(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/complex/polymorphism/complicated")
        Mono<Response<BinaryData>> getComplicated(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/polymorphism/complicated")
        Mono<Response<Void>> putComplicated(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Put("/complex/polymorphism/missingdiscriminator")
        Mono<Response<BinaryData>> putMissingDiscriminator(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Put("/complex/polymorphism/missingrequired/invalid")
        Mono<Response<Void>> putValidMissingRequired(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Get complex types that are polymorphic.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getValid(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types that are polymorphic.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getValid(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types that are polymorphic.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getValidWithResponse(RequestOptions requestOptions, Context context) {
        return getValidWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types that are polymorphic.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param complexBody Please put a salmon that looks like this: { 'fishtype':'Salmon', 'location':'alaska',
     *     'iswild':true, 'species':'king', 'length':1.0, 'siblings':[ { 'fishtype':'Shark', 'age':6, 'birthday':
     *     '2012-01-05T01:00:00Z', 'length':20.0, 'species':'predator', }, { 'fishtype':'Sawshark', 'age':105,
     *     'birthday': '1900-01-05T01:00:00Z', 'length':10.0, 'picture': new Buffer([255, 255, 255, 255,
     *     254]).toString('base64'), 'species':'dangerous', }, { 'fishtype': 'goblin', 'age': 1, 'birthday':
     *     '2015-08-08T00:00:00Z', 'length': 30.0, 'species': 'scary', 'jawsize': 5 } ] };.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putValid(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types that are polymorphic.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param complexBody Please put a salmon that looks like this: { 'fishtype':'Salmon', 'location':'alaska',
     *     'iswild':true, 'species':'king', 'length':1.0, 'siblings':[ { 'fishtype':'Shark', 'age':6, 'birthday':
     *     '2012-01-05T01:00:00Z', 'length':20.0, 'species':'predator', }, { 'fishtype':'Sawshark', 'age':105,
     *     'birthday': '1900-01-05T01:00:00Z', 'length':10.0, 'picture': new Buffer([255, 255, 255, 255,
     *     254]).toString('base64'), 'species':'dangerous', }, { 'fishtype': 'goblin', 'age': 1, 'birthday':
     *     '2015-08-08T00:00:00Z', 'length': 30.0, 'species': 'scary', 'jawsize': 5 } ] };.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putValid(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types that are polymorphic.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param complexBody Please put a salmon that looks like this: { 'fishtype':'Salmon', 'location':'alaska',
     *     'iswild':true, 'species':'king', 'length':1.0, 'siblings':[ { 'fishtype':'Shark', 'age':6, 'birthday':
     *     '2012-01-05T01:00:00Z', 'length':20.0, 'species':'predator', }, { 'fishtype':'Sawshark', 'age':105,
     *     'birthday': '1900-01-05T01:00:00Z', 'length':10.0, 'picture': new Buffer([255, 255, 255, 255,
     *     254]).toString('base64'), 'species':'dangerous', }, { 'fishtype': 'goblin', 'age': 1, 'birthday':
     *     '2015-08-08T00:00:00Z', 'length': 30.0, 'species': 'scary', 'jawsize': 5 } ] };.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putValidWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putValidWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types that are polymorphic, JSON key contains a dot.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic, JSON key contains a dot.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDotSyntaxWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getDotSyntax(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types that are polymorphic, JSON key contains a dot.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic, JSON key contains a dot.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDotSyntaxWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getDotSyntax(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types that are polymorphic, JSON key contains a dot.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic, JSON key contains a dot.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDotSyntaxWithResponse(RequestOptions requestOptions, Context context) {
        return getDotSyntaxWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type, with
     * discriminator specified. Deserialization must NOT fail and use the discriminator type specified on the wire.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     sampleSalmon: {
     *         species: String
     *         location: String
     *         iswild: Boolean
     *     }
     *     salmons: [
     *         (recursive schema, see above)
     *     ]
     *     sampleFish: {
     *         species: String
     *     }
     *     fishes: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     with discriminator specified.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getComposedWithDiscriminatorWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.getComposedWithDiscriminator(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type, with
     * discriminator specified. Deserialization must NOT fail and use the discriminator type specified on the wire.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     sampleSalmon: {
     *         species: String
     *         location: String
     *         iswild: Boolean
     *     }
     *     salmons: [
     *         (recursive schema, see above)
     *     ]
     *     sampleFish: {
     *         species: String
     *     }
     *     fishes: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     with discriminator specified.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getComposedWithDiscriminatorWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.getComposedWithDiscriminator(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type, with
     * discriminator specified. Deserialization must NOT fail and use the discriminator type specified on the wire.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     sampleSalmon: {
     *         species: String
     *         location: String
     *         iswild: Boolean
     *     }
     *     salmons: [
     *         (recursive schema, see above)
     *     ]
     *     sampleFish: {
     *         species: String
     *     }
     *     fishes: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     with discriminator specified.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getComposedWithDiscriminatorWithResponse(
            RequestOptions requestOptions, Context context) {
        return getComposedWithDiscriminatorWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type,
     * without discriminator specified on wire. Deserialization must NOT fail and use the explicit type of the property.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     sampleSalmon: {
     *         species: String
     *         location: String
     *         iswild: Boolean
     *     }
     *     salmons: [
     *         (recursive schema, see above)
     *     ]
     *     sampleFish: {
     *         species: String
     *     }
     *     fishes: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     without discriminator specified on wire.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getComposedWithoutDiscriminatorWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.getComposedWithoutDiscriminator(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type,
     * without discriminator specified on wire. Deserialization must NOT fail and use the explicit type of the property.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     sampleSalmon: {
     *         species: String
     *         location: String
     *         iswild: Boolean
     *     }
     *     salmons: [
     *         (recursive schema, see above)
     *     ]
     *     sampleFish: {
     *         species: String
     *     }
     *     fishes: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     without discriminator specified on wire.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getComposedWithoutDiscriminatorWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.getComposedWithoutDiscriminator(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex object composing a polymorphic scalar property and array property with polymorphic element type,
     * without discriminator specified on wire. Deserialization must NOT fail and use the explicit type of the property.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     sampleSalmon: {
     *         species: String
     *         location: String
     *         iswild: Boolean
     *     }
     *     salmons: [
     *         (recursive schema, see above)
     *     ]
     *     sampleFish: {
     *         species: String
     *     }
     *     fishes: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex object composing a polymorphic scalar property and array property with polymorphic element type,
     *     without discriminator specified on wire.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getComposedWithoutDiscriminatorWithResponse(
            RequestOptions requestOptions, Context context) {
        return getComposedWithoutDiscriminatorWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic, but not at the root of the hierarchy; also have additional
     *     properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getComplicatedWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getComplicated(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic, but not at the root of the hierarchy; also have additional
     *     properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getComplicatedWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getComplicated(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that are polymorphic, but not at the root of the hierarchy; also have additional
     *     properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getComplicatedWithResponse(RequestOptions requestOptions, Context context) {
        return getComplicatedWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putComplicatedWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putComplicated(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putComplicatedWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putComplicated(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types that are polymorphic, but not at the root of the hierarchy; also have additional properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putComplicatedWithResponse(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putComplicatedWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putMissingDiscriminatorWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.putMissingDiscriminator(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putMissingDiscriminatorWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putMissingDiscriminator(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types that are polymorphic, omitting the discriminator.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         {
     *             species: String
     *             length: float
     *             siblings: [
     *                 (recursive schema, see above)
     *             ]
     *         }
     *     ]
     *     location: String
     *     iswild: Boolean
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     *
     * @param complexBody The complexBody parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putMissingDiscriminatorWithResponse(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putMissingDiscriminatorWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be
     * allowed from the client.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to
     *     be sent: { "fishtype": "sawshark", "species": "snaggle toothed", "length": 18.5, "age": 2, "birthday":
     *     "2013-06-01T01:00:00Z", "location": "alaska", "picture": base64(FF FF FF FF FE), "siblings": [ { "fishtype":
     *     "shark", "species": "predator", "birthday": "2012-01-05T01:00:00Z", "length": 20, "age": 6 }, { "fishtype":
     *     "sawshark", "species": "dangerous", "picture": base64(FF FF FF FF FE), "length": 10, "age": 105 } ] }.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidMissingRequiredWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context ->
                        service.putValidMissingRequired(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be
     * allowed from the client.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to
     *     be sent: { "fishtype": "sawshark", "species": "snaggle toothed", "length": 18.5, "age": 2, "birthday":
     *     "2013-06-01T01:00:00Z", "location": "alaska", "picture": base64(FF FF FF FF FE), "siblings": [ { "fishtype":
     *     "shark", "species": "predator", "birthday": "2012-01-05T01:00:00Z", "length": 20, "age": 6 }, { "fishtype":
     *     "sawshark", "species": "dangerous", "picture": base64(FF FF FF FF FE), "length": 10, "age": 105 } ] }.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidMissingRequiredWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putValidMissingRequired(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be
     * allowed from the client.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     species: String
     *     length: float
     *     siblings: [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to
     *     be sent: { "fishtype": "sawshark", "species": "snaggle toothed", "length": 18.5, "age": 2, "birthday":
     *     "2013-06-01T01:00:00Z", "location": "alaska", "picture": base64(FF FF FF FF FE), "siblings": [ { "fishtype":
     *     "shark", "species": "predator", "birthday": "2012-01-05T01:00:00Z", "length": 20, "age": 6 }, { "fishtype":
     *     "sawshark", "species": "dangerous", "picture": base64(FF FF FF FF FE), "length": 10, "age": 105 } ] }.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putValidMissingRequiredWithResponse(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putValidMissingRequiredWithResponseAsync(complexBody, requestOptions, context).block();
    }
}
