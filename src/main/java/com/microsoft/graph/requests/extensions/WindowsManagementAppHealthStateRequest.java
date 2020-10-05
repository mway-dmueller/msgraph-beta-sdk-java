// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsManagementAppHealthState;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Management App Health State Request.
 */
public class WindowsManagementAppHealthStateRequest extends BaseRequest implements IWindowsManagementAppHealthStateRequest {
	
    /**
     * The request for the WindowsManagementAppHealthState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsManagementAppHealthStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsManagementAppHealthState.class);
    }

    /**
     * Gets the WindowsManagementAppHealthState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsManagementAppHealthState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsManagementAppHealthState from the service
     *
     * @return the WindowsManagementAppHealthState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagementAppHealthState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsManagementAppHealthState> callback) {
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
     * Patches this WindowsManagementAppHealthState with a source
     *
     * @param sourceWindowsManagementAppHealthState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsManagementAppHealthState sourceWindowsManagementAppHealthState, final ICallback<? super WindowsManagementAppHealthState> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsManagementAppHealthState);
    }

    /**
     * Patches this WindowsManagementAppHealthState with a source
     *
     * @param sourceWindowsManagementAppHealthState the source object with updates
     * @return the updated WindowsManagementAppHealthState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagementAppHealthState patch(final WindowsManagementAppHealthState sourceWindowsManagementAppHealthState) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsManagementAppHealthState);
    }

    /**
     * Creates a WindowsManagementAppHealthState with a new object
     *
     * @param newWindowsManagementAppHealthState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsManagementAppHealthState newWindowsManagementAppHealthState, final ICallback<? super WindowsManagementAppHealthState> callback) {
        send(HttpMethod.POST, callback, newWindowsManagementAppHealthState);
    }

    /**
     * Creates a WindowsManagementAppHealthState with a new object
     *
     * @param newWindowsManagementAppHealthState the new object to create
     * @return the created WindowsManagementAppHealthState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagementAppHealthState post(final WindowsManagementAppHealthState newWindowsManagementAppHealthState) throws ClientException {
        return send(HttpMethod.POST, newWindowsManagementAppHealthState);
    }

    /**
     * Creates a WindowsManagementAppHealthState with a new object
     *
     * @param newWindowsManagementAppHealthState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsManagementAppHealthState newWindowsManagementAppHealthState, final ICallback<? super WindowsManagementAppHealthState> callback) {
        send(HttpMethod.PUT, callback, newWindowsManagementAppHealthState);
    }

    /**
     * Creates a WindowsManagementAppHealthState with a new object
     *
     * @param newWindowsManagementAppHealthState the object to create/update
     * @return the created WindowsManagementAppHealthState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsManagementAppHealthState put(final WindowsManagementAppHealthState newWindowsManagementAppHealthState) throws ClientException {
        return send(HttpMethod.PUT, newWindowsManagementAppHealthState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsManagementAppHealthStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsManagementAppHealthStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsManagementAppHealthStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsManagementAppHealthStateRequest)this;
     }

}

