// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSLobApp;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSLob App Request.
 */
public class MacOSLobAppRequest extends BaseRequest implements IMacOSLobAppRequest {
	
    /**
     * The request for the MacOSLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSLobAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSLobApp.class);
    }

    /**
     * Gets the MacOSLobApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MacOSLobApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSLobApp from the service
     *
     * @return the MacOSLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSLobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MacOSLobApp> callback) {
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
     * Patches this MacOSLobApp with a source
     *
     * @param sourceMacOSLobApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSLobApp sourceMacOSLobApp, final ICallback<MacOSLobApp> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSLobApp);
    }

    /**
     * Patches this MacOSLobApp with a source
     *
     * @param sourceMacOSLobApp the source object with updates
     * @return the updated MacOSLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSLobApp patch(final MacOSLobApp sourceMacOSLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSLobApp);
    }

    /**
     * Creates a MacOSLobApp with a new object
     *
     * @param newMacOSLobApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSLobApp newMacOSLobApp, final ICallback<MacOSLobApp> callback) {
        send(HttpMethod.POST, callback, newMacOSLobApp);
    }

    /**
     * Creates a MacOSLobApp with a new object
     *
     * @param newMacOSLobApp the new object to create
     * @return the created MacOSLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSLobApp post(final MacOSLobApp newMacOSLobApp) throws ClientException {
        return send(HttpMethod.POST, newMacOSLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSLobAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSLobAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSLobAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSLobAppRequest)this;
     }

}
