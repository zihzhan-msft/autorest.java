package fixtures.header.implementation;

import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Headers. */
public final class HeadersImpl {
    /** The proxy service used to perform REST calls. */
    private final HeadersService service;

    /** The service client containing this operation class. */
    private final AutoRestSwaggerBATHeaderServiceImpl client;

    /**
     * Initializes an instance of HeadersImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    HeadersImpl(AutoRestSwaggerBATHeaderServiceImpl client) {
        this.service = RestProxy.create(HeadersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestSwaggerBATHeaderServiceHeaders to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestSwaggerBATHe")
    private interface HeadersService {
        @Post("/header/param/existingkey")
        Mono<Response<Void>> paramExistingKey(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/existingkey")
        Mono<Response<Void>> responseExistingKey(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/protectedkey")
        Mono<Response<Void>> paramProtectedKey(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/protectedkey")
        Mono<Response<Void>> responseProtectedKey(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/integer")
        Mono<Response<Void>> paramInteger(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/integer")
        Mono<Response<Void>> responseInteger(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/long")
        Mono<Response<Void>> paramLong(@HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/long")
        Mono<Response<Void>> responseLong(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/float")
        Mono<Response<Void>> paramFloat(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/float")
        Mono<Response<Void>> responseFloat(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/double")
        Mono<Response<Void>> paramDouble(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/double")
        Mono<Response<Void>> responseDouble(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/bool")
        Mono<Response<Void>> paramBool(@HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/bool")
        Mono<Response<Void>> responseBool(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/string")
        Mono<Response<Void>> paramString(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/string")
        Mono<Response<Void>> responseString(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/date")
        Mono<Response<Void>> paramDate(@HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/date")
        Mono<Response<Void>> responseDate(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/datetime")
        Mono<Response<Void>> paramDatetime(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/datetime")
        Mono<Response<Void>> responseDatetime(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/datetimerfc1123")
        Mono<Response<Void>> paramDatetimeRfc1123(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/datetimerfc1123")
        Mono<Response<Void>> responseDatetimeRfc1123(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/duration")
        Mono<Response<Void>> paramDuration(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/duration")
        Mono<Response<Void>> responseDuration(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/byte")
        Mono<Response<Void>> paramByte(@HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/byte")
        Mono<Response<Void>> responseByte(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/param/prim/enum")
        Mono<Response<Void>> paramEnum(@HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/response/prim/enum")
        Mono<Response<Void>> responseEnum(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/header/custom/x-ms-client-request-id/9C4D50EE-2D56-4CD3-8152-34347DC9F2B0")
        Mono<Response<Void>> customRequestId(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);
    }

    /**
     * Send a post request with header value "User-Agent": "overwrite".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>userAgent</td><td>String</td><td>Yes</td><td>Send a post request with header value "User-Agent": "overwrite"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramExistingKeyWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.paramExistingKey(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header value "User-Agent": "overwrite".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>userAgent</td><td>String</td><td>Yes</td><td>Send a post request with header value "User-Agent": "overwrite"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramExistingKeyWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramExistingKey(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header value "User-Agent": "overwrite".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>userAgent</td><td>String</td><td>Yes</td><td>Send a post request with header value "User-Agent": "overwrite"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramExistingKeyWithResponse(RequestOptions requestOptions, Context context) {
        return paramExistingKeyWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header value "User-Agent": "overwrite".
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "User-Agent": "overwrite".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseExistingKeyWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.responseExistingKey(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header value "User-Agent": "overwrite".
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "User-Agent": "overwrite".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseExistingKeyWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseExistingKey(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header value "User-Agent": "overwrite".
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "User-Agent": "overwrite".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseExistingKeyWithResponse(RequestOptions requestOptions, Context context) {
        return responseExistingKeyWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header value "Content-Type": "text/html".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>contentType</td><td>String</td><td>Yes</td><td>Send a post request with header value "Content-Type": "text/html"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramProtectedKeyWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.paramProtectedKey(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header value "Content-Type": "text/html".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>contentType</td><td>String</td><td>Yes</td><td>Send a post request with header value "Content-Type": "text/html"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramProtectedKeyWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramProtectedKey(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header value "Content-Type": "text/html".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>contentType</td><td>String</td><td>Yes</td><td>Send a post request with header value "Content-Type": "text/html"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramProtectedKeyWithResponse(RequestOptions requestOptions, Context context) {
        return paramProtectedKeyWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header value "Content-Type": "text/html".
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "Content-Type": "text/html".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseProtectedKeyWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.responseProtectedKey(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header value "Content-Type": "text/html".
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "Content-Type": "text/html".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseProtectedKeyWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseProtectedKey(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header value "Content-Type": "text/html".
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "Content-Type": "text/html".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseProtectedKeyWithResponse(RequestOptions requestOptions, Context context) {
        return responseProtectedKeyWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 1 or "scenario": "negative", "value": -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>int</td><td>Yes</td><td>Send a post request with header values 1 or -2</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramIntegerWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramInteger(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 1 or "scenario": "negative", "value": -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>int</td><td>Yes</td><td>Send a post request with header values 1 or -2</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramIntegerWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramInteger(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 1 or "scenario": "negative", "value": -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>int</td><td>Yes</td><td>Send a post request with header values 1 or -2</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramIntegerWithResponse(RequestOptions requestOptions, Context context) {
        return paramIntegerWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header value "value": 1 or -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 1 or -2.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseIntegerWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseInteger(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header value "value": 1 or -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 1 or -2.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseIntegerWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseInteger(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header value "value": 1 or -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 1 or -2.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseIntegerWithResponse(RequestOptions requestOptions, Context context) {
        return responseIntegerWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 105 or "scenario": "negative", "value":
     * -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>long</td><td>Yes</td><td>Send a post request with header values 105 or -2</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramLongWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramLong(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 105 or "scenario": "negative", "value":
     * -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>long</td><td>Yes</td><td>Send a post request with header values 105 or -2</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramLongWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramLong(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 105 or "scenario": "negative", "value":
     * -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>long</td><td>Yes</td><td>Send a post request with header values 105 or -2</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramLongWithResponse(RequestOptions requestOptions, Context context) {
        return paramLongWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header value "value": 105 or -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 105 or -2.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseLongWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseLong(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header value "value": 105 or -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 105 or -2.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseLongWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseLong(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header value "value": 105 or -2.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 105 or -2.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseLongWithResponse(RequestOptions requestOptions, Context context) {
        return responseLongWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 0.07 or "scenario": "negative", "value":
     * -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>float</td><td>Yes</td><td>Send a post request with header values 0.07 or -3.0</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramFloatWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramFloat(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 0.07 or "scenario": "negative", "value":
     * -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>float</td><td>Yes</td><td>Send a post request with header values 0.07 or -3.0</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramFloatWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramFloat(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 0.07 or "scenario": "negative", "value":
     * -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>float</td><td>Yes</td><td>Send a post request with header values 0.07 or -3.0</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramFloatWithResponse(RequestOptions requestOptions, Context context) {
        return paramFloatWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header value "value": 0.07 or -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 0.07 or -3.0.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseFloatWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseFloat(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header value "value": 0.07 or -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 0.07 or -3.0.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseFloatWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseFloat(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header value "value": 0.07 or -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 0.07 or -3.0.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseFloatWithResponse(RequestOptions requestOptions, Context context) {
        return responseFloatWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 7e120 or "scenario": "negative", "value":
     * -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>double</td><td>Yes</td><td>Send a post request with header values 7e120 or -3.0</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDoubleWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramDouble(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 7e120 or "scenario": "negative", "value":
     * -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>double</td><td>Yes</td><td>Send a post request with header values 7e120 or -3.0</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDoubleWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramDouble(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "positive", "value": 7e120 or "scenario": "negative", "value":
     * -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     *     <tr><td>value</td><td>double</td><td>Yes</td><td>Send a post request with header values 7e120 or -3.0</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDoubleWithResponse(RequestOptions requestOptions, Context context) {
        return paramDoubleWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header value "value": 7e120 or -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 7e120 or -3.0.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDoubleWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseDouble(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header value "value": 7e120 or -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 7e120 or -3.0.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDoubleWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseDouble(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header value "value": 7e120 or -3.0.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "positive" or "negative"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": 7e120 or -3.0.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDoubleWithResponse(RequestOptions requestOptions, Context context) {
        return responseDoubleWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "true", "value": true or "scenario": "false", "value": false.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "true" or "false"</td></tr>
     *     <tr><td>value</td><td>boolean</td><td>Yes</td><td>Send a post request with header values true or false</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramBoolWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramBool(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "true", "value": true or "scenario": "false", "value": false.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "true" or "false"</td></tr>
     *     <tr><td>value</td><td>boolean</td><td>Yes</td><td>Send a post request with header values true or false</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramBoolWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramBool(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "true", "value": true or "scenario": "false", "value": false.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "true" or "false"</td></tr>
     *     <tr><td>value</td><td>boolean</td><td>Yes</td><td>Send a post request with header values true or false</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramBoolWithResponse(RequestOptions requestOptions, Context context) {
        return paramBoolWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header value "value": true or false.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "true" or "false"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": true or false.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseBoolWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseBool(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header value "value": true or false.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "true" or "false"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": true or false.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseBoolWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseBool(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header value "value": true or false.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "true" or "false"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header value "value": true or false.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseBoolWithResponse(RequestOptions requestOptions, Context context) {
        return responseBoolWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "The quick brown fox jumps over the lazy
     * dog" or "scenario": "null", "value": null or "scenario": "empty", "value": "".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values "The quick brown fox jumps over the lazy dog" or null or ""</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramStringWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramString(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "The quick brown fox jumps over the lazy
     * dog" or "scenario": "null", "value": null or "scenario": "empty", "value": "".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values "The quick brown fox jumps over the lazy dog" or null or ""</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramStringWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramString(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "The quick brown fox jumps over the lazy
     * dog" or "scenario": "null", "value": null or "scenario": "empty", "value": "".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values "The quick brown fox jumps over the lazy dog" or null or ""</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramStringWithResponse(RequestOptions requestOptions, Context context) {
        return paramStringWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header values "The quick brown fox jumps over the lazy dog" or null or "".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "The quick brown fox jumps over the lazy dog" or null or "".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseStringWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseString(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header values "The quick brown fox jumps over the lazy dog" or null or "".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "The quick brown fox jumps over the lazy dog" or null or "".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseStringWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseString(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header values "The quick brown fox jumps over the lazy dog" or null or "".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "The quick brown fox jumps over the lazy dog" or null or "".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseStringWithResponse(RequestOptions requestOptions, Context context) {
        return responseStringWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01" or "scenario": "min", "value":
     * "0001-01-01".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "2010-01-01" or "0001-01-01"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDateWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramDate(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01" or "scenario": "min", "value":
     * "0001-01-01".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "2010-01-01" or "0001-01-01"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDateWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramDate(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01" or "scenario": "min", "value":
     * "0001-01-01".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "2010-01-01" or "0001-01-01"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDateWithResponse(RequestOptions requestOptions, Context context) {
        return paramDateWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "2010-01-01" or "0001-01-01".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDateWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseDate(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "2010-01-01" or "0001-01-01".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDateWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseDate(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header values "2010-01-01" or "0001-01-01".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "2010-01-01" or "0001-01-01".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDateWithResponse(RequestOptions requestOptions, Context context) {
        return responseDateWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01T12:34:56Z" or "scenario": "min",
     * "value": "0001-01-01T00:00:00Z".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDatetimeWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramDatetime(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01T12:34:56Z" or "scenario": "min",
     * "value": "0001-01-01T00:00:00Z".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDatetimeWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramDatetime(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "2010-01-01T12:34:56Z" or "scenario": "min",
     * "value": "0001-01-01T00:00:00Z".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDatetimeWithResponse(RequestOptions requestOptions, Context context) {
        return paramDatetimeWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDatetimeWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.responseDatetime(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDatetimeWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseDatetime(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "2010-01-01T12:34:56Z" or "0001-01-01T00:00:00Z".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDatetimeWithResponse(RequestOptions requestOptions, Context context) {
        return responseDatetimeWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "Wed, 01 Jan 2010 12:34:56 GMT" or
     * "scenario": "min", "value": "Mon, 01 Jan 0001 00:00:00 GMT".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDatetimeRfc1123WithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.paramDatetimeRfc1123(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "Wed, 01 Jan 2010 12:34:56 GMT" or
     * "scenario": "min", "value": "Mon, 01 Jan 0001 00:00:00 GMT".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDatetimeRfc1123WithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramDatetimeRfc1123(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "Wed, 01 Jan 2010 12:34:56 GMT" or
     * "scenario": "min", "value": "Mon, 01 Jan 0001 00:00:00 GMT".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDatetimeRfc1123WithResponse(RequestOptions requestOptions, Context context) {
        return paramDatetimeRfc1123WithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDatetimeRfc1123WithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.responseDatetimeRfc1123(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDatetimeRfc1123WithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.responseDatetimeRfc1123(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "min"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or "Mon, 01 Jan 0001 00:00:00 GMT".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDatetimeRfc1123WithResponse(RequestOptions requestOptions, Context context) {
        return responseDatetimeRfc1123WithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "P123DT22H14M12.011S".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "P123DT22H14M12.011S"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDurationWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramDuration(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "P123DT22H14M12.011S".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "P123DT22H14M12.011S"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramDurationWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramDuration(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "P123DT22H14M12.011S".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "P123DT22H14M12.011S"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramDurationWithResponse(RequestOptions requestOptions, Context context) {
        return paramDurationWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header values "P123DT22H14M12.011S".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "P123DT22H14M12.011S".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDurationWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.responseDuration(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header values "P123DT22H14M12.011S".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "P123DT22H14M12.011S".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseDurationWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseDuration(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header values "P123DT22H14M12.011S".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "P123DT22H14M12.011S".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseDurationWithResponse(RequestOptions requestOptions, Context context) {
        return responseDurationWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "啊齄丂狛狜隣郎隣兀﨩".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramByteWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramByte(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "啊齄丂狛狜隣郎隣兀﨩".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramByteWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramByte(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "啊齄丂狛狜隣郎隣兀﨩".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     *     <tr><td>value</td><td>String</td><td>Yes</td><td>Send a post request with header values "啊齄丂狛狜隣郎隣兀﨩"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramByteWithResponse(RequestOptions requestOptions, Context context) {
        return paramByteWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "啊齄丂狛狜隣郎隣兀﨩".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseByteWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseByte(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "啊齄丂狛狜隣郎隣兀﨩".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseByteWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseByte(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header values "啊齄丂狛狜隣郎隣兀﨩".
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "啊齄丂狛狜隣郎隣兀﨩".
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseByteWithResponse(RequestOptions requestOptions, Context context) {
        return responseByteWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "GREY" or "scenario": "null", "value": null.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values 'GREY' </td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramEnumWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.paramEnum(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "GREY" or "scenario": "null", "value": null.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values 'GREY' </td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> paramEnumWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.paramEnum(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send a post request with header values "scenario": "valid", "value": "GREY" or "scenario": "null", "value": null.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     *     <tr><td>value</td><td>String</td><td>No</td><td>Send a post request with header values 'GREY' </td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> paramEnumWithResponse(RequestOptions requestOptions, Context context) {
        return paramEnumWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Get a response with header values "GREY" or null.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "GREY" or null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseEnumWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.responseEnum(this.client.getHost(), requestOptions, context));
    }

    /**
     * Get a response with header values "GREY" or null.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "GREY" or null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> responseEnumWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.responseEnum(this.client.getHost(), requestOptions, context);
    }

    /**
     * Get a response with header values "GREY" or null.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>scenario</td><td>String</td><td>Yes</td><td>Send a post request with header values "scenario": "valid" or "null" or "empty"</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a response with header values "GREY" or null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> responseEnumWithResponse(RequestOptions requestOptions, Context context) {
        return responseEnumWithResponseAsync(requestOptions, context).block();
    }

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> customRequestIdWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.customRequestId(this.client.getHost(), requestOptions, context));
    }

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> customRequestIdWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.customRequestId(this.client.getHost(), requestOptions, context);
    }

    /**
     * Send x-ms-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> customRequestIdWithResponse(RequestOptions requestOptions, Context context) {
        return customRequestIdWithResponseAsync(requestOptions, context).block();
    }
}
