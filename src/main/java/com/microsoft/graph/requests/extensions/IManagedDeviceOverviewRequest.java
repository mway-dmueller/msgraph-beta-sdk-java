// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceOverview;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Overview Request.
 */
public interface IManagedDeviceOverviewRequest extends IHttpRequest {

    /**
     * Gets the ManagedDeviceOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ManagedDeviceOverview> callback);

    /**
     * Gets the ManagedDeviceOverview from the service
     *
     * @return the ManagedDeviceOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceOverview get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ManagedDeviceOverview> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedDeviceOverview with a source
     *
     * @param sourceManagedDeviceOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedDeviceOverview sourceManagedDeviceOverview, final ICallback<ManagedDeviceOverview> callback);

    /**
     * Patches this ManagedDeviceOverview with a source
     *
     * @param sourceManagedDeviceOverview the source object with updates
     * @return the updated ManagedDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceOverview patch(final ManagedDeviceOverview sourceManagedDeviceOverview) throws ClientException;

    /**
     * Posts a ManagedDeviceOverview with a new object
     *
     * @param newManagedDeviceOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedDeviceOverview newManagedDeviceOverview, final ICallback<ManagedDeviceOverview> callback);

    /**
     * Posts a ManagedDeviceOverview with a new object
     *
     * @param newManagedDeviceOverview the new object to create
     * @return the created ManagedDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceOverview post(final ManagedDeviceOverview newManagedDeviceOverview) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedDeviceOverviewRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedDeviceOverviewRequest expand(final String value);

}

