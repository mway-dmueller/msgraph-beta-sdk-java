// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.ReviewSet;
import com.microsoft.graph.ediscovery.models.extensions.SourceCollection;
import com.microsoft.graph.ediscovery.models.generated.DataCollectionScope;
import java.util.EnumSet;
import com.microsoft.graph.ediscovery.models.generated.ExportOptions;
import com.microsoft.graph.ediscovery.models.generated.ExportFileStructure;
import com.microsoft.graph.ediscovery.requests.extensions.IReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IReviewSetQueryRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ReviewSetQueryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Request Builder.
 */
public class ReviewSetRequestBuilder extends BaseRequestBuilder implements IReviewSetRequestBuilder {

    /**
     * The request builder for the ReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IReviewSetRequest instance
     */
    public IReviewSetRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IReviewSetRequest instance
     */
    public IReviewSetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.ediscovery.requests.extensions.ReviewSetRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IReviewSetQueryCollectionRequestBuilder queries() {
        return new ReviewSetQueryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("queries"), getClient(), null);
    }

    public IReviewSetQueryRequestBuilder queries(final String id) {
        return new ReviewSetQueryRequestBuilder(getRequestUrlWithAdditionalSegment("queries") + "/" + id, getClient(), null);
    }

    public IReviewSetAddToReviewSetRequestBuilder addToReviewSet(final SourceCollection sourceCollection, final EnumSet<DataCollectionScope> additionalData) {
        return new ReviewSetAddToReviewSetRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.addToReviewSet"), getClient(), null, sourceCollection, additionalData);
    }

    public IReviewSetExportRequestBuilder export(final String outputName, final String description, final String azureBlobContainer, final String azureBlobToken, final EnumSet<ExportOptions> exportOptions, final ExportFileStructure exportStructure) {
        return new ReviewSetExportRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.ediscovery.export"), getClient(), null, outputName, description, azureBlobContainer, azureBlobToken, exportOptions, exportStructure);
    }
}
