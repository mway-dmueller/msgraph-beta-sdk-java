// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BookingBusiness;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Booking Business Request.
 */
public interface IBookingBusinessRequest extends IHttpRequest {

    /**
     * Gets the BookingBusiness from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super BookingBusiness> callback);

    /**
     * Gets the BookingBusiness from the service
     *
     * @return the BookingBusiness from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingBusiness get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super BookingBusiness> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this BookingBusiness with a source
     *
     * @param sourceBookingBusiness the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final BookingBusiness sourceBookingBusiness, final ICallback<? super BookingBusiness> callback);

    /**
     * Patches this BookingBusiness with a source
     *
     * @param sourceBookingBusiness the source object with updates
     * @return the updated BookingBusiness
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingBusiness patch(final BookingBusiness sourceBookingBusiness) throws ClientException;

    /**
     * Posts a BookingBusiness with a new object
     *
     * @param newBookingBusiness the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final BookingBusiness newBookingBusiness, final ICallback<? super BookingBusiness> callback);

    /**
     * Posts a BookingBusiness with a new object
     *
     * @param newBookingBusiness the new object to create
     * @return the created BookingBusiness
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingBusiness post(final BookingBusiness newBookingBusiness) throws ClientException;

    /**
     * Posts a BookingBusiness with a new object
     *
     * @param newBookingBusiness the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final BookingBusiness newBookingBusiness, final ICallback<? super BookingBusiness> callback);

    /**
     * Posts a BookingBusiness with a new object
     *
     * @param newBookingBusiness the object to create/update
     * @return the created BookingBusiness
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingBusiness put(final BookingBusiness newBookingBusiness) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBookingBusinessRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBookingBusinessRequest expand(final String value);

}
