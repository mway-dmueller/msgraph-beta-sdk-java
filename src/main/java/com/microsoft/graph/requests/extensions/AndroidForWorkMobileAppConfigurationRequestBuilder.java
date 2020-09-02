// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkMobileAppConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Mobile App Configuration Request Builder.
 */
public class AndroidForWorkMobileAppConfigurationRequestBuilder extends BaseRequestBuilder implements IAndroidForWorkMobileAppConfigurationRequestBuilder {

    /**
     * The request builder for the AndroidForWorkMobileAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkMobileAppConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IAndroidForWorkMobileAppConfigurationRequest instance
     */
    public IAndroidForWorkMobileAppConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAndroidForWorkMobileAppConfigurationRequest instance
     */
    public IAndroidForWorkMobileAppConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AndroidForWorkMobileAppConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new ManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IManagedDeviceMobileAppConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new ManagedDeviceMobileAppConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
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

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationDeviceSummary
     *
     * @return the IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder instance
     */
    public IManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder deviceStatusSummary() {
        return new ManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusSummary"), getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationUserSummary
     *
     * @return the IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder instance
     */
    public IManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder userStatusSummary() {
        return new ManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusSummary"), getClient(), null);
    }
}