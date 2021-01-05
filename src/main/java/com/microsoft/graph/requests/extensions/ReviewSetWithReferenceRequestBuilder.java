// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.models.generated.ExportOptions;
import com.microsoft.graph.models.generated.ExportFileStructure;
import java.util.EnumSet;
import com.microsoft.graph.requests.extensions.IReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetQueryRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetQueryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set With Reference Request Builder.
 */
public class ReviewSetWithReferenceRequestBuilder extends BaseRequestBuilder implements IReviewSetWithReferenceRequestBuilder {

    /**
     * The request builder for the ReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IReviewSetWithReferenceRequest instance
     */
    public IReviewSetWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IReviewSetWithReferenceRequest instance
     */
    public IReviewSetWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ReviewSetWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IReviewSetReferenceRequestBuilder reference(){
        return new ReviewSetReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}