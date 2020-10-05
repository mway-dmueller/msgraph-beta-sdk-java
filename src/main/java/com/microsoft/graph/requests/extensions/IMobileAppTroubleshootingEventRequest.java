// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingEvent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Troubleshooting Event Request.
 */
public interface IMobileAppTroubleshootingEventRequest extends IHttpRequest {

    /**
     * Gets the MobileAppTroubleshootingEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MobileAppTroubleshootingEvent> callback);

    /**
     * Gets the MobileAppTroubleshootingEvent from the service
     *
     * @return the MobileAppTroubleshootingEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppTroubleshootingEvent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MobileAppTroubleshootingEvent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppTroubleshootingEvent with a source
     *
     * @param sourceMobileAppTroubleshootingEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppTroubleshootingEvent sourceMobileAppTroubleshootingEvent, final ICallback<? super MobileAppTroubleshootingEvent> callback);

    /**
     * Patches this MobileAppTroubleshootingEvent with a source
     *
     * @param sourceMobileAppTroubleshootingEvent the source object with updates
     * @return the updated MobileAppTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppTroubleshootingEvent patch(final MobileAppTroubleshootingEvent sourceMobileAppTroubleshootingEvent) throws ClientException;

    /**
     * Posts a MobileAppTroubleshootingEvent with a new object
     *
     * @param newMobileAppTroubleshootingEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppTroubleshootingEvent newMobileAppTroubleshootingEvent, final ICallback<? super MobileAppTroubleshootingEvent> callback);

    /**
     * Posts a MobileAppTroubleshootingEvent with a new object
     *
     * @param newMobileAppTroubleshootingEvent the new object to create
     * @return the created MobileAppTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppTroubleshootingEvent post(final MobileAppTroubleshootingEvent newMobileAppTroubleshootingEvent) throws ClientException;

    /**
     * Posts a MobileAppTroubleshootingEvent with a new object
     *
     * @param newMobileAppTroubleshootingEvent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MobileAppTroubleshootingEvent newMobileAppTroubleshootingEvent, final ICallback<? super MobileAppTroubleshootingEvent> callback);

    /**
     * Posts a MobileAppTroubleshootingEvent with a new object
     *
     * @param newMobileAppTroubleshootingEvent the object to create/update
     * @return the created MobileAppTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppTroubleshootingEvent put(final MobileAppTroubleshootingEvent newMobileAppTroubleshootingEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppTroubleshootingEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppTroubleshootingEventRequest expand(final String value);

}

