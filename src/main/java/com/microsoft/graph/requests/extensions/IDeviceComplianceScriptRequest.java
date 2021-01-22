// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceScript;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Script Request.
 */
public interface IDeviceComplianceScriptRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceScript from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceComplianceScript> callback);

    /**
     * Gets the DeviceComplianceScript from the service
     *
     * @return the DeviceComplianceScript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScript get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceComplianceScript> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceScript with a source
     *
     * @param sourceDeviceComplianceScript the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceScript sourceDeviceComplianceScript, final ICallback<? super DeviceComplianceScript> callback);

    /**
     * Patches this DeviceComplianceScript with a source
     *
     * @param sourceDeviceComplianceScript the source object with updates
     * @return the updated DeviceComplianceScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScript patch(final DeviceComplianceScript sourceDeviceComplianceScript) throws ClientException;

    /**
     * Posts a DeviceComplianceScript with a new object
     *
     * @param newDeviceComplianceScript the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceScript newDeviceComplianceScript, final ICallback<? super DeviceComplianceScript> callback);

    /**
     * Posts a DeviceComplianceScript with a new object
     *
     * @param newDeviceComplianceScript the new object to create
     * @return the created DeviceComplianceScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScript post(final DeviceComplianceScript newDeviceComplianceScript) throws ClientException;

    /**
     * Posts a DeviceComplianceScript with a new object
     *
     * @param newDeviceComplianceScript the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceComplianceScript newDeviceComplianceScript, final ICallback<? super DeviceComplianceScript> callback);

    /**
     * Posts a DeviceComplianceScript with a new object
     *
     * @param newDeviceComplianceScript the object to create/update
     * @return the created DeviceComplianceScript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceScript put(final DeviceComplianceScript newDeviceComplianceScript) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceScriptRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceScriptRequest expand(final String value);

}
