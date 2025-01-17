package fixtures.paging.implementation;

import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Pagings. */
public final class PagingsImpl {
    /** The proxy service used to perform REST calls. */
    private final PagingsService service;

    /** The service client containing this operation class. */
    private final AutoRestPagingTestServiceImpl client;

    /**
     * Initializes an instance of PagingsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PagingsImpl(AutoRestPagingTestServiceImpl client) {
        this.service = RestProxy.create(PagingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestPagingTestServicePagings to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestPagingTestSe")
    private interface PagingsService {
        @Get("/paging/noitemname")
        Mono<Response<BinaryData>> getNoItemNamePages(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/nullnextlink")
        Mono<Response<BinaryData>> getNullNextLinkNamePages(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/single")
        Mono<Response<BinaryData>> getSinglePages(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/firstResponseEmpty/1")
        Mono<Response<BinaryData>> firstResponseEmpty(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple")
        Mono<Response<BinaryData>> getMultiplePages(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/getWithQueryParams")
        Mono<Response<BinaryData>> getWithQueryParams(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/nextOperationWithQueryParams")
        Mono<Response<BinaryData>> nextOperationWithQueryParams(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/odata")
        Mono<Response<BinaryData>> getOdataMultiplePages(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/withpath/{offset}")
        Mono<Response<BinaryData>> getMultiplePagesWithOffset(
                @HostParam("$host") String host,
                @PathParam("offset") int offset,
                RequestOptions requestOptions,
                Context context);

        @Get("/paging/multiple/retryfirst")
        Mono<Response<BinaryData>> getMultiplePagesRetryFirst(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/retrysecond")
        Mono<Response<BinaryData>> getMultiplePagesRetrySecond(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/single/failure")
        Mono<Response<BinaryData>> getSinglePagesFailure(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/failure")
        Mono<Response<BinaryData>> getMultiplePagesFailure(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/failureuri")
        Mono<Response<BinaryData>> getMultiplePagesFailureUri(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/fragment/{tenant}")
        Mono<Response<BinaryData>> getMultiplePagesFragmentNextLink(
                @HostParam("$host") String host,
                @PathParam("tenant") String tenant,
                RequestOptions requestOptions,
                Context context);

        @Get("/paging/multiple/fragmentwithgrouping/{tenant}")
        Mono<Response<BinaryData>> getMultiplePagesFragmentWithGroupingNextLink(
                @HostParam("$host") String host,
                @PathParam("tenant") String tenant,
                RequestOptions requestOptions,
                Context context);

        @Post("/paging/multiple/lro")
        Mono<Response<BinaryData>> getMultiplePagesLRO(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("/paging/multiple/fragment/{tenant}/{nextLink}")
        Mono<Response<BinaryData>> nextFragment(
                @HostParam("$host") String host,
                @PathParam("tenant") String tenant,
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                RequestOptions requestOptions,
                Context context);

        @Get("/paging/multiple/fragmentwithgrouping/{tenant}/{nextLink}")
        Mono<Response<BinaryData>> nextFragmentWithGrouping(
                @HostParam("$host") String host,
                @PathParam("tenant") String tenant,
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                RequestOptions requestOptions,
                Context context);

        @Get("/paging/itemNameWithXMSClientName")
        Mono<Response<BinaryData>> getPagingModelWithItemNameWithXMSClientName(
                @HostParam("$host") String host, RequestOptions requestOptions, Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getNoItemNamePagesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getSinglePagesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> firstResponseEmptyNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getMultiplePagesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getOdataMultiplePagesNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getMultiplePagesWithOffsetNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getMultiplePagesRetryFirstNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getMultiplePagesRetrySecondNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getSinglePagesFailureNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getMultiplePagesFailureNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getMultiplePagesFailureUriNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getMultiplePagesLRONext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        Mono<Response<BinaryData>> getPagingModelWithItemNameWithXMSClientNameNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * A paging operation that must return result of the default 'value' node.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getNoItemNamePagesSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getNoItemNamePages(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that must return result of the default 'value' node.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getNoItemNamePagesSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getNoItemNamePages(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that must return result of the default 'value' node.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getNoItemNamePagesAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getNoItemNamePagesSinglePageAsync(requestOptions),
                nextLink -> getNoItemNamePagesNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that must return result of the default 'value' node.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getNoItemNamePagesAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getNoItemNamePagesSinglePageAsync(requestOptions, context),
                nextLink -> getNoItemNamePagesNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that must return result of the default 'value' node.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getNoItemNamePages(RequestOptions requestOptions) {
        return new PagedIterable<>(getNoItemNamePagesAsync(requestOptions));
    }

    /**
     * A paging operation that must return result of the default 'value' node.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getNoItemNamePages(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getNoItemNamePagesAsync(requestOptions, context));
    }

    /**
     * A paging operation that must ignore any kind of nextLink, and stop after page 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getNullNextLinkNamePagesSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getNullNextLinkNamePages(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        null,
                                        null));
    }

    /**
     * A paging operation that must ignore any kind of nextLink, and stop after page 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getNullNextLinkNamePagesSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getNullNextLinkNamePages(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        null,
                                        null));
    }

    /**
     * A paging operation that must ignore any kind of nextLink, and stop after page 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getNullNextLinkNamePagesAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(() -> getNullNextLinkNamePagesSinglePageAsync(requestOptions));
    }

    /**
     * A paging operation that must ignore any kind of nextLink, and stop after page 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getNullNextLinkNamePagesAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(() -> getNullNextLinkNamePagesSinglePageAsync(requestOptions, context));
    }

    /**
     * A paging operation that must ignore any kind of nextLink, and stop after page 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getNullNextLinkNamePages(RequestOptions requestOptions) {
        return new PagedIterable<>(getNullNextLinkNamePagesAsync(requestOptions));
    }

    /**
     * A paging operation that must ignore any kind of nextLink, and stop after page 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getNullNextLinkNamePages(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getNullNextLinkNamePagesAsync(requestOptions, context));
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getSinglePagesSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getSinglePages(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getSinglePagesSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getSinglePages(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getSinglePagesAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getSinglePagesSinglePageAsync(requestOptions),
                nextLink -> getSinglePagesNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getSinglePagesAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getSinglePagesSinglePageAsync(requestOptions, context),
                nextLink -> getSinglePagesNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getSinglePages(RequestOptions requestOptions) {
        return new PagedIterable<>(getSinglePagesAsync(requestOptions));
    }

    /**
     * A paging operation that finishes on the first call without a nextlink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getSinglePages(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getSinglePagesAsync(requestOptions, context));
    }

    /**
     * A paging operation whose first response's items list is empty, but still returns a next link. Second (and final)
     * call, will give you an items list of 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> firstResponseEmptySinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.firstResponseEmpty(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation whose first response's items list is empty, but still returns a next link. Second (and final)
     * call, will give you an items list of 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> firstResponseEmptySinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.firstResponseEmpty(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation whose first response's items list is empty, but still returns a next link. Second (and final)
     * call, will give you an items list of 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> firstResponseEmptyAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> firstResponseEmptySinglePageAsync(requestOptions),
                nextLink -> firstResponseEmptyNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation whose first response's items list is empty, but still returns a next link. Second (and final)
     * call, will give you an items list of 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> firstResponseEmptyAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> firstResponseEmptySinglePageAsync(requestOptions, context),
                nextLink -> firstResponseEmptyNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation whose first response's items list is empty, but still returns a next link. Second (and final)
     * call, will give you an items list of 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> firstResponseEmpty(RequestOptions requestOptions) {
        return new PagedIterable<>(firstResponseEmptyAsync(requestOptions));
    }

    /**
     * A paging operation whose first response's items list is empty, but still returns a next link. Second (and final)
     * call, will give you an items list of 1.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> firstResponseEmpty(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(firstResponseEmptyAsync(requestOptions, context));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.getMultiplePages(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getMultiplePages(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesSinglePageAsync(requestOptions),
                nextLink -> getMultiplePagesNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesSinglePageAsync(requestOptions, context),
                nextLink -> getMultiplePagesNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePages(RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesAsync(requestOptions));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePages(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesAsync(requestOptions, context));
    }

    /**
     * A paging operation that includes a next operation. It has a different query parameter from it's next operation
     * nextOperationWithQueryParams. Returns a ProductResult.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredQueryParameter</td><td>int</td><td>Yes</td><td>A required integer query parameter. Put in value '100' to pass test.</td></tr>
     *     <tr><td>queryConstant</td><td>boolean</td><td>Yes</td><td>A constant. Must be True and will be passed as a query parameter to nextOperationWithQueryParams</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getWithQueryParamsSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getWithQueryParams(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a next operation. It has a different query parameter from it's next operation
     * nextOperationWithQueryParams. Returns a ProductResult.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredQueryParameter</td><td>int</td><td>Yes</td><td>A required integer query parameter. Put in value '100' to pass test.</td></tr>
     *     <tr><td>queryConstant</td><td>boolean</td><td>Yes</td><td>A constant. Must be True and will be passed as a query parameter to nextOperationWithQueryParams</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getWithQueryParamsSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getWithQueryParams(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a next operation. It has a different query parameter from it's next operation
     * nextOperationWithQueryParams. Returns a ProductResult.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredQueryParameter</td><td>int</td><td>Yes</td><td>A required integer query parameter. Put in value '100' to pass test.</td></tr>
     *     <tr><td>queryConstant</td><td>boolean</td><td>Yes</td><td>A constant. Must be True and will be passed as a query parameter to nextOperationWithQueryParams</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getWithQueryParamsAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getWithQueryParamsSinglePageAsync(requestOptions),
                nextLink -> nextOperationWithQueryParamsSinglePageAsync(null));
    }

    /**
     * A paging operation that includes a next operation. It has a different query parameter from it's next operation
     * nextOperationWithQueryParams. Returns a ProductResult.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredQueryParameter</td><td>int</td><td>Yes</td><td>A required integer query parameter. Put in value '100' to pass test.</td></tr>
     *     <tr><td>queryConstant</td><td>boolean</td><td>Yes</td><td>A constant. Must be True and will be passed as a query parameter to nextOperationWithQueryParams</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getWithQueryParamsAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getWithQueryParamsSinglePageAsync(requestOptions, context),
                nextLink -> nextOperationWithQueryParamsSinglePageAsync(null, context));
    }

    /**
     * A paging operation that includes a next operation. It has a different query parameter from it's next operation
     * nextOperationWithQueryParams. Returns a ProductResult.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredQueryParameter</td><td>int</td><td>Yes</td><td>A required integer query parameter. Put in value '100' to pass test.</td></tr>
     *     <tr><td>queryConstant</td><td>boolean</td><td>Yes</td><td>A constant. Must be True and will be passed as a query parameter to nextOperationWithQueryParams</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getWithQueryParams(RequestOptions requestOptions) {
        return new PagedIterable<>(getWithQueryParamsAsync(requestOptions));
    }

    /**
     * A paging operation that includes a next operation. It has a different query parameter from it's next operation
     * nextOperationWithQueryParams. Returns a ProductResult.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>requiredQueryParameter</td><td>int</td><td>Yes</td><td>A required integer query parameter. Put in value '100' to pass test.</td></tr>
     *     <tr><td>queryConstant</td><td>boolean</td><td>Yes</td><td>A constant. Must be True and will be passed as a query parameter to nextOperationWithQueryParams</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getWithQueryParams(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getWithQueryParamsAsync(requestOptions, context));
    }

    /**
     * Next operation for getWithQueryParams. Pass in next=True to pass test. Returns a ProductResult.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>queryConstant</td><td>boolean</td><td>Yes</td><td>A constant. Must be True</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> nextOperationWithQueryParamsSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.nextOperationWithQueryParams(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        null,
                                        null));
    }

    /**
     * Next operation for getWithQueryParams. Pass in next=True to pass test. Returns a ProductResult.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>queryConstant</td><td>boolean</td><td>Yes</td><td>A constant. Must be True</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> nextOperationWithQueryParamsSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.nextOperationWithQueryParams(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        null,
                                        null));
    }

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getOdataMultiplePagesSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getOdataMultiplePages(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getOdataMultiplePagesSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getOdataMultiplePages(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getOdataMultiplePagesAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getOdataMultiplePagesSinglePageAsync(requestOptions),
                nextLink -> getOdataMultiplePagesNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getOdataMultiplePagesAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getOdataMultiplePagesSinglePageAsync(requestOptions, context),
                nextLink -> getOdataMultiplePagesNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getOdataMultiplePages(RequestOptions requestOptions) {
        return new PagedIterable<>(getOdataMultiplePagesAsync(requestOptions));
    }

    /**
     * A paging operation that includes a nextLink in odata format that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getOdataMultiplePages(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getOdataMultiplePagesAsync(requestOptions, context));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param offset Offset of return value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesWithOffsetSinglePageAsync(
            int offset, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesWithOffset(
                                        this.client.getHost(), offset, requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param offset Offset of return value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesWithOffsetSinglePageAsync(
            int offset, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesWithOffset(this.client.getHost(), offset, requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param offset Offset of return value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesWithOffsetAsync(int offset, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesWithOffsetSinglePageAsync(offset, requestOptions),
                nextLink -> getMultiplePagesWithOffsetNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param offset Offset of return value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesWithOffsetAsync(
            int offset, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesWithOffsetSinglePageAsync(offset, requestOptions, context),
                nextLink -> getMultiplePagesWithOffsetNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param offset Offset of return value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesWithOffset(int offset, RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesWithOffsetAsync(offset, requestOptions));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param offset Offset of return value.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesWithOffset(
            int offset, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesWithOffsetAsync(offset, requestOptions, context));
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a
     * nextLink that has 10 pages.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesRetryFirstSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getMultiplePagesRetryFirst(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a
     * nextLink that has 10 pages.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesRetryFirstSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesRetryFirst(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a
     * nextLink that has 10 pages.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesRetryFirstAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesRetryFirstSinglePageAsync(requestOptions),
                nextLink -> getMultiplePagesRetryFirstNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a
     * nextLink that has 10 pages.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesRetryFirstAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesRetryFirstSinglePageAsync(requestOptions, context),
                nextLink -> getMultiplePagesRetryFirstNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a
     * nextLink that has 10 pages.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesRetryFirst(RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesRetryFirstAsync(requestOptions));
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a
     * nextLink that has 10 pages.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesRetryFirst(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesRetryFirstAsync(requestOptions, context));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The
     * client should retry and finish all 10 pages eventually.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesRetrySecondSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getMultiplePagesRetrySecond(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The
     * client should retry and finish all 10 pages eventually.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesRetrySecondSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesRetrySecond(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The
     * client should retry and finish all 10 pages eventually.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesRetrySecondAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesRetrySecondSinglePageAsync(requestOptions),
                nextLink -> getMultiplePagesRetrySecondNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The
     * client should retry and finish all 10 pages eventually.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesRetrySecondAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesRetrySecondSinglePageAsync(requestOptions, context),
                nextLink -> getMultiplePagesRetrySecondNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The
     * client should retry and finish all 10 pages eventually.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesRetrySecond(RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesRetrySecondAsync(requestOptions));
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The
     * client should retry and finish all 10 pages eventually.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesRetrySecond(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesRetrySecondAsync(requestOptions, context));
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getSinglePagesFailureSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getSinglePagesFailure(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getSinglePagesFailureSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getSinglePagesFailure(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getSinglePagesFailureAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getSinglePagesFailureSinglePageAsync(requestOptions),
                nextLink -> getSinglePagesFailureNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getSinglePagesFailureAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getSinglePagesFailureSinglePageAsync(requestOptions, context),
                nextLink -> getSinglePagesFailureNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getSinglePagesFailure(RequestOptions requestOptions) {
        return new PagedIterable<>(getSinglePagesFailureAsync(requestOptions));
    }

    /**
     * A paging operation that receives a 400 on the first call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getSinglePagesFailure(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getSinglePagesFailureAsync(requestOptions, context));
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFailureSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getMultiplePagesFailure(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFailureSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesFailure(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesFailureAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesFailureSinglePageAsync(requestOptions),
                nextLink -> getMultiplePagesFailureNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesFailureAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesFailureSinglePageAsync(requestOptions, context),
                nextLink -> getMultiplePagesFailureNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFailure(RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesFailureAsync(requestOptions));
    }

    /**
     * A paging operation that receives a 400 on the second call.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFailure(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesFailureAsync(requestOptions, context));
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFailureUriSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getMultiplePagesFailureUri(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFailureUriSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesFailureUri(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesFailureUriAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesFailureUriSinglePageAsync(requestOptions),
                nextLink -> getMultiplePagesFailureUriNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesFailureUriAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesFailureUriSinglePageAsync(requestOptions, context),
                nextLink -> getMultiplePagesFailureUriNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFailureUri(RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesFailureUriAsync(requestOptions));
    }

    /**
     * A paging operation that receives an invalid nextLink.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFailureUri(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesFailureUriAsync(requestOptions, context));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFragmentNextLinkSinglePageAsync(
            String tenant, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesFragmentNextLink(
                                        this.client.getHost(), tenant, requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFragmentNextLinkSinglePageAsync(
            String tenant, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesFragmentNextLink(this.client.getHost(), tenant, requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesFragmentNextLinkAsync(String tenant, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesFragmentNextLinkSinglePageAsync(tenant, requestOptions),
                nextLink -> nextFragmentSinglePageAsync(tenant, nextLink, null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesFragmentNextLinkAsync(
            String tenant, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesFragmentNextLinkSinglePageAsync(tenant, requestOptions, context),
                nextLink -> nextFragmentSinglePageAsync(tenant, nextLink, null, context));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFragmentNextLink(String tenant, RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesFragmentNextLinkAsync(tenant, requestOptions));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFragmentNextLink(
            String tenant, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesFragmentNextLinkAsync(tenant, requestOptions, context));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFragmentWithGroupingNextLinkSinglePageAsync(
            String tenant, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesFragmentWithGroupingNextLink(
                                        this.client.getHost(), tenant, requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFragmentWithGroupingNextLinkSinglePageAsync(
            String tenant, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesFragmentWithGroupingNextLink(
                        this.client.getHost(), tenant, requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesFragmentWithGroupingNextLinkAsync(
            String tenant, RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesFragmentWithGroupingNextLinkSinglePageAsync(tenant, requestOptions),
                nextLink -> nextFragmentWithGroupingSinglePageAsync(tenant, nextLink, null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesFragmentWithGroupingNextLinkAsync(
            String tenant, RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesFragmentWithGroupingNextLinkSinglePageAsync(tenant, requestOptions, context),
                nextLink -> nextFragmentWithGroupingSinglePageAsync(tenant, nextLink, null, context));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFragmentWithGroupingNextLink(
            String tenant, RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesFragmentWithGroupingNextLinkAsync(tenant, requestOptions));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment with parameters grouped.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesFragmentWithGroupingNextLink(
            String tenant, RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesFragmentWithGroupingNextLinkAsync(tenant, requestOptions, context));
    }

    /**
     * A long-running paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesLROSinglePageAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getMultiplePagesLRO(this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A long-running paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesLROSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesLRO(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A long-running paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesLROAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getMultiplePagesLROSinglePageAsync(requestOptions),
                nextLink -> getMultiplePagesLRONextSinglePageAsync(nextLink, null));
    }

    /**
     * A long-running paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getMultiplePagesLROAsync(RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getMultiplePagesLROSinglePageAsync(requestOptions, context),
                nextLink -> getMultiplePagesLRONextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A long-running paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesLRO(RequestOptions requestOptions) {
        return new PagedIterable<>(getMultiplePagesLROAsync(requestOptions));
    }

    /**
     * A long-running paging operation that includes a nextLink that has 10 pages.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getMultiplePagesLRO(RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getMultiplePagesLROAsync(requestOptions, context));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param nextLink Next link for list operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> nextFragmentSinglePageAsync(
            String tenant, String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.nextFragment(this.client.getHost(), tenant, nextLink, requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param nextLink Next link for list operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> nextFragmentSinglePageAsync(
            String tenant, String nextLink, RequestOptions requestOptions, Context context) {
        return service.nextFragment(this.client.getHost(), tenant, nextLink, requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param nextLink Next link for list operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> nextFragmentWithGroupingSinglePageAsync(
            String tenant, String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.nextFragmentWithGrouping(
                                        this.client.getHost(), tenant, nextLink, requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that doesn't return a full URL, just a fragment.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Sets the api version to use.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param tenant Sets the tenant to use.
     * @param nextLink Next link for list operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> nextFragmentWithGroupingSinglePageAsync(
            String tenant, String nextLink, RequestOptions requestOptions, Context context) {
        return service.nextFragmentWithGrouping(this.client.getHost(), tenant, nextLink, requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * A paging operation that returns a paging model whose item name is is overriden by x-ms-client-name 'indexes'.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     indexes: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getPagingModelWithItemNameWithXMSClientNameSinglePageAsync(
            RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getPagingModelWithItemNameWithXMSClientName(
                                        this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that returns a paging model whose item name is is overriden by x-ms-client-name 'indexes'.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     indexes: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getPagingModelWithItemNameWithXMSClientNameSinglePageAsync(
            RequestOptions requestOptions, Context context) {
        return service.getPagingModelWithItemNameWithXMSClientName(this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * A paging operation that returns a paging model whose item name is is overriden by x-ms-client-name 'indexes'.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     indexes: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getPagingModelWithItemNameWithXMSClientNameAsync(RequestOptions requestOptions) {
        return new PagedFlux<>(
                () -> getPagingModelWithItemNameWithXMSClientNameSinglePageAsync(requestOptions),
                nextLink -> getPagingModelWithItemNameWithXMSClientNameNextSinglePageAsync(nextLink, null));
    }

    /**
     * A paging operation that returns a paging model whose item name is is overriden by x-ms-client-name 'indexes'.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     indexes: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> getPagingModelWithItemNameWithXMSClientNameAsync(
            RequestOptions requestOptions, Context context) {
        return new PagedFlux<>(
                () -> getPagingModelWithItemNameWithXMSClientNameSinglePageAsync(requestOptions, context),
                nextLink -> getPagingModelWithItemNameWithXMSClientNameNextSinglePageAsync(nextLink, null, context));
    }

    /**
     * A paging operation that returns a paging model whose item name is is overriden by x-ms-client-name 'indexes'.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     indexes: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getPagingModelWithItemNameWithXMSClientName(RequestOptions requestOptions) {
        return new PagedIterable<>(getPagingModelWithItemNameWithXMSClientNameAsync(requestOptions));
    }

    /**
     * A paging operation that returns a paging model whose item name is is overriden by x-ms-client-name 'indexes'.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     indexes: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> getPagingModelWithItemNameWithXMSClientName(
            RequestOptions requestOptions, Context context) {
        return new PagedIterable<>(getPagingModelWithItemNameWithXMSClientNameAsync(requestOptions, context));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getNoItemNamePagesNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getNoItemNamePagesNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getNoItemNamePagesNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getNoItemNamePagesNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getSinglePagesNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context -> service.getSinglePagesNext(nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getSinglePagesNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getSinglePagesNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> firstResponseEmptyNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.firstResponseEmptyNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> firstResponseEmptyNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.firstResponseEmptyNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesNext(nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getOdataMultiplePagesNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getOdataMultiplePagesNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     odataNextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getOdataMultiplePagesNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getOdataMultiplePagesNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesWithOffsetNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesWithOffsetNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesWithOffsetNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesWithOffsetNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesRetryFirstNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesRetryFirstNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesRetryFirstNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesRetryFirstNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesRetrySecondNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesRetrySecondNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesRetrySecondNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesRetrySecondNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getSinglePagesFailureNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getSinglePagesFailureNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getSinglePagesFailureNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getSinglePagesFailureNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFailureNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesFailureNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFailureNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesFailureNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFailureUriNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesFailureUriNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesFailureUriNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesFailureUriNext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesLRONextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getMultiplePagesLRONext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>clientRequestId</td><td>String</td><td>No</td><td>The clientRequestId parameter</td></tr>
     *     <tr><td>maxresults</td><td>String</td><td>No</td><td>Sets the maximum number of items to return in the response.</td></tr>
     *     <tr><td>timeout</td><td>String</td><td>No</td><td>Sets the maximum time that the server can spend processing the request, in seconds. The default is 30 seconds.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     values: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getMultiplePagesLRONextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getMultiplePagesLRONext(nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     indexes: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getPagingModelWithItemNameWithXMSClientNameNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions) {
        return FluxUtil.withContext(
                        context ->
                                service.getPagingModelWithItemNameWithXMSClientNameNext(
                                        nextLink, this.client.getHost(), requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     indexes: [
     *         {
     *             properties: {
     *                 id: Integer
     *                 name: String
     *             }
     *         }
     *     ]
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @param context The context to associate with this operation.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<BinaryData>> getPagingModelWithItemNameWithXMSClientNameNextSinglePageAsync(
            String nextLink, RequestOptions requestOptions, Context context) {
        return service.getPagingModelWithItemNameWithXMSClientNameNext(
                        nextLink, this.client.getHost(), requestOptions, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "values"),
                                        getNextLink(res.getValue(), "nextLink"),
                                        null));
    }

    private List<BinaryData> getValues(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            List<?> values = (List<?>) obj.get(path);
            return values.stream().map(BinaryData::fromObject).collect(Collectors.toList());
        } catch (RuntimeException e) {
            return null;
        }
    }

    private String getNextLink(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            return (String) obj.get(path);
        } catch (RuntimeException e) {
            return null;
        }
    }
}
