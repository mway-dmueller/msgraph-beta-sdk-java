// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentSchedule;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentScheduleCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentScheduleCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Collection Page.
 */
public class UnifiedRoleAssignmentScheduleCollectionPage extends BaseCollectionPage<UnifiedRoleAssignmentSchedule, IUnifiedRoleAssignmentScheduleCollectionRequestBuilder> implements IUnifiedRoleAssignmentScheduleCollectionPage {

    /**
     * A collection page for UnifiedRoleAssignmentSchedule
     *
     * @param response the serialized UnifiedRoleAssignmentScheduleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedRoleAssignmentScheduleCollectionPage(final UnifiedRoleAssignmentScheduleCollectionResponse response, final IUnifiedRoleAssignmentScheduleCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
