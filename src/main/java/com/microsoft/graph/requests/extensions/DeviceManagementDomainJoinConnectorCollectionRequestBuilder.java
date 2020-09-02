// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementDomainJoinConnector;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Domain Join Connector Collection Request Builder.
 */
public class DeviceManagementDomainJoinConnectorCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceManagementDomainJoinConnectorCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementDomainJoinConnectorCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceManagementDomainJoinConnectorCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceManagementDomainJoinConnectorCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceManagementDomainJoinConnectorCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceManagementDomainJoinConnectorRequestBuilder byId(final String id) {
        return new DeviceManagementDomainJoinConnectorRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}