// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIosUpdateConfigurationRequest;
import com.microsoft.graph.requests.extensions.IosUpdateConfigurationRequest;
import com.microsoft.graph.models.extensions.IosUpdateConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Update Configuration Request.
 */
public class IosUpdateConfigurationRequest extends BaseRequest implements IIosUpdateConfigurationRequest {
	
    /**
     * The request for the IosUpdateConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosUpdateConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosUpdateConfiguration.class);
    }

    /**
     * Gets the IosUpdateConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosUpdateConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosUpdateConfiguration from the service
     *
     * @return the IosUpdateConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosUpdateConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosUpdateConfiguration> callback) {
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
     * Patches this IosUpdateConfiguration with a source
     *
     * @param sourceIosUpdateConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosUpdateConfiguration sourceIosUpdateConfiguration, final ICallback<IosUpdateConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceIosUpdateConfiguration);
    }

    /**
     * Patches this IosUpdateConfiguration with a source
     *
     * @param sourceIosUpdateConfiguration the source object with updates
     * @return the updated IosUpdateConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosUpdateConfiguration patch(final IosUpdateConfiguration sourceIosUpdateConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosUpdateConfiguration);
    }

    /**
     * Creates a IosUpdateConfiguration with a new object
     *
     * @param newIosUpdateConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosUpdateConfiguration newIosUpdateConfiguration, final ICallback<IosUpdateConfiguration> callback) {
        send(HttpMethod.POST, callback, newIosUpdateConfiguration);
    }

    /**
     * Creates a IosUpdateConfiguration with a new object
     *
     * @param newIosUpdateConfiguration the new object to create
     * @return the created IosUpdateConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosUpdateConfiguration post(final IosUpdateConfiguration newIosUpdateConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosUpdateConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosUpdateConfigurationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (IosUpdateConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosUpdateConfigurationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (IosUpdateConfigurationRequest)this;
     }

}

