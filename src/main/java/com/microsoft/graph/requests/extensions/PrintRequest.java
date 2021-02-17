// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Print;
import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterShareCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterShareRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintServiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintServiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Request.
 */
public class PrintRequest extends BaseRequest implements IPrintRequest {
	
    /**
     * The request for the Print
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Print.class);
    }

    /**
     * Gets the Print from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Print> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Print from the service
     *
     * @return the Print from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Print get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Print> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Print with a source
     *
     * @param sourcePrint the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Print sourcePrint, final ICallback<? super Print> callback) {
        send(HttpMethod.PATCH, callback, sourcePrint);
    }

    /**
     * Patches this Print with a source
     *
     * @param sourcePrint the source object with updates
     * @return the updated Print
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Print patch(final Print sourcePrint) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrint);
    }

    /**
     * Creates a Print with a new object
     *
     * @param newPrint the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Print newPrint, final ICallback<? super Print> callback) {
        send(HttpMethod.POST, callback, newPrint);
    }

    /**
     * Creates a Print with a new object
     *
     * @param newPrint the new object to create
     * @return the created Print
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Print post(final Print newPrint) throws ClientException {
        return send(HttpMethod.POST, newPrint);
    }

    /**
     * Creates a Print with a new object
     *
     * @param newPrint the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Print newPrint, final ICallback<? super Print> callback) {
        send(HttpMethod.PUT, callback, newPrint);
    }

    /**
     * Creates a Print with a new object
     *
     * @param newPrint the object to create/update
     * @return the created Print
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Print put(final Print newPrint) throws ClientException {
        return send(HttpMethod.PUT, newPrint);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrintRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrintRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrintRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrintRequest)this;
     }

}

