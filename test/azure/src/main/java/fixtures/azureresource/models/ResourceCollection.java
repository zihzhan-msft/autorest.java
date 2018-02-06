/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The ResourceCollection model.
 */
public final class ResourceCollection {
    /**
     * The productresource property.
     */
    @JsonProperty(value = "productresource")
    private FlattenedProduct productresource;

    /**
     * The arrayofresources property.
     */
    @JsonProperty(value = "arrayofresources")
    private List<FlattenedProduct> arrayofresources;

    /**
     * The dictionaryofresources property.
     */
    @JsonProperty(value = "dictionaryofresources")
    private Map<String, FlattenedProduct> dictionaryofresources;

    /**
     * Get the productresource value.
     *
     * @return the productresource value.
     */
    public FlattenedProduct productresource() {
        return this.productresource;
    }

    /**
     * Set the productresource value.
     *
     * @param productresource the productresource value to set.
     * @return the ResourceCollection object itself.
     */
    public ResourceCollection withProductresource(FlattenedProduct productresource) {
        this.productresource = productresource;
        return this;
    }

    /**
     * Get the arrayofresources value.
     *
     * @return the arrayofresources value.
     */
    public List<FlattenedProduct> arrayofresources() {
        return this.arrayofresources;
    }

    /**
     * Set the arrayofresources value.
     *
     * @param arrayofresources the arrayofresources value to set.
     * @return the ResourceCollection object itself.
     */
    public ResourceCollection withArrayofresources(List<FlattenedProduct> arrayofresources) {
        this.arrayofresources = arrayofresources;
        return this;
    }

    /**
     * Get the dictionaryofresources value.
     *
     * @return the dictionaryofresources value.
     */
    public Map<String, FlattenedProduct> dictionaryofresources() {
        return this.dictionaryofresources;
    }

    /**
     * Set the dictionaryofresources value.
     *
     * @param dictionaryofresources the dictionaryofresources value to set.
     * @return the ResourceCollection object itself.
     */
    public ResourceCollection withDictionaryofresources(Map<String, FlattenedProduct> dictionaryofresources) {
        this.dictionaryofresources = dictionaryofresources;
        return this;
    }
}
