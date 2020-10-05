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
 * The class for the Email App Usage User Detail.
 */
public class EmailAppUsageUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Deleted Date.
     * 
     */
    @SerializedName("deletedDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly deletedDate;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Imap4App.
     * 
     */
    @SerializedName("imap4App")
    @Expose
    public java.util.List<String> imap4App;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName("isDeleted")
    @Expose
    public Boolean isDeleted;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName("lastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly lastActivityDate;

    /**
     * The Mail For Mac.
     * 
     */
    @SerializedName("mailForMac")
    @Expose
    public java.util.List<String> mailForMac;

    /**
     * The Other For Mobile.
     * 
     */
    @SerializedName("otherForMobile")
    @Expose
    public java.util.List<String> otherForMobile;

    /**
     * The Outlook For Mac.
     * 
     */
    @SerializedName("outlookForMac")
    @Expose
    public java.util.List<String> outlookForMac;

    /**
     * The Outlook For Mobile.
     * 
     */
    @SerializedName("outlookForMobile")
    @Expose
    public java.util.List<String> outlookForMobile;

    /**
     * The Outlook For Web.
     * 
     */
    @SerializedName("outlookForWeb")
    @Expose
    public java.util.List<String> outlookForWeb;

    /**
     * The Outlook For Windows.
     * 
     */
    @SerializedName("outlookForWindows")
    @Expose
    public java.util.List<String> outlookForWindows;

    /**
     * The Pop3App.
     * 
     */
    @SerializedName("pop3App")
    @Expose
    public java.util.List<String> pop3App;

    /**
     * The Report Period.
     * 
     */
    @SerializedName("reportPeriod")
    @Expose
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Smtp App.
     * 
     */
    @SerializedName("smtpApp")
    @Expose
    public java.util.List<String> smtpApp;

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
