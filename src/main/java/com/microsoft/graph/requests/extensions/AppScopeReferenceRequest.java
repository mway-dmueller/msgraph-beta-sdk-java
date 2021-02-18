// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppScope;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Scope Reference Request.
 */
public class AppScopeReferenceRequest extends BaseRequest implements IAppScopeReferenceRequest {

    /**
     * The request for the AppScope
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppScopeReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppScope.class);
    }

    public void delete(final ICallback<? super AppScope> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public AppScope delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAppScopeReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AppScopeReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAppScopeReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AppScopeReferenceRequest)this;
    }
    /**
     * Puts the AppScope
     *
     * @param srcAppScope the AppScope reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(AppScope srcAppScope, final ICallback<? super AppScope> callback) {
        send(HttpMethod.PUT, callback, srcAppScope);
    }

    /**
     * Puts the AppScope
     *
     * @param srcAppScope the AppScope reference to PUT
     * @return the AppScope
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public AppScope put(AppScope srcAppScope) throws ClientException {
        return send(HttpMethod.PUT, srcAppScope);
    }
}