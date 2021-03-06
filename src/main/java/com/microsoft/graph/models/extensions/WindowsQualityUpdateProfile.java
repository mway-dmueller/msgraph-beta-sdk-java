// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ExpeditedWindowsQualityUpdateSettings;
import com.microsoft.graph.models.extensions.WindowsQualityUpdateProfileAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WindowsQualityUpdateProfileAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Profile.
 */
public class WindowsQualityUpdateProfile extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date time that the profile was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * The description of the profile which is specified by the user.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name for the profile.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Expedited Update Settings.
     * Expedited update settings.
     */
    @SerializedName(value = "expeditedUpdateSettings", alternate = {"ExpeditedUpdateSettings"})
    @Expose
    public ExpeditedWindowsQualityUpdateSettings expeditedUpdateSettings;

    /**
     * The Last Modified Date Time.
     * The date time that the profile was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Quality Update entity.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Assignments.
     * The list of group assignments of the profile.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
    public WindowsQualityUpdateProfileAssignmentCollectionPage assignments;


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


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), WindowsQualityUpdateProfileAssignmentCollectionPage.class);
        }
    }
}
