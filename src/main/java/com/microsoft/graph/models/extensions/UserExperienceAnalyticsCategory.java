// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsInsight;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Category.
 */
public class UserExperienceAnalyticsCategory extends Entity implements IJsonBackedObject {


    /**
     * The Insights.
     * The insights for the user experience analytics category.
     */
    @SerializedName(value = "insights", alternate = {"Insights"})
    @Expose
    public java.util.List<UserExperienceAnalyticsInsight> insights;

    /**
     * The Metric Values.
     * The metric values for the user experience analytics category.
     */
    @SerializedName(value = "metricValues", alternate = {"MetricValues"})
    @Expose
    public UserExperienceAnalyticsMetricCollectionPage metricValues;


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


        if (json.has("metricValues")) {
            metricValues = serializer.deserializeObject(json.get("metricValues").toString(), UserExperienceAnalyticsMetricCollectionPage.class);
        }
    }
}
