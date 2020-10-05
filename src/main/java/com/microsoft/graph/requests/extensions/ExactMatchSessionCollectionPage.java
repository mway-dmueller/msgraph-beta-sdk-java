// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExactMatchSession;
import com.microsoft.graph.requests.extensions.IExactMatchSessionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ExactMatchSessionCollectionPage;
import com.microsoft.graph.requests.extensions.ExactMatchSessionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Session Collection Page.
 */
public class ExactMatchSessionCollectionPage extends BaseCollectionPage<ExactMatchSession, IExactMatchSessionCollectionRequestBuilder> implements IExactMatchSessionCollectionPage {

    /**
     * A collection page for ExactMatchSession
     *
     * @param response the serialized ExactMatchSessionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExactMatchSessionCollectionPage(final ExactMatchSessionCollectionResponse response, final IExactMatchSessionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
