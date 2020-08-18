// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDec2OctRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Dec2Oct Request Builder.
 */
public interface IWorkbookFunctionsDec2OctRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDec2OctRequest
     *
     * @return the IWorkbookFunctionsDec2OctRequest instance
     */
    IWorkbookFunctionsDec2OctRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsDec2OctRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDec2OctRequest instance
     */
    IWorkbookFunctionsDec2OctRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
