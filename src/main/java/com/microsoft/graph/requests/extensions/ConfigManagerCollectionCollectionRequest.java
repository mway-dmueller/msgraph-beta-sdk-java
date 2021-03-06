// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ConfigManagerCollection;
import com.microsoft.graph.models.extensions.ConfigManagerPolicySummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IConfigManagerCollectionCollectionPage;
import com.microsoft.graph.requests.extensions.ConfigManagerCollectionCollectionResponse;
import com.microsoft.graph.requests.extensions.IConfigManagerCollectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConfigManagerCollectionCollectionRequest;
import com.microsoft.graph.requests.extensions.ConfigManagerCollectionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Config Manager Collection Collection Request.
 */
public class ConfigManagerCollectionCollectionRequest extends BaseCollectionRequest<ConfigManagerCollectionCollectionResponse, IConfigManagerCollectionCollectionPage> implements IConfigManagerCollectionCollectionRequest {

    /**
     * The request builder for this collection of ConfigManagerCollection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConfigManagerCollectionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConfigManagerCollectionCollectionResponse.class, IConfigManagerCollectionCollectionPage.class);
    }

    public void get(final ICallback<? super IConfigManagerCollectionCollectionPage> callback) {
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

    public IConfigManagerCollectionCollectionPage get() throws ClientException {
        final ConfigManagerCollectionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ConfigManagerCollection newConfigManagerCollection, final ICallback<? super ConfigManagerCollection> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ConfigManagerCollectionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newConfigManagerCollection, callback);
    }

    public ConfigManagerCollection post(final ConfigManagerCollection newConfigManagerCollection) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ConfigManagerCollectionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newConfigManagerCollection);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IConfigManagerCollectionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ConfigManagerCollectionCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IConfigManagerCollectionCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ConfigManagerCollectionCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IConfigManagerCollectionCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ConfigManagerCollectionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IConfigManagerCollectionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ConfigManagerCollectionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IConfigManagerCollectionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ConfigManagerCollectionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IConfigManagerCollectionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ConfigManagerCollectionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IConfigManagerCollectionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IConfigManagerCollectionCollectionRequest)this;
    }
    public IConfigManagerCollectionCollectionPage buildFromResponse(final ConfigManagerCollectionCollectionResponse response) {
        final IConfigManagerCollectionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ConfigManagerCollectionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ConfigManagerCollectionCollectionPage page = new ConfigManagerCollectionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
