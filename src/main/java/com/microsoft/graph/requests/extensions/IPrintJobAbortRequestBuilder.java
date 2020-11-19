// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrintJobAbortRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Job Abort Request Builder.
 */
public interface IPrintJobAbortRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IPrintJobAbortRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobAbortRequest instance
     */
    IPrintJobAbortRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IPrintJobAbortRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobAbortRequest instance
     */
    IPrintJobAbortRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}