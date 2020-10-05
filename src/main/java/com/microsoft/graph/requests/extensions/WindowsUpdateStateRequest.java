// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsUpdateState;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update State Request.
 */
public class WindowsUpdateStateRequest extends BaseRequest implements IWindowsUpdateStateRequest {
	
    /**
     * The request for the WindowsUpdateState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsUpdateStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsUpdateState.class);
    }

    /**
     * Gets the WindowsUpdateState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsUpdateState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsUpdateState from the service
     *
     * @return the WindowsUpdateState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUpdateState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsUpdateState> callback) {
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
     * Patches this WindowsUpdateState with a source
     *
     * @param sourceWindowsUpdateState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsUpdateState sourceWindowsUpdateState, final ICallback<? super WindowsUpdateState> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsUpdateState);
    }

    /**
     * Patches this WindowsUpdateState with a source
     *
     * @param sourceWindowsUpdateState the source object with updates
     * @return the updated WindowsUpdateState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUpdateState patch(final WindowsUpdateState sourceWindowsUpdateState) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsUpdateState);
    }

    /**
     * Creates a WindowsUpdateState with a new object
     *
     * @param newWindowsUpdateState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsUpdateState newWindowsUpdateState, final ICallback<? super WindowsUpdateState> callback) {
        send(HttpMethod.POST, callback, newWindowsUpdateState);
    }

    /**
     * Creates a WindowsUpdateState with a new object
     *
     * @param newWindowsUpdateState the new object to create
     * @return the created WindowsUpdateState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUpdateState post(final WindowsUpdateState newWindowsUpdateState) throws ClientException {
        return send(HttpMethod.POST, newWindowsUpdateState);
    }

    /**
     * Creates a WindowsUpdateState with a new object
     *
     * @param newWindowsUpdateState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsUpdateState newWindowsUpdateState, final ICallback<? super WindowsUpdateState> callback) {
        send(HttpMethod.PUT, callback, newWindowsUpdateState);
    }

    /**
     * Creates a WindowsUpdateState with a new object
     *
     * @param newWindowsUpdateState the object to create/update
     * @return the created WindowsUpdateState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUpdateState put(final WindowsUpdateState newWindowsUpdateState) throws ClientException {
        return send(HttpMethod.PUT, newWindowsUpdateState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsUpdateStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsUpdateStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsUpdateStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsUpdateStateRequest)this;
     }

}

