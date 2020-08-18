// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IRoomRequest;
import com.microsoft.graph.requests.extensions.RoomRequest;
import com.microsoft.graph.models.extensions.Room;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Room Request.
 */
public class RoomRequest extends BaseRequest implements IRoomRequest {
	
    /**
     * The request for the Room
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoomRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Room.class);
    }

    /**
     * Gets the Room from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Room> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Room from the service
     *
     * @return the Room from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Room get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Room> callback) {
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
     * Patches this Room with a source
     *
     * @param sourceRoom the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Room sourceRoom, final ICallback<Room> callback) {
        send(HttpMethod.PATCH, callback, sourceRoom);
    }

    /**
     * Patches this Room with a source
     *
     * @param sourceRoom the source object with updates
     * @return the updated Room
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Room patch(final Room sourceRoom) throws ClientException {
        return send(HttpMethod.PATCH, sourceRoom);
    }

    /**
     * Creates a Room with a new object
     *
     * @param newRoom the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Room newRoom, final ICallback<Room> callback) {
        send(HttpMethod.POST, callback, newRoom);
    }

    /**
     * Creates a Room with a new object
     *
     * @param newRoom the new object to create
     * @return the created Room
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Room post(final Room newRoom) throws ClientException {
        return send(HttpMethod.POST, newRoom);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IRoomRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (RoomRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IRoomRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (RoomRequest)this;
     }

}

