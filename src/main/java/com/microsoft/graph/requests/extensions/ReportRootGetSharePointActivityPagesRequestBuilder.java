// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityPagesRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointActivityPagesRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Activity Pages Request Builder.
 */
public class ReportRootGetSharePointActivityPagesRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetSharePointActivityPagesRequestBuilder {

    /**
     * The request builder for this ReportRootGetSharePointActivityPages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetSharePointActivityPagesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetSharePointActivityPagesRequest
     *
     * @return the IReportRootGetSharePointActivityPagesRequest instance
     */
    public IReportRootGetSharePointActivityPagesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetSharePointActivityPagesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointActivityPagesRequest instance
     */
    public IReportRootGetSharePointActivityPagesRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ReportRootGetSharePointActivityPagesRequest request = new ReportRootGetSharePointActivityPagesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
