// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsStoreApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Store App Request.
 */
public class WindowsStoreAppRequest extends BaseRequest implements IWindowsStoreAppRequest {
	
    /**
     * The request for the WindowsStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsStoreAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsStoreApp.class);
    }

    /**
     * Gets the WindowsStoreApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsStoreApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsStoreApp from the service
     *
     * @return the WindowsStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsStoreApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsStoreApp> callback) {
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
     * Patches this WindowsStoreApp with a source
     *
     * @param sourceWindowsStoreApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsStoreApp sourceWindowsStoreApp, final ICallback<? super WindowsStoreApp> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsStoreApp);
    }

    /**
     * Patches this WindowsStoreApp with a source
     *
     * @param sourceWindowsStoreApp the source object with updates
     * @return the updated WindowsStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsStoreApp patch(final WindowsStoreApp sourceWindowsStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsStoreApp);
    }

    /**
     * Creates a WindowsStoreApp with a new object
     *
     * @param newWindowsStoreApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsStoreApp newWindowsStoreApp, final ICallback<? super WindowsStoreApp> callback) {
        send(HttpMethod.POST, callback, newWindowsStoreApp);
    }

    /**
     * Creates a WindowsStoreApp with a new object
     *
     * @param newWindowsStoreApp the new object to create
     * @return the created WindowsStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsStoreApp post(final WindowsStoreApp newWindowsStoreApp) throws ClientException {
        return send(HttpMethod.POST, newWindowsStoreApp);
    }

    /**
     * Creates a WindowsStoreApp with a new object
     *
     * @param newWindowsStoreApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsStoreApp newWindowsStoreApp, final ICallback<? super WindowsStoreApp> callback) {
        send(HttpMethod.PUT, callback, newWindowsStoreApp);
    }

    /**
     * Creates a WindowsStoreApp with a new object
     *
     * @param newWindowsStoreApp the object to create/update
     * @return the created WindowsStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsStoreApp put(final WindowsStoreApp newWindowsStoreApp) throws ClientException {
        return send(HttpMethod.PUT, newWindowsStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsStoreAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsStoreAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsStoreAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsStoreAppRequest)this;
     }

}

