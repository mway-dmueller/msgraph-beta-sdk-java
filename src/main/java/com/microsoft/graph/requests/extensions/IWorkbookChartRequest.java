// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChart;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Request.
 */
public interface IWorkbookChartRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChart from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookChart> callback);

    /**
     * Gets the WorkbookChart from the service
     *
     * @return the WorkbookChart from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChart get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookChart> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChart with a source
     *
     * @param sourceWorkbookChart the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChart sourceWorkbookChart, final ICallback<? super WorkbookChart> callback);

    /**
     * Patches this WorkbookChart with a source
     *
     * @param sourceWorkbookChart the source object with updates
     * @return the updated WorkbookChart
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChart patch(final WorkbookChart sourceWorkbookChart) throws ClientException;

    /**
     * Posts a WorkbookChart with a new object
     *
     * @param newWorkbookChart the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChart newWorkbookChart, final ICallback<? super WorkbookChart> callback);

    /**
     * Posts a WorkbookChart with a new object
     *
     * @param newWorkbookChart the new object to create
     * @return the created WorkbookChart
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChart post(final WorkbookChart newWorkbookChart) throws ClientException;

    /**
     * Posts a WorkbookChart with a new object
     *
     * @param newWorkbookChart the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookChart newWorkbookChart, final ICallback<? super WorkbookChart> callback);

    /**
     * Posts a WorkbookChart with a new object
     *
     * @param newWorkbookChart the object to create/update
     * @return the created WorkbookChart
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChart put(final WorkbookChart newWorkbookChart) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartRequest expand(final String value);

}

