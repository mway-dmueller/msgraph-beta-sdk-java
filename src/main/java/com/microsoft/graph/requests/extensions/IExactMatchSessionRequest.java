// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExactMatchSession;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Exact Match Session Request.
 */
public interface IExactMatchSessionRequest extends IHttpRequest {

    /**
     * Gets the ExactMatchSession from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ExactMatchSession> callback);

    /**
     * Gets the ExactMatchSession from the service
     *
     * @return the ExactMatchSession from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchSession get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ExactMatchSession> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ExactMatchSession with a source
     *
     * @param sourceExactMatchSession the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ExactMatchSession sourceExactMatchSession, final ICallback<ExactMatchSession> callback);

    /**
     * Patches this ExactMatchSession with a source
     *
     * @param sourceExactMatchSession the source object with updates
     * @return the updated ExactMatchSession
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchSession patch(final ExactMatchSession sourceExactMatchSession) throws ClientException;

    /**
     * Posts a ExactMatchSession with a new object
     *
     * @param newExactMatchSession the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ExactMatchSession newExactMatchSession, final ICallback<ExactMatchSession> callback);

    /**
     * Posts a ExactMatchSession with a new object
     *
     * @param newExactMatchSession the new object to create
     * @return the created ExactMatchSession
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExactMatchSession post(final ExactMatchSession newExactMatchSession) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExactMatchSessionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExactMatchSessionRequest expand(final String value);

}
