// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Pstn Call Log Row.
 */
public class PstnCallLogRow implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Callee Number.
     * 
     */
    @SerializedName("calleeNumber")
    @Expose
    public String calleeNumber;

    /**
     * The Caller Number.
     * 
     */
    @SerializedName("callerNumber")
    @Expose
    public String callerNumber;

    /**
     * The Call Id.
     * 
     */
    @SerializedName("callId")
    @Expose
    public String callId;

    /**
     * The Call Type.
     * 
     */
    @SerializedName("callType")
    @Expose
    public String callType;

    /**
     * The Charge.
     * 
     */
    @SerializedName("charge")
    @Expose
    public java.math.BigDecimal charge;

    /**
     * The Conference Id.
     * 
     */
    @SerializedName("conferenceId")
    @Expose
    public String conferenceId;

    /**
     * The Connection Charge.
     * 
     */
    @SerializedName("connectionCharge")
    @Expose
    public java.math.BigDecimal connectionCharge;

    /**
     * The Currency.
     * 
     */
    @SerializedName("currency")
    @Expose
    public String currency;

    /**
     * The Destination Context.
     * 
     */
    @SerializedName("destinationContext")
    @Expose
    public String destinationContext;

    /**
     * The Destination Name.
     * 
     */
    @SerializedName("destinationName")
    @Expose
    public String destinationName;

    /**
     * The Duration.
     * 
     */
    @SerializedName("duration")
    @Expose
    public Integer duration;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Id.
     * 
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Inventory Type.
     * 
     */
    @SerializedName("inventoryType")
    @Expose
    public String inventoryType;

    /**
     * The License Capability.
     * 
     */
    @SerializedName("licenseCapability")
    @Expose
    public String licenseCapability;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Tenant Country Code.
     * 
     */
    @SerializedName("tenantCountryCode")
    @Expose
    public String tenantCountryCode;

    /**
     * The Usage Country Code.
     * 
     */
    @SerializedName("usageCountryCode")
    @Expose
    public String usageCountryCode;

    /**
     * The User Display Name.
     * 
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Id.
     * 
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


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
