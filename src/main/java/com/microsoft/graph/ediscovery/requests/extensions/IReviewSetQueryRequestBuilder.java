// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.ReviewSetQuery;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Review Set Query Request Builder.
 */
public interface IReviewSetQueryRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IReviewSetQueryRequest instance
     */
    IReviewSetQueryRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IReviewSetQueryRequest instance
     */
    IReviewSetQueryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IReviewSetQueryApplyTagsRequestBuilder applyTags(final java.util.List<Tag> tagsToAdd, final java.util.List<Tag> tagsToRemove);

}