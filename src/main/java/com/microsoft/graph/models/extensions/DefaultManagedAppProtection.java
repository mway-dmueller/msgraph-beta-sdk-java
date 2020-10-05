// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ManagedAppRemediationAction;
import com.microsoft.graph.models.generated.ManagedAppDataEncryptionType;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.generated.AndroidManagedAppSafetyNetAppsVerificationType;
import com.microsoft.graph.models.generated.AndroidManagedAppSafetyNetDeviceAttestationType;
import com.microsoft.graph.models.generated.AndroidManagedAppSafetyNetEvaluationType;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.extensions.ManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Default Managed App Protection.
 */
public class DefaultManagedAppProtection extends ManagedAppProtection implements IJsonBackedObject {


    /**
     * The Allowed Android Device Manufacturers.
     * Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work. (Android only)
     */
    @SerializedName("allowedAndroidDeviceManufacturers")
    @Expose
    public String allowedAndroidDeviceManufacturers;

    /**
     * The Allowed Android Device Models.
     * List of device models allowed, as a string, for the managed app to work. (Android Only)
     */
    @SerializedName("allowedAndroidDeviceModels")
    @Expose
    public java.util.List<String> allowedAndroidDeviceModels;

    /**
     * The Allowed Ios Device Models.
     * Semicolon seperated list of device models allowed, as a string, for the managed app to work. (iOS Only)
     */
    @SerializedName("allowedIosDeviceModels")
    @Expose
    public String allowedIosDeviceModels;

    /**
     * The App Action If Android Device Manufacturer Not Allowed.
     * Defines a managed app behavior, either block or wipe, if the specified device manufacturer is not allowed. (Android only)
     */
    @SerializedName("appActionIfAndroidDeviceManufacturerNotAllowed")
    @Expose
    public ManagedAppRemediationAction appActionIfAndroidDeviceManufacturerNotAllowed;

    /**
     * The App Action If Android Device Model Not Allowed.
     * Defines a managed app behavior, either block or wipe, if the specified device model is not allowed. (Android Only)
     */
    @SerializedName("appActionIfAndroidDeviceModelNotAllowed")
    @Expose
    public ManagedAppRemediationAction appActionIfAndroidDeviceModelNotAllowed;

    /**
     * The App Action If Android Safety Net Apps Verification Failed.
     * Defines a managed app behavior, either warn or block, if the specified Android App Verification requirment fails.
     */
    @SerializedName("appActionIfAndroidSafetyNetAppsVerificationFailed")
    @Expose
    public ManagedAppRemediationAction appActionIfAndroidSafetyNetAppsVerificationFailed;

    /**
     * The App Action If Android Safety Net Device Attestation Failed.
     * Defines a managed app behavior, either warn or block, if the specified Android SafetyNet Attestation requirment fails.
     */
    @SerializedName("appActionIfAndroidSafetyNetDeviceAttestationFailed")
    @Expose
    public ManagedAppRemediationAction appActionIfAndroidSafetyNetDeviceAttestationFailed;

    /**
     * The App Action If Ios Device Model Not Allowed.
     * Defines a managed app behavior, either block or wipe, if the specified device model is not allowed. (iOS Only)
     */
    @SerializedName("appActionIfIosDeviceModelNotAllowed")
    @Expose
    public ManagedAppRemediationAction appActionIfIosDeviceModelNotAllowed;

    /**
     * The App Data Encryption Type.
     * Type of encryption which should be used for data in a managed app. (iOS Only). Possible values are: useDeviceSettings, afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
     */
    @SerializedName("appDataEncryptionType")
    @Expose
    public ManagedAppDataEncryptionType appDataEncryptionType;

    /**
     * The Biometric Authentication Blocked.
     * Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True. (Android Only)
     */
    @SerializedName("biometricAuthenticationBlocked")
    @Expose
    public Boolean biometricAuthenticationBlocked;

    /**
     * The Custom Browser Display Name.
     * Friendly name of the preferred custom browser to open weblink on Android. (Android only)
     */
    @SerializedName("customBrowserDisplayName")
    @Expose
    public String customBrowserDisplayName;

    /**
     * The Custom Browser Package Id.
     * Unique identifier of a custom browser to open weblink on Android. (Android only)
     */
    @SerializedName("customBrowserPackageId")
    @Expose
    public String customBrowserPackageId;

    /**
     * The Custom Browser Protocol.
     * A custom browser protocol to open weblink on iOS. (iOS only)
     */
    @SerializedName("customBrowserProtocol")
    @Expose
    public String customBrowserProtocol;

    /**
     * The Custom Dialer App Display Name.
     * Friendly name of a custom dialer app to click-to-open a phone number on Android.
     */
    @SerializedName("customDialerAppDisplayName")
    @Expose
    public String customDialerAppDisplayName;

    /**
     * The Custom Dialer App Package Id.
     * PackageId of a custom dialer app to click-to-open a phone number on Android.
     */
    @SerializedName("customDialerAppPackageId")
    @Expose
    public String customDialerAppPackageId;

    /**
     * The Custom Dialer App Protocol.
     * Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     */
    @SerializedName("customDialerAppProtocol")
    @Expose
    public String customDialerAppProtocol;

    /**
     * The Custom Settings.
     * A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     */
    @SerializedName("customSettings")
    @Expose
    public java.util.List<KeyValuePair> customSettings;

    /**
     * The Deployed App Count.
     * Count of apps to which the current policy is deployed.
     */
    @SerializedName("deployedAppCount")
    @Expose
    public Integer deployedAppCount;

