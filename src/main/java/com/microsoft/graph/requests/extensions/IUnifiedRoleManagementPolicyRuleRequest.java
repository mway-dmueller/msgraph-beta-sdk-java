// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicyRule;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Management Policy Rule Request.
 */
public interface IUnifiedRoleManagementPolicyRuleRequest extends IHttpRequest {

    /**
     * Gets the UnifiedRoleManagementPolicyRule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnifiedRoleManagementPolicyRule> callback);

    /**
     * Gets the UnifiedRoleManagementPolicyRule from the service
     *
     * @return the UnifiedRoleManagementPolicyRule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicyRule get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnifiedRoleManagementPolicyRule> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnifiedRoleManagementPolicyRule with a source
     *
     * @param sourceUnifiedRoleManagementPolicyRule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnifiedRoleManagementPolicyRule sourceUnifiedRoleManagementPolicyRule, final ICallback<? super UnifiedRoleManagementPolicyRule> callback);

    /**
     * Patches this UnifiedRoleManagementPolicyRule with a source
     *
     * @param sourceUnifiedRoleManagementPolicyRule the source object with updates
     * @return the updated UnifiedRoleManagementPolicyRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicyRule patch(final UnifiedRoleManagementPolicyRule sourceUnifiedRoleManagementPolicyRule) throws ClientException;

    /**
     * Posts a UnifiedRoleManagementPolicyRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyRule the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnifiedRoleManagementPolicyRule newUnifiedRoleManagementPolicyRule, final ICallback<? super UnifiedRoleManagementPolicyRule> callback);

    /**
     * Posts a UnifiedRoleManagementPolicyRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyRule the new object to create
     * @return the created UnifiedRoleManagementPolicyRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicyRule post(final UnifiedRoleManagementPolicyRule newUnifiedRoleManagementPolicyRule) throws ClientException;

    /**
     * Posts a UnifiedRoleManagementPolicyRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyRule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnifiedRoleManagementPolicyRule newUnifiedRoleManagementPolicyRule, final ICallback<? super UnifiedRoleManagementPolicyRule> callback);

    /**
     * Posts a UnifiedRoleManagementPolicyRule with a new object
     *
     * @param newUnifiedRoleManagementPolicyRule the object to create/update
     * @return the created UnifiedRoleManagementPolicyRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicyRule put(final UnifiedRoleManagementPolicyRule newUnifiedRoleManagementPolicyRule) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleManagementPolicyRuleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleManagementPolicyRuleRequest expand(final String value);

}

