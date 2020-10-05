// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ReviewSet;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Review Set Request.
 */
public interface IReviewSetRequest extends IHttpRequest {

    /**
     * Gets the ReviewSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ReviewSet> callback);

    /**
     * Gets the ReviewSet from the service
     *
     * @return the ReviewSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReviewSet get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ReviewSet> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ReviewSet with a source
     *
     * @param sourceReviewSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ReviewSet sourceReviewSet, final ICallback<? super ReviewSet> callback);

    /**
     * Patches this ReviewSet with a source
     *
     * @param sourceReviewSet the source object with updates
     * @return the updated ReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReviewSet patch(final ReviewSet sourceReviewSet) throws ClientException;

    /**
     * Posts a ReviewSet with a new object
     *
     * @param newReviewSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ReviewSet newReviewSet, final ICallback<? super ReviewSet> callback);

    /**
     * Posts a ReviewSet with a new object
     *
     * @param newReviewSet the new object to create
     * @return the created ReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReviewSet post(final ReviewSet newReviewSet) throws ClientException;

    /**
     * Posts a ReviewSet with a new object
     *
     * @param newReviewSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ReviewSet newReviewSet, final ICallback<? super ReviewSet> callback);

    /**
     * Posts a ReviewSet with a new object
     *
     * @param newReviewSet the object to create/update
     * @return the created ReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ReviewSet put(final ReviewSet newReviewSet) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IReviewSetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IReviewSetRequest expand(final String value);

}

