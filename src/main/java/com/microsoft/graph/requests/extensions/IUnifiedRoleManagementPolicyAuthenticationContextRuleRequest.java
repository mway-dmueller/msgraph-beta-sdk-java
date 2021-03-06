// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicyAuthenticationContextRule;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Management Policy Authentication Context Rule Request.
 */
public interface IUnifiedRoleManagementPolicyAuthenticationContextRuleRequest extends IHttpRequest {

    /**
     * Gets the UnifiedRoleManagementPolicyAuthenticationContextRule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnifiedRoleManagementPolicyAuthenticationContextRule> callback);

    /**
     * Gets the UnifiedRoleManagementPolicyAuthenticationContextRule from the service
     *
     * @return the UnifiedRoleManagementPolicyAuthenticationContextRule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicyAuthenticationContextRule get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnifiedRoleManagementPolicyAuthenticationContextRule> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnifiedRoleManagementPolicyAuthenticationContextRule with a source
     *
     * @param sourceUnifiedRoleManagementPolicyAuthenticationContextRule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnifiedRoleManagementPolicyAuthenticationContextRule sourceUnifiedRoleManagementPolicyAuthenticationContextRule, final ICallback<? super UnifiedRoleManagementPolicyAuthenticationContextRule> callback);

    /**
     * Patches this UnifiedRoleManagementPolicyAuthenticationContextRule with a source
     *
     * @param sourceUnifiedRoleManagementPolicyAuthenticationContextRule the source object with updates
     * @return the updated UnifiedRoleManagementPolicyAuthenticationContextRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicyAuthenticationContextRule patch(final UnifiedRoleManagementPolicyAuthenticationContextRule sourceUnifiedRoleManagementPolicyAuthenticationContextRule) throws ClientException;

    /**
     * Posts a UnifiedRoleManagementPolicyAuthenticationContextRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyAuthenticationContextRule the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnifiedRoleManagementPolicyAuthenticationContextRule newUnifiedRoleManagementPolicyAuthenticationContextRule, final ICallback<? super UnifiedRoleManagementPolicyAuthenticationContextRule> callback);

    /**
     * Posts a UnifiedRoleManagementPolicyAuthenticationContextRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyAuthenticationContextRule the new object to create
     * @return the created UnifiedRoleManagementPolicyAuthenticationContextRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicyAuthenticationContextRule post(final UnifiedRoleManagementPolicyAuthenticationContextRule newUnifiedRoleManagementPolicyAuthenticationContextRule) throws ClientException;

    /**
     * Posts a UnifiedRoleManagementPolicyAuthenticationContextRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyAuthenticationContextRule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnifiedRoleManagementPolicyAuthenticationContextRule newUnifiedRoleManagementPolicyAuthenticationContextRule, final ICallback<? super UnifiedRoleManagementPolicyAuthenticationContextRule> callback);

    /**
     * Posts a UnifiedRoleManagementPolicyAuthenticationContextRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyAuthenticationContextRule the object to create/update
     * @return the created UnifiedRoleManagementPolicyAuthenticationContextRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicyAuthenticationContextRule put(final UnifiedRoleManagementPolicyAuthenticationContextRule newUnifiedRoleManagementPolicyAuthenticationContextRule) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleManagementPolicyAuthenticationContextRuleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleManagementPolicyAuthenticationContextRuleRequest expand(final String value);

}

