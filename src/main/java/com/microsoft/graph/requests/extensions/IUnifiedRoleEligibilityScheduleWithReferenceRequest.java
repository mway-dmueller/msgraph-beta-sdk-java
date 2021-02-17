// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilitySchedule;
import com.microsoft.graph.models.generated.RoleEligibilityScheduleFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UnifiedRoleEligibilitySchedule;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Eligibility Schedule With Reference Request.
 */
public interface IUnifiedRoleEligibilityScheduleWithReferenceRequest extends IHttpRequest {

    void post(final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule, final IJsonBackedObject payload, final ICallback<? super UnifiedRoleEligibilitySchedule> callback);

    UnifiedRoleEligibilitySchedule post(final UnifiedRoleEligibilitySchedule newUnifiedRoleEligibilitySchedule, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super UnifiedRoleEligibilitySchedule> callback);

    UnifiedRoleEligibilitySchedule get() throws ClientException;

	void delete(final ICallback<? super UnifiedRoleEligibilitySchedule> callback);

	void delete() throws ClientException;

	void patch(final UnifiedRoleEligibilitySchedule sourceUnifiedRoleEligibilitySchedule, final ICallback<? super UnifiedRoleEligibilitySchedule> callback);

	UnifiedRoleEligibilitySchedule patch(final UnifiedRoleEligibilitySchedule sourceUnifiedRoleEligibilitySchedule) throws ClientException;

    IUnifiedRoleEligibilityScheduleWithReferenceRequest select(final String value);

    IUnifiedRoleEligibilityScheduleWithReferenceRequest expand(final String value);

}
