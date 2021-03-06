// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Management Policy Request.
 */
public interface IUnifiedRoleManagementPolicyRequest extends IHttpRequest {

    /**
     * Gets the UnifiedRoleManagementPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnifiedRoleManagementPolicy> callback);

    /**
     * Gets the UnifiedRoleManagementPolicy from the service
     *
     * @return the UnifiedRoleManagementPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnifiedRoleManagementPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnifiedRoleManagementPolicy with a source
     *
     * @param sourceUnifiedRoleManagementPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnifiedRoleManagementPolicy sourceUnifiedRoleManagementPolicy, final ICallback<? super UnifiedRoleManagementPolicy> callback);

    /**
     * Patches this UnifiedRoleManagementPolicy with a source
     *
     * @param sourceUnifiedRoleManagementPolicy the source object with updates
     * @return the updated UnifiedRoleManagementPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicy patch(final UnifiedRoleManagementPolicy sourceUnifiedRoleManagementPolicy) throws ClientException;

    /**
     * Posts a UnifiedRoleManagementPolicy with a new object
     *
     * @param newUnifiedRoleManagementPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnifiedRoleManagementPolicy newUnifiedRoleManagementPolicy, final ICallback<? super UnifiedRoleManagementPolicy> callback);

    /**
     * Posts a UnifiedRoleManagementPolicy with a new object
     *
     * @param newUnifiedRoleManagementPolicy the new object to create
     * @return the created UnifiedRoleManagementPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicy post(final UnifiedRoleManagementPolicy newUnifiedRoleManagementPolicy) throws ClientException;

    /**
     * Posts a UnifiedRoleManagementPolicy with a new object
     *
     * @param newUnifiedRoleManagementPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnifiedRoleManagementPolicy newUnifiedRoleManagementPolicy, final ICallback<? super UnifiedRoleManagementPolicy> callback);

    /**
     * Posts a UnifiedRoleManagementPolicy with a new object
     *
     * @param newUnifiedRoleManagementPolicy the object to create/update
     * @return the created UnifiedRoleManagementPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleManagementPolicy put(final UnifiedRoleManagementPolicy newUnifiedRoleManagementPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleManagementPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleManagementPolicyRequest expand(final String value);

}

