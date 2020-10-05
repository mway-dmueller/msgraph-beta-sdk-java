// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.CompanyPortalBlockedAction;
import com.microsoft.graph.models.generated.EnrollmentAvailabilityOptions;
import com.microsoft.graph.models.extensions.MimeContent;
import com.microsoft.graph.models.extensions.RgbColor;
import com.microsoft.graph.models.extensions.IntuneBrandingProfileAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intune Branding Profile.
 */
public class IntuneBrandingProfile extends Entity implements IJsonBackedObject {


    /**
     * The Company Portal Blocked Actions.
     * Collection of blocked actions on the company portal as per platform and device ownership types.
     */
    @SerializedName("companyPortalBlockedActions")
    @Expose
    public java.util.List<CompanyPortalBlockedAction> companyPortalBlockedActions;

    /**
     * The Contact ITEmail Address.
     * E-mail address of the person/organization responsible for IT support
     */
    @SerializedName("contactITEmailAddress")
    @Expose
    public String contactITEmailAddress;

    /**
     * The Contact ITName.
     * Name of the person/organization responsible for IT support
     */
    @SerializedName("contactITName")
    @Expose
    public String contactITName;

    /**
     * The Contact ITNotes.
     * Text comments regarding the person/organization responsible for IT support
     */
    @SerializedName("contactITNotes")
    @Expose
    public String contactITNotes;

    /**
     * The Contact ITPhone Number.
     * Phone number of the person/organization responsible for IT support
     */
    @SerializedName("contactITPhoneNumber")
    @Expose
    public String contactITPhoneNumber;

    /**
     * The Created Date Time.
     * Time when the BrandingProfile was created
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Custom Can See Privacy Message.
     * Text comments regarding what the admin has access to on the device
     */
    @SerializedName("customCanSeePrivacyMessage")
    @Expose
    public String customCanSeePrivacyMessage;

    /**
     * The Custom Cant See Privacy Message.
     * Text comments regarding what the admin doesn't have access to on the device
     */
    @SerializedName("customCantSeePrivacyMessage")
    @Expose
    public String customCantSeePrivacyMessage;

    /**
     * The Custom Privacy Message.
     * Text comments regarding what the admin doesn't have access to on the device
     */
    @SerializedName("customPrivacyMessage")
    @Expose
    public String customPrivacyMessage;

    /**
     * The Disable Client Telemetry.
     * Applies to telemetry sent from all clients to the Intune service. When disabled, all proactive troubleshooting and issue warnings within the client are turned off, and telemetry settings appear inactive or hidden to the device user.
     */
    @SerializedName("disableClientTelemetry")
    @Expose
    public Boolean disableClientTelemetry;

    /**
     * The Display Name.
     * Company/organization name that is displayed to end users
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Enrollment Availability.
     * Customized device enrollment flow displayed to the end user 
     */
    @SerializedName("enrollmentAvailability")
    @Expose
    public EnrollmentAvailabilityOptions enrollmentAvailability;

    /**
     * The Is Default Profile.
     * Boolean that represents whether the profile is used as default or not
     */
    @SerializedName("isDefaultProfile")
    @Expose
    public Boolean isDefaultProfile;

    /**
     * The Is Factory Reset Disabled.
     * Boolean that represents whether the adminsistrator has disabled the 'Factory Reset' action on corporate owned devices.
     */
    @SerializedName("isFactoryResetDisabled")
    @Expose
    public Boolean isFactoryResetDisabled;

    /**
     * The Is Remove Device Disabled.
     * Boolean that represents whether the adminsistrator has disabled the 'Remove Device' action on corporate owned devices.
     */
    @SerializedName("isRemoveDeviceDisabled")
    @Expose
    public Boolean isRemoveDeviceDisabled;

    /**
     * The Landing Page Customized Image.
     * Customized image displayed in Company Portal apps landing page
     */
    @SerializedName("landingPageCustomizedImage")
    @Expose
    public MimeContent landingPageCustomizedImage;

    /**
     * The Last Modified Date Time.
     * Time when the BrandingProfile was last modified
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Light Background Logo.
     * Logo image displayed in Company Portal apps which have a light background behind the logo
     */
    @SerializedName("lightBackgroundLogo")
    @Expose
    public MimeContent lightBackgroundLogo;

    /**
     * The Online Support Site Name.
     * Display name of the company/organization???s IT helpdesk site
     */
    @SerializedName("onlineSupportSiteName")
    @Expose
    public String onlineSupportSiteName;

    /**
     * The Online Support Site Url.
     * URL to the company/organization???s IT helpdesk site
     */
    @SerializedName("onlineSupportSiteUrl")
    @Expose
    public String onlineSupportSiteUrl;

    /**
     * The Privacy Url.
     * URL to the company/organization???s privacy policy
     */
    @SerializedName("privacyUrl")
    @Expose
    public String privacyUrl;

    /**
     * The Profile Description.
     * Description of the profile
     */
    @SerializedName("profileDescription")
    @Expose
    public String profileDescription;

    /**
     * The Profile Name.
     * Name of the profile
     */
    @SerializedName("profileName")
    @Expose
    public String profileName;

    /**
     * The Role Scope Tag Ids.
     * List of scope tags assigned to the branding profile
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Send Device Ownership Change Push Notification.
     * Boolean that indicates if a push notification is sent to users when their device ownership type changes from personal to corporate
     */
    @SerializedName("sendDeviceOwnershipChangePushNotification")
    @Expose
    public Boolean sendDeviceOwnershipChangePushNotification;

    /**
     * The Show Azure ADEnterprise Apps.
     * Boolean that indicates if AzureAD Enterprise Apps will be shown in Company Portal
     */
    @SerializedName("showAzureADEnterpriseApps")
    @Expose
    public Boolean showAzureADEnterpriseApps;

    /**
     * The Show Display Name Next To Logo.
     * Boolean that represents whether the administrator-supplied display name will be shown next to the logo image or not
     */
    @SerializedName("showDisplayNameNextToLogo")
    @Expose
    public Boolean showDisplayNameNextToLogo;

    /**
     * The Show Logo.
     * Boolean that represents whether the administrator-supplied logo images are shown or not
     */
    @SerializedName("showLogo")
    @Expose
    public Boolean showLogo;

    /**
     * The Show Office Web Apps.
     * Boolean that indicates if Office WebApps will be shown in Company Portal
     */
    @SerializedName("showOfficeWebApps")
    @Expose
    public Boolean showOfficeWebApps;

    /**
     * The Theme Color.
     * Primary theme color used in the Company Portal applications and web portal
     */
    @SerializedName("themeColor")
    @Expose
    public RgbColor themeColor;

    /**
     * The Theme Color Logo.
     * Logo image displayed in Company Portal apps which have a theme color background behind the logo
     */
    @SerializedName("themeColorLogo")
    @Expose
    public MimeContent themeColorLogo;

    /**
     * The Assignments.
     * The list of group assignments for the branding profile
     */
    @SerializedName("assignments")
    @Expose
    public IntuneBrandingProfileAssignmentCollectionPage assignments;


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


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), IntuneBrandingProfileAssignmentCollectionPage.class);
        }
    }
}
