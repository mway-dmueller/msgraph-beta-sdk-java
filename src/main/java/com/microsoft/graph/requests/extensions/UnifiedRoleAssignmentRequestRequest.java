// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentRequest;
import com.microsoft.graph.models.generated.RoleAssignmentRequestFilterByCurrentUserOptions;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppScopeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AppScopeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentScheduleWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Request Request.
 */
public class UnifiedRoleAssignmentRequestRequest extends BaseRequest implements IUnifiedRoleAssignmentRequestRequest {
	
    /**
     * The request for the UnifiedRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentRequest.class);
    }

    /**
     * Gets the UnifiedRoleAssignmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UnifiedRoleAssignmentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnifiedRoleAssignmentRequest from the service
     *
     * @return the UnifiedRoleAssignmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UnifiedRoleAssignmentRequest> callback) {
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
     * Patches this UnifiedRoleAssignmentRequest with a source
     *
     * @param sourceUnifiedRoleAssignmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnifiedRoleAssignmentRequest sourceUnifiedRoleAssignmentRequest, final ICallback<? super UnifiedRoleAssignmentRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceUnifiedRoleAssignmentRequest);
    }

    /**
     * Patches this UnifiedRoleAssignmentRequest with a source
     *
     * @param sourceUnifiedRoleAssignmentRequest the source object with updates
     * @return the updated UnifiedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignmentRequest patch(final UnifiedRoleAssignmentRequest sourceUnifiedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleAssignmentRequest);
    }

    /**
     * Creates a UnifiedRoleAssignmentRequest with a new object
     *
     * @param newUnifiedRoleAssignmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnifiedRoleAssignmentRequest newUnifiedRoleAssignmentRequest, final ICallback<? super UnifiedRoleAssignmentRequest> callback) {
        send(HttpMethod.POST, callback, newUnifiedRoleAssignmentRequest);
    }

    /**
     * Creates a UnifiedRoleAssignmentRequest with a new object
     *
     * @param newUnifiedRoleAssignmentRequest the new object to create
     * @return the created UnifiedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignmentRequest post(final UnifiedRoleAssignmentRequest newUnifiedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleAssignmentRequest);
    }

    /**
     * Creates a UnifiedRoleAssignmentRequest with a new object
     *
     * @param newUnifiedRoleAssignmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnifiedRoleAssignmentRequest newUnifiedRoleAssignmentRequest, final ICallback<? super UnifiedRoleAssignmentRequest> callback) {
        send(HttpMethod.PUT, callback, newUnifiedRoleAssignmentRequest);
    }

    /**
     * Creates a UnifiedRoleAssignmentRequest with a new object
     *
     * @param newUnifiedRoleAssignmentRequest the object to create/update
     * @return the created UnifiedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleAssignmentRequest put(final UnifiedRoleAssignmentRequest newUnifiedRoleAssignmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleAssignmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnifiedRoleAssignmentRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnifiedRoleAssignmentRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnifiedRoleAssignmentRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnifiedRoleAssignmentRequestRequest)this;
     }

}
