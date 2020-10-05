// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessAction;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity.
 */
public class ItemActivity extends Entity implements IJsonBackedObject {


    /**
     * The Access.
     * An item was accessed.
     */
    @SerializedName("access")
    @Expose
    public AccessAction access;

    /**
     * The Activity Date Time.
     * Details about when the activity took place. Read-only.
     */
    @SerializedName("activityDateTime")
    @Expose
    public java.util.Calendar activityDateTime;

    /**
     * The Actor.
     * Identity of who performed the action. Read-only.
     */
    @SerializedName("actor")
    @Expose
    public IdentitySet actor;

    /**
     * The Drive Item.
     * Exposes the driveItem that was the target of this activity.
     */
    @SerializedName("driveItem")
    @Expose
    public DriveItem driveItem;


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
