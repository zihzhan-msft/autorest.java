package fixtures.bodycomplex;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.implementation.DictionariesImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AutoRestComplexTestService type. */
@ServiceClient(builder = AutoRestComplexTestServiceBuilder.class, isAsync = true)
public final class DictionaryAsyncClient {
    private final DictionariesImpl serviceClient;

    /**
     * Initializes an instance of Dictionaries client.
     *
     * @param serviceClient the service client implementation.
     */
    DictionaryAsyncClient(DictionariesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get complex types with dictionary property.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     defaultProgram: {
     *         String: String
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with dictionary property.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getValidWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getValidWithResponseAsync(requestOptions);
    }

    /**
     * Put complex types with dictionary property.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     defaultProgram: {
     *         String: String
     *     }
     * }
     * }</pre>
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint",
     *     "xls":"excel", "exe":"", "":null.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putValidWithResponse(BinaryData complexBody, RequestOptions requestOptions) {
        return this.serviceClient.putValidWithResponseAsync(complexBody, requestOptions);
    }

    /**
     * Get complex types with dictionary property which is empty.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     defaultProgram: {
     *         String: String
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with dictionary property which is empty.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getEmptyWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getEmptyWithResponseAsync(requestOptions);
    }

    /**
     * Put complex types with dictionary property which is empty.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     defaultProgram: {
     *         String: String
     *     }
     * }
     * }</pre>
     *
     * @param complexBody Please put an empty dictionary.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putEmptyWithResponse(BinaryData complexBody, RequestOptions requestOptions) {
        return this.serviceClient.putEmptyWithResponseAsync(complexBody, requestOptions);
    }

    /**
     * Get complex types with dictionary property which is null.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     defaultProgram: {
     *         String: String
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with dictionary property which is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNullWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getNullWithResponseAsync(requestOptions);
    }

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     defaultProgram: {
     *         String: String
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return complex types with dictionary property while server doesn't provide a response payload.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getNotProvidedWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getNotProvidedWithResponseAsync(requestOptions);
    }
}
