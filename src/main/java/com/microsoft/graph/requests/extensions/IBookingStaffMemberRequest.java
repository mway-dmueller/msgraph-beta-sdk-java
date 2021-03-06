// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BookingStaffMember;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Booking Staff Member Request.
 */
public interface IBookingStaffMemberRequest extends IHttpRequest {

    /**
     * Gets the BookingStaffMember from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super BookingStaffMember> callback);

    /**
     * Gets the BookingStaffMember from the service
     *
     * @return the BookingStaffMember from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingStaffMember get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super BookingStaffMember> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this BookingStaffMember with a source
     *
     * @param sourceBookingStaffMember the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final BookingStaffMember sourceBookingStaffMember, final ICallback<? super BookingStaffMember> callback);

    /**
     * Patches this BookingStaffMember with a source
     *
     * @param sourceBookingStaffMember the source object with updates
     * @return the updated BookingStaffMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingStaffMember patch(final BookingStaffMember sourceBookingStaffMember) throws ClientException;

    /**
     * Posts a BookingStaffMember with a new object
     *
     * @param newBookingStaffMember the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final BookingStaffMember newBookingStaffMember, final ICallback<? super BookingStaffMember> callback);

    /**
     * Posts a BookingStaffMember with a new object
     *
     * @param newBookingStaffMember the new object to create
     * @return the created BookingStaffMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingStaffMember post(final BookingStaffMember newBookingStaffMember) throws ClientException;

    /**
     * Posts a BookingStaffMember with a new object
     *
     * @param newBookingStaffMember the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final BookingStaffMember newBookingStaffMember, final ICallback<? super BookingStaffMember> callback);

    /**
     * Posts a BookingStaffMember with a new object
     *
     * @param newBookingStaffMember the object to create/update
     * @return the created BookingStaffMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    BookingStaffMember put(final BookingStaffMember newBookingStaffMember) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBookingStaffMemberRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBookingStaffMemberRequest expand(final String value);

}

