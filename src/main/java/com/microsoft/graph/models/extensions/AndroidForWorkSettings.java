// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidForWorkBindStatus;
import com.microsoft.graph.models.generated.AndroidForWorkSyncStatus;
import com.microsoft.graph.models.generated.AndroidForWorkEnrollmentTarget;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Settings.
 */
public class AndroidForWorkSettings extends Entity implements IJsonBackedObject {


    /**
     * The Bind Status.
     * Bind status of the tenant with the Google EMM API
     */
    @SerializedName("bindStatus")
    @Expose
    public AndroidForWorkBindStatus bindStatus;

    /**
     * The Last App Sync Date Time.
     * Last completion time for app sync
     */
    @SerializedName("lastAppSyncDateTime")
    @Expose
    public java.util.Calendar lastAppSyncDateTime;

    /**
     * The Last App Sync Status.
     * Last application sync result
     */
    @SerializedName("lastAppSyncStatus")
    @Expose
    public AndroidForWorkSyncStatus lastAppSyncStatus;

    /**
     * The Owner User Principal Name.
     * Owner UPN that created the enterprise
     */
    @SerializedName("ownerUserPrincipalName")
    @Expose
    public String ownerUserPrincipalName;

    /**
     * The Owner Organization Name.
     * Organization name used when onboarding Android for Work
     */
    @SerializedName("ownerOrganizationName")
    @Expose
    public String ownerOrganizationName;

    /**
     * The Last Modified Date Time.
     * Last modification time for Android for Work settings
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Enrollment Target.
     * Indicates which users can enroll devices in Android for Work device management
     */
    @SerializedName("enrollmentTarget")
    @Expose
    public AndroidForWorkEnrollmentTarget enrollmentTarget;

    /**
     * The Target Group Ids.
     * Specifies which AAD groups can enroll devices in Android for Work device management if enrollmentTarget is set to 'Targeted'
     */
    @SerializedName("targetGroupIds")
    @Expose
    public java.util.List<String> targetGroupIds;

    /**
     * The Device Owner Management Enabled.
     * Indicates if this account is flighting for Android Device Owner Management with CloudDPC.
     */
    @SerializedName("deviceOwnerManagementEnabled")
    @Expose
    public Boolean deviceOwnerManagementEnabled;


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