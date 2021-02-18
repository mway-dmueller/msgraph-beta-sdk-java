// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Assignment Request Request.
 */
public interface IUnifiedRoleAssignmentRequestRequest extends IHttpRequest {

    /**
     * Gets the UnifiedRoleAssignmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnifiedRoleAssignmentRequest> callback);

    /**
     * Gets the UnifiedRoleAssignmentRequest from the service
     *
     * @return the UnifiedRoleAssignmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleAssignmentRequest get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnifiedRoleAssignmentRequest> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnifiedRoleAssignmentRequest with a source
     *
     * @param sourceUnifiedRoleAssignmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnifiedRoleAssignmentRequest sourceUnifiedRoleAssignmentRequest, final ICallback<? super UnifiedRoleAssignmentRequest> callback);

    /**
     * Patches this UnifiedRoleAssignmentRequest with a source
     *
     * @param sourceUnifiedRoleAssignmentRequest the source object with updates
     * @return the updated UnifiedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleAssignmentRequest patch(final UnifiedRoleAssignmentRequest sourceUnifiedRoleAssignmentRequest) throws ClientException;

    /**
     * Posts a UnifiedRoleAssignmentRequest with a new object
     *
     * @param newUnifiedRoleAssignmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnifiedRoleAssignmentRequest newUnifiedRoleAssignmentRequest, final ICallback<? super UnifiedRoleAssignmentRequest> callback);

    /**
     * Posts a UnifiedRoleAssignmentRequest with a new object
     *
     * @param newUnifiedRoleAssignmentRequest the new object to create
     * @return the created UnifiedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleAssignmentRequest post(final UnifiedRoleAssignmentRequest newUnifiedRoleAssignmentRequest) throws ClientException;

    /**
     * Posts a UnifiedRoleAssignmentRequest with a new object
     *
     * @param newUnifiedRoleAssignmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnifiedRoleAssignmentRequest newUnifiedRoleAssignmentRequest, final ICallback<? super UnifiedRoleAssignmentRequest> callback);

    /**
     * Posts a UnifiedRoleAssignmentRequest with a new object
     *
     * @param newUnifiedRoleAssignmentRequest the object to create/update
     * @return the created UnifiedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRoleAssignmentRequest put(final UnifiedRoleAssignmentRequest newUnifiedRoleAssignmentRequest) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleAssignmentRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleAssignmentRequestRequest expand(final String value);

}
