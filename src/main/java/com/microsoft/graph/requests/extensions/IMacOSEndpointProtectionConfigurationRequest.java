// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSEndpointProtectionConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSEndpoint Protection Configuration Request.
 */
public interface IMacOSEndpointProtectionConfigurationRequest extends IHttpRequest {

    /**
     * Gets the MacOSEndpointProtectionConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MacOSEndpointProtectionConfiguration> callback);

    /**
     * Gets the MacOSEndpointProtectionConfiguration from the service
     *
     * @return the MacOSEndpointProtectionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSEndpointProtectionConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MacOSEndpointProtectionConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSEndpointProtectionConfiguration with a source
     *
     * @param sourceMacOSEndpointProtectionConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSEndpointProtectionConfiguration sourceMacOSEndpointProtectionConfiguration, final ICallback<? super MacOSEndpointProtectionConfiguration> callback);

    /**
     * Patches this MacOSEndpointProtectionConfiguration with a source
     *
     * @param sourceMacOSEndpointProtectionConfiguration the source object with updates
     * @return the updated MacOSEndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSEndpointProtectionConfiguration patch(final MacOSEndpointProtectionConfiguration sourceMacOSEndpointProtectionConfiguration) throws ClientException;

    /**
     * Posts a MacOSEndpointProtectionConfiguration with a new object
     *
     * @param newMacOSEndpointProtectionConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSEndpointProtectionConfiguration newMacOSEndpointProtectionConfiguration, final ICallback<? super MacOSEndpointProtectionConfiguration> callback);

    /**
     * Posts a MacOSEndpointProtectionConfiguration with a new object
     *
     * @param newMacOSEndpointProtectionConfiguration the new object to create
     * @return the created MacOSEndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSEndpointProtectionConfiguration post(final MacOSEndpointProtectionConfiguration newMacOSEndpointProtectionConfiguration) throws ClientException;

    /**
     * Posts a MacOSEndpointProtectionConfiguration with a new object
     *
     * @param newMacOSEndpointProtectionConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSEndpointProtectionConfiguration newMacOSEndpointProtectionConfiguration, final ICallback<? super MacOSEndpointProtectionConfiguration> callback);

    /**
     * Posts a MacOSEndpointProtectionConfiguration with a new object
     *
     * @param newMacOSEndpointProtectionConfiguration the object to create/update
     * @return the created MacOSEndpointProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSEndpointProtectionConfiguration put(final MacOSEndpointProtectionConfiguration newMacOSEndpointProtectionConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSEndpointProtectionConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSEndpointProtectionConfigurationRequest expand(final String value);

}

