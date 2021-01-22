// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DepOnboardingSetting;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingCollectionRequest;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingGetExpiringVppTokenCountRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dep Onboarding Setting Collection Request Builder.
 */
public interface IDepOnboardingSettingCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IDepOnboardingSettingCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IDepOnboardingSettingCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IDepOnboardingSettingRequestBuilder byId(final String id);

    IDepOnboardingSettingGetExpiringVppTokenCountRequestBuilder getExpiringVppTokenCount(final String expiringBeforeDateTime);
}