/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.model.clientmodel.examplemodel;

import com.azure.autorest.fluent.model.clientmodel.FluentManager;
import com.azure.autorest.fluent.model.clientmodel.FluentResourceCollection;
import com.azure.autorest.fluent.model.clientmodel.fluentmodel.create.ResourceCreate;

/**
 * Model of example for ResourceCreate.
 */
public class FluentResourceCreateExample extends FluentBaseExample {

    private final ResourceCreate resourceCreate;

    public FluentResourceCreateExample(String name, String originalFileName,
                                       FluentManager manager, FluentResourceCollection collection,
                                       ResourceCreate resourceCreate) {
        super(name, originalFileName, manager, collection);
        this.resourceCreate = resourceCreate;
    }

    public ResourceCreate getResourceCreate() {
        return resourceCreate;
    }
}
