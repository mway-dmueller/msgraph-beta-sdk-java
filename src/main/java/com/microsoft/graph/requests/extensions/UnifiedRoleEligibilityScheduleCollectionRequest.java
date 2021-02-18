// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplication;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilitySchedule;
import com.microsoft.graph.models.generated.RoleEligibilityScheduleFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleCollectionResponse;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleCollectionRequest;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Collection Request.
 */
public class UnifiedRoleEligibilityScheduleCollectionRequest extends BaseCollectionRequest<UnifiedRoleEligibilityScheduleCollectionResponse, IUnifiedRoleEligibilityScheduleCollectionPage> implements IUnifiedRoleEligibilityScheduleCollectionRequest {

    /**
     * The request builder for this collection of UnifiedRoleEligibilitySchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityScheduleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilityScheduleCollectionResponse.class, IUnifiedRoleEligibilityScheduleCollectionPage.class);
    }

    public void get(final ICallback<? super IUnifiedRoleEligibilityScheduleCollectionPage> callback) {
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

    public IUnifiedRoleEligibilityScheduleCollectionPage get() throws ClientException {
        final UnifiedRoleEligibilityScheduleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule, final ICallback<? super UnifiedRoleEligibilitySchedule> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnifiedRoleEligibilityScheduleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleEligibilitySchedule, callback);
    }

    public UnifiedRoleEligibilitySchedule post(final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnifiedRoleEligibilityScheduleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleEligibilityScheduleCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UnifiedRoleEligibilityScheduleCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UnifiedRoleEligibilityScheduleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRoleEligibilityScheduleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UnifiedRoleEligibilityScheduleCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UnifiedRoleEligibilityScheduleCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUnifiedRoleEligibilityScheduleCollectionRequest)this;
    }
    public IUnifiedRoleEligibilityScheduleCollectionPage buildFromResponse(final UnifiedRoleEligibilityScheduleCollectionResponse response) {
        final IUnifiedRoleEligibilityScheduleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UnifiedRoleEligibilityScheduleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UnifiedRoleEligibilityScheduleCollectionPage page = new UnifiedRoleEligibilityScheduleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}