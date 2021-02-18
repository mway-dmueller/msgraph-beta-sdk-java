// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicy;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyRuleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicy;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Management Policy With Reference Request.
 */
public interface IUnifiedRoleManagementPolicyWithReferenceRequest extends IHttpRequest {

    void post(final UnifiedRoleManagementPolicy newUnifiedRoleManagementPolicy, final IJsonBackedObject payload, final ICallback<? super UnifiedRoleManagementPolicy> callback);

    UnifiedRoleManagementPolicy post(final UnifiedRoleManagementPolicy newUnifiedRoleManagementPolicy, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super UnifiedRoleManagementPolicy> callback);

    UnifiedRoleManagementPolicy get() throws ClientException;

	void delete(final ICallback<? super UnifiedRoleManagementPolicy> callback);

	void delete() throws ClientException;

	void patch(final UnifiedRoleManagementPolicy sourceUnifiedRoleManagementPolicy, final ICallback<? super UnifiedRoleManagementPolicy> callback);

	UnifiedRoleManagementPolicy patch(final UnifiedRoleManagementPolicy sourceUnifiedRoleManagementPolicy) throws ClientException;

    IUnifiedRoleManagementPolicyWithReferenceRequest select(final String value);

    IUnifiedRoleManagementPolicyWithReferenceRequest expand(final String value);

}
