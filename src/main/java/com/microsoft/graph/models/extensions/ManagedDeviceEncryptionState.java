// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceTypes;
import com.microsoft.graph.models.generated.EncryptionReadinessState;
import com.microsoft.graph.models.generated.EncryptionState;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.generated.AdvancedBitLockerState;
import com.microsoft.graph.models.generated.FileVaultState;
import com.microsoft.graph.models.extensions.EncryptionReportPolicyDetails;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Encryption State.
 */
public class ManagedDeviceEncryptionState extends Entity implements IJsonBackedObject {


    /**
     * The User Principal Name.
     * User name
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Device Type.
     * Platform of the device.
     */
    @SerializedName("deviceType")
    @Expose
    public DeviceTypes deviceType;

    /**
     * The Os Version.
     * Operating system version of the device
     */
    @SerializedName("osVersion")
    @Expose
    public String osVersion;

    /**
     * The Tpm Specification Version.
     * Device TPM Version
     */
    @SerializedName("tpmSpecificationVersion")
    @Expose
    public String tpmSpecificationVersion;

    /**
     * The Device Name.
     * Device name
     */
    @SerializedName("deviceName")
    @Expose
    public String deviceName;

    /**
     * The Encryption Readiness State.
     * Encryption readiness state
     */
    @SerializedName("encryptionReadinessState")
    @Expose
    public EncryptionReadinessState encryptionReadinessState;

    /**
     * The Encryption State.
     * Device encryption state
     */
    @SerializedName("encryptionState")
    @Expose
    public EncryptionState encryptionState;

    /**
     * The Encryption Policy Setting State.
     * Encryption policy setting state
     */
    @SerializedName("encryptionPolicySettingState")
    @Expose
    public ComplianceStatus encryptionPolicySettingState;

    /**
     * The Advanced Bit Locker States.
     * Advanced BitLocker State
     */
    @SerializedName("advancedBitLockerStates")
    @Expose
    public EnumSet<AdvancedBitLockerState> advancedBitLockerStates;

    /**
     * The File Vault States.
     * FileVault State
     */
    @SerializedName("fileVaultStates")
    @Expose
    public EnumSet<FileVaultState> fileVaultStates;

    /**
     * The Policy Details.
     * Policy Details
     */
    @SerializedName("policyDetails")
    @Expose
    public java.util.List<EncryptionReportPolicyDetails> policyDetails;


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