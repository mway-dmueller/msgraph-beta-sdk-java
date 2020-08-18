// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWebAppRequest;
import com.microsoft.graph.requests.extensions.WebAppRequest;
import com.microsoft.graph.models.extensions.WebApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Web App Request.
 */
public class WebAppRequest extends BaseRequest implements IWebAppRequest {
	
    /**
     * The request for the WebApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WebAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WebApp.class);
    }

    /**
     * Gets the WebApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WebApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WebApp from the service
     *
     * @return the WebApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WebApp> callback) {
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
     * Patches this WebApp with a source
     *
     * @param sourceWebApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WebApp sourceWebApp, final ICallback<WebApp> callback) {
        send(HttpMethod.PATCH, callback, sourceWebApp);
    }

    /**
     * Patches this WebApp with a source
     *
     * @param sourceWebApp the source object with updates
     * @return the updated WebApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebApp patch(final WebApp sourceWebApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceWebApp);
    }

    /**
     * Creates a WebApp with a new object
     *
     * @param newWebApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WebApp newWebApp, final ICallback<WebApp> callback) {
        send(HttpMethod.POST, callback, newWebApp);
    }

    /**
     * Creates a WebApp with a new object
     *
     * @param newWebApp the new object to create
     * @return the created WebApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WebApp post(final WebApp newWebApp) throws ClientException {
        return send(HttpMethod.POST, newWebApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWebAppRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WebAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWebAppRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WebAppRequest)this;
     }

}

