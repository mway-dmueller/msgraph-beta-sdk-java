// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.IWorkbookChartItemRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Item Request.
 */
public interface IWorkbookChartItemRequest {

    /**
     * Patches the WorkbookChartItem
     *
     * @param srcWorkbookChart the WorkbookChart with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(WorkbookChart srcWorkbookChart, final ICallback<WorkbookChart> callback);

    /**
     * Patches the WorkbookChartItem
     *
     * @param srcWorkbookChart the WorkbookChart with which to PATCH
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChart patch(WorkbookChart srcWorkbookChart) throws ClientException;

    /**
     * Puts the WorkbookChartItem
     *
     * @param srcWorkbookChart the WorkbookChart to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookChart srcWorkbookChart, final ICallback<WorkbookChart> callback);

    /**
     * Puts the WorkbookChartItem
     *
     * @param srcWorkbookChart the WorkbookChart to PUT
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     WorkbookChart put(WorkbookChart srcWorkbookChart) throws ClientException;
    /**
     * Gets the WorkbookChart
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookChart> callback);

    /**
     * Gets the WorkbookChart
     *
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookChart get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartItemRequest expand(final String value);

}
