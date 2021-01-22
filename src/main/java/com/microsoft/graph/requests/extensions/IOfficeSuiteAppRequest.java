// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OfficeSuiteApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office Suite App Request.
 */
public interface IOfficeSuiteAppRequest extends IHttpRequest {

    /**
     * Gets the OfficeSuiteApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OfficeSuiteApp> callback);

    /**
     * Gets the OfficeSuiteApp from the service
     *
     * @return the OfficeSuiteApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeSuiteApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OfficeSuiteApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OfficeSuiteApp with a source
     *
     * @param sourceOfficeSuiteApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OfficeSuiteApp sourceOfficeSuiteApp, final ICallback<? super OfficeSuiteApp> callback);

    /**
     * Patches this OfficeSuiteApp with a source
     *
     * @param sourceOfficeSuiteApp the source object with updates
     * @return the updated OfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeSuiteApp patch(final OfficeSuiteApp sourceOfficeSuiteApp) throws ClientException;

    /**
     * Posts a OfficeSuiteApp with a new object
     *
     * @param newOfficeSuiteApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OfficeSuiteApp newOfficeSuiteApp, final ICallback<? super OfficeSuiteApp> callback);

    /**
     * Posts a OfficeSuiteApp with a new object
     *
     * @param newOfficeSuiteApp the new object to create
     * @return the created OfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeSuiteApp post(final OfficeSuiteApp newOfficeSuiteApp) throws ClientException;

    /**
     * Posts a OfficeSuiteApp with a new object
     *
     * @param newOfficeSuiteApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OfficeSuiteApp newOfficeSuiteApp, final ICallback<? super OfficeSuiteApp> callback);

    /**
     * Posts a OfficeSuiteApp with a new object
     *
     * @param newOfficeSuiteApp the object to create/update
     * @return the created OfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfficeSuiteApp put(final OfficeSuiteApp newOfficeSuiteApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOfficeSuiteAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOfficeSuiteAppRequest expand(final String value);

}
