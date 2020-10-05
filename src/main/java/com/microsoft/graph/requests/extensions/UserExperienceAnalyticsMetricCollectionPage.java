// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetric;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Metric Collection Page.
 */
public class UserExperienceAnalyticsMetricCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsMetric, IUserExperienceAnalyticsMetricCollectionRequestBuilder> implements IUserExperienceAnalyticsMetricCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsMetric
     *
     * @param response the serialized UserExperienceAnalyticsMetricCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsMetricCollectionPage(final UserExperienceAnalyticsMetricCollectionResponse response, final IUserExperienceAnalyticsMetricCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
