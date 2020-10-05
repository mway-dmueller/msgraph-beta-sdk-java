// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingStaffMember;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Staff Member Request.
 */
public class BookingStaffMemberRequest extends BaseRequest implements IBookingStaffMemberRequest {
	
    /**
     * The request for the BookingStaffMember
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingStaffMemberRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingStaffMember.class);
    }

    /**
     * Gets the BookingStaffMember from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super BookingStaffMember> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BookingStaffMember from the service
     *
     * @return the BookingStaffMember from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingStaffMember get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super BookingStaffMember> callback) {
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
     * Patches this BookingStaffMember with a source
     *
     * @param sourceBookingStaffMember the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final BookingStaffMember sourceBookingStaffMember, final ICallback<? super BookingStaffMember> callback) {
        send(HttpMethod.PATCH, callback, sourceBookingStaffMember);
    }

    /**
     * Patches this BookingStaffMember with a source
     *
     * @param sourceBookingStaffMember the source object with updates
     * @return the updated BookingStaffMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingStaffMember patch(final BookingStaffMember sourceBookingStaffMember) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingStaffMember);
    }

    /**
     * Creates a BookingStaffMember with a new object
     *
     * @param newBookingStaffMember the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final BookingStaffMember newBookingStaffMember, final ICallback<? super BookingStaffMember> callback) {
        send(HttpMethod.POST, callback, newBookingStaffMember);
    }

    /**
     * Creates a BookingStaffMember with a new object
     *
     * @param newBookingStaffMember the new object to create
     * @return the created BookingStaffMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingStaffMember post(final BookingStaffMember newBookingStaffMember) throws ClientException {
        return send(HttpMethod.POST, newBookingStaffMember);
    }

    /**
     * Creates a BookingStaffMember with a new object
     *
     * @param newBookingStaffMember the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final BookingStaffMember newBookingStaffMember, final ICallback<? super BookingStaffMember> callback) {
        send(HttpMethod.PUT, callback, newBookingStaffMember);
    }

    /**
     * Creates a BookingStaffMember with a new object
     *
     * @param newBookingStaffMember the object to create/update
     * @return the created BookingStaffMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingStaffMember put(final BookingStaffMember newBookingStaffMember) throws ClientException {
        return send(HttpMethod.PUT, newBookingStaffMember);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IBookingStaffMemberRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (BookingStaffMemberRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IBookingStaffMemberRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (BookingStaffMemberRequest)this;
     }

}

