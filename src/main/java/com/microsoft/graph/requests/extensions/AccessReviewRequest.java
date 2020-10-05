// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReview;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewReviewerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewReviewerRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewReviewerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewReviewerRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Request.
 */
public class AccessReviewRequest extends BaseRequest implements IAccessReviewRequest {
	
    /**
     * The request for the AccessReview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReview.class);
    }

    /**
     * Gets the AccessReview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AccessReview> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessReview from the service
     *
     * @return the AccessReview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AccessReview> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AccessReview with a source
     *
     * @param sourceAccessReview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessReview sourceAccessReview, final ICallback<? super AccessReview> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessReview);
    }

    /**
     * Patches this AccessReview with a source
     *
     * @param sourceAccessReview the source object with updates
     * @return the updated AccessReview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReview patch(final AccessReview sourceAccessReview) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessReview);
    }

    /**
     * Creates a AccessReview with a new object
     *
     * @param newAccessReview the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessReview newAccessReview, final ICallback<? super AccessReview> callback) {
        send(HttpMethod.POST, callback, newAccessReview);
    }

    /**
     * Creates a AccessReview with a new object
     *
     * @param newAccessReview the new object to create
     * @return the created AccessReview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReview post(final AccessReview newAccessReview) throws ClientException {
        return send(HttpMethod.POST, newAccessReview);
    }

    /**
     * Creates a AccessReview with a new object
     *
     * @param newAccessReview the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AccessReview newAccessReview, final ICallback<? super AccessReview> callback) {
        send(HttpMethod.PUT, callback, newAccessReview);
    }

    /**
     * Creates a AccessReview with a new object
     *
     * @param newAccessReview the object to create/update
     * @return the created AccessReview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReview put(final AccessReview newAccessReview) throws ClientException {
        return send(HttpMethod.PUT, newAccessReview);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessReviewRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessReviewRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessReviewRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessReviewRequest)this;
     }

}

