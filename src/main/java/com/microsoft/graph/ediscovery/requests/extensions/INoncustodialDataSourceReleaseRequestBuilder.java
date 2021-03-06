// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;
import com.microsoft.graph.ediscovery.requests.extensions.INoncustodialDataSourceReleaseRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Noncustodial Data Source Release Request Builder.
 */
public interface INoncustodialDataSourceReleaseRequestBuilder extends IRequestBuilder {

    /**
     * Creates the INoncustodialDataSourceReleaseRequest
     *
     * @param requestOptions the options for the request
     * @return the INoncustodialDataSourceReleaseRequest instance
     */
    INoncustodialDataSourceReleaseRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the INoncustodialDataSourceReleaseRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the INoncustodialDataSourceReleaseRequest instance
     */
    INoncustodialDataSourceReleaseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
