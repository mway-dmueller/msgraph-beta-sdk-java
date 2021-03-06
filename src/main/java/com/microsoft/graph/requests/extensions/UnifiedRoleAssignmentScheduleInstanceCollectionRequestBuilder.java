// Template Source: BaseEntityCollectionRequestBuilder.java.tt
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

import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleInstanceCollectionRequest;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Instance Collection Request Builder.
 */
public class UnifiedRoleAssignmentScheduleInstanceCollectionRequestBuilder extends BaseRequestBuilder implements IUnifiedRoleAssignmentScheduleInstanceCollectionRequestBuilder {

    /**
     * The request builder for this collection of RbacApplication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentScheduleInstanceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUnifiedRoleAssignmentScheduleInstanceCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUnifiedRoleAssignmentScheduleInstanceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new UnifiedRoleAssignmentScheduleInstanceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IUnifiedRoleAssignmentScheduleInstanceRequestBuilder byId(final String id) {
        return new UnifiedRoleAssignmentScheduleInstanceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IUnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(final RoleAssignmentScheduleInstanceFilterByCurrentUserOptions on) {
        return new UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterByCurrentUser"), getClient(), null, on);
    }
}
