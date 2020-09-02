// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.VulnerableManagedDevice;
import com.microsoft.graph.requests.extensions.IVulnerableManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceCollectionPage;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vulnerable Managed Device Collection Page.
 */
public class VulnerableManagedDeviceCollectionPage extends BaseCollectionPage<VulnerableManagedDevice, IVulnerableManagedDeviceCollectionRequestBuilder> implements IVulnerableManagedDeviceCollectionPage {

    /**
     * A collection page for VulnerableManagedDevice
     *
     * @param response the serialized VulnerableManagedDeviceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public VulnerableManagedDeviceCollectionPage(final VulnerableManagedDeviceCollectionResponse response, final IVulnerableManagedDeviceCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}