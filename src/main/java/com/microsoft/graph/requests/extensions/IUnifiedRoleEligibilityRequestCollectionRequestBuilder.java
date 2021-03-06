// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplication;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilityRequest;
import com.microsoft.graph.models.generated.RoleEligibilityRequestFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Eligibility Request Collection Request Builder.
 */
public interface IUnifiedRoleEligibilityRequestCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IUnifiedRoleEligibilityRequestCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IUnifiedRoleEligibilityRequestCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IUnifiedRoleEligibilityRequestRequestBuilder byId(final String id);


    IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(final RoleEligibilityRequestFilterByCurrentUserOptions on);
}
