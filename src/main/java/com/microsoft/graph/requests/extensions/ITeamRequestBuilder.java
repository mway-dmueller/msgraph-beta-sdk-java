// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITeamRequest;
import com.microsoft.graph.requests.extensions.IScheduleRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import com.microsoft.graph.requests.extensions.ITeamCloneRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamArchiveRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamUnarchiveRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Team Request Builder.
 */
public interface ITeamRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ITeamRequest instance
     */
    ITeamRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ITeamRequest instance
     */
    ITeamRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for Schedule
     *
     * @return the IScheduleRequestBuilder instance
     */
    IScheduleRequestBuilder schedule();

    /**
     * Gets the request builder for Group
     *
     * @return the IGroupWithReferenceRequestBuilder instance
     */
    IGroupWithReferenceRequestBuilder group();

    /**
     * Gets the request builder for TeamsTemplate
     *
     * @return the ITeamsTemplateWithReferenceRequestBuilder instance
     */
    ITeamsTemplateWithReferenceRequestBuilder template();

    IConversationMemberCollectionRequestBuilder members();

    IConversationMemberRequestBuilder members(final String id);

    IChannelCollectionRequestBuilder channels();

    IChannelRequestBuilder channels(final String id);

    /**
     * Gets the request builder for Channel
     *
     * @return the IChannelRequestBuilder instance
     */
    IChannelRequestBuilder primaryChannel();

    ITeamsAppInstallationCollectionRequestBuilder installedApps();

    ITeamsAppInstallationRequestBuilder installedApps(final String id);

    ITeamsAsyncOperationCollectionRequestBuilder operations();

    ITeamsAsyncOperationRequestBuilder operations(final String id);
    ITeamCloneRequestBuilder clone(final String displayName, final String description, final String mailNickname, final String classification, final TeamVisibilityType visibility, final EnumSet<ClonableTeamParts> partsToClone);
    ITeamArchiveRequestBuilder archive(final Boolean shouldSetSpoSiteReadOnlyForMembers);
    ITeamUnarchiveRequestBuilder unarchive();

}
