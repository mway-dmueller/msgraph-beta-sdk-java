// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Picture;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Picture Request.
 */
public interface IPictureRequest extends IHttpRequest {

    /**
     * Gets the Picture from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Picture> callback);

    /**
     * Gets the Picture from the service
     *
     * @return the Picture from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Picture get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Picture> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Picture with a source
     *
     * @param sourcePicture the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Picture sourcePicture, final ICallback<? super Picture> callback);

    /**
     * Patches this Picture with a source
     *
     * @param sourcePicture the source object with updates
     * @return the updated Picture
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Picture patch(final Picture sourcePicture) throws ClientException;

    /**
     * Posts a Picture with a new object
     *
     * @param newPicture the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Picture newPicture, final ICallback<? super Picture> callback);

    /**
     * Posts a Picture with a new object
     *
     * @param newPicture the new object to create
     * @return the created Picture
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Picture post(final Picture newPicture) throws ClientException;

    /**
     * Posts a Picture with a new object
     *
     * @param newPicture the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Picture newPicture, final ICallback<? super Picture> callback);

    /**
     * Posts a Picture with a new object
     *
     * @param newPicture the object to create/update
     * @return the created Picture
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Picture put(final Picture newPicture) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPictureRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPictureRequest expand(final String value);

}

