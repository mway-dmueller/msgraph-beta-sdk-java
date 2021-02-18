// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilityScheduleInstance;
import com.microsoft.graph.models.generated.RoleEligibilityScheduleInstanceFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Instance Reference Request.
 */
public class UnifiedRoleEligibilityScheduleInstanceReferenceRequest extends BaseRequest implements IUnifiedRoleEligibilityScheduleInstanceReferenceRequest {

    /**
     * The request for the UnifiedRoleEligibilityScheduleInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityScheduleInstanceReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleEligibilityScheduleInstance.class);
    }

    public void delete(final ICallback<? super UnifiedRoleEligibilityScheduleInstance> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public UnifiedRoleEligibilityScheduleInstance delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRoleEligibilityScheduleInstanceReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleEligibilityScheduleInstanceReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleEligibilityScheduleInstanceReferenceRequest)this;
    }
    /**
     * Puts the UnifiedRoleEligibilityScheduleInstance
     *
     * @param srcUnifiedRoleEligibilityScheduleInstance the UnifiedRoleEligibilityScheduleInstance reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(UnifiedRoleEligibilityScheduleInstance srcUnifiedRoleEligibilityScheduleInstance, final ICallback<? super UnifiedRoleEligibilityScheduleInstance> callback) {
        send(HttpMethod.PUT, callback, srcUnifiedRoleEligibilityScheduleInstance);
    }

    /**
     * Puts the UnifiedRoleEligibilityScheduleInstance
     *
     * @param srcUnifiedRoleEligibilityScheduleInstance the UnifiedRoleEligibilityScheduleInstance reference to PUT
     * @return the UnifiedRoleEligibilityScheduleInstance
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public UnifiedRoleEligibilityScheduleInstance put(UnifiedRoleEligibilityScheduleInstance srcUnifiedRoleEligibilityScheduleInstance) throws ClientException {
        return send(HttpMethod.PUT, srcUnifiedRoleEligibilityScheduleInstance);
    }
}