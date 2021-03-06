// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSubmission;
import com.microsoft.graph.models.extensions.EducationSubmissionResource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEducationSubmissionResourceCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.IEducationSubmissionResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSubmissionResourceCollectionRequest;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Submission Resource Collection Request.
 */
public class EducationSubmissionResourceCollectionRequest extends BaseCollectionRequest<EducationSubmissionResourceCollectionResponse, IEducationSubmissionResourceCollectionPage> implements IEducationSubmissionResourceCollectionRequest {

    /**
     * The request builder for this collection of EducationSubmissionResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSubmissionResourceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSubmissionResourceCollectionResponse.class, IEducationSubmissionResourceCollectionPage.class);
    }

    public void get(final ICallback<? super IEducationSubmissionResourceCollectionPage> callback) {
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

    public IEducationSubmissionResourceCollectionPage get() throws ClientException {
        final EducationSubmissionResourceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EducationSubmissionResource newEducationSubmissionResource, final ICallback<? super EducationSubmissionResource> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EducationSubmissionResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationSubmissionResource, callback);
    }

    public EducationSubmissionResource post(final EducationSubmissionResource newEducationSubmissionResource) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EducationSubmissionResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationSubmissionResource);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationSubmissionResourceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationSubmissionResourceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IEducationSubmissionResourceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (EducationSubmissionResourceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IEducationSubmissionResourceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (EducationSubmissionResourceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationSubmissionResourceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationSubmissionResourceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEducationSubmissionResourceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationSubmissionResourceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IEducationSubmissionResourceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (EducationSubmissionResourceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IEducationSubmissionResourceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IEducationSubmissionResourceCollectionRequest)this;
    }
    public IEducationSubmissionResourceCollectionPage buildFromResponse(final EducationSubmissionResourceCollectionResponse response) {
        final IEducationSubmissionResourceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationSubmissionResourceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationSubmissionResourceCollectionPage page = new EducationSubmissionResourceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
