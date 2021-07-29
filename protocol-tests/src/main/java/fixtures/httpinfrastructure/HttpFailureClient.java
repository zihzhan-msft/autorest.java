package fixtures.httpinfrastructure;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import fixtures.httpinfrastructure.implementation.HttpFailuresImpl;

/** Initializes a new instance of the synchronous AutoRestHttpInfrastructureTestService type. */
@ServiceClient(builder = AutoRestHttpInfrastructureTestServiceBuilder.class)
public final class HttpFailureClient {
    private final HttpFailuresImpl serviceClient;

    /**
     * Initializes an instance of HttpFailures client.
     *
     * @param serviceClient the service client implementation.
     */
    HttpFailureClient(HttpFailuresImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get empty error form server.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return empty error form server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public boolean getEmptyError(RequestOptions requestOptions) {
        return this.serviceClient.getEmptyError(requestOptions);
    }

    /**
     * Get empty error form server.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @return empty error form server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Boolean> getEmptyErrorWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getEmptyErrorWithResponse(requestOptions, context);
    }

    /**
     * Get empty error form server.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return empty error form server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public boolean getNoModelError(RequestOptions requestOptions) {
        return this.serviceClient.getNoModelError(requestOptions);
    }

    /**
     * Get empty error form server.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @return empty error form server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Boolean> getNoModelErrorWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getNoModelErrorWithResponse(requestOptions, context);
    }

    /**
     * Get empty response from server.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return empty response from server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public boolean getNoModelEmpty(RequestOptions requestOptions) {
        return this.serviceClient.getNoModelEmpty(requestOptions);
    }

    /**
     * Get empty response from server.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * boolean
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @return empty response from server.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Boolean> getNoModelEmptyWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getNoModelEmptyWithResponse(requestOptions, context);
    }
}
