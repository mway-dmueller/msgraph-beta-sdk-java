// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookFilter;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Filter Request.
 */
public interface IWorkbookFilterRequest extends IHttpRequest {

    /**
     * Gets the WorkbookFilter from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookFilter> callback);

    /**
     * Gets the WorkbookFilter from the service
     *
     * @return the WorkbookFilter from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookFilter get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WorkbookFilter> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookFilter with a source
     *
     * @param sourceWorkbookFilter the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookFilter sourceWorkbookFilter, final ICallback<WorkbookFilter> callback);

    /**
     * Patches this WorkbookFilter with a source
     *
     * @param sourceWorkbookFilter the source object with updates
     * @return the updated WorkbookFilter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookFilter patch(final WorkbookFilter sourceWorkbookFilter) throws ClientException;

    /**
     * Posts a WorkbookFilter with a new object
     *
     * @param newWorkbookFilter the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookFilter newWorkbookFilter, final ICallback<WorkbookFilter> callback);

    /**
     * Posts a WorkbookFilter with a new object
     *
     * @param newWorkbookFilter the new object to create
     * @return the created WorkbookFilter
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookFilter post(final WorkbookFilter newWorkbookFilter) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookFilterRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookFilterRequest expand(final String value);

}

