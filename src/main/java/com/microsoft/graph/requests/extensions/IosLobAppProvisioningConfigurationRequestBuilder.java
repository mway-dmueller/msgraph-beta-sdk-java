// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.requests.extensions.IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppProvisioningConfigGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppProvisioningConfigGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Request Builder.
 */
public class IosLobAppProvisioningConfigurationRequestBuilder extends BaseRequestBuilder implements IIosLobAppProvisioningConfigurationRequestBuilder {

    /**
     * The request builder for the IosLobAppProvisioningConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosLobAppProvisioningConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IIosLobAppProvisioningConfigurationRequest instance
     */
    public IIosLobAppProvisioningConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIosLobAppProvisioningConfigurationRequest instance
     */
    public IIosLobAppProvisioningConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder groupAssignments() {
        return new MobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments"), getClient(), null);
    }

    public IMobileAppProvisioningConfigGroupAssignmentRequestBuilder groupAssignments(final String id) {
        return new MobileAppProvisioningConfigGroupAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments") + "/" + id, getClient(), null);
    }
    public IIosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new IosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IIosLobAppProvisioningConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new IosLobAppProvisioningConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id) {
        return new ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }
    public IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder userStatuses(final String id) {
        return new ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    public IIosLobAppProvisioningConfigurationAssignRequestBuilder assign(final java.util.List<MobileAppProvisioningConfigGroupAssignment> appProvisioningConfigurationGroupAssignments, final java.util.List<IosLobAppProvisioningConfigurationAssignment> iOSLobAppProvisioningConfigAssignments) {
        return new IosLobAppProvisioningConfigurationAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, appProvisioningConfigurationGroupAssignments, iOSLobAppProvisioningConfigAssignments);
    }
}