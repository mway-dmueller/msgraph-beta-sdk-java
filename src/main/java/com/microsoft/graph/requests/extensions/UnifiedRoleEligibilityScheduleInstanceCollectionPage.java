// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleEligibilityScheduleInstance;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityScheduleInstanceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleInstanceCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityScheduleInstanceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Instance Collection Page.
 */
public class UnifiedRoleEligibilityScheduleInstanceCollectionPage extends BaseCollectionPage<UnifiedRoleEligibilityScheduleInstance, IUnifiedRoleEligibilityScheduleInstanceCollectionRequestBuilder> implements IUnifiedRoleEligibilityScheduleInstanceCollectionPage {

    /**
     * A collection page for UnifiedRoleEligibilityScheduleInstance
     *
     * @param response the serialized UnifiedRoleEligibilityScheduleInstanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedRoleEligibilityScheduleInstanceCollectionPage(final UnifiedRoleEligibilityScheduleInstanceCollectionResponse response, final IUnifiedRoleEligibilityScheduleInstanceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
