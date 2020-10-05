// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ConnectedOrganization;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Subject.
 */
public class AccessPackageSubject extends Entity implements IJsonBackedObject {


    /**
     * The Alt Sec Id.
     * 
     */
    @SerializedName("altSecId")
    @Expose
    public String altSecId;

    /**
     * The Connected Organization Id.
     * 
     */
    @SerializedName("connectedOrganizationId")
    @Expose
    public String connectedOrganizationId;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Email.
     * 
     */
    @SerializedName("email")
    @Expose
    public String email;

    /**
     * The Object Id.
     * 
     */
    @SerializedName("objectId")
    @Expose
    public String objectId;

    /**
     * The On Premises Security Identifier.
     * 
     */
    @SerializedName("onPremisesSecurityIdentifier")
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The Principal Name.
     * 
     */
    @SerializedName("principalName")
    @Expose
    public String principalName;

    /**
     * The Type.
     * 
     */
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * The Connected Organization.
     * 
     */
    @SerializedName("connectedOrganization")
    @Expose
    public ConnectedOrganization connectedOrganization;


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
