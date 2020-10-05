// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsUserActivityCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams User Activity Counts Request.
 */
public interface ITeamsUserActivityCountsRequest extends IHttpRequest {

    /**
     * Gets the TeamsUserActivityCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TeamsUserActivityCounts> callback);

    /**
     * Gets the TeamsUserActivityCounts from the service
     *
     * @return the TeamsUserActivityCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsUserActivityCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TeamsUserActivityCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamsUserActivityCounts with a source
     *
     * @param sourceTeamsUserActivityCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamsUserActivityCounts sourceTeamsUserActivityCounts, final ICallback<? super TeamsUserActivityCounts> callback);

    /**
     * Patches this TeamsUserActivityCounts with a source
     *
     * @param sourceTeamsUserActivityCounts the source object with updates
     * @return the updated TeamsUserActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsUserActivityCounts patch(final TeamsUserActivityCounts sourceTeamsUserActivityCounts) throws ClientException;

    /**
     * Posts a TeamsUserActivityCounts with a new object
     *
     * @param newTeamsUserActivityCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamsUserActivityCounts newTeamsUserActivityCounts, final ICallback<? super TeamsUserActivityCounts> callback);

    /**
     * Posts a TeamsUserActivityCounts with a new object
     *
     * @param newTeamsUserActivityCounts the new object to create
     * @return the created TeamsUserActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsUserActivityCounts post(final TeamsUserActivityCounts newTeamsUserActivityCounts) throws ClientException;

    /**
     * Posts a TeamsUserActivityCounts with a new object
     *
     * @param newTeamsUserActivityCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TeamsUserActivityCounts newTeamsUserActivityCounts, final ICallback<? super TeamsUserActivityCounts> callback);

    /**
     * Posts a TeamsUserActivityCounts with a new object
     *
     * @param newTeamsUserActivityCounts the object to create/update
     * @return the created TeamsUserActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsUserActivityCounts put(final TeamsUserActivityCounts newTeamsUserActivityCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsUserActivityCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsUserActivityCountsRequest expand(final String value);

}

