// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesQuote;
import com.microsoft.graph.models.extensions.SalesQuoteLine;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineCollectionPage;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionResponse;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteLineCollectionRequest;
import com.microsoft.graph.requests.extensions.SalesQuoteLineCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Quote Line Collection Request.
 */
public class SalesQuoteLineCollectionRequest extends BaseCollectionRequest<SalesQuoteLineCollectionResponse, ISalesQuoteLineCollectionPage> implements ISalesQuoteLineCollectionRequest {

    /**
     * The request builder for this collection of SalesQuoteLine
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesQuoteLineCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SalesQuoteLineCollectionResponse.class, ISalesQuoteLineCollectionPage.class);
    }

    public void get(final ICallback<ISalesQuoteLineCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISalesQuoteLineCollectionPage get() throws ClientException {
        final SalesQuoteLineCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SalesQuoteLine newSalesQuoteLine, final ICallback<SalesQuoteLine> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SalesQuoteLineRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSalesQuoteLine, callback);
    }

    public SalesQuoteLine post(final SalesQuoteLine newSalesQuoteLine) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SalesQuoteLineRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newSalesQuoteLine);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISalesQuoteLineCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SalesQuoteLineCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISalesQuoteLineCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SalesQuoteLineCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISalesQuoteLineCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SalesQuoteLineCollectionRequest)this;
    }

    public ISalesQuoteLineCollectionPage buildFromResponse(final SalesQuoteLineCollectionResponse response) {
        final ISalesQuoteLineCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SalesQuoteLineCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SalesQuoteLineCollectionPage page = new SalesQuoteLineCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}