// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMessageCreateReplyRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Message Create Reply Request Builder.
 */
public interface IMessageCreateReplyRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IMessageCreateReplyRequest
     *
     * @param requestOptions the options for the request
     * @return the IMessageCreateReplyRequest instance
     */
    IMessageCreateReplyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IMessageCreateReplyRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IMessageCreateReplyRequest instance
     */
    IMessageCreateReplyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}