// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemPhone;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Phone Request.
 */
public class ItemPhoneRequest extends BaseRequest implements IItemPhoneRequest {
	
    /**
     * The request for the ItemPhone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemPhoneRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemPhone.class);
    }

    /**
     * Gets the ItemPhone from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ItemPhone> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemPhone from the service
     *
     * @return the ItemPhone from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemPhone get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ItemPhone> callback) {
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
     * Patches this ItemPhone with a source
     *
     * @param sourceItemPhone the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ItemPhone sourceItemPhone, final ICallback<ItemPhone> callback) {
        send(HttpMethod.PATCH, callback, sourceItemPhone);
    }

    /**
     * Patches this ItemPhone with a source
     *
     * @param sourceItemPhone the source object with updates
     * @return the updated ItemPhone
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemPhone patch(final ItemPhone sourceItemPhone) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemPhone);
    }

    /**
     * Creates a ItemPhone with a new object
     *
     * @param newItemPhone the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ItemPhone newItemPhone, final ICallback<ItemPhone> callback) {
        send(HttpMethod.POST, callback, newItemPhone);
    }

    /**
     * Creates a ItemPhone with a new object
     *
     * @param newItemPhone the new object to create
     * @return the created ItemPhone
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemPhone post(final ItemPhone newItemPhone) throws ClientException {
        return send(HttpMethod.POST, newItemPhone);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IItemPhoneRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ItemPhoneRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IItemPhoneRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ItemPhoneRequest)this;
     }

}
