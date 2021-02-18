// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerRoster;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Roster Request.
 */
public class PlannerRosterRequest extends BaseRequest implements IPlannerRosterRequest {
	
    /**
     * The request for the PlannerRoster
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerRosterRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerRoster.class);
    }

    /**
     * Gets the PlannerRoster from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PlannerRoster> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerRoster from the service
     *
     * @return the PlannerRoster from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerRoster get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PlannerRoster> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerRoster with a source
     *
     * @param sourcePlannerRoster the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerRoster sourcePlannerRoster, final ICallback<? super PlannerRoster> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerRoster);
    }

    /**
     * Patches this PlannerRoster with a source
     *
     * @param sourcePlannerRoster the source object with updates
     * @return the updated PlannerRoster
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerRoster patch(final PlannerRoster sourcePlannerRoster) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerRoster);
    }

    /**
     * Creates a PlannerRoster with a new object
     *
     * @param newPlannerRoster the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerRoster newPlannerRoster, final ICallback<? super PlannerRoster> callback) {
        send(HttpMethod.POST, callback, newPlannerRoster);
    }

    /**
     * Creates a PlannerRoster with a new object
     *
     * @param newPlannerRoster the new object to create
     * @return the created PlannerRoster
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerRoster post(final PlannerRoster newPlannerRoster) throws ClientException {
        return send(HttpMethod.POST, newPlannerRoster);
    }

    /**
     * Creates a PlannerRoster with a new object
     *
     * @param newPlannerRoster the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PlannerRoster newPlannerRoster, final ICallback<? super PlannerRoster> callback) {
        send(HttpMethod.PUT, callback, newPlannerRoster);
    }

    /**
     * Creates a PlannerRoster with a new object
     *
     * @param newPlannerRoster the object to create/update
     * @return the created PlannerRoster
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerRoster put(final PlannerRoster newPlannerRoster) throws ClientException {
        return send(HttpMethod.PUT, newPlannerRoster);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerRosterRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerRosterRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerRosterRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerRosterRequest)this;
     }

}
