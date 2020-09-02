// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileLobApp;
import com.microsoft.graph.models.extensions.MobileAppContent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content Collection Request Builder.
 */
public class MobileAppContentCollectionRequestBuilder extends BaseRequestBuilder implements IMobileAppContentCollectionRequestBuilder {

    /**
     * The request builder for this collection of MobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMobileAppContentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMobileAppContentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MobileAppContentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppContentRequestBuilder byId(final String id) {
        return new MobileAppContentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}