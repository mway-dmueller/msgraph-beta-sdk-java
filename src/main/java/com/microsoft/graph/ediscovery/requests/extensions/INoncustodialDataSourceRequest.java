// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;
import com.microsoft.graph.ediscovery.models.extensions.NoncustodialDataSource;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Noncustodial Data Source Request.
 */
public interface INoncustodialDataSourceRequest extends IHttpRequest {

    /**
     * Gets the NoncustodialDataSource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super NoncustodialDataSource> callback);

    /**
     * Gets the NoncustodialDataSource from the service
     *
     * @return the NoncustodialDataSource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NoncustodialDataSource get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super NoncustodialDataSource> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this NoncustodialDataSource with a source
     *
     * @param sourceNoncustodialDataSource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final NoncustodialDataSource sourceNoncustodialDataSource, final ICallback<? super NoncustodialDataSource> callback);

    /**
     * Patches this NoncustodialDataSource with a source
     *
     * @param sourceNoncustodialDataSource the source object with updates
     * @return the updated NoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NoncustodialDataSource patch(final NoncustodialDataSource sourceNoncustodialDataSource) throws ClientException;

    /**
     * Posts a NoncustodialDataSource with a new object
     *
     * @param newNoncustodialDataSource the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final NoncustodialDataSource newNoncustodialDataSource, final ICallback<? super NoncustodialDataSource> callback);

    /**
     * Posts a NoncustodialDataSource with a new object
     *
     * @param newNoncustodialDataSource the new object to create
     * @return the created NoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NoncustodialDataSource post(final NoncustodialDataSource newNoncustodialDataSource) throws ClientException;

    /**
     * Posts a NoncustodialDataSource with a new object
     *
     * @param newNoncustodialDataSource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final NoncustodialDataSource newNoncustodialDataSource, final ICallback<? super NoncustodialDataSource> callback);

    /**
     * Posts a NoncustodialDataSource with a new object
     *
     * @param newNoncustodialDataSource the object to create/update
     * @return the created NoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NoncustodialDataSource put(final NoncustodialDataSource newNoncustodialDataSource) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    INoncustodialDataSourceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    INoncustodialDataSourceRequest expand(final String value);

}
