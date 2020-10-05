// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.VpnConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpn Configuration Request.
 */
public class VpnConfigurationRequest extends BaseRequest implements IVpnConfigurationRequest {
	
    /**
     * The request for the VpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public VpnConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends VpnConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the VpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VpnConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, VpnConfiguration.class);
    }

    /**
     * Gets the VpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super VpnConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the VpnConfiguration from the service
     *
     * @return the VpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public VpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super VpnConfiguration> callback) {
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
     * Patches this VpnConfiguration with a source
     *
     * @param sourceVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final VpnConfiguration sourceVpnConfiguration, final ICallback<? super VpnConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceVpnConfiguration);
    }

    /**
     * Patches this VpnConfiguration with a source
     *
     * @param sourceVpnConfiguration the source object with updates
     * @return the updated VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public VpnConfiguration patch(final VpnConfiguration sourceVpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceVpnConfiguration);
    }

    /**
     * Creates a VpnConfiguration with a new object
     *
     * @param newVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final VpnConfiguration newVpnConfiguration, final ICallback<? super VpnConfiguration> callback) {
        send(HttpMethod.POST, callback, newVpnConfiguration);
    }

    /**
     * Creates a VpnConfiguration with a new object
     *
     * @param newVpnConfiguration the new object to create
     * @return the created VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public VpnConfiguration post(final VpnConfiguration newVpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newVpnConfiguration);
    }

    /**
     * Creates a VpnConfiguration with a new object
     *
     * @param newVpnConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final VpnConfiguration newVpnConfiguration, final ICallback<? super VpnConfiguration> callback) {
        send(HttpMethod.PUT, callback, newVpnConfiguration);
    }

    /**
     * Creates a VpnConfiguration with a new object
     *
     * @param newVpnConfiguration the object to create/update
     * @return the created VpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public VpnConfiguration put(final VpnConfiguration newVpnConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newVpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IVpnConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (VpnConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IVpnConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (VpnConfigurationRequest)this;
     }

}

