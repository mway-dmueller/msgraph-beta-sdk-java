// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EntitlementManagement;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Entitlement Management Request.
 */
public interface IEntitlementManagementRequest extends IHttpRequest {

    /**
     * Gets the EntitlementManagement from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EntitlementManagement> callback);

    /**
     * Gets the EntitlementManagement from the service
     *
     * @return the EntitlementManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntitlementManagement get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EntitlementManagement> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EntitlementManagement with a source
     *
     * @param sourceEntitlementManagement the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EntitlementManagement sourceEntitlementManagement, final ICallback<? super EntitlementManagement> callback);

    /**
     * Patches this EntitlementManagement with a source
     *
     * @param sourceEntitlementManagement the source object with updates
     * @return the updated EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntitlementManagement patch(final EntitlementManagement sourceEntitlementManagement) throws ClientException;

    /**
     * Posts a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EntitlementManagement newEntitlementManagement, final ICallback<? super EntitlementManagement> callback);

    /**
     * Posts a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the new object to create
     * @return the created EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntitlementManagement post(final EntitlementManagement newEntitlementManagement) throws ClientException;

    /**
     * Posts a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EntitlementManagement newEntitlementManagement, final ICallback<? super EntitlementManagement> callback);

    /**
     * Posts a EntitlementManagement with a new object
     *
     * @param newEntitlementManagement the object to create/update
     * @return the created EntitlementManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EntitlementManagement put(final EntitlementManagement newEntitlementManagement) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEntitlementManagementRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEntitlementManagementRequest expand(final String value);

}

