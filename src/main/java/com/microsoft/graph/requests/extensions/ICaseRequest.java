// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Case;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Case Request.
 */
public interface ICaseRequest extends IHttpRequest {

    /**
     * Gets the Case from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Case> callback);

    /**
     * Gets the Case from the service
     *
     * @return the Case from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Case get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Case> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Case with a source
     *
     * @param sourceCase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Case sourceCase, final ICallback<? super Case> callback);

    /**
     * Patches this Case with a source
     *
     * @param sourceCase the source object with updates
     * @return the updated Case
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Case patch(final Case sourceCase) throws ClientException;

    /**
     * Posts a Case with a new object
     *
     * @param newCase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Case newCase, final ICallback<? super Case> callback);

    /**
     * Posts a Case with a new object
     *
     * @param newCase the new object to create
     * @return the created Case
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Case post(final Case newCase) throws ClientException;

    /**
     * Posts a Case with a new object
     *
     * @param newCase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Case newCase, final ICallback<? super Case> callback);

    /**
     * Posts a Case with a new object
     *
     * @param newCase the object to create/update
     * @return the created Case
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Case put(final Case newCase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICaseRequest expand(final String value);

}
