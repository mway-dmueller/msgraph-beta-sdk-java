// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10EndpointProtectionConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Endpoint Protection Configuration Request.
 */
public class Windows10EndpointProtectionConfigurationRequest extends BaseRequest implements IWindows10EndpointProtectionConfigurationRequest {
	
    /**
     * The request for the Windows10EndpointProtectionConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10EndpointProtectionConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10EndpointProtectionConfiguration.class);
    }

    /**
     * Gets the Windows10EndpointProtectionConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows10EndpointProtectionConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10EndpointProtectionConfiguration from the service
     *
     * @return the Windows10EndpointProtectionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EndpointProtectionConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows10EndpointProtectionConfiguration> callback) {
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
     * Patches this Windows10EndpointProtectionConfiguration with a source
     *
     * @param sourceWindows10EndpointProtectionConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10EndpointProtectionConfiguration sourceWindows10EndpointProtectionConfiguration, final ICallback<Windows10EndpointProtectionConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10EndpointProtectionConfiguration);
    }

    /**
     * Patches this Windows10EndpointProtectionConfiguration with a source
     *
     * @param sourceWindows10EndpointProtectionConfiguration the source object with updates
     * @return the updated Windows10EndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EndpointProtectionConfiguration patch(final Windows10EndpointProtectionConfiguration sourceWindows10EndpointProtectionConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10EndpointProtectionConfiguration);
    }

    /**
     * Creates a Windows10EndpointProtectionConfiguration with a new object
     *
     * @param newWindows10EndpointProtectionConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10EndpointProtectionConfiguration newWindows10EndpointProtectionConfiguration, final ICallback<Windows10EndpointProtectionConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows10EndpointProtectionConfiguration);
    }

    /**
     * Creates a Windows10EndpointProtectionConfiguration with a new object
     *
     * @param newWindows10EndpointProtectionConfiguration the new object to create
     * @return the created Windows10EndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10EndpointProtectionConfiguration post(final Windows10EndpointProtectionConfiguration newWindows10EndpointProtectionConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10EndpointProtectionConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows10EndpointProtectionConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows10EndpointProtectionConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows10EndpointProtectionConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows10EndpointProtectionConfigurationRequest)this;
     }

}
