// Template Source: BaseEntityCollectionRequest.java.tt
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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITeamworkTagMemberCollectionPage;
import com.microsoft.graph.requests.extensions.TeamworkTagMemberCollectionResponse;
import com.microsoft.graph.requests.extensions.ITeamworkTagMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkTagMemberCollectionRequest;
import com.microsoft.graph.requests.extensions.TeamworkTagMemberCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Tag Member Collection Request.
 */
public class TeamworkTagMemberCollectionRequest extends BaseCollectionRequest<TeamworkTagMemberCollectionResponse, ITeamworkTagMemberCollectionPage> implements ITeamworkTagMemberCollectionRequest {

    /**
     * The request builder for this collection of TeamworkTagMember
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamworkTagMemberCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamworkTagMemberCollectionResponse.class, ITeamworkTagMemberCollectionPage.class);
    }

    public void get(final ICallback<? super ITeamworkTagMemberCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITeamworkTagMemberCollectionPage get() throws ClientException {
        final TeamworkTagMemberCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TeamworkTagMember newTeamworkTagMember, final ICallback<? super TeamworkTagMember> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TeamworkTagMemberRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTeamworkTagMember, callback);
    }

    public TeamworkTagMember post(final TeamworkTagMember newTeamworkTagMember) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamworkTagMemberRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTeamworkTagMember);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamworkTagMemberCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TeamworkTagMemberCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITeamworkTagMemberCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TeamworkTagMemberCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ITeamworkTagMemberCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (TeamworkTagMemberCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamworkTagMemberCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TeamworkTagMemberCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITeamworkTagMemberCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TeamworkTagMemberCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ITeamworkTagMemberCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (TeamworkTagMemberCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ITeamworkTagMemberCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ITeamworkTagMemberCollectionRequest)this;
    }
    public ITeamworkTagMemberCollectionPage buildFromResponse(final TeamworkTagMemberCollectionResponse response) {
        final ITeamworkTagMemberCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TeamworkTagMemberCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TeamworkTagMemberCollectionPage page = new TeamworkTagMemberCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
