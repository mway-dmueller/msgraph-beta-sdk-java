// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ApplicationSignInDetailedSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Application Sign In Detailed Summary Request.
 */
public interface IApplicationSignInDetailedSummaryRequest extends IHttpRequest {

    /**
     * Gets the ApplicationSignInDetailedSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ApplicationSignInDetailedSummary> callback);

    /**
     * Gets the ApplicationSignInDetailedSummary from the service
     *
     * @return the ApplicationSignInDetailedSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplicationSignInDetailedSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ApplicationSignInDetailedSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ApplicationSignInDetailedSummary with a source
     *
     * @param sourceApplicationSignInDetailedSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ApplicationSignInDetailedSummary sourceApplicationSignInDetailedSummary, final ICallback<? super ApplicationSignInDetailedSummary> callback);

    /**
     * Patches this ApplicationSignInDetailedSummary with a source
     *
     * @param sourceApplicationSignInDetailedSummary the source object with updates
     * @return the updated ApplicationSignInDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplicationSignInDetailedSummary patch(final ApplicationSignInDetailedSummary sourceApplicationSignInDetailedSummary) throws ClientException;

    /**
     * Posts a ApplicationSignInDetailedSummary with a new object
     *
     * @param newApplicationSignInDetailedSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ApplicationSignInDetailedSummary newApplicationSignInDetailedSummary, final ICallback<? super ApplicationSignInDetailedSummary> callback);

    /**
     * Posts a ApplicationSignInDetailedSummary with a new object
     *
     * @param newApplicationSignInDetailedSummary the new object to create
     * @return the created ApplicationSignInDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplicationSignInDetailedSummary post(final ApplicationSignInDetailedSummary newApplicationSignInDetailedSummary) throws ClientException;

    /**
     * Posts a ApplicationSignInDetailedSummary with a new object
     *
     * @param newApplicationSignInDetailedSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ApplicationSignInDetailedSummary newApplicationSignInDetailedSummary, final ICallback<? super ApplicationSignInDetailedSummary> callback);

    /**
     * Posts a ApplicationSignInDetailedSummary with a new object
     *
     * @param newApplicationSignInDetailedSummary the object to create/update
     * @return the created ApplicationSignInDetailedSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplicationSignInDetailedSummary put(final ApplicationSignInDetailedSummary newApplicationSignInDetailedSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IApplicationSignInDetailedSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IApplicationSignInDetailedSummaryRequest expand(final String value);

}
