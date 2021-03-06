// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilitySchedule;
import com.microsoft.graph.models.generated.RoleEligibilityScheduleFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Request.
 */
public class UnifiedRoleEligibilityScheduleRequest extends BaseRequest implements IUnifiedRoleEligibilityScheduleRequest {
	
    /**
     * The request for the UnifiedRoleEligibilitySchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityScheduleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilitySchedule.class);
    }

    /**
     * Gets the UnifiedRoleEligibilitySchedule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UnifiedRoleEligibilitySchedule> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnifiedRoleEligibilitySchedule from the service
     *
     * @return the UnifiedRoleEligibilitySchedule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleEligibilitySchedule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UnifiedRoleEligibilitySchedule> callback) {
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
     * Patches this UnifiedRoleEligibilitySchedule with a source
     *
     * @param sourceUnifiedRoleEligibilitySchedule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnifiedRoleEligibilitySchedule sourceUnifiedRoleEligibilitySchedule, final ICallback<? super UnifiedRoleEligibilitySchedule> callback) {
        send(HttpMethod.PATCH, callback, sourceUnifiedRoleEligibilitySchedule);
    }

    /**
     * Patches this UnifiedRoleEligibilitySchedule with a source
     *
     * @param sourceUnifiedRoleEligibilitySchedule the source object with updates
     * @return the updated UnifiedRoleEligibilitySchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleEligibilitySchedule patch(final UnifiedRoleEligibilitySchedule sourceUnifiedRoleEligibilitySchedule) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleEligibilitySchedule);
    }

    /**
     * Creates a UnifiedRoleEligibilitySchedule with a new object
     *
     * @param newUnifiedRoleEligibilitySchedule the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule, final ICallback<? super UnifiedRoleEligibilitySchedule> callback) {
        send(HttpMethod.POST, callback, newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Creates a UnifiedRoleEligibilitySchedule with a new object
     *
     * @param newUnifiedRoleEligibilitySchedule the new object to create
     * @return the created UnifiedRoleEligibilitySchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleEligibilitySchedule post(final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Creates a UnifiedRoleEligibilitySchedule with a new object
     *
     * @param newUnifiedRoleEligibilitySchedule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule, final ICallback<? super UnifiedRoleEligibilitySchedule> callback) {
        send(HttpMethod.PUT, callback, newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Creates a UnifiedRoleEligibilitySchedule with a new object
     *
     * @param newUnifiedRoleEligibilitySchedule the object to create/update
     * @return the created UnifiedRoleEligibilitySchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleEligibilitySchedule put(final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleEligibilitySchedule);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnifiedRoleEligibilityScheduleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnifiedRoleEligibilityScheduleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnifiedRoleEligibilityScheduleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnifiedRoleEligibilityScheduleRequest)this;
     }

}

