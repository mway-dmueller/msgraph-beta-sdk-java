// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilityScheduleInstance;
import com.microsoft.graph.models.generated.RoleEligibilityScheduleInstanceFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UnifiedRoleEligibilityScheduleInstance;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Eligibility Schedule Instance With Reference Request.
 */
public interface IUnifiedRoleEligibilityScheduleInstanceWithReferenceRequest extends IHttpRequest {

    void post(final UnifiedRoleEligibilityScheduleInstance newUnifiedRoleEligibilityScheduleInstance, final IJsonBackedObject payload, final ICallback<? super UnifiedRoleEligibilityScheduleInstance> callback);

    UnifiedRoleEligibilityScheduleInstance post(final UnifiedRoleEligibilityScheduleInstance newUnifiedRoleEligibilityScheduleInstance, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super UnifiedRoleEligibilityScheduleInstance> callback);

    UnifiedRoleEligibilityScheduleInstance get() throws ClientException;

	void delete(final ICallback<? super UnifiedRoleEligibilityScheduleInstance> callback);

	void delete() throws ClientException;

	void patch(final UnifiedRoleEligibilityScheduleInstance sourceUnifiedRoleEligibilityScheduleInstance, final ICallback<? super UnifiedRoleEligibilityScheduleInstance> callback);

	UnifiedRoleEligibilityScheduleInstance patch(final UnifiedRoleEligibilityScheduleInstance sourceUnifiedRoleEligibilityScheduleInstance) throws ClientException;

    IUnifiedRoleEligibilityScheduleInstanceWithReferenceRequest select(final String value);

    IUnifiedRoleEligibilityScheduleInstanceWithReferenceRequest expand(final String value);

}
