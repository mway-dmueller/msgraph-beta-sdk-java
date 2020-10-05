// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Value Collection Page.
 */
public class GroupPolicyPresentationValueCollectionPage extends BaseCollectionPage<GroupPolicyPresentationValue, IGroupPolicyPresentationValueCollectionRequestBuilder> implements IGroupPolicyPresentationValueCollectionPage {

    /**
     * A collection page for GroupPolicyPresentationValue
     *
     * @param response the serialized GroupPolicyPresentationValueCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyPresentationValueCollectionPage(final GroupPolicyPresentationValueCollectionResponse response, final IGroupPolicyPresentationValueCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
