// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BookingCustomer;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Booking Customer Request.
 */
public interface IBookingCustomerRequest extends IHttpRequest {

    /**
     * Gets the BookingCustomer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super BookingCustomer> callback);

    /**
     * Gets the BookingCustomer from the service
     *
     * @return the BookingCustomer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingCustomer get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super BookingCustomer> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this BookingCustomer with a source
     *
     * @param sourceBookingCustomer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final BookingCustomer sourceBookingCustomer, final ICallback<? super BookingCustomer> callback);

    /**
     * Patches this BookingCustomer with a source
     *
     * @param sourceBookingCustomer the source object with updates
     * @return the updated BookingCustomer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingCustomer patch(final BookingCustomer sourceBookingCustomer) throws ClientException;

    /**
     * Posts a BookingCustomer with a new object
     *
     * @param newBookingCustomer the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final BookingCustomer newBookingCustomer, final ICallback<? super BookingCustomer> callback);

    /**
     * Posts a BookingCustomer with a new object
     *
     * @param newBookingCustomer the new object to create
     * @return the created BookingCustomer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingCustomer post(final BookingCustomer newBookingCustomer) throws ClientException;

    /**
     * Posts a BookingCustomer with a new object
     *
     * @param newBookingCustomer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final BookingCustomer newBookingCustomer, final ICallback<? super BookingCustomer> callback);

    /**
     * Posts a BookingCustomer with a new object
     *
     * @param newBookingCustomer the object to create/update
     * @return the created BookingCustomer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingCustomer put(final BookingCustomer newBookingCustomer) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBookingCustomerRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBookingCustomerRequest expand(final String value);

}

