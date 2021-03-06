// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.UsageRightState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Usage Right.
 */
public class UsageRight extends Entity implements IJsonBackedObject {


    /**
     * The Catalog Id.
     * Product id corresponding to the usage right.
     */
    @SerializedName(value = "catalogId", alternate = {"CatalogId"})
    @Expose
    public String catalogId;

    /**
     * The Service Identifier.
     * Identifier of the service corresponding to the usage right.
     */
    @SerializedName(value = "serviceIdentifier", alternate = {"ServiceIdentifier"})
    @Expose
    public String serviceIdentifier;

    /**
     * The State.
     * The state of the usage right. Possible values are: active, inactive, warning, suspended.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public UsageRightState state;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
