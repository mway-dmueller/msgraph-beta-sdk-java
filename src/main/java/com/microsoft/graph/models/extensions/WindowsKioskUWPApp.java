// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WindowsKioskAppBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Kiosk UWPApp.
 */
public class WindowsKioskUWPApp extends WindowsKioskAppBase implements IJsonBackedObject {


    /**
     * The App Id.
     * This references an Intune App that will be target to the same assignments as Kiosk configuration
     */
    @SerializedName("appId")
    @Expose
    public String appId;

    /**
     * The App User Model Id.
     * This is the only Application User Model ID (AUMID) that will be available to launch use while in Kiosk Mode
     */
    @SerializedName("appUserModelId")
    @Expose
    public String appUserModelId;

    /**
     * The Contained App Id.
     * This references an contained App from an Intune App
     */
    @SerializedName("containedAppId")
    @Expose
    public String containedAppId;


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
