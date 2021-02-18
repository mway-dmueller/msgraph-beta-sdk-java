// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;
import com.microsoft.graph.ediscovery.models.extensions.Settings;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Settings Request.
 */
public interface ISettingsRequest extends IHttpRequest {

    /**
     * Gets the Settings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Settings> callback);

    /**
     * Gets the Settings from the service
     *
     * @return the Settings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Settings get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Settings> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Settings with a source
     *
     * @param sourceSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Settings sourceSettings, final ICallback<? super Settings> callback);

    /**
     * Patches this Settings with a source
     *
     * @param sourceSettings the source object with updates
     * @return the updated Settings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Settings patch(final Settings sourceSettings) throws ClientException;

    /**
     * Posts a Settings with a new object
     *
     * @param newSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Settings newSettings, final ICallback<? super Settings> callback);

    /**
     * Posts a Settings with a new object
     *
     * @param newSettings the new object to create
     * @return the created Settings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Settings post(final Settings newSettings) throws ClientException;

    /**
     * Posts a Settings with a new object
     *
     * @param newSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Settings newSettings, final ICallback<? super Settings> callback);

    /**
     * Posts a Settings with a new object
     *
     * @param newSettings the object to create/update
     * @return the created Settings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Settings put(final Settings newSettings) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISettingsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISettingsRequest expand(final String value);

}
