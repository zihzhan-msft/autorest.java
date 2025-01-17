package fixtures.mediatypes.implementation;

import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the MediaTypesClient type. */
public final class MediaTypesClientImpl {
    /** The proxy service used to perform REST calls. */
    private final MediaTypesClientService service;

    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of MediaTypesClient client.
     *
     * @param host server parameter.
     */
    public MediaTypesClientImpl(String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                host);
    }

    /**
     * Initializes an instance of MediaTypesClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     */
    public MediaTypesClientImpl(HttpPipeline httpPipeline, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of MediaTypesClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     */
    public MediaTypesClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.service = RestProxy.create(MediaTypesClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for MediaTypesClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MediaTypesClient")
    private interface MediaTypesClientService {
        @Post("/mediatypes/analyze")
        Mono<Response<BinaryData>> analyzeBody(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/analyzeNoAccept")
        Mono<Response<Void>> analyzeBodyNoAcceptHeader(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/contentTypeWithEncoding")
        Mono<Response<BinaryData>> contentTypeWithEncoding(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);
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
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeBodyWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.analyzeBody(this.getHost(), requestOptions, context));
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
    public Mono<Response<BinaryData>> analyzeBodyWithResponseAsync(RequestOptions requestOptions, Context context) {
        return service.analyzeBody(this.getHost(), requestOptions, context);
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
        return analyzeBodyWithResponseAsync(requestOptions, context).block();
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
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> analyzeBodyNoAcceptHeaderWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.analyzeBodyNoAcceptHeader(this.getHost(), requestOptions, context));
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
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> analyzeBodyNoAcceptHeaderWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.analyzeBodyNoAcceptHeader(this.getHost(), requestOptions, context);
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
        return analyzeBodyNoAcceptHeaderWithResponseAsync(requestOptions, context).block();
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
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> contentTypeWithEncodingWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                context -> service.contentTypeWithEncoding(this.getHost(), requestOptions, context));
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
    public Mono<Response<BinaryData>> contentTypeWithEncodingWithResponseAsync(
            RequestOptions requestOptions, Context context) {
        return service.contentTypeWithEncoding(this.getHost(), requestOptions, context);
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
        return contentTypeWithEncodingWithResponseAsync(requestOptions, context).block();
    }
}
