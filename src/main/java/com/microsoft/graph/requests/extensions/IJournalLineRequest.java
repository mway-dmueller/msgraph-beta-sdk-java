// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.JournalLine;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Journal Line Request.
 */
public interface IJournalLineRequest extends IHttpRequest {

    /**
     * Gets the JournalLine from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super JournalLine> callback);

    /**
     * Gets the JournalLine from the service
     *
     * @return the JournalLine from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    JournalLine get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super JournalLine> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this JournalLine with a source
     *
     * @param sourceJournalLine the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final JournalLine sourceJournalLine, final ICallback<? super JournalLine> callback);

    /**
     * Patches this JournalLine with a source
     *
     * @param sourceJournalLine the source object with updates
     * @return the updated JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    JournalLine patch(final JournalLine sourceJournalLine) throws ClientException;

    /**
     * Posts a JournalLine with a new object
     *
     * @param newJournalLine the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final JournalLine newJournalLine, final ICallback<? super JournalLine> callback);

    /**
     * Posts a JournalLine with a new object
     *
     * @param newJournalLine the new object to create
     * @return the created JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    JournalLine post(final JournalLine newJournalLine) throws ClientException;

    /**
     * Posts a JournalLine with a new object
     *
     * @param newJournalLine the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final JournalLine newJournalLine, final ICallback<? super JournalLine> callback);

    /**
     * Posts a JournalLine with a new object
     *
     * @param newJournalLine the object to create/update
     * @return the created JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    JournalLine put(final JournalLine newJournalLine) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IJournalLineRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IJournalLineRequest expand(final String value);

}

