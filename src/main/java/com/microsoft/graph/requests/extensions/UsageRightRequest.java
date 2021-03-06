// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UsageRight;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Usage Right Request.
 */
public class UsageRightRequest extends BaseRequest implements IUsageRightRequest {
	
    /**
     * The request for the UsageRight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UsageRightRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UsageRight.class);
    }

    /**
     * Gets the UsageRight from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UsageRight> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UsageRight from the service
     *
     * @return the UsageRight from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UsageRight get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UsageRight> callback) {
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
     * Patches this UsageRight with a source
     *
     * @param sourceUsageRight the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UsageRight sourceUsageRight, final ICallback<? super UsageRight> callback) {
        send(HttpMethod.PATCH, callback, sourceUsageRight);
    }

    /**
     * Patches this UsageRight with a source
     *
     * @param sourceUsageRight the source object with updates
     * @return the updated UsageRight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UsageRight patch(final UsageRight sourceUsageRight) throws ClientException {
        return send(HttpMethod.PATCH, sourceUsageRight);
    }

    /**
     * Creates a UsageRight with a new object
     *
     * @param newUsageRight the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UsageRight newUsageRight, final ICallback<? super UsageRight> callback) {
        send(HttpMethod.POST, callback, newUsageRight);
    }

    /**
     * Creates a UsageRight with a new object
     *
     * @param newUsageRight the new object to create
     * @return the created UsageRight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UsageRight post(final UsageRight newUsageRight) throws ClientException {
        return send(HttpMethod.POST, newUsageRight);
    }

    /**
     * Creates a UsageRight with a new object
     *
     * @param newUsageRight the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UsageRight newUsageRight, final ICallback<? super UsageRight> callback) {
        send(HttpMethod.PUT, callback, newUsageRight);
    }

    /**
     * Creates a UsageRight with a new object
     *
     * @param newUsageRight the object to create/update
     * @return the created UsageRight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UsageRight put(final UsageRight newUsageRight) throws ClientException {
        return send(HttpMethod.PUT, newUsageRight);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUsageRightRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UsageRightRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUsageRightRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UsageRightRequest)this;
     }

}

