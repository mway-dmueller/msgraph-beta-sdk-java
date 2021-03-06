// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemInsights;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Insights Request.
 */
public class ItemInsightsRequest extends BaseRequest implements IItemInsightsRequest {
	
    /**
     * The request for the ItemInsights
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemInsightsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemInsights.class);
    }

    /**
     * Gets the ItemInsights from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ItemInsights> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemInsights from the service
     *
     * @return the ItemInsights from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemInsights get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ItemInsights> callback) {
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
     * Patches this ItemInsights with a source
     *
     * @param sourceItemInsights the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ItemInsights sourceItemInsights, final ICallback<? super ItemInsights> callback) {
        send(HttpMethod.PATCH, callback, sourceItemInsights);
    }

    /**
     * Patches this ItemInsights with a source
     *
     * @param sourceItemInsights the source object with updates
     * @return the updated ItemInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemInsights patch(final ItemInsights sourceItemInsights) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemInsights);
    }

    /**
     * Creates a ItemInsights with a new object
     *
     * @param newItemInsights the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ItemInsights newItemInsights, final ICallback<? super ItemInsights> callback) {
        send(HttpMethod.POST, callback, newItemInsights);
    }

    /**
     * Creates a ItemInsights with a new object
     *
     * @param newItemInsights the new object to create
     * @return the created ItemInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemInsights post(final ItemInsights newItemInsights) throws ClientException {
        return send(HttpMethod.POST, newItemInsights);
    }

    /**
     * Creates a ItemInsights with a new object
     *
     * @param newItemInsights the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ItemInsights newItemInsights, final ICallback<? super ItemInsights> callback) {
        send(HttpMethod.PUT, callback, newItemInsights);
    }

    /**
     * Creates a ItemInsights with a new object
     *
     * @param newItemInsights the object to create/update
     * @return the created ItemInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemInsights put(final ItemInsights newItemInsights) throws ClientException {
        return send(HttpMethod.PUT, newItemInsights);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IItemInsightsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ItemInsightsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IItemInsightsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ItemInsightsRequest)this;
     }

}

