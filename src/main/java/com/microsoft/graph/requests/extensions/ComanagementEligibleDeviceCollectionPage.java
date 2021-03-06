// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ComanagementEligibleDevice;
import com.microsoft.graph.requests.extensions.IComanagementEligibleDeviceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comanagement Eligible Device Collection Page.
 */
public class ComanagementEligibleDeviceCollectionPage extends BaseCollectionPage<ComanagementEligibleDevice, IComanagementEligibleDeviceCollectionRequestBuilder> implements IComanagementEligibleDeviceCollectionPage {

    /**
     * A collection page for ComanagementEligibleDevice
     *
     * @param response the serialized ComanagementEligibleDeviceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ComanagementEligibleDeviceCollectionPage(final ComanagementEligibleDeviceCollectionResponse response, final IComanagementEligibleDeviceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
