// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EasAuthenticationMethod;
import com.microsoft.graph.models.generated.EmailSyncDuration;
import com.microsoft.graph.models.generated.UserEmailSource;
import com.microsoft.graph.models.generated.AndroidUsernameSource;
import com.microsoft.graph.models.extensions.AndroidForWorkCertificateProfileBase;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Eas Email Profile Base.
 */
public class AndroidForWorkEasEmailProfileBase extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Authentication method for Exchange ActiveSync.
     */
    @SerializedName("authenticationMethod")
    @Expose
    public EasAuthenticationMethod authenticationMethod;

    /**
     * The Duration Of Email To Sync.
     * Duration of time email should be synced to.
     */
    @SerializedName("durationOfEmailToSync")
    @Expose
    public EmailSyncDuration durationOfEmailToSync;

    /**
     * The Email Address Source.
     * Email attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName("emailAddressSource")
    @Expose
    public UserEmailSource emailAddressSource;

    /**
     * The Host Name.
     * Exchange location (URL) that the mail app connects to.
     */
    @SerializedName("hostName")
    @Expose
    public String hostName;

    /**
     * The Require Ssl.
     * Indicates whether or not to use SSL.
     */
    @SerializedName("requireSsl")
    @Expose
    public Boolean requireSsl;

    /**
     * The Username Source.
     * Username attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName("usernameSource")
    @Expose
    public AndroidUsernameSource usernameSource;

    /**
     * The Identity Certificate.
     * Identity certificate.
     */
    @SerializedName("identityCertificate")
    @Expose
    public AndroidForWorkCertificateProfileBase identityCertificate;


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
