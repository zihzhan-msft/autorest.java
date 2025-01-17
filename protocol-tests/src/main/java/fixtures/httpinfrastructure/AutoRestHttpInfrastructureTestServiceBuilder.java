package fixtures.httpinfrastructure;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JacksonAdapter;
import fixtures.httpinfrastructure.implementation.AutoRestHttpInfrastructureTestServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the AutoRestHttpInfrastructureTestService type. */
@ServiceClientBuilder(
        serviceClients = {
            HttpFailureClient.class,
            HttpSuccessClient.class,
            HttpRedirectsClient.class,
            HttpClientFailureClient.class,
            HttpServerFailureClient.class,
            HttpRetryClient.class,
            MultipleResponsesClient.class,
            HttpFailureAsyncClient.class,
            HttpSuccessAsyncClient.class,
            HttpRedirectsAsyncClient.class,
            HttpClientFailureAsyncClient.class,
            HttpServerFailureAsyncClient.class,
            HttpRetryAsyncClient.class,
            MultipleResponsesAsyncClient.class
        })
public final class AutoRestHttpInfrastructureTestServiceBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the AutoRestHttpInfrastructureTestServiceBuilder. */
    public AutoRestHttpInfrastructureTestServiceBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the AutoRestHttpInfrastructureTestServiceBuilder.
     */
    public AutoRestHttpInfrastructureTestServiceBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AutoRestHttpInfrastructureTestServiceBuilder.
     */
    public AutoRestHttpInfrastructureTestServiceBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the AutoRestHttpInfrastructureTestServiceBuilder.
     */
    public AutoRestHttpInfrastructureTestServiceBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the AutoRestHttpInfrastructureTestServiceBuilder.
     */
    public AutoRestHttpInfrastructureTestServiceBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the AutoRestHttpInfrastructureTestServiceBuilder.
     */
    public AutoRestHttpInfrastructureTestServiceBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the AutoRestHttpInfrastructureTestServiceBuilder.
     */
    public AutoRestHttpInfrastructureTestServiceBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /*
     * The client options such as application ID and custom headers to set on a
     * request.
     */
    private ClientOptions clientOptions;

    /**
     * Sets The client options such as application ID and custom headers to set on a request.
     *
     * @param clientOptions the clientOptions value.
     * @return the AutoRestHttpInfrastructureTestServiceBuilder.
     */
    public AutoRestHttpInfrastructureTestServiceBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the AutoRestHttpInfrastructureTestServiceBuilder.
     */
    public AutoRestHttpInfrastructureTestServiceBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of AutoRestHttpInfrastructureTestServiceImpl with the provided parameters.
     *
     * @return an instance of AutoRestHttpInfrastructureTestServiceImpl.
     */
    private AutoRestHttpInfrastructureTestServiceImpl buildInnerClient() {
        if (host == null) {
            this.host = "http://localhost:3000";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        AutoRestHttpInfrastructureTestServiceImpl client =
                new AutoRestHttpInfrastructureTestServiceImpl(
                        pipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        if (clientOptions == null) {
            clientOptions = new ClientOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(clientOptions, httpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        HttpHeaders headers = new HttpHeaders();
        clientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of HttpFailureAsyncClient async client.
     *
     * @return an instance of HttpFailureAsyncClient.
     */
    public HttpFailureAsyncClient buildHttpFailureAsyncClient() {
        return new HttpFailureAsyncClient(buildInnerClient().getHttpFailures());
    }

    /**
     * Builds an instance of HttpSuccessAsyncClient async client.
     *
     * @return an instance of HttpSuccessAsyncClient.
     */
    public HttpSuccessAsyncClient buildHttpSuccessAsyncClient() {
        return new HttpSuccessAsyncClient(buildInnerClient().getHttpSuccess());
    }

    /**
     * Builds an instance of HttpRedirectsAsyncClient async client.
     *
     * @return an instance of HttpRedirectsAsyncClient.
     */
    public HttpRedirectsAsyncClient buildHttpRedirectsAsyncClient() {
        return new HttpRedirectsAsyncClient(buildInnerClient().getHttpRedirects());
    }

    /**
     * Builds an instance of HttpClientFailureAsyncClient async client.
     *
     * @return an instance of HttpClientFailureAsyncClient.
     */
    public HttpClientFailureAsyncClient buildHttpClientFailureAsyncClient() {
        return new HttpClientFailureAsyncClient(buildInnerClient().getHttpClientFailures());
    }

    /**
     * Builds an instance of HttpServerFailureAsyncClient async client.
     *
     * @return an instance of HttpServerFailureAsyncClient.
     */
    public HttpServerFailureAsyncClient buildHttpServerFailureAsyncClient() {
        return new HttpServerFailureAsyncClient(buildInnerClient().getHttpServerFailures());
    }

    /**
     * Builds an instance of HttpRetryAsyncClient async client.
     *
     * @return an instance of HttpRetryAsyncClient.
     */
    public HttpRetryAsyncClient buildHttpRetryAsyncClient() {
        return new HttpRetryAsyncClient(buildInnerClient().getHttpRetries());
    }

    /**
     * Builds an instance of MultipleResponsesAsyncClient async client.
     *
     * @return an instance of MultipleResponsesAsyncClient.
     */
    public MultipleResponsesAsyncClient buildMultipleResponsesAsyncClient() {
        return new MultipleResponsesAsyncClient(buildInnerClient().getMultipleResponses());
    }

    /**
     * Builds an instance of HttpFailureClient sync client.
     *
     * @return an instance of HttpFailureClient.
     */
    public HttpFailureClient buildHttpFailureClient() {
        return new HttpFailureClient(buildInnerClient().getHttpFailures());
    }

    /**
     * Builds an instance of HttpSuccessClient sync client.
     *
     * @return an instance of HttpSuccessClient.
     */
    public HttpSuccessClient buildHttpSuccessClient() {
        return new HttpSuccessClient(buildInnerClient().getHttpSuccess());
    }

    /**
     * Builds an instance of HttpRedirectsClient sync client.
     *
     * @return an instance of HttpRedirectsClient.
     */
    public HttpRedirectsClient buildHttpRedirectsClient() {
        return new HttpRedirectsClient(buildInnerClient().getHttpRedirects());
    }

    /**
     * Builds an instance of HttpClientFailureClient sync client.
     *
     * @return an instance of HttpClientFailureClient.
     */
    public HttpClientFailureClient buildHttpClientFailureClient() {
        return new HttpClientFailureClient(buildInnerClient().getHttpClientFailures());
    }

    /**
     * Builds an instance of HttpServerFailureClient sync client.
     *
     * @return an instance of HttpServerFailureClient.
     */
    public HttpServerFailureClient buildHttpServerFailureClient() {
        return new HttpServerFailureClient(buildInnerClient().getHttpServerFailures());
    }

    /**
     * Builds an instance of HttpRetryClient sync client.
     *
     * @return an instance of HttpRetryClient.
     */
    public HttpRetryClient buildHttpRetryClient() {
        return new HttpRetryClient(buildInnerClient().getHttpRetries());
    }

    /**
     * Builds an instance of MultipleResponsesClient sync client.
     *
     * @return an instance of MultipleResponsesClient.
     */
    public MultipleResponsesClient buildMultipleResponsesClient() {
        return new MultipleResponsesClient(buildInnerClient().getMultipleResponses());
    }
}
