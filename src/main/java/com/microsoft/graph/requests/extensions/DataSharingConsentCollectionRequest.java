// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DataSharingConsent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDataSharingConsentCollectionPage;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionResponse;
import com.microsoft.graph.requests.extensions.IDataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentCollectionRequest;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Sharing Consent Collection Request.
 */
public class DataSharingConsentCollectionRequest extends BaseCollectionRequest<DataSharingConsentCollectionResponse, IDataSharingConsentCollectionPage> implements IDataSharingConsentCollectionRequest {

    /**
     * The request builder for this collection of DataSharingConsent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataSharingConsentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataSharingConsentCollectionResponse.class, IDataSharingConsentCollectionPage.class);
    }

    public void get(final ICallback<IDataSharingConsentCollectionPage> callback) {
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

    public IDataSharingConsentCollectionPage get() throws ClientException {
        final DataSharingConsentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DataSharingConsent newDataSharingConsent, final ICallback<DataSharingConsent> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DataSharingConsentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDataSharingConsent, callback);
    }

    public DataSharingConsent post(final DataSharingConsent newDataSharingConsent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DataSharingConsentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDataSharingConsent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDataSharingConsentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DataSharingConsentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDataSharingConsentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DataSharingConsentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDataSharingConsentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DataSharingConsentCollectionRequest)this;
    }

    public IDataSharingConsentCollectionPage buildFromResponse(final DataSharingConsentCollectionResponse response) {
        final IDataSharingConsentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DataSharingConsentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DataSharingConsentCollectionPage page = new DataSharingConsentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}