// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamworkTag;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teamwork Tag Request.
 */
public interface ITeamworkTagRequest extends IHttpRequest {

    /**
     * Gets the TeamworkTag from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TeamworkTag> callback);

    /**
     * Gets the TeamworkTag from the service
     *
     * @return the TeamworkTag from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamworkTag get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TeamworkTag> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TeamworkTag with a source
     *
     * @param sourceTeamworkTag the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TeamworkTag sourceTeamworkTag, final ICallback<? super TeamworkTag> callback);

    /**
     * Patches this TeamworkTag with a source
     *
     * @param sourceTeamworkTag the source object with updates
     * @return the updated TeamworkTag
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamworkTag patch(final TeamworkTag sourceTeamworkTag) throws ClientException;

    /**
     * Posts a TeamworkTag with a new object
     *
     * @param newTeamworkTag the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TeamworkTag newTeamworkTag, final ICallback<? super TeamworkTag> callback);

    /**
     * Posts a TeamworkTag with a new object
     *
     * @param newTeamworkTag the new object to create
     * @return the created TeamworkTag
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamworkTag post(final TeamworkTag newTeamworkTag) throws ClientException;

    /**
     * Posts a TeamworkTag with a new object
     *
     * @param newTeamworkTag the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TeamworkTag newTeamworkTag, final ICallback<? super TeamworkTag> callback);

    /**
     * Posts a TeamworkTag with a new object
     *
     * @param newTeamworkTag the object to create/update
     * @return the created TeamworkTag
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TeamworkTag put(final TeamworkTag newTeamworkTag) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITeamworkTagRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITeamworkTagRequest expand(final String value);

}

