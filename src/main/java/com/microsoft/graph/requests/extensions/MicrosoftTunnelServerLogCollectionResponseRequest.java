// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MicrosoftTunnelServerLogCollectionResponse;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Log Collection Response Request.
 */
public class MicrosoftTunnelServerLogCollectionResponseRequest extends BaseRequest implements IMicrosoftTunnelServerLogCollectionResponseRequest {
	
    /**
     * The request for the MicrosoftTunnelServerLogCollectionResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MicrosoftTunnelServerLogCollectionResponseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MicrosoftTunnelServerLogCollectionResponse.class);
    }

    /**
     * Gets the MicrosoftTunnelServerLogCollectionResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MicrosoftTunnelServerLogCollectionResponse> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MicrosoftTunnelServerLogCollectionResponse from the service
     *
     * @return the MicrosoftTunnelServerLogCollectionResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MicrosoftTunnelServerLogCollectionResponse get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MicrosoftTunnelServerLogCollectionResponse> callback) {
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
     * Patches this MicrosoftTunnelServerLogCollectionResponse with a source
     *
     * @param sourceMicrosoftTunnelServerLogCollectionResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MicrosoftTunnelServerLogCollectionResponse sourceMicrosoftTunnelServerLogCollectionResponse, final ICallback<? super MicrosoftTunnelServerLogCollectionResponse> callback) {
        send(HttpMethod.PATCH, callback, sourceMicrosoftTunnelServerLogCollectionResponse);
    }

    /**
     * Patches this MicrosoftTunnelServerLogCollectionResponse with a source
     *
     * @param sourceMicrosoftTunnelServerLogCollectionResponse the source object with updates
     * @return the updated MicrosoftTunnelServerLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MicrosoftTunnelServerLogCollectionResponse patch(final MicrosoftTunnelServerLogCollectionResponse sourceMicrosoftTunnelServerLogCollectionResponse) throws ClientException {
        return send(HttpMethod.PATCH, sourceMicrosoftTunnelServerLogCollectionResponse);
    }

    /**
     * Creates a MicrosoftTunnelServerLogCollectionResponse with a new object
     *
     * @param newMicrosoftTunnelServerLogCollectionResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MicrosoftTunnelServerLogCollectionResponse newMicrosoftTunnelServerLogCollectionResponse, final ICallback<? super MicrosoftTunnelServerLogCollectionResponse> callback) {
        send(HttpMethod.POST, callback, newMicrosoftTunnelServerLogCollectionResponse);
    }

    /**
     * Creates a MicrosoftTunnelServerLogCollectionResponse with a new object
     *
     * @param newMicrosoftTunnelServerLogCollectionResponse the new object to create
     * @return the created MicrosoftTunnelServerLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MicrosoftTunnelServerLogCollectionResponse post(final MicrosoftTunnelServerLogCollectionResponse newMicrosoftTunnelServerLogCollectionResponse) throws ClientException {
        return send(HttpMethod.POST, newMicrosoftTunnelServerLogCollectionResponse);
    }

    /**
     * Creates a MicrosoftTunnelServerLogCollectionResponse with a new object
     *
     * @param newMicrosoftTunnelServerLogCollectionResponse the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MicrosoftTunnelServerLogCollectionResponse newMicrosoftTunnelServerLogCollectionResponse, final ICallback<? super MicrosoftTunnelServerLogCollectionResponse> callback) {
        send(HttpMethod.PUT, callback, newMicrosoftTunnelServerLogCollectionResponse);
    }

    /**
     * Creates a MicrosoftTunnelServerLogCollectionResponse with a new object
     *
     * @param newMicrosoftTunnelServerLogCollectionResponse the object to create/update
     * @return the created MicrosoftTunnelServerLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MicrosoftTunnelServerLogCollectionResponse put(final MicrosoftTunnelServerLogCollectionResponse newMicrosoftTunnelServerLogCollectionResponse) throws ClientException {
        return send(HttpMethod.PUT, newMicrosoftTunnelServerLogCollectionResponse);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMicrosoftTunnelServerLogCollectionResponseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MicrosoftTunnelServerLogCollectionResponseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMicrosoftTunnelServerLogCollectionResponseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MicrosoftTunnelServerLogCollectionResponseRequest)this;
     }

}
