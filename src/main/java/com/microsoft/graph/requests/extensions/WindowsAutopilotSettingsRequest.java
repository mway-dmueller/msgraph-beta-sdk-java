// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsAutopilotSettings;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Settings Request.
 */
public class WindowsAutopilotSettingsRequest extends BaseRequest implements IWindowsAutopilotSettingsRequest {
	
    /**
     * The request for the WindowsAutopilotSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotSettingsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsAutopilotSettings.class);
    }

    /**
     * Gets the WindowsAutopilotSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsAutopilotSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsAutopilotSettings from the service
     *
     * @return the WindowsAutopilotSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsAutopilotSettings> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsAutopilotSettings with a source
     *
     * @param sourceWindowsAutopilotSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsAutopilotSettings sourceWindowsAutopilotSettings, final ICallback<WindowsAutopilotSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsAutopilotSettings);
    }

    /**
     * Patches this WindowsAutopilotSettings with a source
     *
     * @param sourceWindowsAutopilotSettings the source object with updates
     * @return the updated WindowsAutopilotSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotSettings patch(final WindowsAutopilotSettings sourceWindowsAutopilotSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsAutopilotSettings);
    }

    /**
     * Creates a WindowsAutopilotSettings with a new object
     *
     * @param newWindowsAutopilotSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsAutopilotSettings newWindowsAutopilotSettings, final ICallback<WindowsAutopilotSettings> callback) {
        send(HttpMethod.POST, callback, newWindowsAutopilotSettings);
    }

    /**
     * Creates a WindowsAutopilotSettings with a new object
     *
     * @param newWindowsAutopilotSettings the new object to create
     * @return the created WindowsAutopilotSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotSettings post(final WindowsAutopilotSettings newWindowsAutopilotSettings) throws ClientException {
        return send(HttpMethod.POST, newWindowsAutopilotSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsAutopilotSettingsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsAutopilotSettingsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsAutopilotSettingsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsAutopilotSettingsRequest)this;
     }

}
