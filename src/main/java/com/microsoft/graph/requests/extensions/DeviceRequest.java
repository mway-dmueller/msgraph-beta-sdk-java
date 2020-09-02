// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandRequestBuilder;
import com.microsoft.graph.requests.extensions.CommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CommandRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Request.
 */
public class DeviceRequest extends BaseRequest implements IDeviceRequest {
	
    /**
     * The request for the Device
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Device.class);
    }

    /**
     * Gets the Device from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Device> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Device from the service
     *
     * @return the Device from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Device get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Device> callback) {
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
     * Patches this Device with a source
     *
     * @param sourceDevice the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Device sourceDevice, final ICallback<Device> callback) {
        send(HttpMethod.PATCH, callback, sourceDevice);
    }

    /**
     * Patches this Device with a source
     *
     * @param sourceDevice the source object with updates
     * @return the updated Device
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Device patch(final Device sourceDevice) throws ClientException {
        return send(HttpMethod.PATCH, sourceDevice);
    }

    /**
     * Creates a Device with a new object
     *
     * @param newDevice the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Device newDevice, final ICallback<Device> callback) {
        send(HttpMethod.POST, callback, newDevice);
    }

    /**
     * Creates a Device with a new object
     *
     * @param newDevice the new object to create
     * @return the created Device
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Device post(final Device newDevice) throws ClientException {
        return send(HttpMethod.POST, newDevice);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceRequest)this;
     }

}
