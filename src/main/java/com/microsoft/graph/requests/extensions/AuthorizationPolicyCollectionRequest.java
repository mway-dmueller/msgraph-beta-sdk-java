// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.AuthorizationPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAuthorizationPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.AuthorizationPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.IAuthorizationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthorizationPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.AuthorizationPolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authorization Policy Collection Request.
 */
public class AuthorizationPolicyCollectionRequest extends BaseCollectionRequest<AuthorizationPolicyCollectionResponse, IAuthorizationPolicyCollectionPage> implements IAuthorizationPolicyCollectionRequest {

    /**
     * The request builder for this collection of AuthorizationPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthorizationPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthorizationPolicyCollectionResponse.class, IAuthorizationPolicyCollectionPage.class);
    }

    public void get(final ICallback<? super IAuthorizationPolicyCollectionPage> callback) {
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

    public IAuthorizationPolicyCollectionPage get() throws ClientException {
        final AuthorizationPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AuthorizationPolicy newAuthorizationPolicy, final ICallback<? super AuthorizationPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AuthorizationPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAuthorizationPolicy, callback);
    }

    public AuthorizationPolicy post(final AuthorizationPolicy newAuthorizationPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AuthorizationPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAuthorizationPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAuthorizationPolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AuthorizationPolicyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAuthorizationPolicyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AuthorizationPolicyCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAuthorizationPolicyCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AuthorizationPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAuthorizationPolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AuthorizationPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAuthorizationPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AuthorizationPolicyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAuthorizationPolicyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AuthorizationPolicyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAuthorizationPolicyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAuthorizationPolicyCollectionRequest)this;
    }
    public IAuthorizationPolicyCollectionPage buildFromResponse(final AuthorizationPolicyCollectionResponse response) {
        final IAuthorizationPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AuthorizationPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AuthorizationPolicyCollectionPage page = new AuthorizationPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
