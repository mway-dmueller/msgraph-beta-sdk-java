// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.RiskDetection;
import com.microsoft.graph.models.extensions.RiskyUser;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.RiskDetectionCollectionResponse;
import com.microsoft.graph.requests.extensions.RiskDetectionCollectionPage;
import com.microsoft.graph.requests.extensions.RiskyUserCollectionResponse;
import com.microsoft.graph.requests.extensions.RiskyUserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Protection Root.
 */
public class IdentityProtectionRoot extends Entity implements IJsonBackedObject {


    /**
     * The Risk Detections.
     * 
     */
    public RiskDetectionCollectionPage riskDetections;

    /**
     * The Risky Users.
     * 
     */
    public RiskyUserCollectionPage riskyUsers;


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


        if (json.has("riskDetections")) {
            final RiskDetectionCollectionResponse response = new RiskDetectionCollectionResponse();
            if (json.has("riskDetections@odata.nextLink")) {
                response.nextLink = json.get("riskDetections@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("riskDetections").toString(), JsonObject[].class);
            final RiskDetection[] array = new RiskDetection[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RiskDetection.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            riskDetections = new RiskDetectionCollectionPage(response, null);
        }

        if (json.has("riskyUsers")) {
            final RiskyUserCollectionResponse response = new RiskyUserCollectionResponse();
            if (json.has("riskyUsers@odata.nextLink")) {
                response.nextLink = json.get("riskyUsers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("riskyUsers").toString(), JsonObject[].class);
            final RiskyUser[] array = new RiskyUser[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RiskyUser.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            riskyUsers = new RiskyUserCollectionPage(response, null);
        }
    }
}