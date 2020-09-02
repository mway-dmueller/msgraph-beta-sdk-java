// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Policy Collection Request.
 */
public class AccessPackageAssignmentPolicyCollectionRequest extends BaseCollectionRequest<AccessPackageAssignmentPolicyCollectionResponse, IAccessPackageAssignmentPolicyCollectionPage> implements IAccessPackageAssignmentPolicyCollectionRequest {

    /**
     * The request builder for this collection of AccessPackageAssignmentPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageAssignmentPolicyCollectionResponse.class, IAccessPackageAssignmentPolicyCollectionPage.class);
    }

    public void get(final ICallback<IAccessPackageAssignmentPolicyCollectionPage> callback) {
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

    public IAccessPackageAssignmentPolicyCollectionPage get() throws ClientException {
        final AccessPackageAssignmentPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AccessPackageAssignmentPolicy newAccessPackageAssignmentPolicy, final ICallback<AccessPackageAssignmentPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AccessPackageAssignmentPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAccessPackageAssignmentPolicy, callback);
    }

    public AccessPackageAssignmentPolicy post(final AccessPackageAssignmentPolicy newAccessPackageAssignmentPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessPackageAssignmentPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAccessPackageAssignmentPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageAssignmentPolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessPackageAssignmentPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageAssignmentPolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessPackageAssignmentPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAccessPackageAssignmentPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AccessPackageAssignmentPolicyCollectionRequest)this;
    }

    public IAccessPackageAssignmentPolicyCollectionPage buildFromResponse(final AccessPackageAssignmentPolicyCollectionResponse response) {
        final IAccessPackageAssignmentPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AccessPackageAssignmentPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AccessPackageAssignmentPolicyCollectionPage page = new AccessPackageAssignmentPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}