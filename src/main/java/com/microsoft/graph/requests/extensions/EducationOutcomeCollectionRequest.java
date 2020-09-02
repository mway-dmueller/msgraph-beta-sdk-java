// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSubmission;
import com.microsoft.graph.models.extensions.EducationOutcome;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEducationOutcomeCollectionPage;
import com.microsoft.graph.requests.extensions.EducationOutcomeCollectionResponse;
import com.microsoft.graph.requests.extensions.IEducationOutcomeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationOutcomeCollectionRequest;
import com.microsoft.graph.requests.extensions.EducationOutcomeCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Outcome Collection Request.
 */
public class EducationOutcomeCollectionRequest extends BaseCollectionRequest<EducationOutcomeCollectionResponse, IEducationOutcomeCollectionPage> implements IEducationOutcomeCollectionRequest {

    /**
     * The request builder for this collection of EducationOutcome
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationOutcomeCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationOutcomeCollectionResponse.class, IEducationOutcomeCollectionPage.class);
    }

    public void get(final ICallback<IEducationOutcomeCollectionPage> callback) {
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

    public IEducationOutcomeCollectionPage get() throws ClientException {
        final EducationOutcomeCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EducationOutcome newEducationOutcome, final ICallback<EducationOutcome> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EducationOutcomeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEducationOutcome, callback);
    }

    public EducationOutcome post(final EducationOutcome newEducationOutcome) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EducationOutcomeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEducationOutcome);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationOutcomeCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationOutcomeCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationOutcomeCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationOutcomeCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEducationOutcomeCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationOutcomeCollectionRequest)this;
    }

    public IEducationOutcomeCollectionPage buildFromResponse(final EducationOutcomeCollectionResponse response) {
        final IEducationOutcomeCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationOutcomeCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationOutcomeCollectionPage page = new EducationOutcomeCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}