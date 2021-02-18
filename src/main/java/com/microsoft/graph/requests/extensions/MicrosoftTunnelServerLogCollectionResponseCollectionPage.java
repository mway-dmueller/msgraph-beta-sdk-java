// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MicrosoftTunnelServerLogCollectionResponse;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelServerLogCollectionResponseCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelServerLogCollectionResponseCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelServerLogCollectionResponseCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Log Collection Response Collection Page.
 */
public class MicrosoftTunnelServerLogCollectionResponseCollectionPage extends BaseCollectionPage<MicrosoftTunnelServerLogCollectionResponse, IMicrosoftTunnelServerLogCollectionResponseCollectionRequestBuilder> implements IMicrosoftTunnelServerLogCollectionResponseCollectionPage {

    /**
     * A collection page for MicrosoftTunnelServerLogCollectionResponse
     *
     * @param response the serialized MicrosoftTunnelServerLogCollectionResponseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MicrosoftTunnelServerLogCollectionResponseCollectionPage(final MicrosoftTunnelServerLogCollectionResponseCollectionResponse response, final IMicrosoftTunnelServerLogCollectionResponseCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}