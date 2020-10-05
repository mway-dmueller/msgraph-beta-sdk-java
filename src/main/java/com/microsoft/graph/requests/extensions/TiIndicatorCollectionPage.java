// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TiIndicator;
import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TiIndicatorCollectionPage;
import com.microsoft.graph.requests.extensions.TiIndicatorCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Collection Page.
 */
public class TiIndicatorCollectionPage extends BaseCollectionPage<TiIndicator, ITiIndicatorCollectionRequestBuilder> implements ITiIndicatorCollectionPage {

    /**
     * A collection page for TiIndicator
     *
     * @param response the serialized TiIndicatorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TiIndicatorCollectionPage(final TiIndicatorCollectionResponse response, final ITiIndicatorCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
