// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Channel;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Channel Request.
 */
public interface IChannelRequest extends IHttpRequest {

    /**
     * Gets the Channel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Channel> callback);

    /**
     * Gets the Channel from the service
     *
     * @return the Channel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Channel get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Channel> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Channel with a source
     *
     * @param sourceChannel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Channel sourceChannel, final ICallback<? super Channel> callback);

    /**
     * Patches this Channel with a source
     *
     * @param sourceChannel the source object with updates
     * @return the updated Channel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Channel patch(final Channel sourceChannel) throws ClientException;

    /**
     * Posts a Channel with a new object
     *
     * @param newChannel the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Channel newChannel, final ICallback<? super Channel> callback);

    /**
     * Posts a Channel with a new object
     *
     * @param newChannel the new object to create
     * @return the created Channel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Channel post(final Channel newChannel) throws ClientException;

    /**
     * Posts a Channel with a new object
     *
     * @param newChannel the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Channel newChannel, final ICallback<? super Channel> callback);

    /**
     * Posts a Channel with a new object
     *
     * @param newChannel the object to create/update
     * @return the created Channel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Channel put(final Channel newChannel) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IChannelRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IChannelRequest expand(final String value);

}

