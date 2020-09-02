// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BookingService;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Booking Service Request.
 */
public interface IBookingServiceRequest extends IHttpRequest {

    /**
     * Gets the BookingService from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<BookingService> callback);

    /**
     * Gets the BookingService from the service
     *
     * @return the BookingService from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingService get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<BookingService> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this BookingService with a source
     *
     * @param sourceBookingService the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final BookingService sourceBookingService, final ICallback<BookingService> callback);

    /**
     * Patches this BookingService with a source
     *
     * @param sourceBookingService the source object with updates
     * @return the updated BookingService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingService patch(final BookingService sourceBookingService) throws ClientException;

    /**
     * Posts a BookingService with a new object
     *
     * @param newBookingService the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final BookingService newBookingService, final ICallback<BookingService> callback);

    /**
     * Posts a BookingService with a new object
     *
     * @param newBookingService the new object to create
     * @return the created BookingService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingService post(final BookingService newBookingService) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBookingServiceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBookingServiceRequest expand(final String value);

}
