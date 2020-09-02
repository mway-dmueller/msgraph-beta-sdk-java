// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Bitlocker;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Bitlocker Request.
 */
public interface IBitlockerRequest extends IHttpRequest {

    /**
     * Gets the Bitlocker from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Bitlocker> callback);

    /**
     * Gets the Bitlocker from the service
     *
     * @return the Bitlocker from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Bitlocker get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Bitlocker> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Bitlocker with a source
     *
     * @param sourceBitlocker the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Bitlocker sourceBitlocker, final ICallback<Bitlocker> callback);

    /**
     * Patches this Bitlocker with a source
     *
     * @param sourceBitlocker the source object with updates
     * @return the updated Bitlocker
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Bitlocker patch(final Bitlocker sourceBitlocker) throws ClientException;

    /**
     * Posts a Bitlocker with a new object
     *
     * @param newBitlocker the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Bitlocker newBitlocker, final ICallback<Bitlocker> callback);

    /**
     * Posts a Bitlocker with a new object
     *
     * @param newBitlocker the new object to create
     * @return the created Bitlocker
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Bitlocker post(final Bitlocker newBitlocker) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBitlockerRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBitlockerRequest expand(final String value);

}
