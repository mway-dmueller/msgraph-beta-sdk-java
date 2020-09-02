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

import com.microsoft.graph.requests.extensions.IChatAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatAllMessagesCollectionPage;
import com.microsoft.graph.requests.extensions.ChatAllMessagesCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat All Messages Collection Page.
 */
public class ChatAllMessagesCollectionPage extends BaseCollectionPage<ChatMessage, IChatAllMessagesCollectionRequestBuilder> implements IChatAllMessagesCollectionPage {

    /**
     * A collection page for ChatMessage.
     *
     * @param response The serialized ChatAllMessagesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ChatAllMessagesCollectionPage(final ChatAllMessagesCollectionResponse response, final IChatAllMessagesCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}