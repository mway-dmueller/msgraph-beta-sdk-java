// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ItemInsightsSettings;
import com.microsoft.graph.models.extensions.ProfileCardProperty;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ProfileCardPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Settings.
 */
public class OrganizationSettings extends Entity implements IJsonBackedObject {


    /**
     * The Item Insights.
     * Contains the properties that are configured by an administrator for the visibility of Microsoft Graph-derived insights, between a user and other items in Microsoft 365, such as documents or sites. Get itemInsightsSettings through this navigation property.
     */
    @SerializedName(value = "itemInsights", alternate = {"ItemInsights"})
    @Expose
    public ItemInsightsSettings itemInsights;

    /**
     * The Profile Card Properties.
     * Contains a collection of the properties an administrator has defined as visible on the Microsoft 365 profile card. Get organization settings returns the properties configured for profile cards for the organization.
     */
    @SerializedName(value = "profileCardProperties", alternate = {"ProfileCardProperties"})
    @Expose
    public ProfileCardPropertyCollectionPage profileCardProperties;


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


        if (json.has("profileCardProperties")) {
            profileCardProperties = serializer.deserializeObject(json.get("profileCardProperties").toString(), ProfileCardPropertyCollectionPage.class);
        }
    }
}
