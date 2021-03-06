// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.SensitivityLabelTarget;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Policy Settings.
 */
public class SensitivityPolicySettings extends Entity implements IJsonBackedObject {


    /**
     * The Applicable To.
     * 
     */
    @SerializedName(value = "applicableTo", alternate = {"ApplicableTo"})
    @Expose
    public EnumSet<SensitivityLabelTarget> applicableTo;

    /**
     * The Downgrade Sensitivity Requires Justification.
     * 
     */
    @SerializedName(value = "downgradeSensitivityRequiresJustification", alternate = {"DowngradeSensitivityRequiresJustification"})
    @Expose
    public Boolean downgradeSensitivityRequiresJustification;

    /**
     * The Help Web Url.
     * 
     */
    @SerializedName(value = "helpWebUrl", alternate = {"HelpWebUrl"})
    @Expose
    public String helpWebUrl;

    /**
     * The Is Mandatory.
     * 
     */
    @SerializedName(value = "isMandatory", alternate = {"IsMandatory"})
    @Expose
    public Boolean isMandatory;


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
