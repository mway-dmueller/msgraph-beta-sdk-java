// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsQualityUpdateCatalogItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Catalog Item Request.
 */
public class WindowsQualityUpdateCatalogItemRequest extends BaseRequest implements IWindowsQualityUpdateCatalogItemRequest {
	
    /**
     * The request for the WindowsQualityUpdateCatalogItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsQualityUpdateCatalogItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsQualityUpdateCatalogItem.class);
    }

    /**
     * Gets the WindowsQualityUpdateCatalogItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsQualityUpdateCatalogItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsQualityUpdateCatalogItem from the service
     *
     * @return the WindowsQualityUpdateCatalogItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsQualityUpdateCatalogItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsQualityUpdateCatalogItem> callback) {
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
     * Patches this WindowsQualityUpdateCatalogItem with a source
     *
     * @param sourceWindowsQualityUpdateCatalogItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsQualityUpdateCatalogItem sourceWindowsQualityUpdateCatalogItem, final ICallback<? super WindowsQualityUpdateCatalogItem> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsQualityUpdateCatalogItem);
    }

    /**
     * Patches this WindowsQualityUpdateCatalogItem with a source
     *
     * @param sourceWindowsQualityUpdateCatalogItem the source object with updates
     * @return the updated WindowsQualityUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsQualityUpdateCatalogItem patch(final WindowsQualityUpdateCatalogItem sourceWindowsQualityUpdateCatalogItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsQualityUpdateCatalogItem);
    }

    /**
     * Creates a WindowsQualityUpdateCatalogItem with a new object
     *
     * @param newWindowsQualityUpdateCatalogItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsQualityUpdateCatalogItem newWindowsQualityUpdateCatalogItem, final ICallback<? super WindowsQualityUpdateCatalogItem> callback) {
        send(HttpMethod.POST, callback, newWindowsQualityUpdateCatalogItem);
    }

    /**
     * Creates a WindowsQualityUpdateCatalogItem with a new object
     *
     * @param newWindowsQualityUpdateCatalogItem the new object to create
     * @return the created WindowsQualityUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsQualityUpdateCatalogItem post(final WindowsQualityUpdateCatalogItem newWindowsQualityUpdateCatalogItem) throws ClientException {
        return send(HttpMethod.POST, newWindowsQualityUpdateCatalogItem);
    }

    /**
     * Creates a WindowsQualityUpdateCatalogItem with a new object
     *
     * @param newWindowsQualityUpdateCatalogItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsQualityUpdateCatalogItem newWindowsQualityUpdateCatalogItem, final ICallback<? super WindowsQualityUpdateCatalogItem> callback) {
        send(HttpMethod.PUT, callback, newWindowsQualityUpdateCatalogItem);
    }

    /**
     * Creates a WindowsQualityUpdateCatalogItem with a new object
     *
     * @param newWindowsQualityUpdateCatalogItem the object to create/update
     * @return the created WindowsQualityUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsQualityUpdateCatalogItem put(final WindowsQualityUpdateCatalogItem newWindowsQualityUpdateCatalogItem) throws ClientException {
        return send(HttpMethod.PUT, newWindowsQualityUpdateCatalogItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsQualityUpdateCatalogItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsQualityUpdateCatalogItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsQualityUpdateCatalogItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsQualityUpdateCatalogItemRequest)this;
     }

}

