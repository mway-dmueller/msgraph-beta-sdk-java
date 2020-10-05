// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformance;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Model Performance Collection Page.
 */
public class UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthDeviceModelPerformance, IUserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder> implements IUserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthDeviceModelPerformance
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionPage(final UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionResponse response, final IUserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
