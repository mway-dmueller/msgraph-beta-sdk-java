// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicy;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicyRule;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyRuleCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleManagementPolicyRuleCollectionResponse;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyRuleCollectionRequest;
import com.microsoft.graph.requests.extensions.UnifiedRoleManagementPolicyRuleCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Management Policy Rule Collection Request.
 */
public class UnifiedRoleManagementPolicyRuleCollectionRequest extends BaseCollectionRequest<UnifiedRoleManagementPolicyRuleCollectionResponse, IUnifiedRoleManagementPolicyRuleCollectionPage> implements IUnifiedRoleManagementPolicyRuleCollectionRequest {

    /**
     * The request builder for this collection of UnifiedRoleManagementPolicyRule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleManagementPolicyRuleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleManagementPolicyRuleCollectionResponse.class, IUnifiedRoleManagementPolicyRuleCollectionPage.class);
    }

    public void get(final ICallback<? super IUnifiedRoleManagementPolicyRuleCollectionPage> callback) {
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

    public IUnifiedRoleManagementPolicyRuleCollectionPage get() throws ClientException {
        final UnifiedRoleManagementPolicyRuleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UnifiedRoleManagementPolicyRule newUnifiedRoleManagementPolicyRule, final ICallback<? super UnifiedRoleManagementPolicyRule> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnifiedRoleManagementPolicyRuleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleManagementPolicyRule, callback);
    }

    public UnifiedRoleManagementPolicyRule post(final UnifiedRoleManagementPolicyRule newUnifiedRoleManagementPolicyRule) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnifiedRoleManagementPolicyRuleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleManagementPolicyRule);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyRuleCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleManagementPolicyRuleCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyRuleCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UnifiedRoleManagementPolicyRuleCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyRuleCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UnifiedRoleManagementPolicyRuleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyRuleCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRoleManagementPolicyRuleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyRuleCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UnifiedRoleManagementPolicyRuleCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyRuleCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UnifiedRoleManagementPolicyRuleCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUnifiedRoleManagementPolicyRuleCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUnifiedRoleManagementPolicyRuleCollectionRequest)this;
    }
    public IUnifiedRoleManagementPolicyRuleCollectionPage buildFromResponse(final UnifiedRoleManagementPolicyRuleCollectionResponse response) {
        final IUnifiedRoleManagementPolicyRuleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UnifiedRoleManagementPolicyRuleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UnifiedRoleManagementPolicyRuleCollectionPage page = new UnifiedRoleManagementPolicyRuleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}