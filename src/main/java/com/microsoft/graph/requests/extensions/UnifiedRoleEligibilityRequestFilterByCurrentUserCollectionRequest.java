// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.RoleEligibilityRequestFilterByCurrentUserOptions;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilityRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Request Filter By Current User Collection Request.
 */
public class UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest extends BaseCollectionRequest<UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse, IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage> implements IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest {


    /**
     * The request for this UnifiedRoleEligibilityRequestFilterByCurrentUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse.class, IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage.class);
    }


    public void get(final ICallback<? super IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage> callback) {
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

    public IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage get() throws ClientException {
        final UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage buildFromResponse(final UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse response) {
        final IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (RoleEligibilityRequestFilterByCurrentUserOptions) null);
        } else {
            builder = null;
        }
        final IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage page = new UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequest)this;
    }

}
