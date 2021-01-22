// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerPlan;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Plan Request.
 */
public interface IPlannerPlanRequest extends IHttpRequest {

    /**
     * Gets the PlannerPlan from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PlannerPlan> callback);

    /**
     * Gets the PlannerPlan from the service
     *
     * @return the PlannerPlan from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerPlan get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PlannerPlan> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerPlan with a source
     *
     * @param sourcePlannerPlan the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerPlan sourcePlannerPlan, final ICallback<? super PlannerPlan> callback);

    /**
     * Patches this PlannerPlan with a source
     *
     * @param sourcePlannerPlan the source object with updates
     * @return the updated PlannerPlan
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerPlan patch(final PlannerPlan sourcePlannerPlan) throws ClientException;

    /**
     * Posts a PlannerPlan with a new object
     *
     * @param newPlannerPlan the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerPlan newPlannerPlan, final ICallback<? super PlannerPlan> callback);

    /**
     * Posts a PlannerPlan with a new object
     *
     * @param newPlannerPlan the new object to create
     * @return the created PlannerPlan
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerPlan post(final PlannerPlan newPlannerPlan) throws ClientException;

    /**
     * Posts a PlannerPlan with a new object
     *
     * @param newPlannerPlan the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PlannerPlan newPlannerPlan, final ICallback<? super PlannerPlan> callback);

    /**
     * Posts a PlannerPlan with a new object
     *
     * @param newPlannerPlan the object to create/update
     * @return the created PlannerPlan
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerPlan put(final PlannerPlan newPlannerPlan) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerPlanRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerPlanRequest expand(final String value);

}
