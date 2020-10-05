// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EventMessageResponse;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Message Response Request.
 */
public interface IEventMessageResponseRequest extends IHttpRequest {

    /**
     * Gets the EventMessageResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EventMessageResponse> callback);

    /**
     * Gets the EventMessageResponse from the service
     *
     * @return the EventMessageResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EventMessageResponse get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EventMessageResponse> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EventMessageResponse with a source
     *
     * @param sourceEventMessageResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EventMessageResponse sourceEventMessageResponse, final ICallback<? super EventMessageResponse> callback);

    /**
     * Patches this EventMessageResponse with a source
     *
     * @param sourceEventMessageResponse the source object with updates
     * @return the updated EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EventMessageResponse patch(final EventMessageResponse sourceEventMessageResponse) throws ClientException;

    /**
     * Posts a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EventMessageResponse newEventMessageResponse, final ICallback<? super EventMessageResponse> callback);

    /**
     * Posts a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the new object to create
     * @return the created EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EventMessageResponse post(final EventMessageResponse newEventMessageResponse) throws ClientException;

    /**
     * Posts a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EventMessageResponse newEventMessageResponse, final ICallback<? super EventMessageResponse> callback);

    /**
     * Posts a EventMessageResponse with a new object
     *
     * @param newEventMessageResponse the object to create/update
     * @return the created EventMessageResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EventMessageResponse put(final EventMessageResponse newEventMessageResponse) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEventMessageResponseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEventMessageResponseRequest expand(final String value);

}

