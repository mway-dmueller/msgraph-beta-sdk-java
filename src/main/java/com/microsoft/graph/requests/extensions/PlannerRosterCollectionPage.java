// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerRoster;
import com.microsoft.graph.requests.extensions.IPlannerRosterCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerRosterCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerRosterCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Roster Collection Page.
 */
public class PlannerRosterCollectionPage extends BaseCollectionPage<PlannerRoster, IPlannerRosterCollectionRequestBuilder> implements IPlannerRosterCollectionPage {

    /**
     * A collection page for PlannerRoster
     *
     * @param response the serialized PlannerRosterCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PlannerRosterCollectionPage(final PlannerRosterCollectionResponse response, final IPlannerRosterCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}