// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceHealthScript;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Request.
 */
public interface IDeviceHealthScriptRequest extends IHttpRequest {

    /**
     * Gets the DeviceHealthScript from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceHealthScript> callback);

    /**
     * Gets the DeviceHealthScript from the service
     *
     * @return the DeviceHealthScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScript get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceHealthScript> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceHealthScript with a source
     *
     * @param sourceDeviceHealthScript the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceHealthScript sourceDeviceHealthScript, final ICallback<? super DeviceHealthScript> callback);

    /**
     * Patches this DeviceHealthScript with a source
     *
     * @param sourceDeviceHealthScript the source object with updates
     * @return the updated DeviceHealthScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScript patch(final DeviceHealthScript sourceDeviceHealthScript) throws ClientException;

    /**
     * Posts a DeviceHealthScript with a new object
     *
     * @param newDeviceHealthScript the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceHealthScript newDeviceHealthScript, final ICallback<? super DeviceHealthScript> callback);

    /**
     * Posts a DeviceHealthScript with a new object
     *
     * @param newDeviceHealthScript the new object to create
     * @return the created DeviceHealthScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScript post(final DeviceHealthScript newDeviceHealthScript) throws ClientException;

    /**
     * Posts a DeviceHealthScript with a new object
     *
     * @param newDeviceHealthScript the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceHealthScript newDeviceHealthScript, final ICallback<? super DeviceHealthScript> callback);

    /**
     * Posts a DeviceHealthScript with a new object
     *
     * @param newDeviceHealthScript the object to create/update
     * @return the created DeviceHealthScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScript put(final DeviceHealthScript newDeviceHealthScript) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceHealthScriptRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceHealthScriptRequest expand(final String value);

}
