// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResource;
import com.microsoft.graph.models.extensions.AccessPackageResourceScope;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeCollectionResponse;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeCollectionRequest;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Scope Collection Request.
 */
public class AccessPackageResourceScopeCollectionRequest extends BaseCollectionRequest<AccessPackageResourceScopeCollectionResponse, IAccessPackageResourceScopeCollectionPage> implements IAccessPackageResourceScopeCollectionRequest {

    /**
     * The request builder for this collection of AccessPackageResourceScope
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceScopeCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResourceScopeCollectionResponse.class, IAccessPackageResourceScopeCollectionPage.class);
    }

    public void get(final ICallback<? super IAccessPackageResourceScopeCollectionPage> callback) {
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

    public IAccessPackageResourceScopeCollectionPage get() throws ClientException {
        final AccessPackageResourceScopeCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AccessPackageResourceScope newAccessPackageResourceScope, final ICallback<? super AccessPackageResourceScope> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AccessPackageResourceScopeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessPackageResourceScope, callback);
    }

    public AccessPackageResourceScope post(final AccessPackageResourceScope newAccessPackageResourceScope) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessPackageResourceScopeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessPackageResourceScope);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageResourceScopeCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessPackageResourceScopeCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAccessPackageResourceScopeCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AccessPackageResourceScopeCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAccessPackageResourceScopeCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AccessPackageResourceScopeCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageResourceScopeCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessPackageResourceScopeCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAccessPackageResourceScopeCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AccessPackageResourceScopeCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAccessPackageResourceScopeCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AccessPackageResourceScopeCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAccessPackageResourceScopeCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAccessPackageResourceScopeCollectionRequest)this;
    }
    public IAccessPackageResourceScopeCollectionPage buildFromResponse(final AccessPackageResourceScopeCollectionResponse response) {
        final IAccessPackageResourceScopeCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AccessPackageResourceScopeCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AccessPackageResourceScopeCollectionPage page = new AccessPackageResourceScopeCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
