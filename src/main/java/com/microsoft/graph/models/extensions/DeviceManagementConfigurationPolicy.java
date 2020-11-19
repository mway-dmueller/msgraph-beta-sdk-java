// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceManagementConfigurationPlatforms;
import com.microsoft.graph.models.generated.DeviceManagementConfigurationTechnologies;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSetting;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy.
 */
public class DeviceManagementConfigurationPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Policy creation date and time. This property is read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Creation Source.
     * Policy creation source
     */
    @SerializedName(value = "creationSource", alternate = {"CreationSource"})
    @Expose
    public String creationSource;

    /**
     * The Description.
     * Policy description
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Is Assigned.
     * Policy assignment status. This property is read-only.
     */
    @SerializedName(value = "isAssigned", alternate = {"IsAssigned"})
    @Expose
    public Boolean isAssigned;

    /**
     * The Last Modified Date Time.
     * Policy last modification date and time. This property is read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Name.
     * Policy name
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Platforms.
     * Platforms for this policy
     */
    @SerializedName(value = "platforms", alternate = {"Platforms"})
    @Expose
    public EnumSet<DeviceManagementConfigurationPlatforms> platforms;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Setting Count.
     * Number of settings. This property is read-only.
     */
    @SerializedName(value = "settingCount", alternate = {"SettingCount"})
    @Expose
    public Integer settingCount;

    /**
     * The Technologies.
     * Technologies for this policy
     */
    @SerializedName(value = "technologies", alternate = {"Technologies"})
    @Expose
    public EnumSet<DeviceManagementConfigurationTechnologies> technologies;

    /**
     * The Assignments.
     * Policy assignments
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
    public DeviceManagementConfigurationPolicyAssignmentCollectionPage assignments;

    /**
     * The Settings.
     * Policy settings
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
    public DeviceManagementConfigurationSettingCollectionPage settings;


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
            assignments = serializer.deserializeObject(json.get("assignments").toString(), DeviceManagementConfigurationPolicyAssignmentCollectionPage.class);
        }

        if (json.has("settings")) {
            settings = serializer.deserializeObject(json.get("settings").toString(), DeviceManagementConfigurationSettingCollectionPage.class);
        }
    }
}