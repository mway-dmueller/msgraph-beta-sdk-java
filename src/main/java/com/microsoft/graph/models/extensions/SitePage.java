// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ContentTypeInfo;
import com.microsoft.graph.models.extensions.PublicationFacet;
import com.microsoft.graph.models.extensions.WebPart;
import com.microsoft.graph.models.extensions.BaseItem;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Page.
 */
public class SitePage extends BaseItem implements IJsonBackedObject {


    /**
     * The Content Type.
     * 
     */
    @SerializedName("contentType")
    @Expose
    public ContentTypeInfo contentType;

    /**
     * The Page Layout Type.
     * 
     */
    @SerializedName("pageLayoutType")
    @Expose
    public String pageLayoutType;

    /**
     * The Publishing State.
     * 
     */
    @SerializedName("publishingState")
    @Expose
    public PublicationFacet publishingState;

    /**
     * The Title.
     * 
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Web Parts.
     * 
     */
    @SerializedName("webParts")
    @Expose
    public java.util.List<WebPart> webParts;


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
