// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesOrder;
import com.microsoft.graph.models.extensions.SalesOrderLine;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISalesOrderLineCollectionPage;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionResponse;
import com.microsoft.graph.requests.extensions.ISalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderLineCollectionRequest;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Order Line Collection Request.
 */
public class SalesOrderLineCollectionRequest extends BaseCollectionRequest<SalesOrderLineCollectionResponse, ISalesOrderLineCollectionPage> implements ISalesOrderLineCollectionRequest {

    /**
     * The request builder for this collection of SalesOrderLine
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesOrderLineCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SalesOrderLineCollectionResponse.class, ISalesOrderLineCollectionPage.class);
    }

    public void get(final ICallback<? super ISalesOrderLineCollectionPage> callback) {
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

    public ISalesOrderLineCollectionPage get() throws ClientException {
        final SalesOrderLineCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SalesOrderLine newSalesOrderLine, final ICallback<? super SalesOrderLine> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SalesOrderLineRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSalesOrderLine, callback);
    }

    public SalesOrderLine post(final SalesOrderLine newSalesOrderLine) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SalesOrderLineRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSalesOrderLine);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISalesOrderLineCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SalesOrderLineCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISalesOrderLineCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SalesOrderLineCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ISalesOrderLineCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (SalesOrderLineCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISalesOrderLineCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SalesOrderLineCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISalesOrderLineCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SalesOrderLineCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISalesOrderLineCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SalesOrderLineCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISalesOrderLineCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISalesOrderLineCollectionRequest)this;
    }
    public ISalesOrderLineCollectionPage buildFromResponse(final SalesOrderLineCollectionResponse response) {
        final ISalesOrderLineCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SalesOrderLineCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SalesOrderLineCollectionPage page = new SalesOrderLineCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
