// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsFeatureUpdateCatalogItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Feature Update Catalog Item Request.
 */
public class WindowsFeatureUpdateCatalogItemRequest extends BaseRequest implements IWindowsFeatureUpdateCatalogItemRequest {
	
    /**
     * The request for the WindowsFeatureUpdateCatalogItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsFeatureUpdateCatalogItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsFeatureUpdateCatalogItem.class);
    }

    /**
     * Gets the WindowsFeatureUpdateCatalogItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsFeatureUpdateCatalogItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsFeatureUpdateCatalogItem from the service
     *
     * @return the WindowsFeatureUpdateCatalogItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsFeatureUpdateCatalogItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsFeatureUpdateCatalogItem> callback) {
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
     * Patches this WindowsFeatureUpdateCatalogItem with a source
     *
     * @param sourceWindowsFeatureUpdateCatalogItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsFeatureUpdateCatalogItem sourceWindowsFeatureUpdateCatalogItem, final ICallback<? super WindowsFeatureUpdateCatalogItem> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsFeatureUpdateCatalogItem);
    }

    /**
     * Patches this WindowsFeatureUpdateCatalogItem with a source
     *
     * @param sourceWindowsFeatureUpdateCatalogItem the source object with updates
     * @return the updated WindowsFeatureUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsFeatureUpdateCatalogItem patch(final WindowsFeatureUpdateCatalogItem sourceWindowsFeatureUpdateCatalogItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsFeatureUpdateCatalogItem);
    }

    /**
     * Creates a WindowsFeatureUpdateCatalogItem with a new object
     *
     * @param newWindowsFeatureUpdateCatalogItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsFeatureUpdateCatalogItem newWindowsFeatureUpdateCatalogItem, final ICallback<? super WindowsFeatureUpdateCatalogItem> callback) {
        send(HttpMethod.POST, callback, newWindowsFeatureUpdateCatalogItem);
    }

    /**
     * Creates a WindowsFeatureUpdateCatalogItem with a new object
     *
     * @param newWindowsFeatureUpdateCatalogItem the new object to create
     * @return the created WindowsFeatureUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsFeatureUpdateCatalogItem post(final WindowsFeatureUpdateCatalogItem newWindowsFeatureUpdateCatalogItem) throws ClientException {
        return send(HttpMethod.POST, newWindowsFeatureUpdateCatalogItem);
    }

    /**
     * Creates a WindowsFeatureUpdateCatalogItem with a new object
     *
     * @param newWindowsFeatureUpdateCatalogItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsFeatureUpdateCatalogItem newWindowsFeatureUpdateCatalogItem, final ICallback<? super WindowsFeatureUpdateCatalogItem> callback) {
        send(HttpMethod.PUT, callback, newWindowsFeatureUpdateCatalogItem);
    }

    /**
     * Creates a WindowsFeatureUpdateCatalogItem with a new object
     *
     * @param newWindowsFeatureUpdateCatalogItem the object to create/update
     * @return the created WindowsFeatureUpdateCatalogItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsFeatureUpdateCatalogItem put(final WindowsFeatureUpdateCatalogItem newWindowsFeatureUpdateCatalogItem) throws ClientException {
        return send(HttpMethod.PUT, newWindowsFeatureUpdateCatalogItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsFeatureUpdateCatalogItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsFeatureUpdateCatalogItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsFeatureUpdateCatalogItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsFeatureUpdateCatalogItemRequest)this;
     }

}
