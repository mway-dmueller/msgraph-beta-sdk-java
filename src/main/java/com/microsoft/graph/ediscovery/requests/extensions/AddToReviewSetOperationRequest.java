// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.AddToReviewSetOperation;
import com.microsoft.graph.ediscovery.requests.extensions.IReviewSetWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ReviewSetWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ISourceCollectionWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.SourceCollectionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add To Review Set Operation Request.
 */
public class AddToReviewSetOperationRequest extends BaseRequest implements IAddToReviewSetOperationRequest {
	
    /**
     * The request for the AddToReviewSetOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AddToReviewSetOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AddToReviewSetOperation.class);
    }

    /**
     * Gets the AddToReviewSetOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AddToReviewSetOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AddToReviewSetOperation from the service
     *
     * @return the AddToReviewSetOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AddToReviewSetOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AddToReviewSetOperation> callback) {
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
     * Patches this AddToReviewSetOperation with a source
     *
     * @param sourceAddToReviewSetOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AddToReviewSetOperation sourceAddToReviewSetOperation, final ICallback<? super AddToReviewSetOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceAddToReviewSetOperation);
    }

    /**
     * Patches this AddToReviewSetOperation with a source
     *
     * @param sourceAddToReviewSetOperation the source object with updates
     * @return the updated AddToReviewSetOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AddToReviewSetOperation patch(final AddToReviewSetOperation sourceAddToReviewSetOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceAddToReviewSetOperation);
    }

    /**
     * Creates a AddToReviewSetOperation with a new object
     *
     * @param newAddToReviewSetOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AddToReviewSetOperation newAddToReviewSetOperation, final ICallback<? super AddToReviewSetOperation> callback) {
        send(HttpMethod.POST, callback, newAddToReviewSetOperation);
    }

    /**
     * Creates a AddToReviewSetOperation with a new object
     *
     * @param newAddToReviewSetOperation the new object to create
     * @return the created AddToReviewSetOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AddToReviewSetOperation post(final AddToReviewSetOperation newAddToReviewSetOperation) throws ClientException {
        return send(HttpMethod.POST, newAddToReviewSetOperation);
    }

    /**
     * Creates a AddToReviewSetOperation with a new object
     *
     * @param newAddToReviewSetOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AddToReviewSetOperation newAddToReviewSetOperation, final ICallback<? super AddToReviewSetOperation> callback) {
        send(HttpMethod.PUT, callback, newAddToReviewSetOperation);
    }

    /**
     * Creates a AddToReviewSetOperation with a new object
     *
     * @param newAddToReviewSetOperation the object to create/update
     * @return the created AddToReviewSetOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AddToReviewSetOperation put(final AddToReviewSetOperation newAddToReviewSetOperation) throws ClientException {
        return send(HttpMethod.PUT, newAddToReviewSetOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAddToReviewSetOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AddToReviewSetOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAddToReviewSetOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AddToReviewSetOperationRequest)this;
     }

}
