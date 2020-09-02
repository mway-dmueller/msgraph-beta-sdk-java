// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleSetting;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Setting Request.
 */
public class GovernanceRoleSettingRequest extends BaseRequest implements IGovernanceRoleSettingRequest {
	
    /**
     * The request for the GovernanceRoleSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleSettingRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceRoleSetting.class);
    }

    /**
     * Gets the GovernanceRoleSetting from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GovernanceRoleSetting> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GovernanceRoleSetting from the service
     *
     * @return the GovernanceRoleSetting from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleSetting get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GovernanceRoleSetting> callback) {
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
     * Patches this GovernanceRoleSetting with a source
     *
     * @param sourceGovernanceRoleSetting the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GovernanceRoleSetting sourceGovernanceRoleSetting, final ICallback<GovernanceRoleSetting> callback) {
        send(HttpMethod.PATCH, callback, sourceGovernanceRoleSetting);
    }

    /**
     * Patches this GovernanceRoleSetting with a source
     *
     * @param sourceGovernanceRoleSetting the source object with updates
     * @return the updated GovernanceRoleSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleSetting patch(final GovernanceRoleSetting sourceGovernanceRoleSetting) throws ClientException {
        return send(HttpMethod.PATCH, sourceGovernanceRoleSetting);
    }

    /**
     * Creates a GovernanceRoleSetting with a new object
     *
     * @param newGovernanceRoleSetting the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GovernanceRoleSetting newGovernanceRoleSetting, final ICallback<GovernanceRoleSetting> callback) {
        send(HttpMethod.POST, callback, newGovernanceRoleSetting);
    }

    /**
     * Creates a GovernanceRoleSetting with a new object
     *
     * @param newGovernanceRoleSetting the new object to create
     * @return the created GovernanceRoleSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleSetting post(final GovernanceRoleSetting newGovernanceRoleSetting) throws ClientException {
        return send(HttpMethod.POST, newGovernanceRoleSetting);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGovernanceRoleSettingRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GovernanceRoleSettingRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGovernanceRoleSettingRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GovernanceRoleSettingRequest)this;
     }

}
