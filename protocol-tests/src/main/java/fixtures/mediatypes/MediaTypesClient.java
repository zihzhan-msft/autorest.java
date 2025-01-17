package fixtures.mediatypes;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import fixtures.mediatypes.implementation.MediaTypesClientImpl;

/** Initializes a new instance of the synchronous MediaTypesClient type. */
@ServiceClient(builder = MediaTypesClientBuilder.class)
public final class MediaTypesClient {
    private final MediaTypesClientImpl serviceClient;

    /**
     * Initializes an instance of MediaTypesClient client.
     *
     * @param serviceClient the service client implementation.
     */
    MediaTypesClient(MediaTypesClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Analyze body, that could be different media types.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>contentType</td><td>String</td><td>Yes</td><td>Upload file type</td></tr>
     *     <tr><td>contentLength</td><td>String</td><td>No</td><td>The contentLength parameter</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> analyzeBodyWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.analyzeBodyWithResponse(requestOptions, context);
    }

    /**
     * Analyze body, that could be different media types. Adds to AnalyzeBody by not having an accept type.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>contentType</td><td>String</td><td>Yes</td><td>Upload file type</td></tr>
     *     <tr><td>contentLength</td><td>String</td><td>No</td><td>The contentLength parameter</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> analyzeBodyNoAcceptHeaderWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.analyzeBodyNoAcceptHeaderWithResponse(requestOptions, context);
    }

    /**
     * Pass in contentType 'text/plain; encoding=UTF-8' to pass test. Value for input does not matter.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * String
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> contentTypeWithEncodingWithResponse(RequestOptions requestOptions, Context context) {
        return this.serviceClient.contentTypeWithEncodingWithResponse(requestOptions, context);
    }
}
