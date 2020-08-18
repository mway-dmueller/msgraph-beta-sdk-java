// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFillRequest;
import com.microsoft.graph.requests.extensions.IWorkbookRangeFillClearRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Fill Request Builder.
 */
public interface IWorkbookRangeFillRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookRangeFillRequest instance
     */
    IWorkbookRangeFillRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookRangeFillRequest instance
     */
    IWorkbookRangeFillRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IWorkbookRangeFillClearRequestBuilder clear();

}
