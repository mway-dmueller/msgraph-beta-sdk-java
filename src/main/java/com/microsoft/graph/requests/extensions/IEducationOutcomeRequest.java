// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationOutcome;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Outcome Request.
 */
public interface IEducationOutcomeRequest extends IHttpRequest {

    /**
     * Gets the EducationOutcome from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EducationOutcome> callback);

    /**
     * Gets the EducationOutcome from the service
     *
     * @return the EducationOutcome from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationOutcome get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EducationOutcome> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationOutcome with a source
     *
     * @param sourceEducationOutcome the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationOutcome sourceEducationOutcome, final ICallback<? super EducationOutcome> callback);

    /**
     * Patches this EducationOutcome with a source
     *
     * @param sourceEducationOutcome the source object with updates
     * @return the updated EducationOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationOutcome patch(final EducationOutcome sourceEducationOutcome) throws ClientException;

    /**
     * Posts a EducationOutcome with a new object
     *
     * @param newEducationOutcome the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationOutcome newEducationOutcome, final ICallback<? super EducationOutcome> callback);

    /**
     * Posts a EducationOutcome with a new object
     *
     * @param newEducationOutcome the new object to create
     * @return the created EducationOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationOutcome post(final EducationOutcome newEducationOutcome) throws ClientException;

    /**
     * Posts a EducationOutcome with a new object
     *
     * @param newEducationOutcome the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EducationOutcome newEducationOutcome, final ICallback<? super EducationOutcome> callback);

    /**
     * Posts a EducationOutcome with a new object
     *
     * @param newEducationOutcome the object to create/update
     * @return the created EducationOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationOutcome put(final EducationOutcome newEducationOutcome) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationOutcomeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationOutcomeRequest expand(final String value);

}

