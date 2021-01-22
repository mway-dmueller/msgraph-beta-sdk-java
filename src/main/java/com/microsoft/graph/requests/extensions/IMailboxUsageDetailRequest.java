// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MailboxUsageDetail;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mailbox Usage Detail Request.
 */
public interface IMailboxUsageDetailRequest extends IHttpRequest {

    /**
     * Gets the MailboxUsageDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MailboxUsageDetail> callback);

    /**
     * Gets the MailboxUsageDetail from the service
     *
     * @return the MailboxUsageDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailboxUsageDetail get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MailboxUsageDetail> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MailboxUsageDetail with a source
     *
     * @param sourceMailboxUsageDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MailboxUsageDetail sourceMailboxUsageDetail, final ICallback<? super MailboxUsageDetail> callback);

    /**
     * Patches this MailboxUsageDetail with a source
     *
     * @param sourceMailboxUsageDetail the source object with updates
     * @return the updated MailboxUsageDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailboxUsageDetail patch(final MailboxUsageDetail sourceMailboxUsageDetail) throws ClientException;

    /**
     * Posts a MailboxUsageDetail with a new object
     *
     * @param newMailboxUsageDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MailboxUsageDetail newMailboxUsageDetail, final ICallback<? super MailboxUsageDetail> callback);

    /**
     * Posts a MailboxUsageDetail with a new object
     *
     * @param newMailboxUsageDetail the new object to create
     * @return the created MailboxUsageDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailboxUsageDetail post(final MailboxUsageDetail newMailboxUsageDetail) throws ClientException;

    /**
     * Posts a MailboxUsageDetail with a new object
     *
     * @param newMailboxUsageDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MailboxUsageDetail newMailboxUsageDetail, final ICallback<? super MailboxUsageDetail> callback);

    /**
     * Posts a MailboxUsageDetail with a new object
     *
     * @param newMailboxUsageDetail the object to create/update
     * @return the created MailboxUsageDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MailboxUsageDetail put(final MailboxUsageDetail newMailboxUsageDetail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMailboxUsageDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMailboxUsageDetailRequest expand(final String value);

}
