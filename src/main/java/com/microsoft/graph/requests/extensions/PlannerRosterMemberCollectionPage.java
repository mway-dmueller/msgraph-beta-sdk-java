// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerRosterMember;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Roster Member Collection Page.
 */
public class PlannerRosterMemberCollectionPage extends BaseCollectionPage<PlannerRosterMember, IPlannerRosterMemberCollectionRequestBuilder> implements IPlannerRosterMemberCollectionPage {

    /**
     * A collection page for PlannerRosterMember
     *
     * @param response the serialized PlannerRosterMemberCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PlannerRosterMemberCollectionPage(final PlannerRosterMemberCollectionResponse response, final IPlannerRosterMemberCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}