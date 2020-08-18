// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRank_EqRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Rank_Eq Request Builder.
 */
public interface IWorkbookFunctionsRank_EqRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsRank_EqRequest
     *
     * @return the IWorkbookFunctionsRank_EqRequest instance
     */
    IWorkbookFunctionsRank_EqRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsRank_EqRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRank_EqRequest instance
     */
    IWorkbookFunctionsRank_EqRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
