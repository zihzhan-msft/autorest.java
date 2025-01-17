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

/** An instance of this class provides access to all the operations defined in Primitives. */
public final class PrimitivesImpl {
    /** The proxy service used to perform REST calls. */
    private final PrimitivesService service;

    /** The service client containing this operation class. */
    private final AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of PrimitivesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrimitivesImpl(AutoRestComplexTestServiceImpl client) {
        this.service =
                RestProxy.create(PrimitivesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestComplexTestServicePrimitives to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestComplexTestS")
    private interface PrimitivesService {
        @Get("/complex/primitive/integer")
        Mono<Response<BinaryData>> getInt(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/integer")
        Mono<Response<Void>> putInt(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/long")
        Mono<Response<BinaryData>> getLong(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/long")
        Mono<Response<Void>> putLong(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/float")
        Mono<Response<BinaryData>> getFloat(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/float")
        Mono<Response<Void>> putFloat(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/double")
        Mono<Response<BinaryData>> getDouble(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/double")
        Mono<Response<Void>> putDouble(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/bool")
        Mono<Response<BinaryData>> getBool(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/bool")
        Mono<Response<Void>> putBool(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/string")
        Mono<Response<BinaryData>> getString(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/string")
        Mono<Response<Void>> putString(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/date")
        Mono<Response<BinaryData>> getDate(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/date")
        Mono<Response<Void>> putDate(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/datetime")
        Mono<Response<BinaryData>> getDateTime(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/datetime")
        Mono<Response<Void>> putDateTime(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/datetimerfc1123")
        Mono<Response<BinaryData>> getDateTimeRfc1123(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/datetimerfc1123")
        Mono<Response<Void>> putDateTimeRfc1123(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/duration")
        Mono<Response<BinaryData>> getDuration(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/duration")
        Mono<Response<Void>> putDuration(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);

        @Get("/complex/primitive/byte")
        Mono<Response<BinaryData>> getByte(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Put("/complex/primitive/byte")
        Mono<Response<Void>> putByte(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData complexBody,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Get complex types with integer properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Integer
     *     field2: Integer
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with integer properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getIntWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getInt(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with integer properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Integer
     *     field2: Integer
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with integer properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getIntWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getInt(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with integer properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Integer
     *     field2: Integer
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with integer properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getIntWithResponse(RequestOptions requestOptions, Context context) {
        return getIntWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with integer properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Integer
     *     field2: Integer
     * }
     * }</pre>
     *
     * @param complexBody Please put -1 and 2.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putIntWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putInt(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with integer properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Integer
     *     field2: Integer
     * }
     * }</pre>
     *
     * @param complexBody Please put -1 and 2.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putIntWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putInt(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with integer properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Integer
     *     field2: Integer
     * }
     * }</pre>
     *
     * @param complexBody Please put -1 and 2.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putIntWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putIntWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with long properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Long
     *     field2: Long
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with long properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getLongWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getLong(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with long properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Long
     *     field2: Long
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with long properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getLongWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getLong(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with long properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Long
     *     field2: Long
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with long properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getLongWithResponse(RequestOptions requestOptions, Context context) {
        return getLongWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with long properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Long
     *     field2: Long
     * }
     * }</pre>
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putLongWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putLong(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with long properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Long
     *     field2: Long
     * }
     * }</pre>
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putLongWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putLong(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with long properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Long
     *     field2: Long
     * }
     * }</pre>
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putLongWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putLongWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with float properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Float
     *     field2: Float
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with float properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getFloatWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getFloat(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with float properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Float
     *     field2: Float
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with float properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getFloatWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getFloat(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with float properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Float
     *     field2: Float
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with float properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getFloatWithResponse(RequestOptions requestOptions, Context context) {
        return getFloatWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with float properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Float
     *     field2: Float
     * }
     * }</pre>
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putFloatWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putFloat(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with float properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Float
     *     field2: Float
     * }
     * }</pre>
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putFloatWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putFloat(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with float properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Float
     *     field2: Float
     * }
     * }</pre>
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putFloatWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putFloatWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with double properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Double
     *     field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose: Double
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with double properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDoubleWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getDouble(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with double properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Double
     *     field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose: Double
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with double properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDoubleWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getDouble(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with double properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Double
     *     field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose: Double
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with double properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDoubleWithResponse(RequestOptions requestOptions, Context context) {
        return getDoubleWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with double properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Double
     *     field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose: Double
     * }
     * }</pre>
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDoubleWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putDouble(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with double properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Double
     *     field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose: Double
     * }
     * }</pre>
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDoubleWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putDouble(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with double properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field1: Double
     *     field56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose: Double
     * }
     * }</pre>
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putDoubleWithResponse(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putDoubleWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with bool properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     fieldTrue: Boolean
     *     fieldFalse: Boolean
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with bool properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getBoolWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getBool(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with bool properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     fieldTrue: Boolean
     *     fieldFalse: Boolean
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with bool properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getBoolWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getBool(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with bool properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     fieldTrue: Boolean
     *     fieldFalse: Boolean
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with bool properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getBoolWithResponse(RequestOptions requestOptions, Context context) {
        return getBoolWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with bool properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     fieldTrue: Boolean
     *     fieldFalse: Boolean
     * }
     * }</pre>
     *
     * @param complexBody Please put true and false.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putBoolWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putBool(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with bool properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     fieldTrue: Boolean
     *     fieldFalse: Boolean
     * }
     * }</pre>
     *
     * @param complexBody Please put true and false.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putBoolWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putBool(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with bool properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     fieldTrue: Boolean
     *     fieldFalse: Boolean
     * }
     * }</pre>
     *
     * @param complexBody Please put true and false.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putBoolWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putBoolWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with string properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     empty: String
     *     nullProperty: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with string properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getStringWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getString(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with string properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     empty: String
     *     nullProperty: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with string properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getStringWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getString(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with string properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     empty: String
     *     nullProperty: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with string properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getStringWithResponse(RequestOptions requestOptions, Context context) {
        return getStringWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with string properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     empty: String
     *     nullProperty: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putStringWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putString(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with string properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     empty: String
     *     nullProperty: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putStringWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putString(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with string properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     empty: String
     *     nullProperty: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putStringWithResponse(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putStringWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with date properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     leap: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with date properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDateWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getDate(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with date properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     leap: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with date properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDateWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getDate(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with date properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     leap: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with date properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDateWithResponse(RequestOptions requestOptions, Context context) {
        return getDateWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with date properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     leap: String
     * }
     * }</pre>
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putDate(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with date properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     leap: String
     * }
     * }</pre>
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putDate(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with date properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     leap: String
     * }
     * }</pre>
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putDateWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putDateWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with datetime properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with datetime properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDateTimeWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getDateTime(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with datetime properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with datetime properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDateTimeWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getDateTime(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with datetime properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with datetime properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDateTimeWithResponse(RequestOptions requestOptions, Context context) {
        return getDateTimeWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with datetime properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateTimeWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putDateTime(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with datetime properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateTimeWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putDateTime(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with datetime properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putDateTimeWithResponse(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putDateTimeWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with datetimeRfc1123 properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDateTimeRfc1123WithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.getDateTimeRfc1123(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with datetimeRfc1123 properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDateTimeRfc1123WithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.getDateTimeRfc1123(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with datetimeRfc1123 properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDateTimeRfc1123WithResponse(RequestOptions requestOptions, Context context) {
        return getDateTimeRfc1123WithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateTimeRfc1123WithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putDateTimeRfc1123(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDateTimeRfc1123WithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putDateTimeRfc1123(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     *     now: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putDateTimeRfc1123WithResponse(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putDateTimeRfc1123WithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with duration properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with duration properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDurationWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getDuration(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with duration properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with duration properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getDurationWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getDuration(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with duration properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with duration properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDurationWithResponse(RequestOptions requestOptions, Context context) {
        return getDurationWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with duration properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDurationWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putDuration(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with duration properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putDurationWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putDuration(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with duration properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: String
     * }
     * }</pre>
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putDurationWithResponse(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putDurationWithResponseAsync(complexBody, requestOptions, context).block();
    }

    /**
     * Get complex types with byte properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: byte[]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with byte properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getByteWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getByte(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get complex types with byte properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: byte[]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with byte properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getByteWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.getByte(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get complex types with byte properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: byte[]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with byte properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getByteWithResponse(RequestOptions requestOptions, Context context) {
        return getByteWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Put complex types with byte properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: byte[]
     * }
     * }</pre>
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putByteWithResponseAsync(BinaryData complexBody, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.putByte(this.client.getHost(), complexBody, requestOptions, context));
    }

    /**
     * Put complex types with byte properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: byte[]
     * }
     * }</pre>
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putByteWithResponseAsync(
            BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return service.putByte(this.client.getHost(), complexBody, requestOptions, context);
    }

    /**
     * Put complex types with byte properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     field: byte[]
     * }
     * }</pre>
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putByteWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return putByteWithResponseAsync(complexBody, requestOptions, context).block();
    }
}
