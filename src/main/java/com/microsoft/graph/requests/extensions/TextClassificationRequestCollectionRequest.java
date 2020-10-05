// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.TextClassificationRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestCollectionPage;
import com.microsoft.graph.requests.extensions.TextClassificationRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.TextClassificationRequestCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Text Classification Request Collection Request.
 */
public class TextClassificationRequestCollectionRequest extends BaseCollectionRequest<TextClassificationRequestCollectionResponse, ITextClassificationRequestCollectionPage> implements ITextClassificationRequestCollectionRequest {

    /**
     * The request builder for this collection of TextClassificationRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TextClassificationRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TextClassificationRequestCollectionResponse.class, ITextClassificationRequestCollectionPage.class);
    }

    public void get(final ICallback<? super ITextClassificationRequestCollectionPage> callback) {
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

    public ITextClassificationRequestCollectionPage get() throws ClientException {
        final TextClassificationRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TextClassificationRequest newTextClassificationRequest, final ICallback<? super TextClassificationRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TextClassificationRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTextClassificationRequest, callback);
    }

    public TextClassificationRequest post(final TextClassificationRequest newTextClassificationRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TextClassificationRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTextClassificationRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITextClassificationRequestCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TextClassificationRequestCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITextClassificationRequestCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TextClassificationRequestCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ITextClassificationRequestCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (TextClassificationRequestCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITextClassificationRequestCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TextClassificationRequestCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITextClassificationRequestCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TextClassificationRequestCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ITextClassificationRequestCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (TextClassificationRequestCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ITextClassificationRequestCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ITextClassificationRequestCollectionRequest)this;
    }
    public ITextClassificationRequestCollectionPage buildFromResponse(final TextClassificationRequestCollectionResponse response) {
        final ITextClassificationRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TextClassificationRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TextClassificationRequestCollectionPage page = new TextClassificationRequestCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
