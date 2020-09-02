// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAppConfigurationSchema;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionResponse;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaCollectionRequest;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store App Configuration Schema Collection Request.
 */
public class AndroidManagedStoreAppConfigurationSchemaCollectionRequest extends BaseCollectionRequest<AndroidManagedStoreAppConfigurationSchemaCollectionResponse, IAndroidManagedStoreAppConfigurationSchemaCollectionPage> implements IAndroidManagedStoreAppConfigurationSchemaCollectionRequest {

    /**
     * The request builder for this collection of AndroidManagedStoreAppConfigurationSchema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedStoreAppConfigurationSchemaCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidManagedStoreAppConfigurationSchemaCollectionResponse.class, IAndroidManagedStoreAppConfigurationSchemaCollectionPage.class);
    }

    public void get(final ICallback<IAndroidManagedStoreAppConfigurationSchemaCollectionPage> callback) {
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

    public IAndroidManagedStoreAppConfigurationSchemaCollectionPage get() throws ClientException {
        final AndroidManagedStoreAppConfigurationSchemaCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AndroidManagedStoreAppConfigurationSchema newAndroidManagedStoreAppConfigurationSchema, final ICallback<AndroidManagedStoreAppConfigurationSchema> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AndroidManagedStoreAppConfigurationSchemaRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAndroidManagedStoreAppConfigurationSchema, callback);
    }

    public AndroidManagedStoreAppConfigurationSchema post(final AndroidManagedStoreAppConfigurationSchema newAndroidManagedStoreAppConfigurationSchema) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AndroidManagedStoreAppConfigurationSchemaRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAndroidManagedStoreAppConfigurationSchema);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidManagedStoreAppConfigurationSchemaCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidManagedStoreAppConfigurationSchemaCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidManagedStoreAppConfigurationSchemaCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AndroidManagedStoreAppConfigurationSchemaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAndroidManagedStoreAppConfigurationSchemaCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AndroidManagedStoreAppConfigurationSchemaCollectionRequest)this;
    }

    public IAndroidManagedStoreAppConfigurationSchemaCollectionPage buildFromResponse(final AndroidManagedStoreAppConfigurationSchemaCollectionResponse response) {
        final IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AndroidManagedStoreAppConfigurationSchemaCollectionPage page = new AndroidManagedStoreAppConfigurationSchemaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}