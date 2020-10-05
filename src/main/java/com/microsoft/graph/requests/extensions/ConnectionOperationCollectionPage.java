// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ConnectionOperation;
import com.microsoft.graph.requests.extensions.IConnectionOperationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ConnectionOperationCollectionPage;
import com.microsoft.graph.requests.extensions.ConnectionOperationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connection Operation Collection Page.
 */
public class ConnectionOperationCollectionPage extends BaseCollectionPage<ConnectionOperation, IConnectionOperationCollectionRequestBuilder> implements IConnectionOperationCollectionPage {

    /**
     * A collection page for ConnectionOperation
     *
     * @param response the serialized ConnectionOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ConnectionOperationCollectionPage(final ConnectionOperationCollectionResponse response, final IConnectionOperationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
