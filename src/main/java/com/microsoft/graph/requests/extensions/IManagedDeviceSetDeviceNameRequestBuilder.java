// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceSetDeviceNameRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Set Device Name Request Builder.
 */
public interface IManagedDeviceSetDeviceNameRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceSetDeviceNameRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceSetDeviceNameRequest instance
     */
    IManagedDeviceSetDeviceNameRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IManagedDeviceSetDeviceNameRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceSetDeviceNameRequest instance
     */
    IManagedDeviceSetDeviceNameRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
