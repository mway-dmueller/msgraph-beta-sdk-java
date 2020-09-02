// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedSignupStatus;
import com.microsoft.graph.models.extensions.TenantSetupInfo;
import com.microsoft.graph.models.extensions.RoleSuccessStatistics;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Collection Request.
 */
public class PrivilegedSignupStatusCollectionRequest extends BaseCollectionRequest<PrivilegedSignupStatusCollectionResponse, IPrivilegedSignupStatusCollectionPage> implements IPrivilegedSignupStatusCollectionRequest {

    /**
     * The request builder for this collection of PrivilegedSignupStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedSignupStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedSignupStatusCollectionResponse.class, IPrivilegedSignupStatusCollectionPage.class);
    }

    public void get(final ICallback<IPrivilegedSignupStatusCollectionPage> callback) {
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

    public IPrivilegedSignupStatusCollectionPage get() throws ClientException {
        final PrivilegedSignupStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrivilegedSignupStatus newPrivilegedSignupStatus, final ICallback<PrivilegedSignupStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrivilegedSignupStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPrivilegedSignupStatus, callback);
    }

    public PrivilegedSignupStatus post(final PrivilegedSignupStatus newPrivilegedSignupStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrivilegedSignupStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPrivilegedSignupStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedSignupStatusCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrivilegedSignupStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedSignupStatusCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrivilegedSignupStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrivilegedSignupStatusCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrivilegedSignupStatusCollectionRequest)this;
    }

    public IPrivilegedSignupStatusCollectionPage buildFromResponse(final PrivilegedSignupStatusCollectionResponse response) {
        final IPrivilegedSignupStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrivilegedSignupStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrivilegedSignupStatusCollectionPage page = new PrivilegedSignupStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}