// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Cloud Pc On Premises Connection Update Ad Domain Password Request Builder.
 */
public interface ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest
     *
     * @param requestOptions the options for the request
     * @return the ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest instance
     */
    ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest instance
     */
    ICloudPcOnPremisesConnectionUpdateAdDomainPasswordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
