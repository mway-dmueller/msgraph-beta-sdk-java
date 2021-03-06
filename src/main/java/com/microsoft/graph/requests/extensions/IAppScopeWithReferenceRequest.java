// Template Source: IBaseEntityWithReferenceRequest.java.tt
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

import com.microsoft.graph.models.extensions.AppScope;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Scope With Reference Request.
 */
public interface IAppScopeWithReferenceRequest extends IHttpRequest {

    void post(final AppScope newAppScope, final IJsonBackedObject payload, final ICallback<? super AppScope> callback);

    AppScope post(final AppScope newAppScope, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super AppScope> callback);

    AppScope get() throws ClientException;

	void delete(final ICallback<? super AppScope> callback);

	void delete() throws ClientException;

	void patch(final AppScope sourceAppScope, final ICallback<? super AppScope> callback);

	AppScope patch(final AppScope sourceAppScope) throws ClientException;

    IAppScopeWithReferenceRequest select(final String value);

    IAppScopeWithReferenceRequest expand(final String value);

}
