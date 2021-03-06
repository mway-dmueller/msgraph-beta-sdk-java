// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserRegistrationFeatureCount;
import com.microsoft.graph.models.generated.IncludedUserRoles;
import com.microsoft.graph.models.generated.IncludedUserTypes;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Registration Feature Summary.
 */
public class UserRegistrationFeatureSummary implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Total User Count.
     * Total number of users accounts, excluding those that are blocked
     */
    @SerializedName(value = "totalUserCount", alternate = {"TotalUserCount"})
    @Expose
    public Long totalUserCount;

    /**
     * The User Registration Feature Counts.
     * Number of users registered or capable for Multi-Factor Authentication, Self-Service Password Reset and Passwordless Authentication.
     */
    @SerializedName(value = "userRegistrationFeatureCounts", alternate = {"UserRegistrationFeatureCounts"})
    @Expose
    public java.util.List<UserRegistrationFeatureCount> userRegistrationFeatureCounts;

    /**
     * The User Roles.
     * User role type. Possible values are: all, privilegedAdmin, admin, user.
     */
    @SerializedName(value = "userRoles", alternate = {"UserRoles"})
    @Expose
    public IncludedUserRoles userRoles;

    /**
     * The User Types.
     * User type. Possible values are: all, member, guest.
     */
    @SerializedName(value = "userTypes", alternate = {"UserTypes"})
    @Expose
    public IncludedUserTypes userTypes;


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
