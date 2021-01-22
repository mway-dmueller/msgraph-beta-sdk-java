// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementCollectionSettingDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Collection Setting Definition Request.
 */
public interface IDeviceManagementCollectionSettingDefinitionRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementCollectionSettingDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementCollectionSettingDefinition> callback);

    /**
     * Gets the DeviceManagementCollectionSettingDefinition from the service
     *
     * @return the DeviceManagementCollectionSettingDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementCollectionSettingDefinition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementCollectionSettingDefinition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementCollectionSettingDefinition with a source
     *
     * @param sourceDeviceManagementCollectionSettingDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementCollectionSettingDefinition sourceDeviceManagementCollectionSettingDefinition, final ICallback<? super DeviceManagementCollectionSettingDefinition> callback);

    /**
     * Patches this DeviceManagementCollectionSettingDefinition with a source
     *
     * @param sourceDeviceManagementCollectionSettingDefinition the source object with updates
     * @return the updated DeviceManagementCollectionSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementCollectionSettingDefinition patch(final DeviceManagementCollectionSettingDefinition sourceDeviceManagementCollectionSettingDefinition) throws ClientException;

    /**
     * Posts a DeviceManagementCollectionSettingDefinition with a new object
     *
     * @param newDeviceManagementCollectionSettingDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementCollectionSettingDefinition newDeviceManagementCollectionSettingDefinition, final ICallback<? super DeviceManagementCollectionSettingDefinition> callback);

    /**
     * Posts a DeviceManagementCollectionSettingDefinition with a new object
     *
     * @param newDeviceManagementCollectionSettingDefinition the new object to create
     * @return the created DeviceManagementCollectionSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementCollectionSettingDefinition post(final DeviceManagementCollectionSettingDefinition newDeviceManagementCollectionSettingDefinition) throws ClientException;

    /**
     * Posts a DeviceManagementCollectionSettingDefinition with a new object
     *
     * @param newDeviceManagementCollectionSettingDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementCollectionSettingDefinition newDeviceManagementCollectionSettingDefinition, final ICallback<? super DeviceManagementCollectionSettingDefinition> callback);

    /**
     * Posts a DeviceManagementCollectionSettingDefinition with a new object
     *
     * @param newDeviceManagementCollectionSettingDefinition the object to create/update
     * @return the created DeviceManagementCollectionSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementCollectionSettingDefinition put(final DeviceManagementCollectionSettingDefinition newDeviceManagementCollectionSettingDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementCollectionSettingDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementCollectionSettingDefinitionRequest expand(final String value);

}
