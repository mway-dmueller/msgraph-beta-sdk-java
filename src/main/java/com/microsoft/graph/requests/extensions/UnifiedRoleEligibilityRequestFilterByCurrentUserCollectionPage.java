// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.RoleEligibilityRequestFilterByCurrentUserOptions;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilityRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Request Filter By Current User Collection Page.
 */
public class UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage extends BaseCollectionPage<UnifiedRoleEligibilityRequest, IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder> implements IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage {

    /**
     * A collection page for UnifiedRoleEligibilityRequest.
     *
     * @param response The serialized UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionPage(final UnifiedRoleEligibilityRequestFilterByCurrentUserCollectionResponse response, final IUnifiedRoleEligibilityRequestFilterByCurrentUserCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
