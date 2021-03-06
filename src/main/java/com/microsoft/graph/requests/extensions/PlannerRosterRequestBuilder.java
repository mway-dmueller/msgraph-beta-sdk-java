// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerRoster;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRosterMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Roster Request Builder.
 */
public class PlannerRosterRequestBuilder extends BaseRequestBuilder implements IPlannerRosterRequestBuilder {

    /**
     * The request builder for the PlannerRoster
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerRosterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPlannerRosterRequest instance
     */
    public IPlannerRosterRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPlannerRosterRequest instance
     */
    public IPlannerRosterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PlannerRosterRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IPlannerRosterMemberCollectionRequestBuilder members() {
        return new PlannerRosterMemberCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IPlannerRosterMemberRequestBuilder members(final String id) {
        return new PlannerRosterMemberRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public IPlannerPlanCollectionWithReferencesRequestBuilder plans() {
        return new PlannerPlanCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("plans"), getClient(), null);
    }

    public IPlannerPlanWithReferenceRequestBuilder plans(final String id) {
        return new PlannerPlanWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("plans") + "/" + id, getClient(), null);
    }
}
