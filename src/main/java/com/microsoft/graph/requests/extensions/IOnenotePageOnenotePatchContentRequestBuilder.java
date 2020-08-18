// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnenotePageOnenotePatchContentRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Page Onenote Patch Content Request Builder.
 */
public interface IOnenotePageOnenotePatchContentRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IOnenotePageOnenotePatchContentRequest
     *
     * @return the IOnenotePageOnenotePatchContentRequest instance
     */
    IOnenotePageOnenotePatchContentRequest buildRequest();

    /**
     * Creates the IOnenotePageOnenotePatchContentRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IOnenotePageOnenotePatchContentRequest instance
     */
    IOnenotePageOnenotePatchContentRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
