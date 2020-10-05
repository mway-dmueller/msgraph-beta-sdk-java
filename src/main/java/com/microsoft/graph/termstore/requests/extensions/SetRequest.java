// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Set;
import com.microsoft.graph.termstore.requests.extensions.ITermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ITermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.RelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.RelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.GroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Set Request.
 */
public class SetRequest extends BaseRequest implements ISetRequest {
	
    /**
     * The request for the Set
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SetRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Set.class);
    }

    /**
     * Gets the Set from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Set> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Set from the service
     *
     * @return the Set from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Set get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Set> callback) {
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
     * Patches this Set with a source
     *
     * @param sourceSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Set sourceSet, final ICallback<? super Set> callback) {
        send(HttpMethod.PATCH, callback, sourceSet);
    }

    /**
     * Patches this Set with a source
     *
     * @param sourceSet the source object with updates
     * @return the updated Set
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Set patch(final Set sourceSet) throws ClientException {
        return send(HttpMethod.PATCH, sourceSet);
    }

    /**
     * Creates a Set with a new object
     *
     * @param newSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Set newSet, final ICallback<? super Set> callback) {
        send(HttpMethod.POST, callback, newSet);
    }

    /**
     * Creates a Set with a new object
     *
     * @param newSet the new object to create
     * @return the created Set
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Set post(final Set newSet) throws ClientException {
        return send(HttpMethod.POST, newSet);
    }

    /**
     * Creates a Set with a new object
     *
     * @param newSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Set newSet, final ICallback<? super Set> callback) {
        send(HttpMethod.PUT, callback, newSet);
    }

    /**
     * Creates a Set with a new object
     *
     * @param newSet the object to create/update
     * @return the created Set
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Set put(final Set newSet) throws ClientException {
        return send(HttpMethod.PUT, newSet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISetRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SetRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISetRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SetRequest)this;
     }

}

