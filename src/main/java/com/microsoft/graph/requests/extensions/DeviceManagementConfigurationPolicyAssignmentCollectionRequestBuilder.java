// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicy;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Assignment Collection Request Builder.
 */
public class DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagementConfigurationPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceManagementConfigurationPolicyAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceManagementConfigurationPolicyAssignmentRequestBuilder byId(final String id) {
        return new DeviceManagementConfigurationPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
