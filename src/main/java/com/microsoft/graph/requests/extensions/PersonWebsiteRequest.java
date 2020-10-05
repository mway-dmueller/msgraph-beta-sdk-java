// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PersonWebsite;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Website Request.
 */
public class PersonWebsiteRequest extends BaseRequest implements IPersonWebsiteRequest {
	
    /**
     * The request for the PersonWebsite
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonWebsiteRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonWebsite.class);
    }

    /**
     * Gets the PersonWebsite from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PersonWebsite> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PersonWebsite from the service
     *
     * @return the PersonWebsite from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonWebsite get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PersonWebsite> callback) {
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
     * Patches this PersonWebsite with a source
     *
     * @param sourcePersonWebsite the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PersonWebsite sourcePersonWebsite, final ICallback<? super PersonWebsite> callback) {
        send(HttpMethod.PATCH, callback, sourcePersonWebsite);
    }

    /**
     * Patches this PersonWebsite with a source
     *
     * @param sourcePersonWebsite the source object with updates
     * @return the updated PersonWebsite
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonWebsite patch(final PersonWebsite sourcePersonWebsite) throws ClientException {
        return send(HttpMethod.PATCH, sourcePersonWebsite);
    }

    /**
     * Creates a PersonWebsite with a new object
     *
     * @param newPersonWebsite the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PersonWebsite newPersonWebsite, final ICallback<? super PersonWebsite> callback) {
        send(HttpMethod.POST, callback, newPersonWebsite);
    }

    /**
     * Creates a PersonWebsite with a new object
     *
     * @param newPersonWebsite the new object to create
     * @return the created PersonWebsite
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonWebsite post(final PersonWebsite newPersonWebsite) throws ClientException {
        return send(HttpMethod.POST, newPersonWebsite);
    }

    /**
     * Creates a PersonWebsite with a new object
     *
     * @param newPersonWebsite the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PersonWebsite newPersonWebsite, final ICallback<? super PersonWebsite> callback) {
        send(HttpMethod.PUT, callback, newPersonWebsite);
    }

    /**
     * Creates a PersonWebsite with a new object
     *
     * @param newPersonWebsite the object to create/update
     * @return the created PersonWebsite
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PersonWebsite put(final PersonWebsite newPersonWebsite) throws ClientException {
        return send(HttpMethod.PUT, newPersonWebsite);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPersonWebsiteRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PersonWebsiteRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPersonWebsiteRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PersonWebsiteRequest)this;
     }

}

