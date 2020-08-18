// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Home Realm Discovery Policy With Reference Request.
 */
public interface IHomeRealmDiscoveryPolicyWithReferenceRequest extends IHttpRequest {

    void post(final HomeRealmDiscoveryPolicy newHomeRealmDiscoveryPolicy, final IJsonBackedObject payload, final ICallback<HomeRealmDiscoveryPolicy> callback);

    HomeRealmDiscoveryPolicy post(final HomeRealmDiscoveryPolicy newHomeRealmDiscoveryPolicy, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<HomeRealmDiscoveryPolicy> callback);

    HomeRealmDiscoveryPolicy get() throws ClientException;

	void delete(final ICallback<HomeRealmDiscoveryPolicy> callback);

	void delete() throws ClientException;

	void patch(final HomeRealmDiscoveryPolicy sourceHomeRealmDiscoveryPolicy, final ICallback<HomeRealmDiscoveryPolicy> callback);

	HomeRealmDiscoveryPolicy patch(final HomeRealmDiscoveryPolicy sourceHomeRealmDiscoveryPolicy) throws ClientException;

    IHomeRealmDiscoveryPolicyWithReferenceRequest select(final String value);

    IHomeRealmDiscoveryPolicyWithReferenceRequest expand(final String value);

}
