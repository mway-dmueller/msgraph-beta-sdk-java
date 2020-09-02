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
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App With Reference Request Builder.
 */
public class MobileAppWithReferenceRequestBuilder extends BaseRequestBuilder implements IMobileAppWithReferenceRequestBuilder {

    /**
     * The request builder for the MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IMobileAppWithReferenceRequest instance
     */
    public IMobileAppWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IMobileAppWithReferenceRequest instance
     */
    public IMobileAppWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MobileAppWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppReferenceRequestBuilder reference(){
        return new MobileAppReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}