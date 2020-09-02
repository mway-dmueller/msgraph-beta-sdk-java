// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ConnectorStatus;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ConnectorGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.ConnectorGroupCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connector.
 */
public class Connector extends Entity implements IJsonBackedObject {


    /**
     * The Machine Name.
     * 
     */
    @SerializedName("machineName")
    @Expose
    public String machineName;

    /**
     * The External Ip.
     * 
     */
    @SerializedName("externalIp")
    @Expose
    public String externalIp;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public ConnectorStatus status;

    /**
     * The Member Of.
     * 
     */
    public ConnectorGroupCollectionPage memberOf;


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


        if (json.has("memberOf")) {
            final ConnectorGroupCollectionResponse response = new ConnectorGroupCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final ConnectorGroup[] array = new ConnectorGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConnectorGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new ConnectorGroupCollectionPage(response, null);
        }
    }
}