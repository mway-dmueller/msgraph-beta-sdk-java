// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentSchedule;
import com.microsoft.graph.models.generated.RoleAssignmentScheduleFilterByCurrentUserOptions;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentSchedule;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Assignment Schedule Reference Request.
 */
public interface IUnifiedRoleAssignmentScheduleReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super UnifiedRoleAssignmentSchedule> callback);

    UnifiedRoleAssignmentSchedule delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleAssignmentScheduleReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleAssignmentScheduleReferenceRequest expand(final String value);

    /**
     * Puts the UnifiedRoleAssignmentSchedule
     *
     * @param srcUnifiedRoleAssignmentSchedule the UnifiedRoleAssignmentSchedule to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(UnifiedRoleAssignmentSchedule srcUnifiedRoleAssignmentSchedule, final ICallback<? super UnifiedRoleAssignmentSchedule> callback);

    /**
     * Puts the UnifiedRoleAssignmentSchedule
     *
     * @param srcUnifiedRoleAssignmentSchedule the UnifiedRoleAssignmentSchedule to PUT
     * @return the UnifiedRoleAssignmentSchedule
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    UnifiedRoleAssignmentSchedule put(UnifiedRoleAssignmentSchedule srcUnifiedRoleAssignmentSchedule) throws ClientException;
}
