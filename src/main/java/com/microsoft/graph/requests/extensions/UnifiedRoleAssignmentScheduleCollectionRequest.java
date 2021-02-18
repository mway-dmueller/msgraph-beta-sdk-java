// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplication;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentSchedule;
import com.microsoft.graph.models.generated.RoleAssignmentScheduleFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentScheduleCollectionResponse;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleCollectionRequest;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentScheduleCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Collection Request.
 */
public class UnifiedRoleAssignmentScheduleCollectionRequest extends BaseCollectionRequest<UnifiedRoleAssignmentScheduleCollectionResponse, IUnifiedRoleAssignmentScheduleCollectionPage> implements IUnifiedRoleAssignmentScheduleCollectionRequest {

    /**
     * The request builder for this collection of UnifiedRoleAssignmentSchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentScheduleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentScheduleCollectionResponse.class, IUnifiedRoleAssignmentScheduleCollectionPage.class);
    }

    public void get(final ICallback<? super IUnifiedRoleAssignmentScheduleCollectionPage> callback) {
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

    public IUnifiedRoleAssignmentScheduleCollectionPage get() throws ClientException {
        final UnifiedRoleAssignmentScheduleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UnifiedRoleAssignmentSchedule newUnifiedRoleAssignmentSchedule, final ICallback<? super UnifiedRoleAssignmentSchedule> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnifiedRoleAssignmentScheduleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleAssignmentSchedule, callback);
    }

    public UnifiedRoleAssignmentSchedule post(final UnifiedRoleAssignmentSchedule newUnifiedRoleAssignmentSchedule) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnifiedRoleAssignmentScheduleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleAssignmentSchedule);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleAssignmentScheduleCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UnifiedRoleAssignmentScheduleCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UnifiedRoleAssignmentScheduleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRoleAssignmentScheduleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UnifiedRoleAssignmentScheduleCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UnifiedRoleAssignmentScheduleCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUnifiedRoleAssignmentScheduleCollectionRequest)this;
    }
    public IUnifiedRoleAssignmentScheduleCollectionPage buildFromResponse(final UnifiedRoleAssignmentScheduleCollectionResponse response) {
        final IUnifiedRoleAssignmentScheduleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UnifiedRoleAssignmentScheduleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UnifiedRoleAssignmentScheduleCollectionPage page = new UnifiedRoleAssignmentScheduleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}