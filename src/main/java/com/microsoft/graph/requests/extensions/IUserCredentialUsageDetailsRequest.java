// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserCredentialUsageDetails;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Credential Usage Details Request.
 */
public interface IUserCredentialUsageDetailsRequest extends IHttpRequest {

    /**
     * Gets the UserCredentialUsageDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserCredentialUsageDetails> callback);

    /**
     * Gets the UserCredentialUsageDetails from the service
     *
     * @return the UserCredentialUsageDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserCredentialUsageDetails get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserCredentialUsageDetails> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserCredentialUsageDetails with a source
     *
     * @param sourceUserCredentialUsageDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserCredentialUsageDetails sourceUserCredentialUsageDetails, final ICallback<? super UserCredentialUsageDetails> callback);

    /**
     * Patches this UserCredentialUsageDetails with a source
     *
     * @param sourceUserCredentialUsageDetails the source object with updates
     * @return the updated UserCredentialUsageDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserCredentialUsageDetails patch(final UserCredentialUsageDetails sourceUserCredentialUsageDetails) throws ClientException;

    /**
     * Posts a UserCredentialUsageDetails with a new object
     *
     * @param newUserCredentialUsageDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserCredentialUsageDetails newUserCredentialUsageDetails, final ICallback<? super UserCredentialUsageDetails> callback);

    /**
     * Posts a UserCredentialUsageDetails with a new object
     *
     * @param newUserCredentialUsageDetails the new object to create
     * @return the created UserCredentialUsageDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserCredentialUsageDetails post(final UserCredentialUsageDetails newUserCredentialUsageDetails) throws ClientException;

    /**
     * Posts a UserCredentialUsageDetails with a new object
     *
     * @param newUserCredentialUsageDetails the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserCredentialUsageDetails newUserCredentialUsageDetails, final ICallback<? super UserCredentialUsageDetails> callback);

    /**
     * Posts a UserCredentialUsageDetails with a new object
     *
     * @param newUserCredentialUsageDetails the object to create/update
     * @return the created UserCredentialUsageDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserCredentialUsageDetails put(final UserCredentialUsageDetails newUserCredentialUsageDetails) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserCredentialUsageDetailsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserCredentialUsageDetailsRequest expand(final String value);

}

