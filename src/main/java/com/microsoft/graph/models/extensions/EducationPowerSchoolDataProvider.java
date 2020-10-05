// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EducationSynchronizationCustomizations;
import com.microsoft.graph.models.extensions.EducationSynchronizationDataProvider;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Power School Data Provider.
 */
public class EducationPowerSchoolDataProvider extends EducationSynchronizationDataProvider implements IJsonBackedObject {


    /**
     * The Allow Teachers In Multiple Schools.
     * 
     */
    @SerializedName("allowTeachersInMultipleSchools")
    @Expose
    public Boolean allowTeachersInMultipleSchools;

    /**
     * The Client Id.
     * 
     */
    @SerializedName("clientId")
    @Expose
    public String clientId;

    /**
     * The Client Secret.
     * 
     */
    @SerializedName("clientSecret")
    @Expose
    public String clientSecret;

    /**
     * The Connection Url.
     * 
     */
    @SerializedName("connectionUrl")
    @Expose
    public String connectionUrl;

    /**
     * The Customizations.
     * 
     */
    @SerializedName("customizations")
    @Expose
    public EducationSynchronizationCustomizations customizations;

    /**
     * The Schools Ids.
     * 
     */
    @SerializedName("schoolsIds")
    @Expose
    public java.util.List<String> schoolsIds;

    /**
     * The School Year.
     * 
     */
    @SerializedName("schoolYear")
    @Expose
    public String schoolYear;


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
