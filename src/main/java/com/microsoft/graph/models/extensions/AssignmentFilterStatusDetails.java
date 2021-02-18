// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.AssignmentFilterEvaluationSummary;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Assignment Filter Status Details.
 */
public class AssignmentFilterStatusDetails implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Device Properties.
     * Device properties used for filter evaluation during device check-in time.
     */
    @SerializedName(value = "deviceProperties", alternate = {"DeviceProperties"})
    @Expose
    public java.util.List<KeyValuePair> deviceProperties;

    /**
     * The Evalution Summaries.
     * Evaluation result summaries for each filter associated to device and payload
     */
    @SerializedName(value = "evalutionSummaries", alternate = {"EvalutionSummaries"})
    @Expose
    public java.util.List<AssignmentFilterEvaluationSummary> evalutionSummaries;

    /**
     * The Managed Device Id.
     * Unique identifier for the device object.
     */
    @SerializedName(value = "managedDeviceId", alternate = {"ManagedDeviceId"})
    @Expose
    public String managedDeviceId;

    /**
     * The Payload Id.
     * Unique identifier for payload object.
     */
    @SerializedName(value = "payloadId", alternate = {"PayloadId"})
    @Expose
    public String payloadId;

    /**
     * The User Id.
     * Unique identifier for UserId object. Can be null
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;


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