// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookOperation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Operation Request.
 */
public interface IWorkbookOperationRequest extends IHttpRequest {

    /**
     * Gets the WorkbookOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookOperation> callback);

    /**
     * Gets the WorkbookOperation from the service
     *
     * @return the WorkbookOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookOperation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookOperation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookOperation with a source
     *
     * @param sourceWorkbookOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookOperation sourceWorkbookOperation, final ICallback<? super WorkbookOperation> callback);

    /**
     * Patches this WorkbookOperation with a source
     *
     * @param sourceWorkbookOperation the source object with updates
     * @return the updated WorkbookOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookOperation patch(final WorkbookOperation sourceWorkbookOperation) throws ClientException;

    /**
     * Posts a WorkbookOperation with a new object
     *
     * @param newWorkbookOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookOperation newWorkbookOperation, final ICallback<? super WorkbookOperation> callback);

    /**
     * Posts a WorkbookOperation with a new object
     *
     * @param newWorkbookOperation the new object to create
     * @return the created WorkbookOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookOperation post(final WorkbookOperation newWorkbookOperation) throws ClientException;

    /**
     * Posts a WorkbookOperation with a new object
     *
     * @param newWorkbookOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookOperation newWorkbookOperation, final ICallback<? super WorkbookOperation> callback);

    /**
     * Posts a WorkbookOperation with a new object
     *
     * @param newWorkbookOperation the object to create/update
     * @return the created WorkbookOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookOperation put(final WorkbookOperation newWorkbookOperation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookOperationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookOperationRequest expand(final String value);

}

