// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppleUserInitiatedEnrollmentProfile;
import com.microsoft.graph.models.extensions.AppleEnrollmentProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAppleEnrollmentProfileAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.AppleEnrollmentProfileAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IAppleEnrollmentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppleEnrollmentProfileAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.AppleEnrollmentProfileAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Enrollment Profile Assignment Collection Request.
 */
public class AppleEnrollmentProfileAssignmentCollectionRequest extends BaseCollectionRequest<AppleEnrollmentProfileAssignmentCollectionResponse, IAppleEnrollmentProfileAssignmentCollectionPage> implements IAppleEnrollmentProfileAssignmentCollectionRequest {

    /**
     * The request builder for this collection of AppleEnrollmentProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppleEnrollmentProfileAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppleEnrollmentProfileAssignmentCollectionResponse.class, IAppleEnrollmentProfileAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IAppleEnrollmentProfileAssignmentCollectionPage> callback) {
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

    public IAppleEnrollmentProfileAssignmentCollectionPage get() throws ClientException {
        final AppleEnrollmentProfileAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment, final ICallback<? super AppleEnrollmentProfileAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AppleEnrollmentProfileAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAppleEnrollmentProfileAssignment, callback);
    }

    public AppleEnrollmentProfileAssignment post(final AppleEnrollmentProfileAssignment newAppleEnrollmentProfileAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AppleEnrollmentProfileAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAppleEnrollmentProfileAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAppleEnrollmentProfileAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AppleEnrollmentProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAppleEnrollmentProfileAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AppleEnrollmentProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAppleEnrollmentProfileAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AppleEnrollmentProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAppleEnrollmentProfileAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AppleEnrollmentProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAppleEnrollmentProfileAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AppleEnrollmentProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAppleEnrollmentProfileAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AppleEnrollmentProfileAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAppleEnrollmentProfileAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAppleEnrollmentProfileAssignmentCollectionRequest)this;
    }
    public IAppleEnrollmentProfileAssignmentCollectionPage buildFromResponse(final AppleEnrollmentProfileAssignmentCollectionResponse response) {
        final IAppleEnrollmentProfileAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AppleEnrollmentProfileAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AppleEnrollmentProfileAssignmentCollectionPage page = new AppleEnrollmentProfileAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
