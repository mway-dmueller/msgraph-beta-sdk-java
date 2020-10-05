// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SharePointActivityPages;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Share Point Activity Pages Request.
 */
public interface ISharePointActivityPagesRequest extends IHttpRequest {

    /**
     * Gets the SharePointActivityPages from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SharePointActivityPages> callback);

    /**
     * Gets the SharePointActivityPages from the service
     *
     * @return the SharePointActivityPages from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointActivityPages get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SharePointActivityPages> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SharePointActivityPages with a source
     *
     * @param sourceSharePointActivityPages the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SharePointActivityPages sourceSharePointActivityPages, final ICallback<? super SharePointActivityPages> callback);

    /**
     * Patches this SharePointActivityPages with a source
     *
     * @param sourceSharePointActivityPages the source object with updates
     * @return the updated SharePointActivityPages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointActivityPages patch(final SharePointActivityPages sourceSharePointActivityPages) throws ClientException;

    /**
     * Posts a SharePointActivityPages with a new object
     *
     * @param newSharePointActivityPages the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SharePointActivityPages newSharePointActivityPages, final ICallback<? super SharePointActivityPages> callback);

    /**
     * Posts a SharePointActivityPages with a new object
     *
     * @param newSharePointActivityPages the new object to create
     * @return the created SharePointActivityPages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointActivityPages post(final SharePointActivityPages newSharePointActivityPages) throws ClientException;

    /**
     * Posts a SharePointActivityPages with a new object
     *
     * @param newSharePointActivityPages the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SharePointActivityPages newSharePointActivityPages, final ICallback<? super SharePointActivityPages> callback);

    /**
     * Posts a SharePointActivityPages with a new object
     *
     * @param newSharePointActivityPages the object to create/update
     * @return the created SharePointActivityPages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointActivityPages put(final SharePointActivityPages newSharePointActivityPages) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISharePointActivityPagesRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISharePointActivityPagesRequest expand(final String value);

}

