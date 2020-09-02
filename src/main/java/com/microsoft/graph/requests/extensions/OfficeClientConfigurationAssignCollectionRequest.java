// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignCollectionPage;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignCollectionResponse;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationAssignBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration Assign Collection Request.
 */
public class OfficeClientConfigurationAssignCollectionRequest extends BaseCollectionRequest<OfficeClientConfigurationAssignCollectionResponse, IOfficeClientConfigurationAssignCollectionPage> implements IOfficeClientConfigurationAssignCollectionRequest {


    protected final OfficeClientConfigurationAssignBody body;


    /**
     * The request for this OfficeClientConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfficeClientConfigurationAssignCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OfficeClientConfigurationAssignCollectionResponse.class, IOfficeClientConfigurationAssignCollectionPage.class);
        body = new OfficeClientConfigurationAssignBody();
    }


    public void post(final ICallback<IOfficeClientConfigurationAssignCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IOfficeClientConfigurationAssignCollectionPage post() throws ClientException {
        final OfficeClientConfigurationAssignCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IOfficeClientConfigurationAssignCollectionPage buildFromResponse(final OfficeClientConfigurationAssignCollectionResponse response) {
        final IOfficeClientConfigurationAssignCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OfficeClientConfigurationAssignCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<OfficeClientConfigurationAssignment>) null);
        } else {
            builder = null;
        }
        final IOfficeClientConfigurationAssignCollectionPage page = new OfficeClientConfigurationAssignCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOfficeClientConfigurationAssignCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IOfficeClientConfigurationAssignCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOfficeClientConfigurationAssignCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IOfficeClientConfigurationAssignCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOfficeClientConfigurationAssignCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IOfficeClientConfigurationAssignCollectionRequest)this;
    }

}