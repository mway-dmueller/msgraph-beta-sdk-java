// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplication;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentScheduleInstance;
import com.microsoft.graph.models.generated.RoleAssignmentScheduleInstanceFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleInstanceCollectionRequest;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Assignment Schedule Instance Collection Request Builder.
 */
public interface IUnifiedRoleAssignmentScheduleInstanceCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IUnifiedRoleAssignmentScheduleInstanceCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IUnifiedRoleAssignmentScheduleInstanceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IUnifiedRoleAssignmentScheduleInstanceRequestBuilder byId(final String id);


    IUnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(final RoleAssignmentScheduleInstanceFilterByCurrentUserOptions on);
}
