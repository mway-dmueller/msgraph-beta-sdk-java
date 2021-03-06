// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;
import com.microsoft.graph.ediscovery.requests.extensions.ICaseReopenRequest;
import com.microsoft.graph.ediscovery.requests.extensions.CaseReopenRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Reopen Request Builder.
 */
public class CaseReopenRequestBuilder extends BaseActionRequestBuilder implements ICaseReopenRequestBuilder {

    /**
     * The request builder for this CaseReopen
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CaseReopenRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ICaseReopenRequest
     *
     * @param requestOptions the options for the request
     * @return the ICaseReopenRequest instance
     */
    public ICaseReopenRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ICaseReopenRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICaseReopenRequest instance
     */
    public ICaseReopenRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CaseReopenRequest request = new CaseReopenRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
