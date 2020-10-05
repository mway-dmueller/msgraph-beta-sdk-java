// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SensitiveType;
import com.microsoft.graph.requests.extensions.ISensitiveTypeCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SensitiveTypeCollectionPage;
import com.microsoft.graph.requests.extensions.SensitiveTypeCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitive Type Collection Page.
 */
public class SensitiveTypeCollectionPage extends BaseCollectionPage<SensitiveType, ISensitiveTypeCollectionRequestBuilder> implements ISensitiveTypeCollectionPage {

    /**
     * A collection page for SensitiveType
     *
     * @param response the serialized SensitiveTypeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SensitiveTypeCollectionPage(final SensitiveTypeCollectionResponse response, final ISensitiveTypeCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
