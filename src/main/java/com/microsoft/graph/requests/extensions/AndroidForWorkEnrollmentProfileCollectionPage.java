// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkEnrollmentProfile;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Enrollment Profile Collection Page.
 */
public class AndroidForWorkEnrollmentProfileCollectionPage extends BaseCollectionPage<AndroidForWorkEnrollmentProfile, IAndroidForWorkEnrollmentProfileCollectionRequestBuilder> implements IAndroidForWorkEnrollmentProfileCollectionPage {

    /**
     * A collection page for AndroidForWorkEnrollmentProfile
     *
     * @param response the serialized AndroidForWorkEnrollmentProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AndroidForWorkEnrollmentProfileCollectionPage(final AndroidForWorkEnrollmentProfileCollectionResponse response, final IAndroidForWorkEnrollmentProfileCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}