// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.requests.extensions.IServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Collection Page.
 */
public class ServicePrincipalCollectionPage extends BaseCollectionPage<ServicePrincipal, IServicePrincipalCollectionRequestBuilder> implements IServicePrincipalCollectionPage {

    /**
     * A collection page for ServicePrincipal
     *
     * @param response the serialized ServicePrincipalCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ServicePrincipalCollectionPage(final ServicePrincipalCollectionResponse response, final IServicePrincipalCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
