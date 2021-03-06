// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleManagementPolicyAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.UnifiedRoleManagementPolicyAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Management Policy Assignment Collection Request.
 */
public class UnifiedRoleManagementPolicyAssignmentCollectionRequest extends BaseCollectionRequest<UnifiedRoleManagementPolicyAssignmentCollectionResponse, IUnifiedRoleManagementPolicyAssignmentCollectionPage> implements IUnifiedRoleManagementPolicyAssignmentCollectionRequest {

    /**
     * The request builder for this collection of UnifiedRoleManagementPolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleManagementPolicyAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleManagementPolicyAssignmentCollectionResponse.class, IUnifiedRoleManagementPolicyAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IUnifiedRoleManagementPolicyAssignmentCollectionPage> callback) {
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

    public IUnifiedRoleManagementPolicyAssignmentCollectionPage get() throws ClientException {
        final UnifiedRoleManagementPolicyAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UnifiedRoleManagementPolicyAssignment newUnifiedRoleManagementPolicyAssignment, final ICallback<? super UnifiedRoleManagementPolicyAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnifiedRoleManagementPolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleManagementPolicyAssignment, callback);
    }

    public UnifiedRoleManagementPolicyAssignment post(final UnifiedRoleManagementPolicyAssignment newUnifiedRoleManagementPolicyAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnifiedRoleManagementPolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleManagementPolicyAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleManagementPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UnifiedRoleManagementPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UnifiedRoleManagementPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRoleManagementPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UnifiedRoleManagementPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UnifiedRoleManagementPolicyAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUnifiedRoleManagementPolicyAssignmentCollectionRequest)this;
    }
    public IUnifiedRoleManagementPolicyAssignmentCollectionPage buildFromResponse(final UnifiedRoleManagementPolicyAssignmentCollectionResponse response) {
        final IUnifiedRoleManagementPolicyAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UnifiedRoleManagementPolicyAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UnifiedRoleManagementPolicyAssignmentCollectionPage page = new UnifiedRoleManagementPolicyAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
