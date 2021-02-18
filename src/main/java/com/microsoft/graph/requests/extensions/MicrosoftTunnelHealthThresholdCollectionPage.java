// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MicrosoftTunnelHealthThreshold;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelHealthThresholdCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelHealthThresholdCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelHealthThresholdCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Health Threshold Collection Page.
 */
public class MicrosoftTunnelHealthThresholdCollectionPage extends BaseCollectionPage<MicrosoftTunnelHealthThreshold, IMicrosoftTunnelHealthThresholdCollectionRequestBuilder> implements IMicrosoftTunnelHealthThresholdCollectionPage {

    /**
     * A collection page for MicrosoftTunnelHealthThreshold
     *
     * @param response the serialized MicrosoftTunnelHealthThresholdCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MicrosoftTunnelHealthThresholdCollectionPage(final MicrosoftTunnelHealthThresholdCollectionResponse response, final IMicrosoftTunnelHealthThresholdCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}