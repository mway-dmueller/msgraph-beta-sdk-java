// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyConfiguration;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionValueCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionResponse;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionValueCollectionRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Value Collection Request.
 */
public class GroupPolicyDefinitionValueCollectionRequest extends BaseCollectionRequest<GroupPolicyDefinitionValueCollectionResponse, IGroupPolicyDefinitionValueCollectionPage> implements IGroupPolicyDefinitionValueCollectionRequest {

    /**
     * The request builder for this collection of GroupPolicyDefinitionValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionValueCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinitionValueCollectionResponse.class, IGroupPolicyDefinitionValueCollectionPage.class);
    }

    public void get(final ICallback<? super IGroupPolicyDefinitionValueCollectionPage> callback) {
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

    public IGroupPolicyDefinitionValueCollectionPage get() throws ClientException {
        final GroupPolicyDefinitionValueCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GroupPolicyDefinitionValue newGroupPolicyDefinitionValue, final ICallback<? super GroupPolicyDefinitionValue> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupPolicyDefinitionValueRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupPolicyDefinitionValue, callback);
    }

    public GroupPolicyDefinitionValue post(final GroupPolicyDefinitionValue newGroupPolicyDefinitionValue) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupPolicyDefinitionValueRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupPolicyDefinitionValue);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyDefinitionValueCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (GroupPolicyDefinitionValueCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (GroupPolicyDefinitionValueCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupPolicyDefinitionValueCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GroupPolicyDefinitionValueCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (GroupPolicyDefinitionValueCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IGroupPolicyDefinitionValueCollectionRequest)this;
    }
    public IGroupPolicyDefinitionValueCollectionPage buildFromResponse(final GroupPolicyDefinitionValueCollectionResponse response) {
        final IGroupPolicyDefinitionValueCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupPolicyDefinitionValueCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupPolicyDefinitionValueCollectionPage page = new GroupPolicyDefinitionValueCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
