// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanDetailsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Plan Reference Request.
 */
public interface IPlannerPlanReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super PlannerPlan> callback);

    PlannerPlan delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPlannerPlanReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPlannerPlanReferenceRequest expand(final String value);

    /**
     * Puts the PlannerPlan
     *
     * @param srcPlannerPlan the PlannerPlan to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(PlannerPlan srcPlannerPlan, final ICallback<? super PlannerPlan> callback);

    /**
     * Puts the PlannerPlan
     *
     * @param srcPlannerPlan the PlannerPlan to PUT
     * @return the PlannerPlan
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    PlannerPlan put(PlannerPlan srcPlannerPlan) throws ClientException;
}