// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerRosterMember;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Roster Member Request.
 */
public interface IPlannerRosterMemberRequest extends IHttpRequest {

    /**
     * Gets the PlannerRosterMember from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PlannerRosterMember> callback);

    /**
     * Gets the PlannerRosterMember from the service
     *
     * @return the PlannerRosterMember from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerRosterMember get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PlannerRosterMember> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerRosterMember with a source
     *
     * @param sourcePlannerRosterMember the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerRosterMember sourcePlannerRosterMember, final ICallback<? super PlannerRosterMember> callback);

    /**
     * Patches this PlannerRosterMember with a source
     *
     * @param sourcePlannerRosterMember the source object with updates
     * @return the updated PlannerRosterMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerRosterMember patch(final PlannerRosterMember sourcePlannerRosterMember) throws ClientException;

    /**
     * Posts a PlannerRosterMember with a new object
     *
     * @param newPlannerRosterMember the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerRosterMember newPlannerRosterMember, final ICallback<? super PlannerRosterMember> callback);

    /**
     * Posts a PlannerRosterMember with a new object
     *
     * @param newPlannerRosterMember the new object to create
     * @return the created PlannerRosterMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerRosterMember post(final PlannerRosterMember newPlannerRosterMember) throws ClientException;

    /**
     * Posts a PlannerRosterMember with a new object
     *
     * @param newPlannerRosterMember the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PlannerRosterMember newPlannerRosterMember, final ICallback<? super PlannerRosterMember> callback);

    /**
     * Posts a PlannerRosterMember with a new object
     *
     * @param newPlannerRosterMember the object to create/update
     * @return the created PlannerRosterMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerRosterMember put(final PlannerRosterMember newPlannerRosterMember) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerRosterMemberRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerRosterMemberRequest expand(final String value);

}

