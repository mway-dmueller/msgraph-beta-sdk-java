// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.models.extensions.Connector;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connector Collection With References Request.
 */
public class ConnectorCollectionWithReferencesRequest extends BaseCollectionRequest<ConnectorCollectionResponse, IConnectorCollectionPage> implements IConnectorCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of Connector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConnectorCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConnectorCollectionResponse.class, IConnectorCollectionPage.class);
    }

    public void get(final ICallback<IConnectorCollectionWithReferencesPage> callback) {
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

    public IConnectorCollectionWithReferencesPage get() throws ClientException {
        final ConnectorCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IConnectorCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ConnectorCollectionWithReferencesRequest)this;
    }

    public IConnectorCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ConnectorCollectionWithReferencesRequest)this;
    }

    public IConnectorCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ConnectorCollectionWithReferencesRequest)this;
    }

    public IConnectorCollectionWithReferencesPage buildFromResponse(final ConnectorCollectionResponse response) {
        final IConnectorCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ConnectorCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ConnectorCollectionWithReferencesPage page = new ConnectorCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}