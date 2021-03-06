// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplication;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilityScheduleInstance;
import com.microsoft.graph.models.generated.RoleEligibilityScheduleInstanceFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleInstanceCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleInstanceCollectionResponse;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleInstanceCollectionRequest;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleInstanceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Instance Collection Request.
 */
public class UnifiedRoleEligibilityScheduleInstanceCollectionRequest extends BaseCollectionRequest<UnifiedRoleEligibilityScheduleInstanceCollectionResponse, IUnifiedRoleEligibilityScheduleInstanceCollectionPage> implements IUnifiedRoleEligibilityScheduleInstanceCollectionRequest {

    /**
     * The request builder for this collection of UnifiedRoleEligibilityScheduleInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityScheduleInstanceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilityScheduleInstanceCollectionResponse.class, IUnifiedRoleEligibilityScheduleInstanceCollectionPage.class);
    }

    public void get(final ICallback<? super IUnifiedRoleEligibilityScheduleInstanceCollectionPage> callback) {
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

    public IUnifiedRoleEligibilityScheduleInstanceCollectionPage get() throws ClientException {
        final UnifiedRoleEligibilityScheduleInstanceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UnifiedRoleEligibilityScheduleInstance newUnifiedRoleEligibilityScheduleInstance, final ICallback<? super UnifiedRoleEligibilityScheduleInstance> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnifiedRoleEligibilityScheduleInstanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleEligibilityScheduleInstance, callback);
    }

    public UnifiedRoleEligibilityScheduleInstance post(final UnifiedRoleEligibilityScheduleInstance newUnifiedRoleEligibilityScheduleInstance) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnifiedRoleEligibilityScheduleInstanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleEligibilityScheduleInstance);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleEligibilityScheduleInstanceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UnifiedRoleEligibilityScheduleInstanceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UnifiedRoleEligibilityScheduleInstanceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRoleEligibilityScheduleInstanceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UnifiedRoleEligibilityScheduleInstanceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UnifiedRoleEligibilityScheduleInstanceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUnifiedRoleEligibilityScheduleInstanceCollectionRequest)this;
    }
    public IUnifiedRoleEligibilityScheduleInstanceCollectionPage buildFromResponse(final UnifiedRoleEligibilityScheduleInstanceCollectionResponse response) {
        final IUnifiedRoleEligibilityScheduleInstanceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UnifiedRoleEligibilityScheduleInstanceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UnifiedRoleEligibilityScheduleInstanceCollectionPage page = new UnifiedRoleEligibilityScheduleInstanceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
