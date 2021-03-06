// Template Source: BaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tag Collection With References Request.
 */
public class TagCollectionWithReferencesRequest extends BaseCollectionRequest<TagCollectionResponse, ITagCollectionPage> implements ITagCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of Tag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TagCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TagCollectionResponse.class, ITagCollectionPage.class);
    }

    public void get(final ICallback<? super ITagCollectionWithReferencesPage> callback) {
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

    public ITagCollectionWithReferencesPage get() throws ClientException {
        final TagCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public ITagCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public ITagCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public ITagCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public ITagCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public ITagCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    public ITagCollectionWithReferencesPage buildFromResponse(final TagCollectionResponse response) {
        final ITagCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TagCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TagCollectionWithReferencesPage page = new TagCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
