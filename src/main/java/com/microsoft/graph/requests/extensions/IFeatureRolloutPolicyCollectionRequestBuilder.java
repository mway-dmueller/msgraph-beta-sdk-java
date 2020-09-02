// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Directory;
import com.microsoft.graph.models.extensions.FeatureRolloutPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IFeatureRolloutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IFeatureRolloutPolicyCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Feature Rollout Policy Collection Request Builder.
 */
public interface IFeatureRolloutPolicyCollectionRequestBuilder extends IRequestBuilder {

    IFeatureRolloutPolicyCollectionRequest buildRequest();

    IFeatureRolloutPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IFeatureRolloutPolicyRequestBuilder byId(final String id);

}