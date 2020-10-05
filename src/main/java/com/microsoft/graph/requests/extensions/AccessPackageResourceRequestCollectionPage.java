// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageResourceRequest;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Request Collection Page.
 */
public class AccessPackageResourceRequestCollectionPage extends BaseCollectionPage<AccessPackageResourceRequest, IAccessPackageResourceRequestCollectionRequestBuilder> implements IAccessPackageResourceRequestCollectionPage {

    /**
     * A collection page for AccessPackageResourceRequest
     *
     * @param response the serialized AccessPackageResourceRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessPackageResourceRequestCollectionPage(final AccessPackageResourceRequestCollectionResponse response, final IAccessPackageResourceRequestCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
