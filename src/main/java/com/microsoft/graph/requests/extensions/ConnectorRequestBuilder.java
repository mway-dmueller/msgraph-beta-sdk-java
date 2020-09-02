// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Connector;
import com.microsoft.graph.requests.extensions.IConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorGroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connector Request Builder.
 */
public class ConnectorRequestBuilder extends BaseRequestBuilder implements IConnectorRequestBuilder {

    /**
     * The request builder for the Connector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConnectorRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IConnectorRequest instance
     */
    public IConnectorRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IConnectorRequest instance
     */
    public IConnectorRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ConnectorRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IConnectorGroupCollectionWithReferencesRequestBuilder memberOf() {
        return new ConnectorGroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    public IConnectorGroupWithReferenceRequestBuilder memberOf(final String id) {
        return new ConnectorGroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
}