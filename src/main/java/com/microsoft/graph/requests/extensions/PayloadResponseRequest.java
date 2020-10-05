// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PayloadResponse;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Payload Response Request.
 */
public class PayloadResponseRequest extends BaseRequest implements IPayloadResponseRequest {
	
    /**
     * The request for the PayloadResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PayloadResponseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PayloadResponse.class);
    }

    /**
     * Gets the PayloadResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PayloadResponse> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PayloadResponse from the service
     *
     * @return the PayloadResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PayloadResponse get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PayloadResponse> callback) {
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
     * Patches this PayloadResponse with a source
     *
     * @param sourcePayloadResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PayloadResponse sourcePayloadResponse, final ICallback<? super PayloadResponse> callback) {
        send(HttpMethod.PATCH, callback, sourcePayloadResponse);
    }

    /**
     * Patches this PayloadResponse with a source
     *
     * @param sourcePayloadResponse the source object with updates
     * @return the updated PayloadResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PayloadResponse patch(final PayloadResponse sourcePayloadResponse) throws ClientException {
        return send(HttpMethod.PATCH, sourcePayloadResponse);
    }

    /**
     * Creates a PayloadResponse with a new object
     *
     * @param newPayloadResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PayloadResponse newPayloadResponse, final ICallback<? super PayloadResponse> callback) {
        send(HttpMethod.POST, callback, newPayloadResponse);
    }

    /**
     * Creates a PayloadResponse with a new object
     *
     * @param newPayloadResponse the new object to create
     * @return the created PayloadResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PayloadResponse post(final PayloadResponse newPayloadResponse) throws ClientException {
        return send(HttpMethod.POST, newPayloadResponse);
    }

    /**
     * Creates a PayloadResponse with a new object
     *
     * @param newPayloadResponse the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PayloadResponse newPayloadResponse, final ICallback<? super PayloadResponse> callback) {
        send(HttpMethod.PUT, callback, newPayloadResponse);
    }

    /**
     * Creates a PayloadResponse with a new object
     *
     * @param newPayloadResponse the object to create/update
     * @return the created PayloadResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PayloadResponse put(final PayloadResponse newPayloadResponse) throws ClientException {
        return send(HttpMethod.PUT, newPayloadResponse);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPayloadResponseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PayloadResponseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPayloadResponseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PayloadResponseRequest)this;
     }

}

