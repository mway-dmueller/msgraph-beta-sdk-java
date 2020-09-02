// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationPolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Policy Set Item Request.
 */
public class DeviceConfigurationPolicySetItemRequest extends BaseRequest implements IDeviceConfigurationPolicySetItemRequest {
	
    /**
     * The request for the DeviceConfigurationPolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationPolicySetItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationPolicySetItem.class);
    }

    /**
     * Gets the DeviceConfigurationPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceConfigurationPolicySetItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationPolicySetItem from the service
     *
     * @return the DeviceConfigurationPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationPolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceConfigurationPolicySetItem> callback) {
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
     * Patches this DeviceConfigurationPolicySetItem with a source
     *
     * @param sourceDeviceConfigurationPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceConfigurationPolicySetItem sourceDeviceConfigurationPolicySetItem, final ICallback<DeviceConfigurationPolicySetItem> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationPolicySetItem);
    }

    /**
     * Patches this DeviceConfigurationPolicySetItem with a source
     *
     * @param sourceDeviceConfigurationPolicySetItem the source object with updates
     * @return the updated DeviceConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationPolicySetItem patch(final DeviceConfigurationPolicySetItem sourceDeviceConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationPolicySetItem);
    }

    /**
     * Creates a DeviceConfigurationPolicySetItem with a new object
     *
     * @param newDeviceConfigurationPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceConfigurationPolicySetItem newDeviceConfigurationPolicySetItem, final ICallback<DeviceConfigurationPolicySetItem> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationPolicySetItem);
    }

    /**
     * Creates a DeviceConfigurationPolicySetItem with a new object
     *
     * @param newDeviceConfigurationPolicySetItem the new object to create
     * @return the created DeviceConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationPolicySetItem post(final DeviceConfigurationPolicySetItem newDeviceConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceConfigurationPolicySetItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceConfigurationPolicySetItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceConfigurationPolicySetItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceConfigurationPolicySetItemRequest)this;
     }

}
