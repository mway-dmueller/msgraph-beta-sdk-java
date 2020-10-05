// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessReviewSet;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Review Set Request.
 */
public interface IAccessReviewSetRequest extends IHttpRequest {

    /**
     * Gets the AccessReviewSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AccessReviewSet> callback);

    /**
     * Gets the AccessReviewSet from the service
     *
     * @return the AccessReviewSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewSet get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AccessReviewSet> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessReviewSet with a source
     *
     * @param sourceAccessReviewSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessReviewSet sourceAccessReviewSet, final ICallback<? super AccessReviewSet> callback);

    /**
     * Patches this AccessReviewSet with a source
     *
     * @param sourceAccessReviewSet the source object with updates
     * @return the updated AccessReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewSet patch(final AccessReviewSet sourceAccessReviewSet) throws ClientException;

    /**
     * Posts a AccessReviewSet with a new object
     *
     * @param newAccessReviewSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessReviewSet newAccessReviewSet, final ICallback<? super AccessReviewSet> callback);

    /**
     * Posts a AccessReviewSet with a new object
     *
     * @param newAccessReviewSet the new object to create
     * @return the created AccessReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewSet post(final AccessReviewSet newAccessReviewSet) throws ClientException;

    /**
     * Posts a AccessReviewSet with a new object
     *
     * @param newAccessReviewSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessReviewSet newAccessReviewSet, final ICallback<? super AccessReviewSet> callback);

    /**
     * Posts a AccessReviewSet with a new object
     *
     * @param newAccessReviewSet the object to create/update
     * @return the created AccessReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessReviewSet put(final AccessReviewSet newAccessReviewSet) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessReviewSetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessReviewSetRequest expand(final String value);

}

