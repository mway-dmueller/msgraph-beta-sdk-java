// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Connector;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Connector Request.
 */
public interface IConnectorRequest extends IHttpRequest {

    /**
     * Gets the Connector from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Connector> callback);

    /**
     * Gets the Connector from the service
     *
     * @return the Connector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Connector get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Connector> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Connector with a source
     *
     * @param sourceConnector the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Connector sourceConnector, final ICallback<? super Connector> callback);

    /**
     * Patches this Connector with a source
     *
     * @param sourceConnector the source object with updates
     * @return the updated Connector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Connector patch(final Connector sourceConnector) throws ClientException;

    /**
     * Posts a Connector with a new object
     *
     * @param newConnector the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Connector newConnector, final ICallback<? super Connector> callback);

    /**
     * Posts a Connector with a new object
     *
     * @param newConnector the new object to create
     * @return the created Connector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Connector post(final Connector newConnector) throws ClientException;

    /**
     * Posts a Connector with a new object
     *
     * @param newConnector the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Connector newConnector, final ICallback<? super Connector> callback);

    /**
     * Posts a Connector with a new object
     *
     * @param newConnector the object to create/update
     * @return the created Connector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Connector put(final Connector newConnector) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IConnectorRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IConnectorRequest expand(final String value);

}

