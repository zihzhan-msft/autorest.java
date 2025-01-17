package fixtures.httpinfrastructure;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.httpinfrastructure.implementation.HttpRedirectsImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AutoRestHttpInfrastructureTestService type. */
@ServiceClient(builder = AutoRestHttpInfrastructureTestServiceBuilder.class, isAsync = true)
public final class HttpRedirectsAsyncClient {
    private final HttpRedirectsImpl serviceClient;

    /**
     * Initializes an instance of HttpRedirects client.
     *
     * @param serviceClient the service client implementation.
     */
    HttpRedirectsAsyncClient(HttpRedirectsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> head300WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head300WithResponseAsync(requestOptions);
    }

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * [
     *     String
     * ]
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> get300WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get300WithResponseAsync(requestOptions);
    }

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> head301WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head301WithResponseAsync(requestOptions);
    }

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> get301WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get301WithResponseAsync(requestOptions);
    }

    /**
     * Put true Boolean value in request returns 301. This request should not be automatically redirected, but should
     * return the received 301 to the caller for evaluation.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> put301WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.put301WithResponseAsync(requestOptions);
    }

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> head302WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head302WithResponseAsync(requestOptions);
    }

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> get302WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get302WithResponseAsync(requestOptions);
    }

    /**
     * Patch true Boolean value in request returns 302. This request should not be automatically redirected, but should
     * return the received 302 to the caller for evaluation.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> patch302WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.patch302WithResponseAsync(requestOptions);
    }

    /**
     * Post true Boolean value in request returns 303. This request should be automatically redirected usign a get,
     * ultimately returning a 200 status code.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> post303WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.post303WithResponseAsync(requestOptions);
    }

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> head307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.head307WithResponseAsync(requestOptions);
    }

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> get307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.get307WithResponseAsync(requestOptions);
    }

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> put307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.put307WithResponseAsync(requestOptions);
    }

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> patch307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.patch307WithResponseAsync(requestOptions);
    }

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> post307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.post307WithResponseAsync(requestOptions);
    }

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> delete307WithResponse(RequestOptions requestOptions) {
        return this.serviceClient.delete307WithResponseAsync(requestOptions);
    }
}
