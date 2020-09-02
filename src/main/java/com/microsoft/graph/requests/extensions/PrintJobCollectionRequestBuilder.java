// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrinterBase;
import com.microsoft.graph.models.extensions.PrintJob;
import com.microsoft.graph.models.extensions.PrintJobStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrintJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintJobRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintJobCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Collection Request Builder.
 */
public class PrintJobCollectionRequestBuilder extends BaseRequestBuilder implements IPrintJobCollectionRequestBuilder {

    /**
     * The request builder for this collection of PrinterBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintJobCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IPrintJobCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPrintJobCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrintJobCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrintJobRequestBuilder byId(final String id) {
        return new PrintJobRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}