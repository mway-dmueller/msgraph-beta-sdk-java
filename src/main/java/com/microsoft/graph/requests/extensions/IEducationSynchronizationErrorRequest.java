// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationSynchronizationError;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Synchronization Error Request.
 */
public interface IEducationSynchronizationErrorRequest extends IHttpRequest {

    /**
     * Gets the EducationSynchronizationError from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EducationSynchronizationError> callback);

    /**
     * Gets the EducationSynchronizationError from the service
     *
     * @return the EducationSynchronizationError from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationError get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EducationSynchronizationError> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationSynchronizationError with a source
     *
     * @param sourceEducationSynchronizationError the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationSynchronizationError sourceEducationSynchronizationError, final ICallback<? super EducationSynchronizationError> callback);

    /**
     * Patches this EducationSynchronizationError with a source
     *
     * @param sourceEducationSynchronizationError the source object with updates
     * @return the updated EducationSynchronizationError
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationError patch(final EducationSynchronizationError sourceEducationSynchronizationError) throws ClientException;

    /**
     * Posts a EducationSynchronizationError with a new object
     *
     * @param newEducationSynchronizationError the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationSynchronizationError newEducationSynchronizationError, final ICallback<? super EducationSynchronizationError> callback);

    /**
     * Posts a EducationSynchronizationError with a new object
     *
     * @param newEducationSynchronizationError the new object to create
     * @return the created EducationSynchronizationError
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationError post(final EducationSynchronizationError newEducationSynchronizationError) throws ClientException;

    /**
     * Posts a EducationSynchronizationError with a new object
     *
     * @param newEducationSynchronizationError the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EducationSynchronizationError newEducationSynchronizationError, final ICallback<? super EducationSynchronizationError> callback);

    /**
     * Posts a EducationSynchronizationError with a new object
     *
     * @param newEducationSynchronizationError the object to create/update
     * @return the created EducationSynchronizationError
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationError put(final EducationSynchronizationError newEducationSynchronizationError) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationSynchronizationErrorRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationSynchronizationErrorRequest expand(final String value);

}

