// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSWiredNetworkConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSWired Network Configuration Request.
 */
public interface IMacOSWiredNetworkConfigurationRequest extends IHttpRequest {

    /**
     * Gets the MacOSWiredNetworkConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MacOSWiredNetworkConfiguration> callback);

    /**
     * Gets the MacOSWiredNetworkConfiguration from the service
     *
     * @return the MacOSWiredNetworkConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSWiredNetworkConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MacOSWiredNetworkConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSWiredNetworkConfiguration with a source
     *
     * @param sourceMacOSWiredNetworkConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSWiredNetworkConfiguration sourceMacOSWiredNetworkConfiguration, final ICallback<? super MacOSWiredNetworkConfiguration> callback);

    /**
     * Patches this MacOSWiredNetworkConfiguration with a source
     *
     * @param sourceMacOSWiredNetworkConfiguration the source object with updates
     * @return the updated MacOSWiredNetworkConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSWiredNetworkConfiguration patch(final MacOSWiredNetworkConfiguration sourceMacOSWiredNetworkConfiguration) throws ClientException;

    /**
     * Posts a MacOSWiredNetworkConfiguration with a new object
     *
     * @param newMacOSWiredNetworkConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSWiredNetworkConfiguration newMacOSWiredNetworkConfiguration, final ICallback<? super MacOSWiredNetworkConfiguration> callback);

    /**
     * Posts a MacOSWiredNetworkConfiguration with a new object
     *
     * @param newMacOSWiredNetworkConfiguration the new object to create
     * @return the created MacOSWiredNetworkConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSWiredNetworkConfiguration post(final MacOSWiredNetworkConfiguration newMacOSWiredNetworkConfiguration) throws ClientException;

    /**
     * Posts a MacOSWiredNetworkConfiguration with a new object
     *
     * @param newMacOSWiredNetworkConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSWiredNetworkConfiguration newMacOSWiredNetworkConfiguration, final ICallback<? super MacOSWiredNetworkConfiguration> callback);

    /**
     * Posts a MacOSWiredNetworkConfiguration with a new object
     *
     * @param newMacOSWiredNetworkConfiguration the object to create/update
     * @return the created MacOSWiredNetworkConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSWiredNetworkConfiguration put(final MacOSWiredNetworkConfiguration newMacOSWiredNetworkConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSWiredNetworkConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSWiredNetworkConfigurationRequest expand(final String value);

}

