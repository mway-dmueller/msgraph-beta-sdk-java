// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.IChatMessageHostedContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageHostedContentRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Chat Message Request Builder.
 */
public interface IChatMessageRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IChatMessageRequest instance
     */
    IChatMessageRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IChatMessageRequest instance
     */
    IChatMessageRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IChatMessageHostedContentCollectionRequestBuilder hostedContents();

    IChatMessageHostedContentRequestBuilder hostedContents(final String id);

    IChatMessageCollectionRequestBuilder replies();

    IChatMessageRequestBuilder replies(final String id);

}