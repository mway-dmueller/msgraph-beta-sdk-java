// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserDetail;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teams User Activity User Detail Request.
 */
public interface ITeamsUserActivityUserDetailRequest extends IHttpRequest {

    /**
     * Gets the TeamsUserActivityUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TeamsUserActivityUserDetail> callback);

    /**
     * Gets the TeamsUserActivityUserDetail from the service
     *
     * @return the TeamsUserActivityUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsUserActivityUserDetail get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TeamsUserActivityUserDetail> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamsUserActivityUserDetail with a source
     *
     * @param sourceTeamsUserActivityUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamsUserActivityUserDetail sourceTeamsUserActivityUserDetail, final ICallback<? super TeamsUserActivityUserDetail> callback);

    /**
     * Patches this TeamsUserActivityUserDetail with a source
     *
     * @param sourceTeamsUserActivityUserDetail the source object with updates
     * @return the updated TeamsUserActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsUserActivityUserDetail patch(final TeamsUserActivityUserDetail sourceTeamsUserActivityUserDetail) throws ClientException;

    /**
     * Posts a TeamsUserActivityUserDetail with a new object
     *
     * @param newTeamsUserActivityUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamsUserActivityUserDetail newTeamsUserActivityUserDetail, final ICallback<? super TeamsUserActivityUserDetail> callback);

    /**
     * Posts a TeamsUserActivityUserDetail with a new object
     *
     * @param newTeamsUserActivityUserDetail the new object to create
     * @return the created TeamsUserActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsUserActivityUserDetail post(final TeamsUserActivityUserDetail newTeamsUserActivityUserDetail) throws ClientException;

    /**
     * Posts a TeamsUserActivityUserDetail with a new object
     *
     * @param newTeamsUserActivityUserDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TeamsUserActivityUserDetail newTeamsUserActivityUserDetail, final ICallback<? super TeamsUserActivityUserDetail> callback);

    /**
     * Posts a TeamsUserActivityUserDetail with a new object
     *
     * @param newTeamsUserActivityUserDetail the object to create/update
     * @return the created TeamsUserActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamsUserActivityUserDetail put(final TeamsUserActivityUserDetail newTeamsUserActivityUserDetail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamsUserActivityUserDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamsUserActivityUserDetailRequest expand(final String value);

}