    /**
     * The Disable App Encryption If Device Encryption Is Enabled.
     * When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     */
    @SerializedName("disableAppEncryptionIfDeviceEncryptionIsEnabled")
    @Expose
    public Boolean disableAppEncryptionIfDeviceEncryptionIsEnabled;

    /**
     * The Disable Protection Of Managed Outbound Open In Data.
     * Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps. (iOS Only)
     */
    @SerializedName("disableProtectionOfManagedOutboundOpenInData")
    @Expose
    public Boolean disableProtectionOfManagedOutboundOpenInData;

    /**
     * The Encrypt App Data.
     * Indicates whether managed-app data should be encrypted. (Android only)
     */
    @SerializedName("encryptAppData")
    @Expose
    public Boolean encryptAppData;

    /**
     * The Exempted App Packages.
     * Android App packages in this list will be exempt from the policy and will be able to receive data from managed apps. (Android only)
     */
    @SerializedName("exemptedAppPackages")
    @Expose
    public java.util.List<KeyValuePair> exemptedAppPackages;

    /**
     * The Exempted App Protocols.
     * iOS Apps in this list will be exempt from the policy and will be able to receive data from managed apps. (iOS Only)
     */
    @SerializedName("exemptedAppProtocols")
    @Expose
    public java.util.List<KeyValuePair> exemptedAppProtocols;

    /**
     * The Face Id Blocked.
     * Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     */
    @SerializedName("faceIdBlocked")
    @Expose
    public Boolean faceIdBlocked;

    /**
     * The Filter Open In To Only Managed Apps.
     * Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False. (iOS Only)
     */
    @SerializedName("filterOpenInToOnlyManagedApps")
    @Expose
    public Boolean filterOpenInToOnlyManagedApps;

    /**
     * The Minimum Required Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or app access will be blocked
     */
    @SerializedName("minimumRequiredCompanyPortalVersion")
    @Expose
    public String minimumRequiredCompanyPortalVersion;

    /**
     * The Minimum Required Patch Version.
     * Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     */
    @SerializedName("minimumRequiredPatchVersion")
    @Expose
    public String minimumRequiredPatchVersion;

    /**
     * The Minimum Required Sdk Version.
     * Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     */
    @SerializedName("minimumRequiredSdkVersion")
    @Expose
    public String minimumRequiredSdkVersion;

    /**
     * The Minimum Warning Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     */
    @SerializedName("minimumWarningCompanyPortalVersion")
    @Expose
    public String minimumWarningCompanyPortalVersion;

    /**
     * The Minimum Warning Patch Version.
     * Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
     */
    @SerializedName("minimumWarningPatchVersion")
    @Expose
    public String minimumWarningPatchVersion;

    /**
     * The Minimum Wipe Company Portal Version.
     * Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     */
    @SerializedName("minimumWipeCompanyPortalVersion")
    @Expose
    public String minimumWipeCompanyPortalVersion;

    /**
     * The Minimum Wipe Patch Version.
     * Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data. (Android only)
     */
    @SerializedName("minimumWipePatchVersion")
    @Expose
    public String minimumWipePatchVersion;

    /**
     * The Minimum Wipe Sdk Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName("minimumWipeSdkVersion")
    @Expose
    public String minimumWipeSdkVersion;

    /**
     * The Protect Inbound Data From Unknown Sources.
     * Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps. (iOS Only)
     */
    @SerializedName("protectInboundDataFromUnknownSources")
    @Expose
    public Boolean protectInboundDataFromUnknownSources;

    /**
     * The Required Android Safety Net Apps Verification Type.
     * Defines the Android SafetyNet Apps Verification requirement for a managed app to work.
     */
    @SerializedName("requiredAndroidSafetyNetAppsVerificationType")
    @Expose
    public AndroidManagedAppSafetyNetAppsVerificationType requiredAndroidSafetyNetAppsVerificationType;

    /**
     * The Required Android Safety Net Device Attestation Type.
     * Defines the Android SafetyNet Device Attestation requirement for a managed app to work.
     */
    @SerializedName("requiredAndroidSafetyNetDeviceAttestationType")
    @Expose
    public AndroidManagedAppSafetyNetDeviceAttestationType requiredAndroidSafetyNetDeviceAttestationType;

    /**
     * The Required Android Safety Net Evaluation Type.
     * Defines the Android SafetyNet evaluation type requirement for a managed app to work. (Android Only)
     */
    @SerializedName("requiredAndroidSafetyNetEvaluationType")
    @Expose
    public AndroidManagedAppSafetyNetEvaluationType requiredAndroidSafetyNetEvaluationType;

    /**
     * The Screen Capture Blocked.
     * Indicates whether screen capture is blocked. (Android only)
     */
    @SerializedName("screenCaptureBlocked")
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Third Party Keyboards Blocked.
     * Defines if third party keyboards are allowed while accessing a managed app. (iOS Only)
     */
    @SerializedName("thirdPartyKeyboardsBlocked")
    @Expose
    public Boolean thirdPartyKeyboardsBlocked;

    /**
     * The Apps.
     * List of apps to which the policy is deployed.
     */
    @SerializedName("apps")
    @Expose
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Deployment Summary.
     * Navigation property to deployment summary of the configuration.
     */
    @SerializedName("deploymentSummary")
    @Expose
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


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


        if (json.has("apps")) {
            apps = serializer.deserializeObject(json.get("apps").toString(), ManagedMobileAppCollectionPage.class);
        }
    }
}
