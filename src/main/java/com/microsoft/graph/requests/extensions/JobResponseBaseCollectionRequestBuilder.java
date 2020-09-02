// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.JobResponseBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IJobResponseBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Job Response Base Collection Request Builder.
 */
public class JobResponseBaseCollectionRequestBuilder extends BaseRequestBuilder implements IJobResponseBaseCollectionRequestBuilder {

    /**
     * The request builder for this collection of DataClassificationService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public JobResponseBaseCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IJobResponseBaseCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IJobResponseBaseCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new JobResponseBaseCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IJobResponseBaseRequestBuilder byId(final String id) {
        return new JobResponseBaseRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}