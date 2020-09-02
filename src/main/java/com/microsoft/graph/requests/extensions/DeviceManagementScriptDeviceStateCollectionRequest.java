// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementScriptUserState;
import com.microsoft.graph.models.extensions.DeviceManagementScriptDeviceState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Device State Collection Request.
 */
public class DeviceManagementScriptDeviceStateCollectionRequest extends BaseCollectionRequest<DeviceManagementScriptDeviceStateCollectionResponse, IDeviceManagementScriptDeviceStateCollectionPage> implements IDeviceManagementScriptDeviceStateCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementScriptDeviceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptDeviceStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptDeviceStateCollectionResponse.class, IDeviceManagementScriptDeviceStateCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementScriptDeviceStateCollectionPage> callback) {
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

    public IDeviceManagementScriptDeviceStateCollectionPage get() throws ClientException {
        final DeviceManagementScriptDeviceStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementScriptDeviceState newDeviceManagementScriptDeviceState, final ICallback<DeviceManagementScriptDeviceState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementScriptDeviceStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementScriptDeviceState, callback);
    }

    public DeviceManagementScriptDeviceState post(final DeviceManagementScriptDeviceState newDeviceManagementScriptDeviceState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementScriptDeviceStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementScriptDeviceState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementScriptDeviceStateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementScriptDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementScriptDeviceStateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementScriptDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementScriptDeviceStateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementScriptDeviceStateCollectionRequest)this;
    }

    public IDeviceManagementScriptDeviceStateCollectionPage buildFromResponse(final DeviceManagementScriptDeviceStateCollectionResponse response) {
        final IDeviceManagementScriptDeviceStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementScriptDeviceStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementScriptDeviceStateCollectionPage page = new DeviceManagementScriptDeviceStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}