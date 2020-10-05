// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkWiFiConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Wi Fi Configuration Request.
 */
public class AndroidForWorkWiFiConfigurationRequest extends BaseRequest implements IAndroidForWorkWiFiConfigurationRequest {
	
    /**
     * The request for the AndroidForWorkWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AndroidForWorkWiFiConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends AndroidForWorkWiFiConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AndroidForWorkWiFiConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkWiFiConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkWiFiConfiguration.class);
    }

    /**
     * Gets the AndroidForWorkWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidForWorkWiFiConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkWiFiConfiguration from the service
     *
     * @return the AndroidForWorkWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkWiFiConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidForWorkWiFiConfiguration> callback) {
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
     * Patches this AndroidForWorkWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkWiFiConfiguration sourceAndroidForWorkWiFiConfiguration, final ICallback<? super AndroidForWorkWiFiConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkWiFiConfiguration);
    }

    /**
     * Patches this AndroidForWorkWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkWiFiConfiguration the source object with updates
     * @return the updated AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkWiFiConfiguration patch(final AndroidForWorkWiFiConfiguration sourceAndroidForWorkWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration, final ICallback<? super AndroidForWorkWiFiConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the new object to create
     * @return the created AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkWiFiConfiguration post(final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration, final ICallback<? super AndroidForWorkWiFiConfiguration> callback) {
        send(HttpMethod.PUT, callback, newAndroidForWorkWiFiConfiguration);
    }

    /**
     * Creates a AndroidForWorkWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkWiFiConfiguration the object to create/update
     * @return the created AndroidForWorkWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkWiFiConfiguration put(final AndroidForWorkWiFiConfiguration newAndroidForWorkWiFiConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkWiFiConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkWiFiConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkWiFiConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkWiFiConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkWiFiConfigurationRequest)this;
     }

}

