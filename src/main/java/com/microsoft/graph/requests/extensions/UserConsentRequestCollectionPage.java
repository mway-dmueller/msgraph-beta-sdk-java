// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserConsentRequest;
import com.microsoft.graph.requests.extensions.IUserConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserConsentRequestCollectionPage;
import com.microsoft.graph.requests.extensions.UserConsentRequestCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Consent Request Collection Page.
 */
public class UserConsentRequestCollectionPage extends BaseCollectionPage<UserConsentRequest, IUserConsentRequestCollectionRequestBuilder> implements IUserConsentRequestCollectionPage {

    /**
     * A collection page for UserConsentRequest
     *
     * @param response the serialized UserConsentRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserConsentRequestCollectionPage(final UserConsentRequestCollectionResponse response, final IUserConsentRequestCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
