package fixtures.httpinfrastructure;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import fixtures.httpinfrastructure.implementation.HttpClientFailuresImpl;

/** Initializes a new instance of the synchronous AutoRestHttpInfrastructureTestService type. */
@ServiceClient(builder = AutoRestHttpInfrastructureTestServiceBuilder.class)
public final class HttpClientFailureClient {
    private final HttpClientFailuresImpl serviceClient;

    /**
     * Initializes an instance of HttpClientFailures client.
     *
     * @param serviceClient the service client implementation.
     */
    HttpClientFailureClient(HttpClientFailuresImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> head400WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.head400WithResponse(requestOptions, context);
    }

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get400WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.get400WithResponse(requestOptions, context);
    }

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> put400WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.put400WithResponse(requestOptions, context);
    }

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patch400WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.patch400WithResponse(requestOptions, context);
    }

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> post400WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.post400WithResponse(requestOptions, context);
    }

    /**
     * Return 400 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> delete400WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.delete400WithResponse(requestOptions, context);
    }

    /**
     * Return 401 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> head401WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.head401WithResponse(requestOptions, context);
    }

    /**
     * Return 402 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get402WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.get402WithResponse(requestOptions, context);
    }

    /**
     * Return 403 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get403WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.get403WithResponse(requestOptions, context);
    }

    /**
     * Return 404 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> put404WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.put404WithResponse(requestOptions, context);
    }

    /**
     * Return 405 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patch405WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.patch405WithResponse(requestOptions, context);
    }

    /**
     * Return 406 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> post406WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.post406WithResponse(requestOptions, context);
    }

    /**
     * Return 407 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> delete407WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.delete407WithResponse(requestOptions, context);
    }

    /**
     * Return 409 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> put409WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.put409WithResponse(requestOptions, context);
    }

    /**
     * Return 410 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> head410WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.head410WithResponse(requestOptions, context);
    }

    /**
     * Return 411 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get411WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.get411WithResponse(requestOptions, context);
    }

    /**
     * Return 412 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get412WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.get412WithResponse(requestOptions, context);
    }

    /**
     * Return 413 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> put413WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.put413WithResponse(requestOptions, context);
    }

    /**
     * Return 414 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> patch414WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.patch414WithResponse(requestOptions, context);
    }

    /**
     * Return 415 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> post415WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.post415WithResponse(requestOptions, context);
    }

    /**
     * Return 416 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> get416WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.get416WithResponse(requestOptions, context);
    }

    /**
     * Return 417 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> delete417WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.delete417WithResponse(requestOptions, context);
    }

    /**
     * Return 429 status code - should be represented in the client as an error.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> head429WithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.head429WithResponse(requestOptions, context);
    }
}
