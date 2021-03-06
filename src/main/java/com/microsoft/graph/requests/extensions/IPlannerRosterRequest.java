// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerRoster;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Roster Request.
 */
public interface IPlannerRosterRequest extends IHttpRequest {

    /**
     * Gets the PlannerRoster from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PlannerRoster> callback);

    /**
     * Gets the PlannerRoster from the service
     *
     * @return the PlannerRoster from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerRoster get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PlannerRoster> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerRoster with a source
     *
     * @param sourcePlannerRoster the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerRoster sourcePlannerRoster, final ICallback<? super PlannerRoster> callback);

    /**
     * Patches this PlannerRoster with a source
     *
     * @param sourcePlannerRoster the source object with updates
     * @return the updated PlannerRoster
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerRoster patch(final PlannerRoster sourcePlannerRoster) throws ClientException;

    /**
     * Posts a PlannerRoster with a new object
     *
     * @param newPlannerRoster the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerRoster newPlannerRoster, final ICallback<? super PlannerRoster> callback);

    /**
     * Posts a PlannerRoster with a new object
     *
     * @param newPlannerRoster the new object to create
     * @return the created PlannerRoster
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerRoster post(final PlannerRoster newPlannerRoster) throws ClientException;

    /**
     * Posts a PlannerRoster with a new object
     *
     * @param newPlannerRoster the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PlannerRoster newPlannerRoster, final ICallback<? super PlannerRoster> callback);

    /**
     * Posts a PlannerRoster with a new object
     *
     * @param newPlannerRoster the object to create/update
     * @return the created PlannerRoster
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerRoster put(final PlannerRoster newPlannerRoster) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerRosterRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerRosterRequest expand(final String value);

}

