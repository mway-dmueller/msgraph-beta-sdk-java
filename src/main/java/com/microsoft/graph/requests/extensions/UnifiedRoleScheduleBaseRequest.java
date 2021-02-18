// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleScheduleBase;
import com.microsoft.graph.requests.extensions.IAppScopeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AppScopeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Schedule Base Request.
 */
public class UnifiedRoleScheduleBaseRequest extends BaseRequest implements IUnifiedRoleScheduleBaseRequest {
	
    /**
     * The request for the UnifiedRoleScheduleBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public UnifiedRoleScheduleBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends UnifiedRoleScheduleBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the UnifiedRoleScheduleBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleScheduleBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleScheduleBase.class);
    }

    /**
     * Gets the UnifiedRoleScheduleBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UnifiedRoleScheduleBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnifiedRoleScheduleBase from the service
     *
     * @return the UnifiedRoleScheduleBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleScheduleBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UnifiedRoleScheduleBase> callback) {
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
     * Patches this UnifiedRoleScheduleBase with a source
     *
     * @param sourceUnifiedRoleScheduleBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnifiedRoleScheduleBase sourceUnifiedRoleScheduleBase, final ICallback<? super UnifiedRoleScheduleBase> callback) {
        send(HttpMethod.PATCH, callback, sourceUnifiedRoleScheduleBase);
    }

    /**
     * Patches this UnifiedRoleScheduleBase with a source
     *
     * @param sourceUnifiedRoleScheduleBase the source object with updates
     * @return the updated UnifiedRoleScheduleBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleScheduleBase patch(final UnifiedRoleScheduleBase sourceUnifiedRoleScheduleBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleScheduleBase);
    }

    /**
     * Creates a UnifiedRoleScheduleBase with a new object
     *
     * @param newUnifiedRoleScheduleBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnifiedRoleScheduleBase newUnifiedRoleScheduleBase, final ICallback<? super UnifiedRoleScheduleBase> callback) {
        send(HttpMethod.POST, callback, newUnifiedRoleScheduleBase);
    }

    /**
     * Creates a UnifiedRoleScheduleBase with a new object
     *
     * @param newUnifiedRoleScheduleBase the new object to create
     * @return the created UnifiedRoleScheduleBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleScheduleBase post(final UnifiedRoleScheduleBase newUnifiedRoleScheduleBase) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleScheduleBase);
    }

    /**
     * Creates a UnifiedRoleScheduleBase with a new object
     *
     * @param newUnifiedRoleScheduleBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnifiedRoleScheduleBase newUnifiedRoleScheduleBase, final ICallback<? super UnifiedRoleScheduleBase> callback) {
        send(HttpMethod.PUT, callback, newUnifiedRoleScheduleBase);
    }

    /**
     * Creates a UnifiedRoleScheduleBase with a new object
     *
     * @param newUnifiedRoleScheduleBase the object to create/update
     * @return the created UnifiedRoleScheduleBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnifiedRoleScheduleBase put(final UnifiedRoleScheduleBase newUnifiedRoleScheduleBase) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleScheduleBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnifiedRoleScheduleBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnifiedRoleScheduleBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnifiedRoleScheduleBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnifiedRoleScheduleBaseRequest)this;
     }

}
