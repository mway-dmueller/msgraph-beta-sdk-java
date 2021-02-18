// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleManagementPolicy;
import com.microsoft.graph.requests.extensions.IUnifiedRoleManagementPolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleManagementPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleManagementPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Management Policy Collection Page.
 */
public class UnifiedRoleManagementPolicyCollectionPage extends BaseCollectionPage<UnifiedRoleManagementPolicy, IUnifiedRoleManagementPolicyCollectionRequestBuilder> implements IUnifiedRoleManagementPolicyCollectionPage {

    /**
     * A collection page for UnifiedRoleManagementPolicy
     *
     * @param response the serialized UnifiedRoleManagementPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedRoleManagementPolicyCollectionPage(final UnifiedRoleManagementPolicyCollectionResponse response, final IUnifiedRoleManagementPolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
