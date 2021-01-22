// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import com.microsoft.graph.models.extensions.MobileAppRelationship;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.MobileAppRelationshipState;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Request Builder.
 */
public interface IMobileAppRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppRequest instance
     */
    IMobileAppRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IMobileAppRequest instance
     */
    IMobileAppRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IMobileAppAssignmentCollectionRequestBuilder assignments();

    IMobileAppAssignmentRequestBuilder assignments(final String id);

    IMobileAppCategoryCollectionWithReferencesRequestBuilder categories();

    IMobileAppCategoryWithReferenceRequestBuilder categories(final String id);

    IMobileAppInstallStatusCollectionRequestBuilder deviceStatuses();

    IMobileAppInstallStatusRequestBuilder deviceStatuses(final String id);

    /**
     * Gets the request builder for MobileAppInstallSummary
     *
     * @return the IMobileAppInstallSummaryRequestBuilder instance
     */
    IMobileAppInstallSummaryRequestBuilder installSummary();

    IMobileAppRelationshipCollectionRequestBuilder relationships();

    IMobileAppRelationshipRequestBuilder relationships(final String id);

    IUserAppInstallStatusCollectionRequestBuilder userStatuses();

    IUserAppInstallStatusRequestBuilder userStatuses(final String id);
    IMobileAppAssignRequestBuilder assign(final java.util.List<MobileAppAssignment> mobileAppAssignments);
    IMobileAppUpdateRelationshipsRequestBuilder updateRelationships(final java.util.List<MobileAppRelationship> relationships);

    IMobileAppGetRelatedAppStatesCollectionRequestBuilder getRelatedAppStates(final String userPrincipalName, final String deviceId);

}