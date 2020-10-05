// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PurchaseInvoiceLine;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.AccountRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice Line Request.
 */
public class PurchaseInvoiceLineRequest extends BaseRequest implements IPurchaseInvoiceLineRequest {
	
    /**
     * The request for the PurchaseInvoiceLine
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PurchaseInvoiceLineRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PurchaseInvoiceLine.class);
    }

    /**
     * Gets the PurchaseInvoiceLine from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PurchaseInvoiceLine> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PurchaseInvoiceLine from the service
     *
     * @return the PurchaseInvoiceLine from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PurchaseInvoiceLine get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PurchaseInvoiceLine> callback) {
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
     * Patches this PurchaseInvoiceLine with a source
     *
     * @param sourcePurchaseInvoiceLine the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PurchaseInvoiceLine sourcePurchaseInvoiceLine, final ICallback<? super PurchaseInvoiceLine> callback) {
        send(HttpMethod.PATCH, callback, sourcePurchaseInvoiceLine);
    }

    /**
     * Patches this PurchaseInvoiceLine with a source
     *
     * @param sourcePurchaseInvoiceLine the source object with updates
     * @return the updated PurchaseInvoiceLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PurchaseInvoiceLine patch(final PurchaseInvoiceLine sourcePurchaseInvoiceLine) throws ClientException {
        return send(HttpMethod.PATCH, sourcePurchaseInvoiceLine);
    }

    /**
     * Creates a PurchaseInvoiceLine with a new object
     *
     * @param newPurchaseInvoiceLine the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PurchaseInvoiceLine newPurchaseInvoiceLine, final ICallback<? super PurchaseInvoiceLine> callback) {
        send(HttpMethod.POST, callback, newPurchaseInvoiceLine);
    }

    /**
     * Creates a PurchaseInvoiceLine with a new object
     *
     * @param newPurchaseInvoiceLine the new object to create
     * @return the created PurchaseInvoiceLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PurchaseInvoiceLine post(final PurchaseInvoiceLine newPurchaseInvoiceLine) throws ClientException {
        return send(HttpMethod.POST, newPurchaseInvoiceLine);
    }

    /**
     * Creates a PurchaseInvoiceLine with a new object
     *
     * @param newPurchaseInvoiceLine the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PurchaseInvoiceLine newPurchaseInvoiceLine, final ICallback<? super PurchaseInvoiceLine> callback) {
        send(HttpMethod.PUT, callback, newPurchaseInvoiceLine);
    }

    /**
     * Creates a PurchaseInvoiceLine with a new object
     *
     * @param newPurchaseInvoiceLine the object to create/update
     * @return the created PurchaseInvoiceLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PurchaseInvoiceLine put(final PurchaseInvoiceLine newPurchaseInvoiceLine) throws ClientException {
        return send(HttpMethod.PUT, newPurchaseInvoiceLine);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPurchaseInvoiceLineRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PurchaseInvoiceLineRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPurchaseInvoiceLineRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PurchaseInvoiceLineRequest)this;
     }

}

