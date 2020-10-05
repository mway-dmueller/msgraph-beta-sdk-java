// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsUserActivityUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams User Activity User Counts Request.
 */
public class TeamsUserActivityUserCountsRequest extends BaseRequest implements ITeamsUserActivityUserCountsRequest {
	
    /**
     * The request for the TeamsUserActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsUserActivityUserCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsUserActivityUserCounts.class);
    }

    /**
     * Gets the TeamsUserActivityUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TeamsUserActivityUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsUserActivityUserCounts from the service
     *
     * @return the TeamsUserActivityUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsUserActivityUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TeamsUserActivityUserCounts> callback) {
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
     * Patches this TeamsUserActivityUserCounts with a source
     *
     * @param sourceTeamsUserActivityUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TeamsUserActivityUserCounts sourceTeamsUserActivityUserCounts, final ICallback<? super TeamsUserActivityUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsUserActivityUserCounts);
    }

    /**
     * Patches this TeamsUserActivityUserCounts with a source
     *
     * @param sourceTeamsUserActivityUserCounts the source object with updates
     * @return the updated TeamsUserActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsUserActivityUserCounts patch(final TeamsUserActivityUserCounts sourceTeamsUserActivityUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsUserActivityUserCounts);
    }

    /**
     * Creates a TeamsUserActivityUserCounts with a new object
     *
     * @param newTeamsUserActivityUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TeamsUserActivityUserCounts newTeamsUserActivityUserCounts, final ICallback<? super TeamsUserActivityUserCounts> callback) {
        send(HttpMethod.POST, callback, newTeamsUserActivityUserCounts);
    }

    /**
     * Creates a TeamsUserActivityUserCounts with a new object
     *
     * @param newTeamsUserActivityUserCounts the new object to create
     * @return the created TeamsUserActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsUserActivityUserCounts post(final TeamsUserActivityUserCounts newTeamsUserActivityUserCounts) throws ClientException {
        return send(HttpMethod.POST, newTeamsUserActivityUserCounts);
    }

    /**
     * Creates a TeamsUserActivityUserCounts with a new object
     *
     * @param newTeamsUserActivityUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TeamsUserActivityUserCounts newTeamsUserActivityUserCounts, final ICallback<? super TeamsUserActivityUserCounts> callback) {
        send(HttpMethod.PUT, callback, newTeamsUserActivityUserCounts);
    }

    /**
     * Creates a TeamsUserActivityUserCounts with a new object
     *
     * @param newTeamsUserActivityUserCounts the object to create/update
     * @return the created TeamsUserActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsUserActivityUserCounts put(final TeamsUserActivityUserCounts newTeamsUserActivityUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newTeamsUserActivityUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITeamsUserActivityUserCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TeamsUserActivityUserCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITeamsUserActivityUserCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TeamsUserActivityUserCountsRequest)this;
     }

}

