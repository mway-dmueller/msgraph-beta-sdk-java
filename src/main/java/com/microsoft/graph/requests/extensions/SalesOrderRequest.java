// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesOrder;
import com.microsoft.graph.requests.extensions.ISalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderLineRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SalesOrderLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.CustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Order Request.
 */
public class SalesOrderRequest extends BaseRequest implements ISalesOrderRequest {
	
    /**
     * The request for the SalesOrder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesOrderRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SalesOrder.class);
    }

    /**
     * Gets the SalesOrder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SalesOrder> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SalesOrder from the service
     *
     * @return the SalesOrder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesOrder get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SalesOrder> callback) {
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
     * Patches this SalesOrder with a source
     *
     * @param sourceSalesOrder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SalesOrder sourceSalesOrder, final ICallback<? super SalesOrder> callback) {
        send(HttpMethod.PATCH, callback, sourceSalesOrder);
    }

    /**
     * Patches this SalesOrder with a source
     *
     * @param sourceSalesOrder the source object with updates
     * @return the updated SalesOrder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesOrder patch(final SalesOrder sourceSalesOrder) throws ClientException {
        return send(HttpMethod.PATCH, sourceSalesOrder);
    }

    /**
     * Creates a SalesOrder with a new object
     *
     * @param newSalesOrder the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SalesOrder newSalesOrder, final ICallback<? super SalesOrder> callback) {
        send(HttpMethod.POST, callback, newSalesOrder);
    }

    /**
     * Creates a SalesOrder with a new object
     *
     * @param newSalesOrder the new object to create
     * @return the created SalesOrder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesOrder post(final SalesOrder newSalesOrder) throws ClientException {
        return send(HttpMethod.POST, newSalesOrder);
    }

    /**
     * Creates a SalesOrder with a new object
     *
     * @param newSalesOrder the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SalesOrder newSalesOrder, final ICallback<? super SalesOrder> callback) {
        send(HttpMethod.PUT, callback, newSalesOrder);
    }

    /**
     * Creates a SalesOrder with a new object
     *
     * @param newSalesOrder the object to create/update
     * @return the created SalesOrder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SalesOrder put(final SalesOrder newSalesOrder) throws ClientException {
        return send(HttpMethod.PUT, newSalesOrder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISalesOrderRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SalesOrderRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISalesOrderRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SalesOrderRequest)this;
     }

}

