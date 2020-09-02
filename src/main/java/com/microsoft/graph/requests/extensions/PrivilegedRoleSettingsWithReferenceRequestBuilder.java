// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleSettings;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Settings With Reference Request Builder.
 */
public class PrivilegedRoleSettingsWithReferenceRequestBuilder extends BaseRequestBuilder implements IPrivilegedRoleSettingsWithReferenceRequestBuilder {

    /**
     * The request builder for the PrivilegedRoleSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleSettingsWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IPrivilegedRoleSettingsWithReferenceRequest instance
     */
    public IPrivilegedRoleSettingsWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IPrivilegedRoleSettingsWithReferenceRequest instance
     */
    public IPrivilegedRoleSettingsWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrivilegedRoleSettingsWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrivilegedRoleSettingsReferenceRequestBuilder reference(){
        return new PrivilegedRoleSettingsReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}