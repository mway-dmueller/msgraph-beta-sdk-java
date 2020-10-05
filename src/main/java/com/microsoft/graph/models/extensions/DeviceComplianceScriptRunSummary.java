// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Script Run Summary.
 */
public class DeviceComplianceScriptRunSummary extends Entity implements IJsonBackedObject {


    /**
     * The Detection Script Error Device Count.
     * Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647
     */
    @SerializedName("detectionScriptErrorDeviceCount")
    @Expose
    public Integer detectionScriptErrorDeviceCount;

    /**
     * The Detection Script Pending Device Count.
     * Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647
     */
    @SerializedName("detectionScriptPendingDeviceCount")
    @Expose
    public Integer detectionScriptPendingDeviceCount;

    /**
     * The Issue Detected Device Count.
     * Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647
     */
    @SerializedName("issueDetectedDeviceCount")
    @Expose
    public Integer issueDetectedDeviceCount;

    /**
     * The Last Script Run Date Time.
     * Last run time for the script across all devices
     */
    @SerializedName("lastScriptRunDateTime")
    @Expose
    public java.util.Calendar lastScriptRunDateTime;

    /**
     * The No Issue Detected Device Count.
     * Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647
     */
    @SerializedName("noIssueDetectedDeviceCount")
    @Expose
    public Integer noIssueDetectedDeviceCount;


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
