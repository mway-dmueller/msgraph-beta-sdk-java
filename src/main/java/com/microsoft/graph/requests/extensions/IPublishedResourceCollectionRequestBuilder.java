// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnPremisesPublishingProfile;
import com.microsoft.graph.models.extensions.PublishedResource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPublishedResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPublishedResourceCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Published Resource Collection Request Builder.
 */
public interface IPublishedResourceCollectionRequestBuilder extends IRequestBuilder {

    IPublishedResourceCollectionRequest buildRequest();

    IPublishedResourceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IPublishedResourceRequestBuilder byId(final String id);

}