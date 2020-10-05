// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementReportSchedule;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Report Schedule Request.
 */
public interface IDeviceManagementReportScheduleRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementReportSchedule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementReportSchedule> callback);

    /**
     * Gets the DeviceManagementReportSchedule from the service
     *
     * @return the DeviceManagementReportSchedule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementReportSchedule get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementReportSchedule> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementReportSchedule with a source
     *
     * @param sourceDeviceManagementReportSchedule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementReportSchedule sourceDeviceManagementReportSchedule, final ICallback<? super DeviceManagementReportSchedule> callback);

    /**
     * Patches this DeviceManagementReportSchedule with a source
     *
     * @param sourceDeviceManagementReportSchedule the source object with updates
     * @return the updated DeviceManagementReportSchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementReportSchedule patch(final DeviceManagementReportSchedule sourceDeviceManagementReportSchedule) throws ClientException;

    /**
     * Posts a DeviceManagementReportSchedule with a new object
     *
     * @param newDeviceManagementReportSchedule the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementReportSchedule newDeviceManagementReportSchedule, final ICallback<? super DeviceManagementReportSchedule> callback);

    /**
     * Posts a DeviceManagementReportSchedule with a new object
     *
     * @param newDeviceManagementReportSchedule the new object to create
     * @return the created DeviceManagementReportSchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementReportSchedule post(final DeviceManagementReportSchedule newDeviceManagementReportSchedule) throws ClientException;

    /**
     * Posts a DeviceManagementReportSchedule with a new object
     *
     * @param newDeviceManagementReportSchedule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementReportSchedule newDeviceManagementReportSchedule, final ICallback<? super DeviceManagementReportSchedule> callback);

    /**
     * Posts a DeviceManagementReportSchedule with a new object
     *
     * @param newDeviceManagementReportSchedule the object to create/update
     * @return the created DeviceManagementReportSchedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementReportSchedule put(final DeviceManagementReportSchedule newDeviceManagementReportSchedule) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementReportScheduleRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementReportScheduleRequest expand(final String value);

}

