// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MuteParticipantsOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mute Participants Operation Request.
 */
public class MuteParticipantsOperationRequest extends BaseRequest implements IMuteParticipantsOperationRequest {
	
    /**
     * The request for the MuteParticipantsOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MuteParticipantsOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MuteParticipantsOperation.class);
    }

    /**
     * Gets the MuteParticipantsOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MuteParticipantsOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MuteParticipantsOperation from the service
     *
     * @return the MuteParticipantsOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MuteParticipantsOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MuteParticipantsOperation> callback) {
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
     * Patches this MuteParticipantsOperation with a source
     *
     * @param sourceMuteParticipantsOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MuteParticipantsOperation sourceMuteParticipantsOperation, final ICallback<? super MuteParticipantsOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceMuteParticipantsOperation);
    }

    /**
     * Patches this MuteParticipantsOperation with a source
     *
     * @param sourceMuteParticipantsOperation the source object with updates
     * @return the updated MuteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MuteParticipantsOperation patch(final MuteParticipantsOperation sourceMuteParticipantsOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceMuteParticipantsOperation);
    }

    /**
     * Creates a MuteParticipantsOperation with a new object
     *
     * @param newMuteParticipantsOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MuteParticipantsOperation newMuteParticipantsOperation, final ICallback<? super MuteParticipantsOperation> callback) {
        send(HttpMethod.POST, callback, newMuteParticipantsOperation);
    }

    /**
     * Creates a MuteParticipantsOperation with a new object
     *
     * @param newMuteParticipantsOperation the new object to create
     * @return the created MuteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MuteParticipantsOperation post(final MuteParticipantsOperation newMuteParticipantsOperation) throws ClientException {
        return send(HttpMethod.POST, newMuteParticipantsOperation);
    }

    /**
     * Creates a MuteParticipantsOperation with a new object
     *
     * @param newMuteParticipantsOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MuteParticipantsOperation newMuteParticipantsOperation, final ICallback<? super MuteParticipantsOperation> callback) {
        send(HttpMethod.PUT, callback, newMuteParticipantsOperation);
    }

    /**
     * Creates a MuteParticipantsOperation with a new object
     *
     * @param newMuteParticipantsOperation the object to create/update
     * @return the created MuteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MuteParticipantsOperation put(final MuteParticipantsOperation newMuteParticipantsOperation) throws ClientException {
        return send(HttpMethod.PUT, newMuteParticipantsOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMuteParticipantsOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MuteParticipantsOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMuteParticipantsOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MuteParticipantsOperationRequest)this;
     }

}

