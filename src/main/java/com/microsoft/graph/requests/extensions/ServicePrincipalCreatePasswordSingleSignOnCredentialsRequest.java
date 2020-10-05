// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ServicePrincipalCreatePasswordSingleSignOnCredentialsBody;
import com.microsoft.graph.models.extensions.PasswordSingleSignOnCredentialSet;
import com.microsoft.graph.requests.extensions.IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Create Password Single Sign On Credentials Request.
 */
public class ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest extends BaseRequest implements IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest {
    protected final ServicePrincipalCreatePasswordSingleSignOnCredentialsBody body;

    /**
     * The request for this ServicePrincipalCreatePasswordSingleSignOnCredentials
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PasswordSingleSignOnCredentialSet.class);
        body = new ServicePrincipalCreatePasswordSingleSignOnCredentialsBody();
    }

    public void post(final ICallback<? super PasswordSingleSignOnCredentialSet> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public PasswordSingleSignOnCredentialSet post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ServicePrincipalCreatePasswordSingleSignOnCredentialsRequest)this;
    }

}
