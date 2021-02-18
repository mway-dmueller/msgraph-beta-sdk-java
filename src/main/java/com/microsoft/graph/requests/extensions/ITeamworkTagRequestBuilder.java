// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamworkTag;
import com.microsoft.graph.requests.extensions.ITeamworkTagMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkTagMemberRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Teamwork Tag Request Builder.
 */
public interface ITeamworkTagRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITeamworkTagRequest instance
     */
    ITeamworkTagRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ITeamworkTagRequest instance
     */
    ITeamworkTagRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ITeamworkTagMemberCollectionRequestBuilder members();

    ITeamworkTagMemberRequestBuilder members(final String id);

}