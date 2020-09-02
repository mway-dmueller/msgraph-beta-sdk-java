// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISalesInvoicePostAndSendRequest;
import com.microsoft.graph.requests.extensions.SalesInvoicePostAndSendRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Invoice Post And Send Request Builder.
 */
public class SalesInvoicePostAndSendRequestBuilder extends BaseActionRequestBuilder implements ISalesInvoicePostAndSendRequestBuilder {

    /**
     * The request builder for this SalesInvoicePostAndSend
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesInvoicePostAndSendRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ISalesInvoicePostAndSendRequest
     *
     * @return the ISalesInvoicePostAndSendRequest instance
     */
    public ISalesInvoicePostAndSendRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ISalesInvoicePostAndSendRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ISalesInvoicePostAndSendRequest instance
     */
    public ISalesInvoicePostAndSendRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        SalesInvoicePostAndSendRequest request = new SalesInvoicePostAndSendRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}