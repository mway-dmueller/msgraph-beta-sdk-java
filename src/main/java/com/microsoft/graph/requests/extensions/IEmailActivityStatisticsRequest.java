// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EmailActivityStatistics;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Email Activity Statistics Request.
 */
public interface IEmailActivityStatisticsRequest extends IHttpRequest {

    /**
     * Gets the EmailActivityStatistics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EmailActivityStatistics> callback);

    /**
     * Gets the EmailActivityStatistics from the service
     *
     * @return the EmailActivityStatistics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailActivityStatistics get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EmailActivityStatistics> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EmailActivityStatistics with a source
     *
     * @param sourceEmailActivityStatistics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EmailActivityStatistics sourceEmailActivityStatistics, final ICallback<? super EmailActivityStatistics> callback);

    /**
     * Patches this EmailActivityStatistics with a source
     *
     * @param sourceEmailActivityStatistics the source object with updates
     * @return the updated EmailActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailActivityStatistics patch(final EmailActivityStatistics sourceEmailActivityStatistics) throws ClientException;

    /**
     * Posts a EmailActivityStatistics with a new object
     *
     * @param newEmailActivityStatistics the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EmailActivityStatistics newEmailActivityStatistics, final ICallback<? super EmailActivityStatistics> callback);

    /**
     * Posts a EmailActivityStatistics with a new object
     *
     * @param newEmailActivityStatistics the new object to create
     * @return the created EmailActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailActivityStatistics post(final EmailActivityStatistics newEmailActivityStatistics) throws ClientException;

    /**
     * Posts a EmailActivityStatistics with a new object
     *
     * @param newEmailActivityStatistics the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EmailActivityStatistics newEmailActivityStatistics, final ICallback<? super EmailActivityStatistics> callback);

    /**
     * Posts a EmailActivityStatistics with a new object
     *
     * @param newEmailActivityStatistics the object to create/update
     * @return the created EmailActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailActivityStatistics put(final EmailActivityStatistics newEmailActivityStatistics) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEmailActivityStatisticsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEmailActivityStatisticsRequest expand(final String value);

}

