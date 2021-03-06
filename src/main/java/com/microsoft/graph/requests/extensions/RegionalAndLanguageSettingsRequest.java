// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RegionalAndLanguageSettings;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Regional And Language Settings Request.
 */
public class RegionalAndLanguageSettingsRequest extends BaseRequest implements IRegionalAndLanguageSettingsRequest {
	
    /**
     * The request for the RegionalAndLanguageSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RegionalAndLanguageSettingsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RegionalAndLanguageSettings.class);
    }

    /**
     * Gets the RegionalAndLanguageSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super RegionalAndLanguageSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RegionalAndLanguageSettings from the service
     *
     * @return the RegionalAndLanguageSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RegionalAndLanguageSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super RegionalAndLanguageSettings> callback) {
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
     * Patches this RegionalAndLanguageSettings with a source
     *
     * @param sourceRegionalAndLanguageSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final RegionalAndLanguageSettings sourceRegionalAndLanguageSettings, final ICallback<? super RegionalAndLanguageSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceRegionalAndLanguageSettings);
    }

    /**
     * Patches this RegionalAndLanguageSettings with a source
     *
     * @param sourceRegionalAndLanguageSettings the source object with updates
     * @return the updated RegionalAndLanguageSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RegionalAndLanguageSettings patch(final RegionalAndLanguageSettings sourceRegionalAndLanguageSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceRegionalAndLanguageSettings);
    }

    /**
     * Creates a RegionalAndLanguageSettings with a new object
     *
     * @param newRegionalAndLanguageSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final RegionalAndLanguageSettings newRegionalAndLanguageSettings, final ICallback<? super RegionalAndLanguageSettings> callback) {
        send(HttpMethod.POST, callback, newRegionalAndLanguageSettings);
    }

    /**
     * Creates a RegionalAndLanguageSettings with a new object
     *
     * @param newRegionalAndLanguageSettings the new object to create
     * @return the created RegionalAndLanguageSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RegionalAndLanguageSettings post(final RegionalAndLanguageSettings newRegionalAndLanguageSettings) throws ClientException {
        return send(HttpMethod.POST, newRegionalAndLanguageSettings);
    }

    /**
     * Creates a RegionalAndLanguageSettings with a new object
     *
     * @param newRegionalAndLanguageSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final RegionalAndLanguageSettings newRegionalAndLanguageSettings, final ICallback<? super RegionalAndLanguageSettings> callback) {
        send(HttpMethod.PUT, callback, newRegionalAndLanguageSettings);
    }

    /**
     * Creates a RegionalAndLanguageSettings with a new object
     *
     * @param newRegionalAndLanguageSettings the object to create/update
     * @return the created RegionalAndLanguageSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RegionalAndLanguageSettings put(final RegionalAndLanguageSettings newRegionalAndLanguageSettings) throws ClientException {
        return send(HttpMethod.PUT, newRegionalAndLanguageSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IRegionalAndLanguageSettingsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (RegionalAndLanguageSettingsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IRegionalAndLanguageSettingsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (RegionalAndLanguageSettingsRequest)this;
     }

}

