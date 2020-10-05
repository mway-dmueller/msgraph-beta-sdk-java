// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import com.microsoft.graph.models.extensions.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Collection With References Request.
 */
public class DirectoryObjectCollectionWithReferencesRequest extends BaseCollectionRequest<DirectoryObjectCollectionResponse, IDirectoryObjectCollectionPage> implements IDirectoryObjectCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectCollectionResponse.class, IDirectoryObjectCollectionPage.class);
    }

    public void get(final ICallback<? super IDirectoryObjectCollectionWithReferencesPage> callback) {
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

    public IDirectoryObjectCollectionWithReferencesPage get() throws ClientException {
        final DirectoryObjectCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IDirectoryObjectCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public IDirectoryObjectCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public IDirectoryObjectCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public IDirectoryObjectCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public IDirectoryObjectCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    public IDirectoryObjectCollectionWithReferencesPage buildFromResponse(final DirectoryObjectCollectionResponse response) {
        final IDirectoryObjectCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryObjectCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DirectoryObjectCollectionWithReferencesPage page = new DirectoryObjectCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
