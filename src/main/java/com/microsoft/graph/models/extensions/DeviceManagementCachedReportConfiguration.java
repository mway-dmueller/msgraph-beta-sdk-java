// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceManagementReportStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Cached Report Configuration.
 */
public class DeviceManagementCachedReportConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Expiration Date Time.
     * Time that the cached report expires
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Filter.
     * Filters applied on report creation.
     */
    @SerializedName("filter")
    @Expose
    public String filter;

    /**
     * The Last Refresh Date Time.
     * Time that the cached report was last refreshed
     */
    @SerializedName("lastRefreshDateTime")
    @Expose
    public java.util.Calendar lastRefreshDateTime;

    /**
     * The Metadata.
     * Caller-managed metadata associated with the report
     */
    @SerializedName("metadata")
    @Expose
    public String metadata;

    /**
     * The Order By.
     * Ordering of columns in the report
     */
    @SerializedName("orderBy")
    @Expose
    public java.util.List<String> orderBy;

    /**
     * The Report Name.
     * Name of the report
     */
    @SerializedName("reportName")
    @Expose
    public String reportName;

    /**
     * The Select.
     * Columns selected from the report
     */
    @SerializedName("select")
    @Expose
    public java.util.List<String> select;

    /**
     * The Status.
     * Status of the cached report
     */
    @SerializedName("status")
    @Expose
    public DeviceManagementReportStatus status;


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
