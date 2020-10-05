// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SynchronizationJob;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Synchronization Job Request.
 */
public interface ISynchronizationJobRequest extends IHttpRequest {

    /**
     * Gets the SynchronizationJob from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SynchronizationJob> callback);

    /**
     * Gets the SynchronizationJob from the service
     *
     * @return the SynchronizationJob from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SynchronizationJob get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SynchronizationJob> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SynchronizationJob with a source
     *
     * @param sourceSynchronizationJob the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SynchronizationJob sourceSynchronizationJob, final ICallback<? super SynchronizationJob> callback);

    /**
     * Patches this SynchronizationJob with a source
     *
     * @param sourceSynchronizationJob the source object with updates
     * @return the updated SynchronizationJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SynchronizationJob patch(final SynchronizationJob sourceSynchronizationJob) throws ClientException;

    /**
     * Posts a SynchronizationJob with a new object
     *
     * @param newSynchronizationJob the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SynchronizationJob newSynchronizationJob, final ICallback<? super SynchronizationJob> callback);

    /**
     * Posts a SynchronizationJob with a new object
     *
     * @param newSynchronizationJob the new object to create
     * @return the created SynchronizationJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SynchronizationJob post(final SynchronizationJob newSynchronizationJob) throws ClientException;

    /**
     * Posts a SynchronizationJob with a new object
     *
     * @param newSynchronizationJob the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SynchronizationJob newSynchronizationJob, final ICallback<? super SynchronizationJob> callback);

    /**
     * Posts a SynchronizationJob with a new object
     *
     * @param newSynchronizationJob the object to create/update
     * @return the created SynchronizationJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SynchronizationJob put(final SynchronizationJob newSynchronizationJob) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISynchronizationJobRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISynchronizationJobRequest expand(final String value);

}

