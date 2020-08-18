// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IParticipantRequest;
import com.microsoft.graph.requests.extensions.IParticipantMuteRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Participant Request Builder.
 */
public interface IParticipantRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IParticipantRequest instance
     */
    IParticipantRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IParticipantRequest instance
     */
    IParticipantRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IParticipantMuteRequestBuilder mute(final String clientContext);

}
