// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows81WifiImportConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Wifi Import Configuration Request.
 */
public class Windows81WifiImportConfigurationRequest extends BaseRequest implements IWindows81WifiImportConfigurationRequest {
	
    /**
     * The request for the Windows81WifiImportConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81WifiImportConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81WifiImportConfiguration.class);
    }

    /**
     * Gets the Windows81WifiImportConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows81WifiImportConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows81WifiImportConfiguration from the service
     *
     * @return the Windows81WifiImportConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81WifiImportConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows81WifiImportConfiguration> callback) {
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
     * Patches this Windows81WifiImportConfiguration with a source
     *
     * @param sourceWindows81WifiImportConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows81WifiImportConfiguration sourceWindows81WifiImportConfiguration, final ICallback<Windows81WifiImportConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows81WifiImportConfiguration);
    }

    /**
     * Patches this Windows81WifiImportConfiguration with a source
     *
     * @param sourceWindows81WifiImportConfiguration the source object with updates
     * @return the updated Windows81WifiImportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81WifiImportConfiguration patch(final Windows81WifiImportConfiguration sourceWindows81WifiImportConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows81WifiImportConfiguration);
    }

    /**
     * Creates a Windows81WifiImportConfiguration with a new object
     *
     * @param newWindows81WifiImportConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows81WifiImportConfiguration newWindows81WifiImportConfiguration, final ICallback<Windows81WifiImportConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows81WifiImportConfiguration);
    }

    /**
     * Creates a Windows81WifiImportConfiguration with a new object
     *
     * @param newWindows81WifiImportConfiguration the new object to create
     * @return the created Windows81WifiImportConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81WifiImportConfiguration post(final Windows81WifiImportConfiguration newWindows81WifiImportConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows81WifiImportConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows81WifiImportConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows81WifiImportConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows81WifiImportConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows81WifiImportConfigurationRequest)this;
     }

}
