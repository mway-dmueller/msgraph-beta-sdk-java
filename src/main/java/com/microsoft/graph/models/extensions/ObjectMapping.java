// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AttributeMapping;
import com.microsoft.graph.models.generated.ObjectFlowTypes;
import com.microsoft.graph.models.extensions.MetadataEntry;
import com.microsoft.graph.models.extensions.Filter;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Object Mapping.
 */
public class ObjectMapping implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Attribute Mappings.
     * 
     */
    @SerializedName("attributeMappings")
    @Expose
    public java.util.List<AttributeMapping> attributeMappings;

    /**
     * The Enabled.
     * 
     */
    @SerializedName("enabled")
    @Expose
    public Boolean enabled;

    /**
     * The Flow Types.
     * 
     */
    @SerializedName("flowTypes")
    @Expose
    public EnumSet<ObjectFlowTypes> flowTypes;

    /**
     * The Metadata.
     * 
     */
    @SerializedName("metadata")
    @Expose
    public java.util.List<MetadataEntry> metadata;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Scope.
     * 
     */
    @SerializedName("scope")
    @Expose
    public Filter scope;

    /**
     * The Source Object Name.
     * 
     */
    @SerializedName("sourceObjectName")
    @Expose
    public String sourceObjectName;

    /**
     * The Target Object Name.
     * 
     */
    @SerializedName("targetObjectName")
    @Expose
    public String targetObjectName;


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
