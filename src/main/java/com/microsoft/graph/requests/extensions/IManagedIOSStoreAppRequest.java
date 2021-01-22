// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedIOSStoreApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed IOSStore App Request.
 */
public interface IManagedIOSStoreAppRequest extends IHttpRequest {

    /**
     * Gets the ManagedIOSStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagedIOSStoreApp> callback);

    /**
     * Gets the ManagedIOSStoreApp from the service
     *
     * @return the ManagedIOSStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedIOSStoreApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagedIOSStoreApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedIOSStoreApp with a source
     *
     * @param sourceManagedIOSStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedIOSStoreApp sourceManagedIOSStoreApp, final ICallback<? super ManagedIOSStoreApp> callback);

    /**
     * Patches this ManagedIOSStoreApp with a source
     *
     * @param sourceManagedIOSStoreApp the source object with updates
     * @return the updated ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedIOSStoreApp patch(final ManagedIOSStoreApp sourceManagedIOSStoreApp) throws ClientException;

    /**
     * Posts a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedIOSStoreApp newManagedIOSStoreApp, final ICallback<? super ManagedIOSStoreApp> callback);

    /**
     * Posts a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the new object to create
     * @return the created ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedIOSStoreApp post(final ManagedIOSStoreApp newManagedIOSStoreApp) throws ClientException;

    /**
     * Posts a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedIOSStoreApp newManagedIOSStoreApp, final ICallback<? super ManagedIOSStoreApp> callback);

    /**
     * Posts a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the object to create/update
     * @return the created ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedIOSStoreApp put(final ManagedIOSStoreApp newManagedIOSStoreApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedIOSStoreAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedIOSStoreAppRequest expand(final String value);

}
