// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageDistributionUserCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams Device Usage Distribution User Counts Request.
 */
public interface ITeamsDeviceUsageDistributionUserCountsRequest extends IHttpRequest {

    /**
     * Gets the TeamsDeviceUsageDistributionUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<TeamsDeviceUsageDistributionUserCounts> callback);

    /**
     * Gets the TeamsDeviceUsageDistributionUserCounts from the service
     *
     * @return the TeamsDeviceUsageDistributionUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsDeviceUsageDistributionUserCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<TeamsDeviceUsageDistributionUserCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamsDeviceUsageDistributionUserCounts with a source
     *
     * @param sourceTeamsDeviceUsageDistributionUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamsDeviceUsageDistributionUserCounts sourceTeamsDeviceUsageDistributionUserCounts, final ICallback<TeamsDeviceUsageDistributionUserCounts> callback);

    /**
     * Patches this TeamsDeviceUsageDistributionUserCounts with a source
     *
     * @param sourceTeamsDeviceUsageDistributionUserCounts the source object with updates
     * @return the updated TeamsDeviceUsageDistributionUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsDeviceUsageDistributionUserCounts patch(final TeamsDeviceUsageDistributionUserCounts sourceTeamsDeviceUsageDistributionUserCounts) throws ClientException;

    /**
     * Posts a TeamsDeviceUsageDistributionUserCounts with a new object
     *
     * @param newTeamsDeviceUsageDistributionUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamsDeviceUsageDistributionUserCounts newTeamsDeviceUsageDistributionUserCounts, final ICallback<TeamsDeviceUsageDistributionUserCounts> callback);

    /**
     * Posts a TeamsDeviceUsageDistributionUserCounts with a new object
     *
     * @param newTeamsDeviceUsageDistributionUserCounts the new object to create
     * @return the created TeamsDeviceUsageDistributionUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsDeviceUsageDistributionUserCounts post(final TeamsDeviceUsageDistributionUserCounts newTeamsDeviceUsageDistributionUserCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsDeviceUsageDistributionUserCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsDeviceUsageDistributionUserCountsRequest expand(final String value);

}
