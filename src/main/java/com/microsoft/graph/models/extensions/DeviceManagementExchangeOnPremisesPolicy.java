// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeAccessRule;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessLevel;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeDeviceClass;
import com.microsoft.graph.models.extensions.OnPremisesConditionalAccessSettings;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange On Premises Policy.
 */
public class DeviceManagementExchangeOnPremisesPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Access Rules.
     * The list of device access rules in Exchange. The access rules apply globally to the entire Exchange organization
     */
    @SerializedName(value = "accessRules", alternate = {"AccessRules"})
    @Expose
    public java.util.List<DeviceManagementExchangeAccessRule> accessRules;

    /**
     * The Default Access Level.
     * Default access state in Exchange. This rule applies globally to the entire Exchange organization. Possible values are: none, allow, block, quarantine.
     */
    @SerializedName(value = "defaultAccessLevel", alternate = {"DefaultAccessLevel"})
    @Expose
    public DeviceManagementExchangeAccessLevel defaultAccessLevel;

    /**
     * The Known Device Classes.
     * The list of device classes known to Exchange
     */
    @SerializedName(value = "knownDeviceClasses", alternate = {"KnownDeviceClasses"})
    @Expose
    public java.util.List<DeviceManagementExchangeDeviceClass> knownDeviceClasses;

    /**
     * The Notification Content.
     * Notification text that will be sent to users quarantined by this policy. This is UTF8 encoded byte array HTML.
     */
    @SerializedName(value = "notificationContent", alternate = {"NotificationContent"})
    @Expose
    public byte[] notificationContent;

    /**
     * The Conditional Access Settings.
     * The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     */
    @SerializedName(value = "conditionalAccessSettings", alternate = {"ConditionalAccessSettings"})
    @Expose
    public OnPremisesConditionalAccessSettings conditionalAccessSettings;


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
