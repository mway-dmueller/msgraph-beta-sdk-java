// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentSchedule;
import com.microsoft.graph.models.generated.RoleAssignmentScheduleFilterByCurrentUserOptions;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule With Reference Request.
 */
public class UnifiedRoleAssignmentScheduleWithReferenceRequest extends BaseRequest implements IUnifiedRoleAssignmentScheduleWithReferenceRequest {

    /**
     * The request for the UnifiedRoleAssignmentSchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentScheduleWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentSchedule.class);
    }

    public void post(final UnifiedRoleAssignmentSchedule newUnifiedRoleAssignmentSchedule, final IJsonBackedObject payload, final ICallback<? super UnifiedRoleAssignmentSchedule> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public UnifiedRoleAssignmentSchedule post(final UnifiedRoleAssignmentSchedule newUnifiedRoleAssignmentSchedule, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newUnifiedRoleAssignmentSchedule;
        }
        return null;
    }

    public void get(final ICallback<? super UnifiedRoleAssignmentSchedule> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public UnifiedRoleAssignmentSchedule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super UnifiedRoleAssignmentSchedule> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final UnifiedRoleAssignmentSchedule sourceUnifiedRoleAssignmentSchedule, final ICallback<? super UnifiedRoleAssignmentSchedule> callback) {
		send(HttpMethod.PATCH, callback, sourceUnifiedRoleAssignmentSchedule);
	}

	public UnifiedRoleAssignmentSchedule patch(final UnifiedRoleAssignmentSchedule sourceUnifiedRoleAssignmentSchedule) throws ClientException {
		return send(HttpMethod.PATCH, sourceUnifiedRoleAssignmentSchedule);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IUnifiedRoleAssignmentScheduleWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentScheduleWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleAssignmentScheduleWithReferenceRequest)this;
    }
}