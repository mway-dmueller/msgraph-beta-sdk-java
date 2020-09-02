// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupHistory;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Startup History Collection Page.
 */
public class UserExperienceAnalyticsDeviceStartupHistoryCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsDeviceStartupHistory, IUserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder> implements IUserExperienceAnalyticsDeviceStartupHistoryCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsDeviceStartupHistory
     *
     * @param response the serialized UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsDeviceStartupHistoryCollectionPage(final UserExperienceAnalyticsDeviceStartupHistoryCollectionResponse response, final IUserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}