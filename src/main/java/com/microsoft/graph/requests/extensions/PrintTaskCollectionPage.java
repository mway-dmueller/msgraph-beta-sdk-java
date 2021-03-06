// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintTask;
import com.microsoft.graph.requests.extensions.IPrintTaskCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionPage;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Collection Page.
 */
public class PrintTaskCollectionPage extends BaseCollectionPage<PrintTask, IPrintTaskCollectionRequestBuilder> implements IPrintTaskCollectionPage {

    /**
     * A collection page for PrintTask
     *
     * @param response the serialized PrintTaskCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrintTaskCollectionPage(final PrintTaskCollectionResponse response, final IPrintTaskCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
