// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationFileSynchronizationVerificationMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationSynchronizationProfileStartCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSynchronizationProfileStartCollectionRequest;
import com.microsoft.graph.requests.extensions.EducationSynchronizationProfileStartCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile Start Collection Request Builder.
 */
public class EducationSynchronizationProfileStartCollectionRequestBuilder extends BaseActionRequestBuilder implements IEducationSynchronizationProfileStartCollectionRequestBuilder {

    /**
     * The request builder for this collection of EducationSynchronizationProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSynchronizationProfileStartCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IEducationSynchronizationProfileStartCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IEducationSynchronizationProfileStartCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EducationSynchronizationProfileStartCollectionRequest request = new EducationSynchronizationProfileStartCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

  
        return request;
    }
}
