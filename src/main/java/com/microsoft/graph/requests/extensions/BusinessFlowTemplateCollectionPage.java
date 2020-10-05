// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BusinessFlowTemplate;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.BusinessFlowTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.BusinessFlowTemplateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Business Flow Template Collection Page.
 */
public class BusinessFlowTemplateCollectionPage extends BaseCollectionPage<BusinessFlowTemplate, IBusinessFlowTemplateCollectionRequestBuilder> implements IBusinessFlowTemplateCollectionPage {

    /**
     * A collection page for BusinessFlowTemplate
     *
     * @param response the serialized BusinessFlowTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BusinessFlowTemplateCollectionPage(final BusinessFlowTemplateCollectionResponse response, final IBusinessFlowTemplateCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
