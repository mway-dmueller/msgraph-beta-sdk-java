// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.AddToReviewSetOperation;
import com.microsoft.graph.ediscovery.requests.extensions.IReviewSetWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ReviewSetWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ISourceCollectionWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.SourceCollectionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Add To Review Set Operation Request Builder.
 */
public class AddToReviewSetOperationRequestBuilder extends BaseRequestBuilder implements IAddToReviewSetOperationRequestBuilder {

    /**
     * The request builder for the AddToReviewSetOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AddToReviewSetOperationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAddToReviewSetOperationRequest instance
     */
    public IAddToReviewSetOperationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAddToReviewSetOperationRequest instance
     */
    public IAddToReviewSetOperationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.ediscovery.requests.extensions.AddToReviewSetOperationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ReviewSet
     *
     * @return the IReviewSetWithReferenceRequestBuilder instance
     */
    public IReviewSetWithReferenceRequestBuilder reviewSet() {
        return new ReviewSetWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSet"), getClient(), null);
    }

    /**
     * Gets the request builder for SourceCollection
     *
     * @return the ISourceCollectionWithReferenceRequestBuilder instance
     */
    public ISourceCollectionWithReferenceRequestBuilder sourceCollection() {
        return new SourceCollectionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("sourceCollection"), getClient(), null);
    }
}
