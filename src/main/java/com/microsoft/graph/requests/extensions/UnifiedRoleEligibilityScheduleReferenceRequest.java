// Template Source: BaseEntityReferenceRequest.java.tt
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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Reference Request.
 */
public class UnifiedRoleEligibilityScheduleReferenceRequest extends BaseRequest implements IUnifiedRoleEligibilityScheduleReferenceRequest {

    /**
     * The request for the UnifiedRoleEligibilitySchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityScheduleReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilitySchedule.class);
    }

    public void delete(final ICallback<? super UnifiedRoleEligibilitySchedule> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public UnifiedRoleEligibilitySchedule delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRoleEligibilityScheduleReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleEligibilityScheduleReferenceRequest)this;
    }
    /**
     * Puts the UnifiedRoleEligibilitySchedule
     *
     * @param srcUnifiedRoleEligibilitySchedule the UnifiedRoleEligibilitySchedule reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(UnifiedRoleEligibilitySchedule srcUnifiedRoleEligibilitySchedule, final ICallback<? super UnifiedRoleEligibilitySchedule> callback) {
        send(HttpMethod.PUT, callback, srcUnifiedRoleEligibilitySchedule);
    }

    /**
     * Puts the UnifiedRoleEligibilitySchedule
     *
     * @param srcUnifiedRoleEligibilitySchedule the UnifiedRoleEligibilitySchedule reference to PUT
     * @return the UnifiedRoleEligibilitySchedule
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public UnifiedRoleEligibilitySchedule put(UnifiedRoleEligibilitySchedule srcUnifiedRoleEligibilitySchedule) throws ClientException {
        return send(HttpMethod.PUT, srcUnifiedRoleEligibilitySchedule);
    }
}
