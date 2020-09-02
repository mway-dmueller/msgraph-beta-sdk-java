// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.models.extensions.DeviceManagementIntentSettingCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentSettingCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentSettingCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentSettingCategoryCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentSettingCategoryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Setting Category Collection Request.
 */
public class DeviceManagementIntentSettingCategoryCollectionRequest extends BaseCollectionRequest<DeviceManagementIntentSettingCategoryCollectionResponse, IDeviceManagementIntentSettingCategoryCollectionPage> implements IDeviceManagementIntentSettingCategoryCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementIntentSettingCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentSettingCategoryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementIntentSettingCategoryCollectionResponse.class, IDeviceManagementIntentSettingCategoryCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementIntentSettingCategoryCollectionPage> callback) {
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

    public IDeviceManagementIntentSettingCategoryCollectionPage get() throws ClientException {
        final DeviceManagementIntentSettingCategoryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory, final ICallback<DeviceManagementIntentSettingCategory> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementIntentSettingCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementIntentSettingCategory, callback);
    }

    public DeviceManagementIntentSettingCategory post(final DeviceManagementIntentSettingCategory newDeviceManagementIntentSettingCategory) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementIntentSettingCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementIntentSettingCategory);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementIntentSettingCategoryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementIntentSettingCategoryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementIntentSettingCategoryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementIntentSettingCategoryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementIntentSettingCategoryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementIntentSettingCategoryCollectionRequest)this;
    }

    public IDeviceManagementIntentSettingCategoryCollectionPage buildFromResponse(final DeviceManagementIntentSettingCategoryCollectionResponse response) {
        final IDeviceManagementIntentSettingCategoryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementIntentSettingCategoryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementIntentSettingCategoryCollectionPage page = new DeviceManagementIntentSettingCategoryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}