// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRole;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Request Builder.
 */
public interface IPrivilegedRoleRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrivilegedRoleRequest instance
     */
    IPrivilegedRoleRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPrivilegedRoleRequest instance
     */
    IPrivilegedRoleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IPrivilegedRoleAssignmentCollectionWithReferencesRequestBuilder assignments();

    IPrivilegedRoleAssignmentWithReferenceRequestBuilder assignments(final String id);

    /**
     * Gets the request builder for PrivilegedRoleSettings
     *
     * @return the IPrivilegedRoleSettingsRequestBuilder instance
     */
    IPrivilegedRoleSettingsRequestBuilder settings();

    /**
     * Gets the request builder for PrivilegedRoleSummary
     *
     * @return the IPrivilegedRoleSummaryRequestBuilder instance
     */
    IPrivilegedRoleSummaryRequestBuilder summary();
    IPrivilegedRoleSelfActivateRequestBuilder selfActivate(final String reason, final String duration, final String ticketNumber, final String ticketSystem);
    IPrivilegedRoleSelfDeactivateRequestBuilder selfDeactivate();

}