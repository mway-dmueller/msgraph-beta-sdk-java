// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest;
import com.microsoft.graph.requests.extensions.CloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc On Premises Connection Update Ad Domain Password Request Builder.
 */
public class CloudPcOnPremisesConnectionUpdateAdDomainPasswordRequestBuilder extends BaseActionRequestBuilder implements ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequestBuilder {

    /**
     * The request builder for this CloudPcOnPremisesConnectionUpdateAdDomainPassword
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param adDomainPassword the adDomainPassword
     */
    public CloudPcOnPremisesConnectionUpdateAdDomainPasswordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String adDomainPassword) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("adDomainPassword", adDomainPassword);
    }

    /**
     * Creates the ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest
     *
     * @param requestOptions the options for the request
     * @return the ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest instance
     */
    public ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest instance
     */
    public ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest request = new CloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("adDomainPassword")) {
            request.body.adDomainPassword = getParameter("adDomainPassword");
        }

        return request;
    }
}