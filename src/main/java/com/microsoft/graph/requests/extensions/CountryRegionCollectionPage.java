// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CountryRegion;
import com.microsoft.graph.requests.extensions.ICountryRegionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CountryRegionCollectionPage;
import com.microsoft.graph.requests.extensions.CountryRegionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Country Region Collection Page.
 */
public class CountryRegionCollectionPage extends BaseCollectionPage<CountryRegion, ICountryRegionCollectionRequestBuilder> implements ICountryRegionCollectionPage {

    /**
     * A collection page for CountryRegion
     *
     * @param response the serialized CountryRegionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CountryRegionCollectionPage(final CountryRegionCollectionResponse response, final ICountryRegionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}