// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Detail.
 */
public class AuthenticationDetail implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Authentication Step Date Time.
     * 
     */
    @SerializedName("authenticationStepDateTime")
    @Expose
    public java.util.Calendar authenticationStepDateTime;

    /**
     * The Authentication Method.
     * 
     */
    @SerializedName("authenticationMethod")
    @Expose
    public String authenticationMethod;

    /**
     * The Authentication Method Detail.
     * 
     */
    @SerializedName("authenticationMethodDetail")
    @Expose
    public String authenticationMethodDetail;

    /**
     * The Succeeded.
     * 
     */
    @SerializedName("succeeded")
    @Expose
    public Boolean succeeded;

    /**
     * The Authentication Step Result Detail.
     * 
     */
    @SerializedName("authenticationStepResultDetail")
    @Expose
    public String authenticationStepResultDetail;

    /**
     * The Authentication Step Requirement.
     * 
     */
    @SerializedName("authenticationStepRequirement")
    @Expose
    public String authenticationStepRequirement;


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