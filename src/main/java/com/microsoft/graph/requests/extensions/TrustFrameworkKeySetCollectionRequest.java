// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TrustFramework;
import com.microsoft.graph.models.extensions.TrustFrameworkKeySet;
import com.microsoft.graph.models.extensions.TrustFrameworkKey;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITrustFrameworkKeySetCollectionPage;
import com.microsoft.graph.requests.extensions.TrustFrameworkKeySetCollectionResponse;
import com.microsoft.graph.requests.extensions.ITrustFrameworkKeySetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrustFrameworkKeySetCollectionRequest;
import com.microsoft.graph.requests.extensions.TrustFrameworkKeySetCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Collection Request.
 */
public class TrustFrameworkKeySetCollectionRequest extends BaseCollectionRequest<TrustFrameworkKeySetCollectionResponse, ITrustFrameworkKeySetCollectionPage> implements ITrustFrameworkKeySetCollectionRequest {

    /**
     * The request builder for this collection of TrustFrameworkKeySet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkKeySetCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TrustFrameworkKeySetCollectionResponse.class, ITrustFrameworkKeySetCollectionPage.class);
    }

    public void get(final ICallback<ITrustFrameworkKeySetCollectionPage> callback) {
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

    public ITrustFrameworkKeySetCollectionPage get() throws ClientException {
        final TrustFrameworkKeySetCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TrustFrameworkKeySet newTrustFrameworkKeySet, final ICallback<TrustFrameworkKeySet> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TrustFrameworkKeySetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTrustFrameworkKeySet, callback);
    }

    public TrustFrameworkKeySet post(final TrustFrameworkKeySet newTrustFrameworkKeySet) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TrustFrameworkKeySetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTrustFrameworkKeySet);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITrustFrameworkKeySetCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TrustFrameworkKeySetCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITrustFrameworkKeySetCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TrustFrameworkKeySetCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITrustFrameworkKeySetCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TrustFrameworkKeySetCollectionRequest)this;
    }

    public ITrustFrameworkKeySetCollectionPage buildFromResponse(final TrustFrameworkKeySetCollectionResponse response) {
        final ITrustFrameworkKeySetCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TrustFrameworkKeySetCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TrustFrameworkKeySetCollectionPage page = new TrustFrameworkKeySetCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}