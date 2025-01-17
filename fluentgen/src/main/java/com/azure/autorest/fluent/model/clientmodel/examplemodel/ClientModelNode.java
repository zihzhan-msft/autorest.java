/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.azure.autorest.fluent.model.clientmodel.examplemodel;

import com.azure.autorest.fluent.model.clientmodel.ModelProperty;
import com.azure.autorest.model.clientmodel.ClientModel;
import com.azure.autorest.model.clientmodel.IType;

import java.util.HashMap;
import java.util.Map;

/**
 * Example node for a client model (a generated Java class).
 */
public class ClientModelNode extends ExampleNode {

    private ClientModel model;

    // modelProperties can contain more properties than in the model, as it includes those properties from the superclass of the model
    private final Map<ExampleNode, ModelProperty> modelProperties = new HashMap<>();

    public ClientModelNode(IType clientType, Object objectValue) {
        super(clientType, objectValue);
    }

    public ClientModel getClientModel() {
        return model;
    }

    public ClientModelNode setClientModel(ClientModel model) {
        this.model = model;
        return this;
    }

    public Map<ExampleNode, ModelProperty> getClientModelProperties() {
        return modelProperties;
    }
}
