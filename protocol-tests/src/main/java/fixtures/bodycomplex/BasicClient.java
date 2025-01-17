package fixtures.bodycomplex;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.bodycomplex.implementation.BasicsImpl;

/** Initializes a new instance of the synchronous AutoRestComplexTestService type. */
@ServiceClient(builder = AutoRestComplexTestServiceBuilder.class)
public final class BasicClient {
    private final BasicsImpl serviceClient;

    /**
     * Initializes an instance of Basics client.
     *
     * @param serviceClient the service client implementation.
     */
    BasicClient(BasicsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String(cyan/Magenta/YELLOW/blacK)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex type {id: 2, name: 'abc', color: 'YELLOW'}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getValidWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getValidWithResponse(requestOptions, context);
    }

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String(cyan/Magenta/YELLOW/blacK)
     * }
     * }</pre>
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putValidWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return this.serviceClient.putValidWithResponse(complexBody, requestOptions, context);
    }

    /**
     * Get a basic complex type that is invalid for the local strong type.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String(cyan/Magenta/YELLOW/blacK)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a basic complex type that is invalid for the local strong type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getInvalidWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getInvalidWithResponse(requestOptions, context);
    }

    /**
     * Get a basic complex type that is empty.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String(cyan/Magenta/YELLOW/blacK)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a basic complex type that is empty.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getEmptyWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getEmptyWithResponse(requestOptions, context);
    }

    /**
     * Get a basic complex type whose properties are null.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String(cyan/Magenta/YELLOW/blacK)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a basic complex type whose properties are null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNullWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getNullWithResponse(requestOptions, context);
    }

    /**
     * Get a basic complex type while the server doesn't provide a response payload.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: Integer
     *     name: String
     *     color: String(cyan/Magenta/YELLOW/blacK)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return a basic complex type while the server doesn't provide a response payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getNotProvidedWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getNotProvidedWithResponse(requestOptions, context);
    }
}
