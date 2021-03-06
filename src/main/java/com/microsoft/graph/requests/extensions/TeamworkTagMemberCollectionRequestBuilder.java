// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamworkTag;
import com.microsoft.graph.models.extensions.TeamworkTagMember;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITeamworkTagMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkTagMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkTagMemberCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Tag Member Collection Request Builder.
 */
public class TeamworkTagMemberCollectionRequestBuilder extends BaseRequestBuilder implements ITeamworkTagMemberCollectionRequestBuilder {

    /**
     * The request builder for this collection of TeamworkTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamworkTagMemberCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITeamworkTagMemberCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITeamworkTagMemberCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TeamworkTagMemberCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITeamworkTagMemberRequestBuilder byId(final String id) {
        return new TeamworkTagMemberRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
