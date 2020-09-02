// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.SalesInvoice;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISalesInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Invoice Collection Request Builder.
 */
public class SalesInvoiceCollectionRequestBuilder extends BaseRequestBuilder implements ISalesInvoiceCollectionRequestBuilder {

    /**
     * The request builder for this collection of Company
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesInvoiceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ISalesInvoiceCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ISalesInvoiceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SalesInvoiceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISalesInvoiceRequestBuilder byId(final String id) {
        return new SalesInvoiceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}