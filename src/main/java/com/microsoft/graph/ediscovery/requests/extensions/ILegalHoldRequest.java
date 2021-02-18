// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;
import com.microsoft.graph.ediscovery.models.extensions.LegalHold;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Legal Hold Request.
 */
public interface ILegalHoldRequest extends IHttpRequest {

    /**
     * Gets the LegalHold from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super LegalHold> callback);

    /**
     * Gets the LegalHold from the service
     *
     * @return the LegalHold from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    LegalHold get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super LegalHold> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this LegalHold with a source
     *
     * @param sourceLegalHold the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final LegalHold sourceLegalHold, final ICallback<? super LegalHold> callback);

    /**
     * Patches this LegalHold with a source
     *
     * @param sourceLegalHold the source object with updates
     * @return the updated LegalHold
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    LegalHold patch(final LegalHold sourceLegalHold) throws ClientException;

    /**
     * Posts a LegalHold with a new object
     *
     * @param newLegalHold the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final LegalHold newLegalHold, final ICallback<? super LegalHold> callback);

    /**
     * Posts a LegalHold with a new object
     *
     * @param newLegalHold the new object to create
     * @return the created LegalHold
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    LegalHold post(final LegalHold newLegalHold) throws ClientException;

    /**
     * Posts a LegalHold with a new object
     *
     * @param newLegalHold the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final LegalHold newLegalHold, final ICallback<? super LegalHold> callback);

    /**
     * Posts a LegalHold with a new object
     *
     * @param newLegalHold the object to create/update
     * @return the created LegalHold
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    LegalHold put(final LegalHold newLegalHold) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ILegalHoldRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ILegalHoldRequest expand(final String value);

}
