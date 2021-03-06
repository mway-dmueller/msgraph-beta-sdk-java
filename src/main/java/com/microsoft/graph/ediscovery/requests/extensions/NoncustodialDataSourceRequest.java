// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.NoncustodialDataSource;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Noncustodial Data Source Request.
 */
public class NoncustodialDataSourceRequest extends BaseRequest implements INoncustodialDataSourceRequest {
	
    /**
     * The request for the NoncustodialDataSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NoncustodialDataSourceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NoncustodialDataSource.class);
    }

    /**
     * Gets the NoncustodialDataSource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super NoncustodialDataSource> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the NoncustodialDataSource from the service
     *
     * @return the NoncustodialDataSource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NoncustodialDataSource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super NoncustodialDataSource> callback) {
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
     * Patches this NoncustodialDataSource with a source
     *
     * @param sourceNoncustodialDataSource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final NoncustodialDataSource sourceNoncustodialDataSource, final ICallback<? super NoncustodialDataSource> callback) {
        send(HttpMethod.PATCH, callback, sourceNoncustodialDataSource);
    }

    /**
     * Patches this NoncustodialDataSource with a source
     *
     * @param sourceNoncustodialDataSource the source object with updates
     * @return the updated NoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NoncustodialDataSource patch(final NoncustodialDataSource sourceNoncustodialDataSource) throws ClientException {
        return send(HttpMethod.PATCH, sourceNoncustodialDataSource);
    }

    /**
     * Creates a NoncustodialDataSource with a new object
     *
     * @param newNoncustodialDataSource the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final NoncustodialDataSource newNoncustodialDataSource, final ICallback<? super NoncustodialDataSource> callback) {
        send(HttpMethod.POST, callback, newNoncustodialDataSource);
    }

    /**
     * Creates a NoncustodialDataSource with a new object
     *
     * @param newNoncustodialDataSource the new object to create
     * @return the created NoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NoncustodialDataSource post(final NoncustodialDataSource newNoncustodialDataSource) throws ClientException {
        return send(HttpMethod.POST, newNoncustodialDataSource);
    }

    /**
     * Creates a NoncustodialDataSource with a new object
     *
     * @param newNoncustodialDataSource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final NoncustodialDataSource newNoncustodialDataSource, final ICallback<? super NoncustodialDataSource> callback) {
        send(HttpMethod.PUT, callback, newNoncustodialDataSource);
    }

    /**
     * Creates a NoncustodialDataSource with a new object
     *
     * @param newNoncustodialDataSource the object to create/update
     * @return the created NoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NoncustodialDataSource put(final NoncustodialDataSource newNoncustodialDataSource) throws ClientException {
        return send(HttpMethod.PUT, newNoncustodialDataSource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public INoncustodialDataSourceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (NoncustodialDataSourceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public INoncustodialDataSourceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (NoncustodialDataSourceRequest)this;
     }

}

