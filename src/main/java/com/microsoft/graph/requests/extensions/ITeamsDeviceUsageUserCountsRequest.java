// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams Device Usage User Counts Request.
 */
public interface ITeamsDeviceUsageUserCountsRequest extends IHttpRequest {

    /**
     * Gets the TeamsDeviceUsageUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TeamsDeviceUsageUserCounts> callback);

    /**
     * Gets the TeamsDeviceUsageUserCounts from the service
     *
     * @return the TeamsDeviceUsageUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsDeviceUsageUserCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TeamsDeviceUsageUserCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamsDeviceUsageUserCounts with a source
     *
     * @param sourceTeamsDeviceUsageUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamsDeviceUsageUserCounts sourceTeamsDeviceUsageUserCounts, final ICallback<? super TeamsDeviceUsageUserCounts> callback);

    /**
     * Patches this TeamsDeviceUsageUserCounts with a source
     *
     * @param sourceTeamsDeviceUsageUserCounts the source object with updates
     * @return the updated TeamsDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsDeviceUsageUserCounts patch(final TeamsDeviceUsageUserCounts sourceTeamsDeviceUsageUserCounts) throws ClientException;

    /**
     * Posts a TeamsDeviceUsageUserCounts with a new object
     *
     * @param newTeamsDeviceUsageUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamsDeviceUsageUserCounts newTeamsDeviceUsageUserCounts, final ICallback<? super TeamsDeviceUsageUserCounts> callback);

    /**
     * Posts a TeamsDeviceUsageUserCounts with a new object
     *
     * @param newTeamsDeviceUsageUserCounts the new object to create
     * @return the created TeamsDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsDeviceUsageUserCounts post(final TeamsDeviceUsageUserCounts newTeamsDeviceUsageUserCounts) throws ClientException;

    /**
     * Posts a TeamsDeviceUsageUserCounts with a new object
     *
     * @param newTeamsDeviceUsageUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TeamsDeviceUsageUserCounts newTeamsDeviceUsageUserCounts, final ICallback<? super TeamsDeviceUsageUserCounts> callback);

    /**
     * Posts a TeamsDeviceUsageUserCounts with a new object
     *
     * @param newTeamsDeviceUsageUserCounts the object to create/update
     * @return the created TeamsDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsDeviceUsageUserCounts put(final TeamsDeviceUsageUserCounts newTeamsDeviceUsageUserCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsDeviceUsageUserCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsDeviceUsageUserCountsRequest expand(final String value);

}
