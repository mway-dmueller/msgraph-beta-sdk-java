// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CertificateStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enterprise Code Signing Certificate.
 */
public class EnterpriseCodeSigningCertificate extends Entity implements IJsonBackedObject {


    /**
     * The Content.
     * The Windows Enterprise Code-Signing Certificate in the raw data format.
     */
    @SerializedName("content")
    @Expose
    public byte[] content;

    /**
     * The Expiration Date Time.
     * The Cert Expiration Date.
     */
    @SerializedName("expirationDateTime")
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Issuer.
     * The Issuer value for the cert.
     */
    @SerializedName("issuer")
    @Expose
    public String issuer;

    /**
     * The Issuer Name.
     * The Issuer Name for the cert.
     */
    @SerializedName("issuerName")
    @Expose
    public String issuerName;

    /**
     * The Status.
     * The Certificate Status Provisioned or not Provisioned.
     */
    @SerializedName("status")
    @Expose
    public CertificateStatus status;

    /**
     * The Subject.
     * The Subject Value for the cert.
     */
    @SerializedName("subject")
    @Expose
    public String subject;

    /**
     * The Subject Name.
     * The Subject Name for the cert.
     */
    @SerializedName("subjectName")
    @Expose
    public String subjectName;

    /**
     * The Upload Date Time.
     * The date time of CodeSigning Cert when it is uploaded.
     */
    @SerializedName("uploadDateTime")
    @Expose
    public java.util.Calendar uploadDateTime;


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
