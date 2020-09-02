// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsBaseline;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsBaselineCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Baseline Collection Page.
 */
public class UserExperienceAnalyticsBaselineCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsBaseline, IUserExperienceAnalyticsBaselineCollectionRequestBuilder> implements IUserExperienceAnalyticsBaselineCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsBaseline
     *
     * @param response the serialized UserExperienceAnalyticsBaselineCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsBaselineCollectionPage(final UserExperienceAnalyticsBaselineCollectionResponse response, final IUserExperienceAnalyticsBaselineCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}