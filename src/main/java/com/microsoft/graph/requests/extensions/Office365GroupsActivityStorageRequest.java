// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365GroupsActivityStorage;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Groups Activity Storage Request.
 */
public class Office365GroupsActivityStorageRequest extends BaseRequest implements IOffice365GroupsActivityStorageRequest {
	
    /**
     * The request for the Office365GroupsActivityStorage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Office365GroupsActivityStorageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Office365GroupsActivityStorage.class);
    }

    /**
     * Gets the Office365GroupsActivityStorage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Office365GroupsActivityStorage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Office365GroupsActivityStorage from the service
     *
     * @return the Office365GroupsActivityStorage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365GroupsActivityStorage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Office365GroupsActivityStorage> callback) {
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
     * Patches this Office365GroupsActivityStorage with a source
     *
     * @param sourceOffice365GroupsActivityStorage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Office365GroupsActivityStorage sourceOffice365GroupsActivityStorage, final ICallback<? super Office365GroupsActivityStorage> callback) {
        send(HttpMethod.PATCH, callback, sourceOffice365GroupsActivityStorage);
    }

    /**
     * Patches this Office365GroupsActivityStorage with a source
     *
     * @param sourceOffice365GroupsActivityStorage the source object with updates
     * @return the updated Office365GroupsActivityStorage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365GroupsActivityStorage patch(final Office365GroupsActivityStorage sourceOffice365GroupsActivityStorage) throws ClientException {
        return send(HttpMethod.PATCH, sourceOffice365GroupsActivityStorage);
    }

    /**
     * Creates a Office365GroupsActivityStorage with a new object
     *
     * @param newOffice365GroupsActivityStorage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Office365GroupsActivityStorage newOffice365GroupsActivityStorage, final ICallback<? super Office365GroupsActivityStorage> callback) {
        send(HttpMethod.POST, callback, newOffice365GroupsActivityStorage);
    }

    /**
     * Creates a Office365GroupsActivityStorage with a new object
     *
     * @param newOffice365GroupsActivityStorage the new object to create
     * @return the created Office365GroupsActivityStorage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365GroupsActivityStorage post(final Office365GroupsActivityStorage newOffice365GroupsActivityStorage) throws ClientException {
        return send(HttpMethod.POST, newOffice365GroupsActivityStorage);
    }

    /**
     * Creates a Office365GroupsActivityStorage with a new object
     *
     * @param newOffice365GroupsActivityStorage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Office365GroupsActivityStorage newOffice365GroupsActivityStorage, final ICallback<? super Office365GroupsActivityStorage> callback) {
        send(HttpMethod.PUT, callback, newOffice365GroupsActivityStorage);
    }

    /**
     * Creates a Office365GroupsActivityStorage with a new object
     *
     * @param newOffice365GroupsActivityStorage the object to create/update
     * @return the created Office365GroupsActivityStorage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365GroupsActivityStorage put(final Office365GroupsActivityStorage newOffice365GroupsActivityStorage) throws ClientException {
        return send(HttpMethod.PUT, newOffice365GroupsActivityStorage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOffice365GroupsActivityStorageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Office365GroupsActivityStorageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOffice365GroupsActivityStorageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Office365GroupsActivityStorageRequest)this;
     }

}

