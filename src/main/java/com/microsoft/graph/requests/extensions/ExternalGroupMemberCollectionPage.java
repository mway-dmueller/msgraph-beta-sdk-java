// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExternalGroupMember;
import com.microsoft.graph.requests.extensions.IExternalGroupMemberCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ExternalGroupMemberCollectionPage;
import com.microsoft.graph.requests.extensions.ExternalGroupMemberCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Group Member Collection Page.
 */
public class ExternalGroupMemberCollectionPage extends BaseCollectionPage<ExternalGroupMember, IExternalGroupMemberCollectionRequestBuilder> implements IExternalGroupMemberCollectionPage {

    /**
     * A collection page for ExternalGroupMember
     *
     * @param response the serialized ExternalGroupMemberCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExternalGroupMemberCollectionPage(final ExternalGroupMemberCollectionResponse response, final IExternalGroupMemberCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
