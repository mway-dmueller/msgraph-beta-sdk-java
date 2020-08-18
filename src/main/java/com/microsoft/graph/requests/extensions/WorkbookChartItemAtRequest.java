// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.IWorkbookChartItemAtRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartItemAtRequest;

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
 * The class for the Workbook Chart Item At Request.
 */
public class WorkbookChartItemAtRequest extends BaseRequest implements IWorkbookChartItemAtRequest {

    /**
     * The request for this WorkbookChartItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChart.class);
    }

    /**
     * Patches the WorkbookChartItemAt
     * @param srcWorkbookChart the WorkbookChart with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(WorkbookChart srcWorkbookChart, final ICallback<WorkbookChart> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookChart);
    }

    /**
     * Patches the WorkbookChartItemAt
     *
     * @param srcWorkbookChart the WorkbookChart with which to PATCH
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookChart patch(WorkbookChart srcWorkbookChart) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookChart);
    }

    /**
     * Puts the WorkbookChartItemAt
     *
     * @param srcWorkbookChart the WorkbookChart to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookChart srcWorkbookChart, final ICallback<WorkbookChart> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookChart);
    }

    /**
     * Puts the WorkbookChartItemAt
     *
     * @param srcWorkbookChart the WorkbookChart to PUT
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookChart put(WorkbookChart srcWorkbookChart) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookChart);
    }
    /**
     * Gets the WorkbookChart
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookChart> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChart
     *
     * @return the WorkbookChart
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookChart get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookChartItemAtRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookChartItemAtRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookChartItemAtRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookChartItemAtRequest)this;
    }

}
