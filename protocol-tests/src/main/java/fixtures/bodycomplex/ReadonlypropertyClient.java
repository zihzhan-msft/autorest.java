package fixtures.bodycomplex;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.bodycomplex.implementation.ReadonlypropertiesImpl;

/** Initializes a new instance of the synchronous AutoRestComplexTestService type. */
@ServiceClient(builder = AutoRestComplexTestServiceBuilder.class)
public final class ReadonlypropertyClient {
    private final ReadonlypropertiesImpl serviceClient;

    /**
     * Initializes an instance of Readonlyproperties client.
     *
     * @param serviceClient the service client implementation.
     */
    ReadonlypropertyClient(ReadonlypropertiesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex types that have readonly properties.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     size: Integer
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types that have readonly properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getValidWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.getValidWithResponse(requestOptions, context);
    }

    /**
     * Put complex types that have readonly properties.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String
     *     size: Integer
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
    public Response<Void> putValidWithResponse(BinaryData complexBody, RequestOptions requestOptions, Context context) {
        return this.serviceClient.putValidWithResponse(complexBody, requestOptions, context);
    }
}
