/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The B model.
 */
public final class B extends A {
    /**
     * The textStatusCode property.
     */
    @JsonProperty(value = "textStatusCode")
    private String textStatusCode;

    /**
     * Get the textStatusCode value.
     *
     * @return the textStatusCode value.
     */
    public String textStatusCode() {
        return this.textStatusCode;
    }

    /**
     * Set the textStatusCode value.
     *
     * @param textStatusCode the textStatusCode value to set.
     * @return the B object itself.
     */
    public B withTextStatusCode(String textStatusCode) {
        this.textStatusCode = textStatusCode;
        return this;
    }
}
