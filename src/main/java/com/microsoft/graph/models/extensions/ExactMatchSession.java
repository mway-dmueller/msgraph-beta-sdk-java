// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ExactMatchUploadAgent;
import com.microsoft.graph.models.extensions.ExactMatchJobBase;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Session.
 */
public class ExactMatchSession extends ExactMatchJobBase implements IJsonBackedObject {


    /**
     * The Datastore Id.
     * 
     */
    @SerializedName("datastoreId")
    @Expose
    public String datastoreId;

    /**
     * The Upload Agent Id.
     * 
     */
    @SerializedName("uploadAgentId")
    @Expose
    public String uploadAgentId;

    /**
     * The Fields.
     * 
     */
    @SerializedName("fields")
    @Expose
    public java.util.List<String> fields;

    /**
     * The File Name.
     * 
     */
    @SerializedName("fileName")
    @Expose
    public String fileName;

    /**
     * The Checksum.
     * 
     */
    @SerializedName("checksum")
    @Expose
    public String checksum;

    /**
     * The Data Upload URI.
     * 
     */
    @SerializedName("dataUploadURI")
    @Expose
    public String dataUploadURI;

    /**
     * The Remaining Block Count.
     * 
     */
    @SerializedName("remainingBlockCount")
    @Expose
    public Integer remainingBlockCount;

    /**
     * The Total Block Count.
     * 
     */
    @SerializedName("totalBlockCount")
    @Expose
    public Integer totalBlockCount;

    /**
     * The State.
     * 
     */
    @SerializedName("state")
    @Expose
    public String state;

    /**
     * The Upload Completion Date Time.
     * 
     */
    @SerializedName("uploadCompletionDateTime")
    @Expose
    public java.util.Calendar uploadCompletionDateTime;

    /**
     * The Processing Completion Date Time.
     * 
     */
    @SerializedName("processingCompletionDateTime")
    @Expose
    public java.util.Calendar processingCompletionDateTime;

    /**
     * The Rows Per Block.
     * 
     */
    @SerializedName("rowsPerBlock")
    @Expose
    public Integer rowsPerBlock;

    /**
     * The Total Job Count.
     * 
     */
    @SerializedName("totalJobCount")
    @Expose
    public Integer totalJobCount;

    /**
     * The Remaining Job Count.
     * 
     */
    @SerializedName("remainingJobCount")
    @Expose
    public Integer remainingJobCount;

    /**
     * The Salt.
     * 
     */
    @SerializedName("salt")
    @Expose
    public String salt;

    /**
     * The Upload Agent.
     * 
     */
    @SerializedName("uploadAgent")
    @Expose
    public ExactMatchUploadAgent uploadAgent;


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