// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMessageReplyRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Message Reply Request Builder.
 */
public interface IMessageReplyRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IMessageReplyRequest
     *
     * @return the IMessageReplyRequest instance
     */
    IMessageReplyRequest buildRequest();

    /**
     * Creates the IMessageReplyRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IMessageReplyRequest instance
     */
    IMessageReplyRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
