// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.IosLobAppProvisioningConfigurationAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Assignment Collection Page.
 */
public class IosLobAppProvisioningConfigurationAssignmentCollectionPage extends BaseCollectionPage<IosLobAppProvisioningConfigurationAssignment, IIosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder> implements IIosLobAppProvisioningConfigurationAssignmentCollectionPage {

    /**
     * A collection page for IosLobAppProvisioningConfigurationAssignment
     *
     * @param response the serialized IosLobAppProvisioningConfigurationAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IosLobAppProvisioningConfigurationAssignmentCollectionPage(final IosLobAppProvisioningConfigurationAssignmentCollectionResponse response, final IIosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
