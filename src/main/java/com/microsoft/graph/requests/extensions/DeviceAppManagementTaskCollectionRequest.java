// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.DeviceAppManagementTask;
import com.microsoft.graph.models.generated.DeviceAppManagementTaskStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementTaskCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementTaskCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceAppManagementTaskCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Task Collection Request.
 */
public class DeviceAppManagementTaskCollectionRequest extends BaseCollectionRequest<DeviceAppManagementTaskCollectionResponse, IDeviceAppManagementTaskCollectionPage> implements IDeviceAppManagementTaskCollectionRequest {

    /**
     * The request builder for this collection of DeviceAppManagementTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementTaskCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAppManagementTaskCollectionResponse.class, IDeviceAppManagementTaskCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceAppManagementTaskCollectionPage> callback) {
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

    public IDeviceAppManagementTaskCollectionPage get() throws ClientException {
        final DeviceAppManagementTaskCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceAppManagementTask newDeviceAppManagementTask, final ICallback<? super DeviceAppManagementTask> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceAppManagementTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceAppManagementTask, callback);
    }

    public DeviceAppManagementTask post(final DeviceAppManagementTask newDeviceAppManagementTask) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceAppManagementTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceAppManagementTask);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceAppManagementTaskCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceAppManagementTaskCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceAppManagementTaskCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceAppManagementTaskCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceAppManagementTaskCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceAppManagementTaskCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceAppManagementTaskCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceAppManagementTaskCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceAppManagementTaskCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceAppManagementTaskCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceAppManagementTaskCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceAppManagementTaskCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceAppManagementTaskCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceAppManagementTaskCollectionRequest)this;
    }
    public IDeviceAppManagementTaskCollectionPage buildFromResponse(final DeviceAppManagementTaskCollectionResponse response) {
        final IDeviceAppManagementTaskCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceAppManagementTaskCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceAppManagementTaskCollectionPage page = new DeviceAppManagementTaskCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
