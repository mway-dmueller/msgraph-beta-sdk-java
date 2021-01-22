// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserFlowLanguageConfiguration;
import com.microsoft.graph.requests.extensions.IUserFlowLanguagePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserFlowLanguagePageRequestBuilder;
import com.microsoft.graph.requests.extensions.UserFlowLanguagePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserFlowLanguagePageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Flow Language Configuration Request.
 */
public class UserFlowLanguageConfigurationRequest extends BaseRequest implements IUserFlowLanguageConfigurationRequest {
	
    /**
     * The request for the UserFlowLanguageConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserFlowLanguageConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserFlowLanguageConfiguration.class);
    }

    /**
     * Gets the UserFlowLanguageConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserFlowLanguageConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserFlowLanguageConfiguration from the service
     *
     * @return the UserFlowLanguageConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserFlowLanguageConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserFlowLanguageConfiguration> callback) {
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
     * Patches this UserFlowLanguageConfiguration with a source
     *
     * @param sourceUserFlowLanguageConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserFlowLanguageConfiguration sourceUserFlowLanguageConfiguration, final ICallback<? super UserFlowLanguageConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceUserFlowLanguageConfiguration);
    }

    /**
     * Patches this UserFlowLanguageConfiguration with a source
     *
     * @param sourceUserFlowLanguageConfiguration the source object with updates
     * @return the updated UserFlowLanguageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserFlowLanguageConfiguration patch(final UserFlowLanguageConfiguration sourceUserFlowLanguageConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserFlowLanguageConfiguration);
    }

    /**
     * Creates a UserFlowLanguageConfiguration with a new object
     *
     * @param newUserFlowLanguageConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserFlowLanguageConfiguration newUserFlowLanguageConfiguration, final ICallback<? super UserFlowLanguageConfiguration> callback) {
        send(HttpMethod.POST, callback, newUserFlowLanguageConfiguration);
    }

    /**
     * Creates a UserFlowLanguageConfiguration with a new object
     *
     * @param newUserFlowLanguageConfiguration the new object to create
     * @return the created UserFlowLanguageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserFlowLanguageConfiguration post(final UserFlowLanguageConfiguration newUserFlowLanguageConfiguration) throws ClientException {
        return send(HttpMethod.POST, newUserFlowLanguageConfiguration);
    }

    /**
     * Creates a UserFlowLanguageConfiguration with a new object
     *
     * @param newUserFlowLanguageConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserFlowLanguageConfiguration newUserFlowLanguageConfiguration, final ICallback<? super UserFlowLanguageConfiguration> callback) {
        send(HttpMethod.PUT, callback, newUserFlowLanguageConfiguration);
    }

    /**
     * Creates a UserFlowLanguageConfiguration with a new object
     *
     * @param newUserFlowLanguageConfiguration the object to create/update
     * @return the created UserFlowLanguageConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserFlowLanguageConfiguration put(final UserFlowLanguageConfiguration newUserFlowLanguageConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newUserFlowLanguageConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserFlowLanguageConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserFlowLanguageConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserFlowLanguageConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserFlowLanguageConfigurationRequest)this;
     }

}
