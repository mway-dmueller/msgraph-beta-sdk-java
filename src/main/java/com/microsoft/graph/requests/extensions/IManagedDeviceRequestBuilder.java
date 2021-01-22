// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.generated.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.models.extensions.DeviceLogCollectionRequest;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import com.microsoft.graph.models.extensions.ConfigurationManagerAction;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.models.generated.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.extensions.BulkManagedDeviceActionResult;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingState;
import com.microsoft.graph.requests.extensions.ISecurityBaselineStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceLogCollectionResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceLogCollectionResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsProtectionStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Request Builder.
 */
public interface IManagedDeviceRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceRequest instance
     */
    IManagedDeviceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceRequest instance
     */
    IManagedDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ISecurityBaselineStateCollectionRequestBuilder securityBaselineStates();

    ISecurityBaselineStateRequestBuilder securityBaselineStates(final String id);

    IDeviceCompliancePolicyStateCollectionRequestBuilder deviceCompliancePolicyStates();

    IDeviceCompliancePolicyStateRequestBuilder deviceCompliancePolicyStates(final String id);

    IDeviceConfigurationStateCollectionRequestBuilder deviceConfigurationStates();

    IDeviceConfigurationStateRequestBuilder deviceConfigurationStates(final String id);

    IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder managedDeviceMobileAppConfigurationStates();

    IManagedDeviceMobileAppConfigurationStateRequestBuilder managedDeviceMobileAppConfigurationStates(final String id);

    IDetectedAppCollectionWithReferencesRequestBuilder detectedApps();

    IDetectedAppWithReferenceRequestBuilder detectedApps(final String id);

    /**
     * Gets the request builder for DeviceCategory
     *
     * @return the IDeviceCategoryRequestBuilder instance
     */
    IDeviceCategoryRequestBuilder deviceCategory();

    IDeviceLogCollectionResponseCollectionRequestBuilder logCollectionRequests();

    IDeviceLogCollectionResponseRequestBuilder logCollectionRequests(final String id);

    IUserCollectionRequestBuilder users();

    IUserRequestBuilder users(final String id);

    /**
     * Gets the request builder for WindowsProtectionState
     *
     * @return the IWindowsProtectionStateRequestBuilder instance
     */
    IWindowsProtectionStateRequestBuilder windowsProtectionState();
    IManagedDeviceSendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal(final String notificationTitle, final String notificationBody);
    IManagedDeviceOverrideComplianceStateRequestBuilder overrideComplianceState(final AdministratorConfiguredDeviceComplianceState complianceState, final String remediationUrl);
    IManagedDeviceBypassActivationLockRequestBuilder bypassActivationLock();
    IManagedDeviceCleanWindowsDeviceRequestBuilder cleanWindowsDevice(final Boolean keepUserData);
    IManagedDeviceCreateDeviceLogCollectionRequestRequestBuilder createDeviceLogCollectionRequest(final DeviceLogCollectionRequest templateType);
    IManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice(final String userPrincipalName);
    IManagedDeviceDisableLostModeRequestBuilder disableLostMode();
    IManagedDeviceEnableLostModeRequestBuilder enableLostMode(final String message, final String phoneNumber, final String footer);
    IManagedDeviceLocateDeviceRequestBuilder locateDevice();
    IManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser();
    IManagedDevicePlayLostModeSoundRequestBuilder playLostModeSound();
    IManagedDeviceRebootNowRequestBuilder rebootNow();
    IManagedDeviceRecoverPasscodeRequestBuilder recoverPasscode();
    IManagedDeviceRemoteLockRequestBuilder remoteLock();
    IManagedDeviceRequestRemoteAssistanceRequestBuilder requestRemoteAssistance();
    IManagedDeviceResetPasscodeRequestBuilder resetPasscode();
    IManagedDeviceRetireRequestBuilder retire();
    IManagedDeviceRevokeAppleVppLicensesRequestBuilder revokeAppleVppLicenses();
    IManagedDeviceRotateBitLockerKeysRequestBuilder rotateBitLockerKeys();
    IManagedDeviceRotateFileVaultKeyRequestBuilder rotateFileVaultKey();
    IManagedDeviceSetDeviceNameRequestBuilder setDeviceName(final String deviceName);
    IManagedDeviceShutDownRequestBuilder shutDown();
    IManagedDeviceSyncDeviceRequestBuilder syncDevice();
    IManagedDeviceTriggerConfigurationManagerActionRequestBuilder triggerConfigurationManagerAction(final ConfigurationManagerAction configurationManagerAction);
    IManagedDeviceUpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount(final UpdateWindowsDeviceAccountActionParameter updateWindowsDeviceAccountActionParameter);
    IManagedDeviceWindowsDefenderScanRequestBuilder windowsDefenderScan(final Boolean quickScan);
    IManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures();
    IManagedDeviceWipeRequestBuilder wipe(final Boolean keepEnrollmentData, final Boolean keepUserData, final String macOsUnlockCode, final Boolean useProtectedWipe);

    IManagedDeviceGetNonCompliantSettingsCollectionRequestBuilder getNonCompliantSettings();
    IManagedDeviceGetFileVaultKeyRequestBuilder getFileVaultKey();

}