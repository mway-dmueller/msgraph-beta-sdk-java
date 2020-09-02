// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MobileAppContentFile;
import com.microsoft.graph.models.extensions.MobileContainedApp;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionPage;
import com.microsoft.graph.requests.extensions.MobileContainedAppCollectionResponse;
import com.microsoft.graph.requests.extensions.MobileContainedAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content.
 */
public class MobileAppContent extends Entity implements IJsonBackedObject {


    /**
     * The Files.
     * The list of files for this app content version.
     */
    public MobileAppContentFileCollectionPage files;

    /**
     * The Contained Apps.
     * The collection of contained apps in a MobileLobApp acting as a package.
     */
    public MobileContainedAppCollectionPage containedApps;


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


        if (json.has("files")) {
            final MobileAppContentFileCollectionResponse response = new MobileAppContentFileCollectionResponse();
            if (json.has("files@odata.nextLink")) {
                response.nextLink = json.get("files@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("files").toString(), JsonObject[].class);
            final MobileAppContentFile[] array = new MobileAppContentFile[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileAppContentFile.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            files = new MobileAppContentFileCollectionPage(response, null);
        }

        if (json.has("containedApps")) {
            final MobileContainedAppCollectionResponse response = new MobileContainedAppCollectionResponse();
            if (json.has("containedApps@odata.nextLink")) {
                response.nextLink = json.get("containedApps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("containedApps").toString(), JsonObject[].class);
            final MobileContainedApp[] array = new MobileContainedApp[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MobileContainedApp.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            containedApps = new MobileContainedAppCollectionPage(response, null);
        }
    }
}