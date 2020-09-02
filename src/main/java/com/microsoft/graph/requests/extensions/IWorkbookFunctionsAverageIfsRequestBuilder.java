// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAverageIfsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Average Ifs Request Builder.
 */
public interface IWorkbookFunctionsAverageIfsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsAverageIfsRequest
     *
     * @return the IWorkbookFunctionsAverageIfsRequest instance
     */
    IWorkbookFunctionsAverageIfsRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsAverageIfsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAverageIfsRequest instance
     */
    IWorkbookFunctionsAverageIfsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}