// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.RoleAssignmentScheduleInstanceFilterByCurrentUserOptions;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentScheduleInstance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Instance Filter By Current User Collection Page.
 */
public class UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionPage extends BaseCollectionPage<UnifiedRoleAssignmentScheduleInstance, IUnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder> implements IUnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionPage {

    /**
     * A collection page for UnifiedRoleAssignmentScheduleInstance.
     *
     * @param response The serialized UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionPage(final UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionResponse response, final IUnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
