// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IInvitationRequest;
import com.microsoft.graph.requests.extensions.InvitationRequest;
import com.microsoft.graph.requests.extensions.IUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWithReferenceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Invitation Request Builder.
 */
public class InvitationRequestBuilder extends BaseRequestBuilder implements IInvitationRequestBuilder {

    /**
     * The request builder for the Invitation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InvitationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IInvitationRequest instance
     */
    public IInvitationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IInvitationRequest instance
     */
    public IInvitationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new InvitationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for User
     *
     * @return the IUserWithReferenceRequestBuilder instance
     */
    public IUserWithReferenceRequestBuilder invitedUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("invitedUser"), getClient(), null);
    }
}

