// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ProgramControlType;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Program Control Type Request.
 */
public interface IProgramControlTypeRequest extends IHttpRequest {

    /**
     * Gets the ProgramControlType from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ProgramControlType> callback);

    /**
     * Gets the ProgramControlType from the service
     *
     * @return the ProgramControlType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ProgramControlType get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ProgramControlType> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ProgramControlType with a source
     *
     * @param sourceProgramControlType the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ProgramControlType sourceProgramControlType, final ICallback<? super ProgramControlType> callback);

    /**
     * Patches this ProgramControlType with a source
     *
     * @param sourceProgramControlType the source object with updates
     * @return the updated ProgramControlType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ProgramControlType patch(final ProgramControlType sourceProgramControlType) throws ClientException;

    /**
     * Posts a ProgramControlType with a new object
     *
     * @param newProgramControlType the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ProgramControlType newProgramControlType, final ICallback<? super ProgramControlType> callback);

    /**
     * Posts a ProgramControlType with a new object
     *
     * @param newProgramControlType the new object to create
     * @return the created ProgramControlType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ProgramControlType post(final ProgramControlType newProgramControlType) throws ClientException;

    /**
     * Posts a ProgramControlType with a new object
     *
     * @param newProgramControlType the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ProgramControlType newProgramControlType, final ICallback<? super ProgramControlType> callback);

    /**
     * Posts a ProgramControlType with a new object
     *
     * @param newProgramControlType the object to create/update
     * @return the created ProgramControlType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ProgramControlType put(final ProgramControlType newProgramControlType) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IProgramControlTypeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IProgramControlTypeRequest expand(final String value);

}

