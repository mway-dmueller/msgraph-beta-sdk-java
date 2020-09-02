// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.models.extensions.DeviceManagementIntentDeviceState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Device State Collection Request.
 */
public class DeviceManagementIntentDeviceStateCollectionRequest extends BaseCollectionRequest<DeviceManagementIntentDeviceStateCollectionResponse, IDeviceManagementIntentDeviceStateCollectionPage> implements IDeviceManagementIntentDeviceStateCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementIntentDeviceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentDeviceStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementIntentDeviceStateCollectionResponse.class, IDeviceManagementIntentDeviceStateCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementIntentDeviceStateCollectionPage> callback) {
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

    public IDeviceManagementIntentDeviceStateCollectionPage get() throws ClientException {
        final DeviceManagementIntentDeviceStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementIntentDeviceState newDeviceManagementIntentDeviceState, final ICallback<DeviceManagementIntentDeviceState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementIntentDeviceStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementIntentDeviceState, callback);
    }

    public DeviceManagementIntentDeviceState post(final DeviceManagementIntentDeviceState newDeviceManagementIntentDeviceState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementIntentDeviceStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementIntentDeviceState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementIntentDeviceStateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementIntentDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementIntentDeviceStateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementIntentDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementIntentDeviceStateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementIntentDeviceStateCollectionRequest)this;
    }

    public IDeviceManagementIntentDeviceStateCollectionPage buildFromResponse(final DeviceManagementIntentDeviceStateCollectionResponse response) {
        final IDeviceManagementIntentDeviceStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementIntentDeviceStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementIntentDeviceStateCollectionPage page = new DeviceManagementIntentDeviceStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}