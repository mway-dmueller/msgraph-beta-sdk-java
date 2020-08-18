// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPermutationaRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Permutationa Request Builder.
 */
public interface IWorkbookFunctionsPermutationaRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsPermutationaRequest
     *
     * @return the IWorkbookFunctionsPermutationaRequest instance
     */
    IWorkbookFunctionsPermutationaRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsPermutationaRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPermutationaRequest instance
     */
    IWorkbookFunctionsPermutationaRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
