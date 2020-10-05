// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.requests.extensions.IPrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Share Reference Request.
 */
public class PrinterShareReferenceRequest extends BaseRequest implements IPrinterShareReferenceRequest {

    /**
     * The request for the PrinterShare
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterShareReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrinterShare.class);
    }

    public void delete(final ICallback<? super PrinterShare> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public PrinterShare delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrinterShareReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrinterShareReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrinterShareReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrinterShareReferenceRequest)this;
    }
    /**
     * Puts the PrinterShare
     *
     * @param srcPrinterShare the PrinterShare reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(PrinterShare srcPrinterShare, final ICallback<? super PrinterShare> callback) {
        send(HttpMethod.PUT, callback, srcPrinterShare);
    }

    /**
     * Puts the PrinterShare
     *
     * @param srcPrinterShare the PrinterShare reference to PUT
     * @return the PrinterShare
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PrinterShare put(PrinterShare srcPrinterShare) throws ClientException {
        return send(HttpMethod.PUT, srcPrinterShare);
    }
}
