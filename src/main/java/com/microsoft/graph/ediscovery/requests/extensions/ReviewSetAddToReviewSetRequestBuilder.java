// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;
import com.microsoft.graph.ediscovery.requests.extensions.IReviewSetAddToReviewSetRequest;
import com.microsoft.graph.ediscovery.requests.extensions.ReviewSetAddToReviewSetRequest;
import com.microsoft.graph.ediscovery.models.extensions.SourceCollection;
import com.microsoft.graph.ediscovery.models.generated.DataCollectionScope;
import java.util.EnumSet;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Add To Review Set Request Builder.
 */
public class ReviewSetAddToReviewSetRequestBuilder extends BaseActionRequestBuilder implements IReviewSetAddToReviewSetRequestBuilder {

    /**
     * The request builder for this ReviewSetAddToReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param sourceCollection the sourceCollection
     * @param additionalData the additionalData
     */
    public ReviewSetAddToReviewSetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final SourceCollection sourceCollection, final EnumSet<DataCollectionScope> additionalData) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("sourceCollection", sourceCollection);
        bodyParams.put("additionalData", additionalData);
    }

    /**
     * Creates the IReviewSetAddToReviewSetRequest
     *
     * @param requestOptions the options for the request
     * @return the IReviewSetAddToReviewSetRequest instance
     */
    public IReviewSetAddToReviewSetRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IReviewSetAddToReviewSetRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReviewSetAddToReviewSetRequest instance
     */
    public IReviewSetAddToReviewSetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReviewSetAddToReviewSetRequest request = new ReviewSetAddToReviewSetRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sourceCollection")) {
            request.body.sourceCollection = getParameter("sourceCollection");
        }

        if (hasParameter("additionalData")) {
            request.body.additionalData = getParameter("additionalData");
        }

        return request;
    }
}