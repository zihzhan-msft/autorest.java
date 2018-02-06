/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IntWrapper model.
 */
public final class IntWrapper {
    /**
     * The field1 property.
     */
    @JsonProperty(value = "field1")
    private Integer field1;

    /**
     * The field2 property.
     */
    @JsonProperty(value = "field2")
    private Integer field2;

    /**
     * Get the field1 value.
     *
     * @return the field1 value.
     */
    public Integer field1() {
        return this.field1;
    }

    /**
     * Set the field1 value.
     *
     * @param field1 the field1 value to set.
     * @return the IntWrapper object itself.
     */
    public IntWrapper withField1(Integer field1) {
        this.field1 = field1;
        return this;
    }

    /**
     * Get the field2 value.
     *
     * @return the field2 value.
     */
    public Integer field2() {
        return this.field2;
    }

    /**
     * Set the field2 value.
     *
     * @param field2 the field2 value to set.
     * @return the IntWrapper object itself.
     */
    public IntWrapper withField2(Integer field2) {
        this.field2 = field2;
        return this;
    }
}
