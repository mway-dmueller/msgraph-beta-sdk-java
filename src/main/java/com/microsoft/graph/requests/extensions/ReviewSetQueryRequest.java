// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReviewSetQuery;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Query Request.
 */
public class ReviewSetQueryRequest extends BaseRequest implements IReviewSetQueryRequest {
	
    /**
     * The request for the ReviewSetQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetQueryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReviewSetQuery.class);
    }

    /**
     * Gets the ReviewSetQuery from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ReviewSetQuery> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ReviewSetQuery from the service
     *
     * @return the ReviewSetQuery from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReviewSetQuery get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ReviewSetQuery> callback) {
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
     * Patches this ReviewSetQuery with a source
     *
     * @param sourceReviewSetQuery the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ReviewSetQuery sourceReviewSetQuery, final ICallback<? super ReviewSetQuery> callback) {
        send(HttpMethod.PATCH, callback, sourceReviewSetQuery);
    }

    /**
     * Patches this ReviewSetQuery with a source
     *
     * @param sourceReviewSetQuery the source object with updates
     * @return the updated ReviewSetQuery
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReviewSetQuery patch(final ReviewSetQuery sourceReviewSetQuery) throws ClientException {
        return send(HttpMethod.PATCH, sourceReviewSetQuery);
    }

    /**
     * Creates a ReviewSetQuery with a new object
     *
     * @param newReviewSetQuery the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ReviewSetQuery newReviewSetQuery, final ICallback<? super ReviewSetQuery> callback) {
        send(HttpMethod.POST, callback, newReviewSetQuery);
    }

    /**
     * Creates a ReviewSetQuery with a new object
     *
     * @param newReviewSetQuery the new object to create
     * @return the created ReviewSetQuery
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReviewSetQuery post(final ReviewSetQuery newReviewSetQuery) throws ClientException {
        return send(HttpMethod.POST, newReviewSetQuery);
    }

    /**
     * Creates a ReviewSetQuery with a new object
     *
     * @param newReviewSetQuery the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ReviewSetQuery newReviewSetQuery, final ICallback<? super ReviewSetQuery> callback) {
        send(HttpMethod.PUT, callback, newReviewSetQuery);
    }

    /**
     * Creates a ReviewSetQuery with a new object
     *
     * @param newReviewSetQuery the object to create/update
     * @return the created ReviewSetQuery
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReviewSetQuery put(final ReviewSetQuery newReviewSetQuery) throws ClientException {
        return send(HttpMethod.PUT, newReviewSetQuery);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IReviewSetQueryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ReviewSetQueryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IReviewSetQueryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ReviewSetQueryRequest)this;
     }

}

