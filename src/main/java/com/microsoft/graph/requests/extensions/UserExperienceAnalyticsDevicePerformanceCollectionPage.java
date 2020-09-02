// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Performance Collection Page.
 */
public class UserExperienceAnalyticsDevicePerformanceCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsDevicePerformance, IUserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder> implements IUserExperienceAnalyticsDevicePerformanceCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsDevicePerformance
     *
     * @param response the serialized UserExperienceAnalyticsDevicePerformanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsDevicePerformanceCollectionPage(final UserExperienceAnalyticsDevicePerformanceCollectionResponse response, final IUserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}