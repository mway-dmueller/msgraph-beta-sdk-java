// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartDataLabels;
import com.microsoft.graph.requests.extensions.IWorkbookChartDataLabelFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartDataLabelFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Data Labels Request.
 */
public class WorkbookChartDataLabelsRequest extends BaseRequest implements IWorkbookChartDataLabelsRequest {
	
    /**
     * The request for the WorkbookChartDataLabels
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartDataLabelsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartDataLabels.class);
    }

    /**
     * Gets the WorkbookChartDataLabels from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartDataLabels> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartDataLabels from the service
     *
     * @return the WorkbookChartDataLabels from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartDataLabels get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartDataLabels> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartDataLabels with a source
     *
     * @param sourceWorkbookChartDataLabels the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartDataLabels sourceWorkbookChartDataLabels, final ICallback<? super WorkbookChartDataLabels> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartDataLabels);
    }

    /**
     * Patches this WorkbookChartDataLabels with a source
     *
     * @param sourceWorkbookChartDataLabels the source object with updates
     * @return the updated WorkbookChartDataLabels
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartDataLabels patch(final WorkbookChartDataLabels sourceWorkbookChartDataLabels) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartDataLabels);
    }

    /**
     * Creates a WorkbookChartDataLabels with a new object
     *
     * @param newWorkbookChartDataLabels the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartDataLabels newWorkbookChartDataLabels, final ICallback<? super WorkbookChartDataLabels> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartDataLabels);
    }

    /**
     * Creates a WorkbookChartDataLabels with a new object
     *
     * @param newWorkbookChartDataLabels the new object to create
     * @return the created WorkbookChartDataLabels
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartDataLabels post(final WorkbookChartDataLabels newWorkbookChartDataLabels) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartDataLabels);
    }

    /**
     * Creates a WorkbookChartDataLabels with a new object
     *
     * @param newWorkbookChartDataLabels the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartDataLabels newWorkbookChartDataLabels, final ICallback<? super WorkbookChartDataLabels> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartDataLabels);
    }

    /**
     * Creates a WorkbookChartDataLabels with a new object
     *
     * @param newWorkbookChartDataLabels the object to create/update
     * @return the created WorkbookChartDataLabels
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartDataLabels put(final WorkbookChartDataLabels newWorkbookChartDataLabels) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartDataLabels);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartDataLabelsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartDataLabelsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartDataLabelsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartDataLabelsRequest)this;
     }

}

