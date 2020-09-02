// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EdiscoveryCase;
import com.microsoft.graph.requests.extensions.IReviewSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Case Request Builder.
 */
public class EdiscoveryCaseRequestBuilder extends BaseRequestBuilder implements IEdiscoveryCaseRequestBuilder {

    /**
     * The request builder for the EdiscoveryCase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryCaseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEdiscoveryCaseRequest instance
     */
    public IEdiscoveryCaseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEdiscoveryCaseRequest instance
     */
    public IEdiscoveryCaseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EdiscoveryCaseRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IReviewSetCollectionRequestBuilder reviewSets() {
        return new ReviewSetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSets"), getClient(), null);
    }

    public IReviewSetRequestBuilder reviewSets(final String id) {
        return new ReviewSetRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSets") + "/" + id, getClient(), null);
    }

    public IEdiscoveryCaseCloseRequestBuilder close() {
        return new EdiscoveryCaseCloseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.close"), getClient(), null);
    }

    public IEdiscoveryCaseReopenRequestBuilder reopen() {
        return new EdiscoveryCaseReopenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reopen"), getClient(), null);
    }
}