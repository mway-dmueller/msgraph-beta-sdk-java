// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCountIfRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Count If Request Builder.
 */
public interface IWorkbookFunctionsCountIfRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCountIfRequest
     *
     * @return the IWorkbookFunctionsCountIfRequest instance
     */
    IWorkbookFunctionsCountIfRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsCountIfRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCountIfRequest instance
     */
    IWorkbookFunctionsCountIfRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}