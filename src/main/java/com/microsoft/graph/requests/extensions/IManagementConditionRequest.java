// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagementCondition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Management Condition Request.
 */
public interface IManagementConditionRequest extends IHttpRequest {

    /**
     * Gets the ManagementCondition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagementCondition> callback);

    /**
     * Gets the ManagementCondition from the service
     *
     * @return the ManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagementCondition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagementCondition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagementCondition with a source
     *
     * @param sourceManagementCondition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagementCondition sourceManagementCondition, final ICallback<? super ManagementCondition> callback);

    /**
     * Patches this ManagementCondition with a source
     *
     * @param sourceManagementCondition the source object with updates
     * @return the updated ManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagementCondition patch(final ManagementCondition sourceManagementCondition) throws ClientException;

    /**
     * Posts a ManagementCondition with a new object
     *
     * @param newManagementCondition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagementCondition newManagementCondition, final ICallback<? super ManagementCondition> callback);

    /**
     * Posts a ManagementCondition with a new object
     *
     * @param newManagementCondition the new object to create
     * @return the created ManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagementCondition post(final ManagementCondition newManagementCondition) throws ClientException;

    /**
     * Posts a ManagementCondition with a new object
     *
     * @param newManagementCondition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagementCondition newManagementCondition, final ICallback<? super ManagementCondition> callback);

    /**
     * Posts a ManagementCondition with a new object
     *
     * @param newManagementCondition the object to create/update
     * @return the created ManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagementCondition put(final ManagementCondition newManagementCondition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagementConditionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagementConditionRequest expand(final String value);

}

