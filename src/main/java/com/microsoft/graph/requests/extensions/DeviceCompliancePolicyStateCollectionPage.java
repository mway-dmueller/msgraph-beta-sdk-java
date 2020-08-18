// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyState;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy State Collection Page.
 */
public class DeviceCompliancePolicyStateCollectionPage extends BaseCollectionPage<DeviceCompliancePolicyState, IDeviceCompliancePolicyStateCollectionRequestBuilder> implements IDeviceCompliancePolicyStateCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicyState
     *
     * @param response the serialized DeviceCompliancePolicyStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCompliancePolicyStateCollectionPage(final DeviceCompliancePolicyStateCollectionResponse response, final IDeviceCompliancePolicyStateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
