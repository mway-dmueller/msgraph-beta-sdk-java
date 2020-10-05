// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnitOfMeasure;
import com.microsoft.graph.requests.extensions.IUnitOfMeasureCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionPage;
import com.microsoft.graph.requests.extensions.UnitOfMeasureCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unit Of Measure Collection Page.
 */
public class UnitOfMeasureCollectionPage extends BaseCollectionPage<UnitOfMeasure, IUnitOfMeasureCollectionRequestBuilder> implements IUnitOfMeasureCollectionPage {

    /**
     * A collection page for UnitOfMeasure
     *
     * @param response the serialized UnitOfMeasureCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnitOfMeasureCollectionPage(final UnitOfMeasureCollectionResponse response, final IUnitOfMeasureCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
