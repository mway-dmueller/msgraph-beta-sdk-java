// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIosVppAppRevokeDeviceLicenseRequest;
import com.microsoft.graph.requests.extensions.IosVppAppRevokeDeviceLicenseRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App Revoke Device License Request Builder.
 */
public class IosVppAppRevokeDeviceLicenseRequestBuilder extends BaseActionRequestBuilder implements IIosVppAppRevokeDeviceLicenseRequestBuilder {

    /**
     * The request builder for this IosVppAppRevokeDeviceLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param managedDeviceId the managedDeviceId
     * @param notifyManagedDevices the notifyManagedDevices
     */
    public IosVppAppRevokeDeviceLicenseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String managedDeviceId, final Boolean notifyManagedDevices) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("managedDeviceId", managedDeviceId);
        bodyParams.put("notifyManagedDevices", notifyManagedDevices);
    }

    /**
     * Creates the IIosVppAppRevokeDeviceLicenseRequest
     *
     * @return the IIosVppAppRevokeDeviceLicenseRequest instance
     */
    public IIosVppAppRevokeDeviceLicenseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IIosVppAppRevokeDeviceLicenseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IIosVppAppRevokeDeviceLicenseRequest instance
     */
    public IIosVppAppRevokeDeviceLicenseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        IosVppAppRevokeDeviceLicenseRequest request = new IosVppAppRevokeDeviceLicenseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("managedDeviceId")) {
            request.body.managedDeviceId = getParameter("managedDeviceId");
        }

        if (hasParameter("notifyManagedDevices")) {
            request.body.notifyManagedDevices = getParameter("notifyManagedDevices");
        }

        return request;
    }
}