// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.RoleEligibilityScheduleFilterByCurrentUserOptions;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilitySchedule;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Filter By Current User Collection Page.
 */
public class UnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionPage extends BaseCollectionPage<UnifiedRoleEligibilitySchedule, IUnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionRequestBuilder> implements IUnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionPage {

    /**
     * A collection page for UnifiedRoleEligibilitySchedule.
     *
     * @param response The serialized UnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionPage(final UnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionResponse response, final IUnifiedRoleEligibilityScheduleFilterByCurrentUserCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
