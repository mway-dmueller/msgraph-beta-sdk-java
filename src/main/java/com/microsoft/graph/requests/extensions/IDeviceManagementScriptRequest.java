// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementScript;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Script Request.
 */
public interface IDeviceManagementScriptRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementScript from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementScript> callback);

    /**
     * Gets the DeviceManagementScript from the service
     *
     * @return the DeviceManagementScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScript get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementScript> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementScript with a source
     *
     * @param sourceDeviceManagementScript the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementScript sourceDeviceManagementScript, final ICallback<? super DeviceManagementScript> callback);

    /**
     * Patches this DeviceManagementScript with a source
     *
     * @param sourceDeviceManagementScript the source object with updates
     * @return the updated DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScript patch(final DeviceManagementScript sourceDeviceManagementScript) throws ClientException;

    /**
     * Posts a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementScript newDeviceManagementScript, final ICallback<? super DeviceManagementScript> callback);

    /**
     * Posts a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the new object to create
     * @return the created DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScript post(final DeviceManagementScript newDeviceManagementScript) throws ClientException;

    /**
     * Posts a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementScript newDeviceManagementScript, final ICallback<? super DeviceManagementScript> callback);

    /**
     * Posts a DeviceManagementScript with a new object
     *
     * @param newDeviceManagementScript the object to create/update
     * @return the created DeviceManagementScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScript put(final DeviceManagementScript newDeviceManagementScript) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementScriptRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementScriptRequest expand(final String value);

}
