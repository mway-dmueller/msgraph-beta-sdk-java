// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EmailAppUsageUserCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Email App Usage User Counts Request.
 */
public interface IEmailAppUsageUserCountsRequest extends IHttpRequest {

    /**
     * Gets the EmailAppUsageUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EmailAppUsageUserCounts> callback);

    /**
     * Gets the EmailAppUsageUserCounts from the service
     *
     * @return the EmailAppUsageUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAppUsageUserCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EmailAppUsageUserCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EmailAppUsageUserCounts with a source
     *
     * @param sourceEmailAppUsageUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EmailAppUsageUserCounts sourceEmailAppUsageUserCounts, final ICallback<? super EmailAppUsageUserCounts> callback);

    /**
     * Patches this EmailAppUsageUserCounts with a source
     *
     * @param sourceEmailAppUsageUserCounts the source object with updates
     * @return the updated EmailAppUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAppUsageUserCounts patch(final EmailAppUsageUserCounts sourceEmailAppUsageUserCounts) throws ClientException;

    /**
     * Posts a EmailAppUsageUserCounts with a new object
     *
     * @param newEmailAppUsageUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EmailAppUsageUserCounts newEmailAppUsageUserCounts, final ICallback<? super EmailAppUsageUserCounts> callback);

    /**
     * Posts a EmailAppUsageUserCounts with a new object
     *
     * @param newEmailAppUsageUserCounts the new object to create
     * @return the created EmailAppUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAppUsageUserCounts post(final EmailAppUsageUserCounts newEmailAppUsageUserCounts) throws ClientException;

    /**
     * Posts a EmailAppUsageUserCounts with a new object
     *
     * @param newEmailAppUsageUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EmailAppUsageUserCounts newEmailAppUsageUserCounts, final ICallback<? super EmailAppUsageUserCounts> callback);

    /**
     * Posts a EmailAppUsageUserCounts with a new object
     *
     * @param newEmailAppUsageUserCounts the object to create/update
     * @return the created EmailAppUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAppUsageUserCounts put(final EmailAppUsageUserCounts newEmailAppUsageUserCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEmailAppUsageUserCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEmailAppUsageUserCountsRequest expand(final String value);

}

