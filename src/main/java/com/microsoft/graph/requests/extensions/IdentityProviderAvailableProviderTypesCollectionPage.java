// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IIdentityProviderAvailableProviderTypesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderAvailableProviderTypesCollectionPage;
import com.microsoft.graph.requests.extensions.IdentityProviderAvailableProviderTypesCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Available Provider Types Collection Page.
 */
public class IdentityProviderAvailableProviderTypesCollectionPage extends BaseCollectionPage<String, IIdentityProviderAvailableProviderTypesCollectionRequestBuilder> implements IIdentityProviderAvailableProviderTypesCollectionPage {

    /**
     * A collection page for String.
     *
     * @param response The serialized IdentityProviderAvailableProviderTypesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public IdentityProviderAvailableProviderTypesCollectionPage(final IdentityProviderAvailableProviderTypesCollectionResponse response, final IIdentityProviderAvailableProviderTypesCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
