// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceWithoutCloudIdentity;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Without Cloud Identity Collection Page.
 */
public class UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsDeviceWithoutCloudIdentity, IUserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionRequestBuilder> implements IUserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage {

    /**
     * A collection page for UserExperienceAnalyticsDeviceWithoutCloudIdentity
     *
     * @param response the serialized UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionPage(final UserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionResponse response, final IUserExperienceAnalyticsDeviceWithoutCloudIdentityCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
