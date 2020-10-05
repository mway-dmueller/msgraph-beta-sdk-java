// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceCertificateState;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Certificate State Request.
 */
public class ManagedDeviceCertificateStateRequest extends BaseRequest implements IManagedDeviceCertificateStateRequest {
	
    /**
     * The request for the ManagedDeviceCertificateState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceCertificateStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceCertificateState.class);
    }

    /**
     * Gets the ManagedDeviceCertificateState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedDeviceCertificateState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceCertificateState from the service
     *
     * @return the ManagedDeviceCertificateState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceCertificateState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedDeviceCertificateState> callback) {
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
     * Patches this ManagedDeviceCertificateState with a source
     *
     * @param sourceManagedDeviceCertificateState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedDeviceCertificateState sourceManagedDeviceCertificateState, final ICallback<? super ManagedDeviceCertificateState> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceCertificateState);
    }

    /**
     * Patches this ManagedDeviceCertificateState with a source
     *
     * @param sourceManagedDeviceCertificateState the source object with updates
     * @return the updated ManagedDeviceCertificateState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceCertificateState patch(final ManagedDeviceCertificateState sourceManagedDeviceCertificateState) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceCertificateState);
    }

    /**
     * Creates a ManagedDeviceCertificateState with a new object
     *
     * @param newManagedDeviceCertificateState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedDeviceCertificateState newManagedDeviceCertificateState, final ICallback<? super ManagedDeviceCertificateState> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceCertificateState);
    }

    /**
     * Creates a ManagedDeviceCertificateState with a new object
     *
     * @param newManagedDeviceCertificateState the new object to create
     * @return the created ManagedDeviceCertificateState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceCertificateState post(final ManagedDeviceCertificateState newManagedDeviceCertificateState) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceCertificateState);
    }

    /**
     * Creates a ManagedDeviceCertificateState with a new object
     *
     * @param newManagedDeviceCertificateState the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedDeviceCertificateState newManagedDeviceCertificateState, final ICallback<? super ManagedDeviceCertificateState> callback) {
        send(HttpMethod.PUT, callback, newManagedDeviceCertificateState);
    }

    /**
     * Creates a ManagedDeviceCertificateState with a new object
     *
     * @param newManagedDeviceCertificateState the object to create/update
     * @return the created ManagedDeviceCertificateState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceCertificateState put(final ManagedDeviceCertificateState newManagedDeviceCertificateState) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceCertificateState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedDeviceCertificateStateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedDeviceCertificateStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedDeviceCertificateStateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedDeviceCertificateStateRequest)this;
     }

}

