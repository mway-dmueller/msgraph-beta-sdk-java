// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ExportOptions;
import com.microsoft.graph.models.generated.ExportFileStructure;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.models.extensions.CaseOperation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Export Operation.
 */
public class CaseExportOperation extends CaseOperation implements IJsonBackedObject {


    /**
     * The Azure Blob Container.
     * 
     */
    @SerializedName(value = "azureBlobContainer", alternate = {"AzureBlobContainer"})
    @Expose
    public String azureBlobContainer;

    /**
     * The Azure Blob Token.
     * 
     */
    @SerializedName(value = "azureBlobToken", alternate = {"AzureBlobToken"})
    @Expose
    public String azureBlobToken;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Export Options.
     * 
     */
    @SerializedName(value = "exportOptions", alternate = {"ExportOptions"})
    @Expose
    public EnumSet<ExportOptions> exportOptions;

    /**
     * The Export Structure.
     * 
     */
    @SerializedName(value = "exportStructure", alternate = {"ExportStructure"})
    @Expose
    public ExportFileStructure exportStructure;

    /**
     * The Output Folder Id.
     * 
     */
    @SerializedName(value = "outputFolderId", alternate = {"OutputFolderId"})
    @Expose
    public String outputFolderId;

    /**
     * The Output Name.
     * 
     */
    @SerializedName(value = "outputName", alternate = {"OutputName"})
    @Expose
    public String outputName;

    /**
     * The Review Set.
     * 
     */
    @SerializedName(value = "reviewSet", alternate = {"ReviewSet"})
    @Expose
    public ReviewSet reviewSet;


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