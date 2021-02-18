// Template Source: IBaseEntityReferenceRequest.java.tt
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
 * The interface for the Unified Role Eligibility Schedule Reference Request.
 */
public interface IUnifiedRoleEligibilityScheduleReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super UnifiedRoleEligibilitySchedule> callback);

    UnifiedRoleEligibilitySchedule delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleEligibilityScheduleReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleEligibilityScheduleReferenceRequest expand(final String value);

    /**
     * Puts the UnifiedRoleEligibilitySchedule
     *
     * @param srcUnifiedRoleEligibilitySchedule the UnifiedRoleEligibilitySchedule to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(UnifiedRoleEligibilitySchedule srcUnifiedRoleEligibilitySchedule, final ICallback<? super UnifiedRoleEligibilitySchedule> callback);

    /**
     * Puts the UnifiedRoleEligibilitySchedule
     *
     * @param srcUnifiedRoleEligibilitySchedule the UnifiedRoleEligibilitySchedule to PUT
     * @return the UnifiedRoleEligibilitySchedule
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    UnifiedRoleEligibilitySchedule put(UnifiedRoleEligibilitySchedule srcUnifiedRoleEligibilitySchedule) throws ClientException;
}