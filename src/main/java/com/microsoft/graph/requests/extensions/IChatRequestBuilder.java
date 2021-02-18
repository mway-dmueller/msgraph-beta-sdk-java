// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.TeamworkNotificationRecipient;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTabCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTabRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Chat Request Builder.
 */
public interface IChatRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IChatRequest instance
     */
    IChatRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IChatRequest instance
     */
    IChatRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ITeamsAppInstallationCollectionRequestBuilder installedApps();

    ITeamsAppInstallationRequestBuilder installedApps(final String id);

    IConversationMemberCollectionRequestBuilder members();

    IConversationMemberRequestBuilder members(final String id);

    IChatMessageCollectionRequestBuilder messages();

    IChatMessageRequestBuilder messages(final String id);

    ITeamsTabCollectionRequestBuilder tabs();

    ITeamsTabRequestBuilder tabs(final String id);
    IChatSendActivityNotificationRequestBuilder sendActivityNotification(final TeamworkActivityTopic topic, final String activityType, final Long chainId, final ItemBody previewText, final java.util.List<KeyValuePair> templateParameters, final TeamworkNotificationRecipient recipient, final String teamsAppId);

}