// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnitOfMeasure;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unit Of Measure Request.
 */
public interface IUnitOfMeasureRequest extends IHttpRequest {

    /**
     * Gets the UnitOfMeasure from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnitOfMeasure> callback);

    /**
     * Gets the UnitOfMeasure from the service
     *
     * @return the UnitOfMeasure from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnitOfMeasure get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnitOfMeasure> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnitOfMeasure with a source
     *
     * @param sourceUnitOfMeasure the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnitOfMeasure sourceUnitOfMeasure, final ICallback<? super UnitOfMeasure> callback);

    /**
     * Patches this UnitOfMeasure with a source
     *
     * @param sourceUnitOfMeasure the source object with updates
     * @return the updated UnitOfMeasure
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnitOfMeasure patch(final UnitOfMeasure sourceUnitOfMeasure) throws ClientException;

    /**
     * Posts a UnitOfMeasure with a new object
     *
     * @param newUnitOfMeasure the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnitOfMeasure newUnitOfMeasure, final ICallback<? super UnitOfMeasure> callback);

    /**
     * Posts a UnitOfMeasure with a new object
     *
     * @param newUnitOfMeasure the new object to create
     * @return the created UnitOfMeasure
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnitOfMeasure post(final UnitOfMeasure newUnitOfMeasure) throws ClientException;

    /**
     * Posts a UnitOfMeasure with a new object
     *
     * @param newUnitOfMeasure the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnitOfMeasure newUnitOfMeasure, final ICallback<? super UnitOfMeasure> callback);

    /**
     * Posts a UnitOfMeasure with a new object
     *
     * @param newUnitOfMeasure the object to create/update
     * @return the created UnitOfMeasure
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnitOfMeasure put(final UnitOfMeasure newUnitOfMeasure) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnitOfMeasureRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnitOfMeasureRequest expand(final String value);

}

