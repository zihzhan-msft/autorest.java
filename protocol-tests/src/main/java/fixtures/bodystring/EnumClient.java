package fixtures.bodystring;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.bodystring.implementation.EnumsImpl;

/** Initializes a new instance of the synchronous AutoRestSwaggerBATService type. */
@ServiceClient(builder = AutoRestSwaggerBATServiceBuilder.class)
public final class EnumClient {
    private final EnumsImpl serviceClient;

    /**
     * Initializes an instance of Enums client.
     *
     * @param serviceClient the service client implementation.
     */
    EnumClient(EnumsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String(red color/green-color/blue_color)
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<String> getNotExpandableWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getNotExpandableWithResponse(requestOptions, context);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * String(red color/green-color/blue_color)
     * }</pre>
     *
     * @param stringBody string body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putNotExpandableWithResponse(
            BinaryData stringBody, RequestOptions requestOptions, Context context) {
        return this.serviceClient.putNotExpandableWithResponse(stringBody, requestOptions, context);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String(red color/green-color/blue_color)
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<String> getReferencedWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getReferencedWithResponse(requestOptions, context);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * String(red color/green-color/blue_color)
     * }</pre>
     *
     * @param enumStringBody enum string body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putReferencedWithResponse(
            BinaryData enumStringBody, RequestOptions requestOptions, Context context) {
        return this.serviceClient.putReferencedWithResponse(enumStringBody, requestOptions, context);
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     colorConstant: String
     *     field1: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return value 'green-color' from the constant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getReferencedConstantWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getReferencedConstantWithResponse(requestOptions, context);
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     colorConstant: String
     *     field1: String
     * }
     * }</pre>
     *
     * @param enumStringBody enum string body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putReferencedConstantWithResponse(
            BinaryData enumStringBody, RequestOptions requestOptions, Context context) {
        return this.serviceClient.putReferencedConstantWithResponse(enumStringBody, requestOptions, context);
    }
}
