// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITeamAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamAllMessagesCollectionPage;
import com.microsoft.graph.requests.extensions.TeamAllMessagesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team All Messages Collection Request.
 */
public class TeamAllMessagesCollectionRequest extends BaseCollectionRequest<TeamAllMessagesCollectionResponse, ITeamAllMessagesCollectionPage> implements ITeamAllMessagesCollectionRequest {


    /**
     * The request for this TeamAllMessages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamAllMessagesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamAllMessagesCollectionResponse.class, ITeamAllMessagesCollectionPage.class);
    }


    public void get(final ICallback<ITeamAllMessagesCollectionPage> callback) {
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

    public ITeamAllMessagesCollectionPage get() throws ClientException {
        final TeamAllMessagesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public ITeamAllMessagesCollectionPage buildFromResponse(final TeamAllMessagesCollectionResponse response) {
        final ITeamAllMessagesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TeamAllMessagesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ITeamAllMessagesCollectionPage page = new TeamAllMessagesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamAllMessagesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ITeamAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITeamAllMessagesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ITeamAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamAllMessagesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ITeamAllMessagesCollectionRequest)this;
    }

}