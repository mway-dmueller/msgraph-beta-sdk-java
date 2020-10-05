// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BookingStaffMember;
import com.microsoft.graph.requests.extensions.IBookingStaffMemberCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.BookingStaffMemberCollectionPage;
import com.microsoft.graph.requests.extensions.BookingStaffMemberCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Staff Member Collection Page.
 */
public class BookingStaffMemberCollectionPage extends BaseCollectionPage<BookingStaffMember, IBookingStaffMemberCollectionRequestBuilder> implements IBookingStaffMemberCollectionPage {

    /**
     * A collection page for BookingStaffMember
     *
     * @param response the serialized BookingStaffMemberCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BookingStaffMemberCollectionPage(final BookingStaffMemberCollectionResponse response, final IBookingStaffMemberCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
