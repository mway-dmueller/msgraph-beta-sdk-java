// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationPolicySetItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration Policy Set Item Request.
 */
public interface IDeviceConfigurationPolicySetItemRequest extends IHttpRequest {

    /**
     * Gets the DeviceConfigurationPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceConfigurationPolicySetItem> callback);

    /**
     * Gets the DeviceConfigurationPolicySetItem from the service
     *
     * @return the DeviceConfigurationPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationPolicySetItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceConfigurationPolicySetItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceConfigurationPolicySetItem with a source
     *
     * @param sourceDeviceConfigurationPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceConfigurationPolicySetItem sourceDeviceConfigurationPolicySetItem, final ICallback<? super DeviceConfigurationPolicySetItem> callback);

    /**
     * Patches this DeviceConfigurationPolicySetItem with a source
     *
     * @param sourceDeviceConfigurationPolicySetItem the source object with updates
     * @return the updated DeviceConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationPolicySetItem patch(final DeviceConfigurationPolicySetItem sourceDeviceConfigurationPolicySetItem) throws ClientException;

    /**
     * Posts a DeviceConfigurationPolicySetItem with a new object
     *
     * @param newDeviceConfigurationPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceConfigurationPolicySetItem newDeviceConfigurationPolicySetItem, final ICallback<? super DeviceConfigurationPolicySetItem> callback);

    /**
     * Posts a DeviceConfigurationPolicySetItem with a new object
     *
     * @param newDeviceConfigurationPolicySetItem the new object to create
     * @return the created DeviceConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationPolicySetItem post(final DeviceConfigurationPolicySetItem newDeviceConfigurationPolicySetItem) throws ClientException;

    /**
     * Posts a DeviceConfigurationPolicySetItem with a new object
     *
     * @param newDeviceConfigurationPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceConfigurationPolicySetItem newDeviceConfigurationPolicySetItem, final ICallback<? super DeviceConfigurationPolicySetItem> callback);

    /**
     * Posts a DeviceConfigurationPolicySetItem with a new object
     *
     * @param newDeviceConfigurationPolicySetItem the object to create/update
     * @return the created DeviceConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceConfigurationPolicySetItem put(final DeviceConfigurationPolicySetItem newDeviceConfigurationPolicySetItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceConfigurationPolicySetItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceConfigurationPolicySetItemRequest expand(final String value);

}
