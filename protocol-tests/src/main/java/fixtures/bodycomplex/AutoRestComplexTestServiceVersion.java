package fixtures.bodycomplex;

import com.azure.core.util.ServiceVersion;

/** Service version of AutoRestComplexTestService. */
public enum AutoRestComplexTestServiceVersion implements ServiceVersion {
    /** Enum value 2016-02-29. */
    V2016_02_29("2016-02-29");

    private final String version;

    AutoRestComplexTestServiceVersion(String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link AutoRestComplexTestServiceVersion}.
     */
    public static AutoRestComplexTestServiceVersion getLatest() {
        return V2016_02_29;
    }
}
