package fixtures.url;

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
import fixtures.url.implementation.AutoRestUrlTestServiceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the AutoRestUrlTestService type. */
@ServiceClientBuilder(
        serviceClients = {
            PathsClient.class,
            QueriesClient.class,
            PathItemsClient.class,
            PathsAsyncClient.class,
            QueriesAsyncClient.class,
            PathItemsAsyncClient.class
        })
public final class AutoRestUrlTestServiceBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the AutoRestUrlTestServiceBuilder. */
    public AutoRestUrlTestServiceBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * A string value 'globalItemStringPath' that appears in the path
     */
    private String globalStringPath;

    /**
     * Sets A string value 'globalItemStringPath' that appears in the path.
     *
     * @param globalStringPath the globalStringPath value.
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder globalStringPath(String globalStringPath) {
        this.globalStringPath = globalStringPath;
        return this;
    }

    /*
     * should contain value null
     */
    private String globalStringQuery;

    /**
     * Sets should contain value null.
     *
     * @param globalStringQuery the globalStringQuery value.
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder globalStringQuery(String globalStringQuery) {
        this.globalStringQuery = globalStringQuery;
        return this;
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder host(String host) {
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
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder pipeline(HttpPipeline pipeline) {
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
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder httpClient(HttpClient httpClient) {
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
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder configuration(Configuration configuration) {
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
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
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
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder retryPolicy(RetryPolicy retryPolicy) {
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
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the AutoRestUrlTestServiceBuilder.
     */
    public AutoRestUrlTestServiceBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of AutoRestUrlTestServiceImpl with the provided parameters.
     *
     * @return an instance of AutoRestUrlTestServiceImpl.
     */
    private AutoRestUrlTestServiceImpl buildInnerClient() {
        if (host == null) {
            this.host = "http://localhost:3000";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        AutoRestUrlTestServiceImpl client =
                new AutoRestUrlTestServiceImpl(
                        pipeline,
                        JacksonAdapter.createDefaultSerializerAdapter(),
                        globalStringPath,
                        globalStringQuery,
                        host);
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
     * Builds an instance of PathsAsyncClient async client.
     *
     * @return an instance of PathsAsyncClient.
     */
    public PathsAsyncClient buildPathsAsyncClient() {
        return new PathsAsyncClient(buildInnerClient().getPaths());
    }

    /**
     * Builds an instance of QueriesAsyncClient async client.
     *
     * @return an instance of QueriesAsyncClient.
     */
    public QueriesAsyncClient buildQueriesAsyncClient() {
        return new QueriesAsyncClient(buildInnerClient().getQueries());
    }

    /**
     * Builds an instance of PathItemsAsyncClient async client.
     *
     * @return an instance of PathItemsAsyncClient.
     */
    public PathItemsAsyncClient buildPathItemsAsyncClient() {
        return new PathItemsAsyncClient(buildInnerClient().getPathItems());
    }

    /**
     * Builds an instance of PathsClient sync client.
     *
     * @return an instance of PathsClient.
     */
    public PathsClient buildPathsClient() {
        return new PathsClient(buildInnerClient().getPaths());
    }

    /**
     * Builds an instance of QueriesClient sync client.
     *
     * @return an instance of QueriesClient.
     */
    public QueriesClient buildQueriesClient() {
        return new QueriesClient(buildInnerClient().getQueries());
    }

    /**
     * Builds an instance of PathItemsClient sync client.
     *
     * @return an instance of PathItemsClient.
     */
    public PathItemsClient buildPathItemsClient() {
        return new PathItemsClient(buildInnerClient().getPathItems());
    }
}
