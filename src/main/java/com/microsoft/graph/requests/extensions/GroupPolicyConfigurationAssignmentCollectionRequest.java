// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyConfiguration;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Assignment Collection Request.
 */
public class GroupPolicyConfigurationAssignmentCollectionRequest extends BaseCollectionRequest<GroupPolicyConfigurationAssignmentCollectionResponse, IGroupPolicyConfigurationAssignmentCollectionPage> implements IGroupPolicyConfigurationAssignmentCollectionRequest {

    /**
     * The request builder for this collection of GroupPolicyConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyConfigurationAssignmentCollectionResponse.class, IGroupPolicyConfigurationAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IGroupPolicyConfigurationAssignmentCollectionPage> callback) {
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

    public IGroupPolicyConfigurationAssignmentCollectionPage get() throws ClientException {
        final GroupPolicyConfigurationAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment, final ICallback<? super GroupPolicyConfigurationAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupPolicyConfigurationAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupPolicyConfigurationAssignment, callback);
    }

    public GroupPolicyConfigurationAssignment post(final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupPolicyConfigurationAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupPolicyConfigurationAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyConfigurationAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyConfigurationAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IGroupPolicyConfigurationAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (GroupPolicyConfigurationAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IGroupPolicyConfigurationAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (GroupPolicyConfigurationAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyConfigurationAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupPolicyConfigurationAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupPolicyConfigurationAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GroupPolicyConfigurationAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IGroupPolicyConfigurationAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (GroupPolicyConfigurationAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IGroupPolicyConfigurationAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IGroupPolicyConfigurationAssignmentCollectionRequest)this;
    }
    public IGroupPolicyConfigurationAssignmentCollectionPage buildFromResponse(final GroupPolicyConfigurationAssignmentCollectionResponse response) {
        final IGroupPolicyConfigurationAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupPolicyConfigurationAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupPolicyConfigurationAssignmentCollectionPage page = new GroupPolicyConfigurationAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
