// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingCustomer;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Customer Request.
 */
public class BookingCustomerRequest extends BaseRequest implements IBookingCustomerRequest {
	
    /**
     * The request for the BookingCustomer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingCustomerRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingCustomer.class);
    }

    /**
     * Gets the BookingCustomer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super BookingCustomer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BookingCustomer from the service
     *
     * @return the BookingCustomer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingCustomer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super BookingCustomer> callback) {
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
     * Patches this BookingCustomer with a source
     *
     * @param sourceBookingCustomer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final BookingCustomer sourceBookingCustomer, final ICallback<? super BookingCustomer> callback) {
        send(HttpMethod.PATCH, callback, sourceBookingCustomer);
    }

    /**
     * Patches this BookingCustomer with a source
     *
     * @param sourceBookingCustomer the source object with updates
     * @return the updated BookingCustomer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingCustomer patch(final BookingCustomer sourceBookingCustomer) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingCustomer);
    }

    /**
     * Creates a BookingCustomer with a new object
     *
     * @param newBookingCustomer the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final BookingCustomer newBookingCustomer, final ICallback<? super BookingCustomer> callback) {
        send(HttpMethod.POST, callback, newBookingCustomer);
    }

    /**
     * Creates a BookingCustomer with a new object
     *
     * @param newBookingCustomer the new object to create
     * @return the created BookingCustomer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingCustomer post(final BookingCustomer newBookingCustomer) throws ClientException {
        return send(HttpMethod.POST, newBookingCustomer);
    }

    /**
     * Creates a BookingCustomer with a new object
     *
     * @param newBookingCustomer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final BookingCustomer newBookingCustomer, final ICallback<? super BookingCustomer> callback) {
        send(HttpMethod.PUT, callback, newBookingCustomer);
    }

    /**
     * Creates a BookingCustomer with a new object
     *
     * @param newBookingCustomer the object to create/update
     * @return the created BookingCustomer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingCustomer put(final BookingCustomer newBookingCustomer) throws ClientException {
        return send(HttpMethod.PUT, newBookingCustomer);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IBookingCustomerRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (BookingCustomerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IBookingCustomerRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (BookingCustomerRequest)this;
     }

}

