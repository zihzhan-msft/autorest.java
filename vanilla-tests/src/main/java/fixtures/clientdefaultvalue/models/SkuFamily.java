package fixtures.clientdefaultvalue.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuFamily. */
public final class SkuFamily extends ExpandableStringEnum<SkuFamily> {
    /** Static value A for SkuFamily. */
    public static final SkuFamily A = fromString("A");

    /**
     * Creates or finds a SkuFamily from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuFamily.
     */
    @JsonCreator
    public static SkuFamily fromString(String name) {
        return fromString(name, SkuFamily.class);
    }

    /** @return known SkuFamily values. */
    public static Collection<SkuFamily> values() {
        return values(SkuFamily.class);
    }
}
