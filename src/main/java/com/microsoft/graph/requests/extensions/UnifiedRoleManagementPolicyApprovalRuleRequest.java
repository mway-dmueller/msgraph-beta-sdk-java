// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicyApprovalRule;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Management Policy Approval Rule Request.
 */
public class UnifiedRoleManagementPolicyApprovalRuleRequest extends BaseRequest implements IUnifiedRoleManagementPolicyApprovalRuleRequest {
	
    /**
     * The request for the UnifiedRoleManagementPolicyApprovalRule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleManagementPolicyApprovalRuleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleManagementPolicyApprovalRule.class);
    }

    /**
     * Gets the UnifiedRoleManagementPolicyApprovalRule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UnifiedRoleManagementPolicyApprovalRule> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnifiedRoleManagementPolicyApprovalRule from the service
     *
     * @return the UnifiedRoleManagementPolicyApprovalRule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleManagementPolicyApprovalRule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UnifiedRoleManagementPolicyApprovalRule> callback) {
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
     * Patches this UnifiedRoleManagementPolicyApprovalRule with a source
     *
     * @param sourceUnifiedRoleManagementPolicyApprovalRule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnifiedRoleManagementPolicyApprovalRule sourceUnifiedRoleManagementPolicyApprovalRule, final ICallback<? super UnifiedRoleManagementPolicyApprovalRule> callback) {
        send(HttpMethod.PATCH, callback, sourceUnifiedRoleManagementPolicyApprovalRule);
    }

    /**
     * Patches this UnifiedRoleManagementPolicyApprovalRule with a source
     *
     * @param sourceUnifiedRoleManagementPolicyApprovalRule the source object with updates
     * @return the updated UnifiedRoleManagementPolicyApprovalRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleManagementPolicyApprovalRule patch(final UnifiedRoleManagementPolicyApprovalRule sourceUnifiedRoleManagementPolicyApprovalRule) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleManagementPolicyApprovalRule);
    }

    /**
     * Creates a UnifiedRoleManagementPolicyApprovalRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyApprovalRule the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnifiedRoleManagementPolicyApprovalRule newUnifiedRoleManagementPolicyApprovalRule, final ICallback<? super UnifiedRoleManagementPolicyApprovalRule> callback) {
        send(HttpMethod.POST, callback, newUnifiedRoleManagementPolicyApprovalRule);
    }

    /**
     * Creates a UnifiedRoleManagementPolicyApprovalRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyApprovalRule the new object to create
     * @return the created UnifiedRoleManagementPolicyApprovalRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleManagementPolicyApprovalRule post(final UnifiedRoleManagementPolicyApprovalRule newUnifiedRoleManagementPolicyApprovalRule) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleManagementPolicyApprovalRule);
    }

    /**
     * Creates a UnifiedRoleManagementPolicyApprovalRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyApprovalRule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnifiedRoleManagementPolicyApprovalRule newUnifiedRoleManagementPolicyApprovalRule, final ICallback<? super UnifiedRoleManagementPolicyApprovalRule> callback) {
        send(HttpMethod.PUT, callback, newUnifiedRoleManagementPolicyApprovalRule);
    }

    /**
     * Creates a UnifiedRoleManagementPolicyApprovalRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyApprovalRule the object to create/update
     * @return the created UnifiedRoleManagementPolicyApprovalRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleManagementPolicyApprovalRule put(final UnifiedRoleManagementPolicyApprovalRule newUnifiedRoleManagementPolicyApprovalRule) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleManagementPolicyApprovalRule);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnifiedRoleManagementPolicyApprovalRuleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnifiedRoleManagementPolicyApprovalRuleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnifiedRoleManagementPolicyApprovalRuleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnifiedRoleManagementPolicyApprovalRuleRequest)this;
     }

}

