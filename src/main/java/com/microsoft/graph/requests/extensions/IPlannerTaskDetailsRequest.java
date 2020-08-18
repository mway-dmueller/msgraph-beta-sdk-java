// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerTaskDetails;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Task Details Request.
 */
public interface IPlannerTaskDetailsRequest extends IHttpRequest {

    /**
     * Gets the PlannerTaskDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<PlannerTaskDetails> callback);

    /**
     * Gets the PlannerTaskDetails from the service
     *
     * @return the PlannerTaskDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerTaskDetails get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<PlannerTaskDetails> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PlannerTaskDetails with a source
     *
     * @param sourcePlannerTaskDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerTaskDetails sourcePlannerTaskDetails, final ICallback<PlannerTaskDetails> callback);

    /**
     * Patches this PlannerTaskDetails with a source
     *
     * @param sourcePlannerTaskDetails the source object with updates
     * @return the updated PlannerTaskDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerTaskDetails patch(final PlannerTaskDetails sourcePlannerTaskDetails) throws ClientException;

    /**
     * Posts a PlannerTaskDetails with a new object
     *
     * @param newPlannerTaskDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerTaskDetails newPlannerTaskDetails, final ICallback<PlannerTaskDetails> callback);

    /**
     * Posts a PlannerTaskDetails with a new object
     *
     * @param newPlannerTaskDetails the new object to create
     * @return the created PlannerTaskDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerTaskDetails post(final PlannerTaskDetails newPlannerTaskDetails) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerTaskDetailsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerTaskDetailsRequest expand(final String value);

}

