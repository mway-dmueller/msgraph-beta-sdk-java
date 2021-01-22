// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceUserOverview;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance User Overview Request.
 */
public interface IDeviceComplianceUserOverviewRequest extends IHttpRequest {

    /**
     * Gets the DeviceComplianceUserOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceComplianceUserOverview> callback);

    /**
     * Gets the DeviceComplianceUserOverview from the service
     *
     * @return the DeviceComplianceUserOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceUserOverview get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceComplianceUserOverview> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceComplianceUserOverview with a source
     *
     * @param sourceDeviceComplianceUserOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceComplianceUserOverview sourceDeviceComplianceUserOverview, final ICallback<? super DeviceComplianceUserOverview> callback);

    /**
     * Patches this DeviceComplianceUserOverview with a source
     *
     * @param sourceDeviceComplianceUserOverview the source object with updates
     * @return the updated DeviceComplianceUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceUserOverview patch(final DeviceComplianceUserOverview sourceDeviceComplianceUserOverview) throws ClientException;

    /**
     * Posts a DeviceComplianceUserOverview with a new object
     *
     * @param newDeviceComplianceUserOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceComplianceUserOverview newDeviceComplianceUserOverview, final ICallback<? super DeviceComplianceUserOverview> callback);

    /**
     * Posts a DeviceComplianceUserOverview with a new object
     *
     * @param newDeviceComplianceUserOverview the new object to create
     * @return the created DeviceComplianceUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceUserOverview post(final DeviceComplianceUserOverview newDeviceComplianceUserOverview) throws ClientException;

    /**
     * Posts a DeviceComplianceUserOverview with a new object
     *
     * @param newDeviceComplianceUserOverview the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceComplianceUserOverview newDeviceComplianceUserOverview, final ICallback<? super DeviceComplianceUserOverview> callback);

    /**
     * Posts a DeviceComplianceUserOverview with a new object
     *
     * @param newDeviceComplianceUserOverview the object to create/update
     * @return the created DeviceComplianceUserOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceComplianceUserOverview put(final DeviceComplianceUserOverview newDeviceComplianceUserOverview) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceComplianceUserOverviewRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceComplianceUserOverviewRequest expand(final String value);

}
