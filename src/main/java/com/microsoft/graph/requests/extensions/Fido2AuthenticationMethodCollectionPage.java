// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Fido2AuthenticationMethod;
import com.microsoft.graph.requests.extensions.IFido2AuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Fido2Authentication Method Collection Page.
 */
public class Fido2AuthenticationMethodCollectionPage extends BaseCollectionPage<Fido2AuthenticationMethod, IFido2AuthenticationMethodCollectionRequestBuilder> implements IFido2AuthenticationMethodCollectionPage {

    /**
     * A collection page for Fido2AuthenticationMethod
     *
     * @param response the serialized Fido2AuthenticationMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public Fido2AuthenticationMethodCollectionPage(final Fido2AuthenticationMethodCollectionResponse response, final IFido2AuthenticationMethodCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
