// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionResponse;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Category Collection With References Page.
 */
public class GroupPolicyCategoryCollectionWithReferencesPage extends BaseCollectionPage<GroupPolicyCategory, IGroupPolicyCategoryCollectionWithReferencesRequestBuilder> implements IGroupPolicyCategoryCollectionWithReferencesPage {

    /**
     * A collection page for GroupPolicyCategory
     *
     * @param response the serialized GroupPolicyCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyCategoryCollectionWithReferencesPage(final GroupPolicyCategoryCollectionResponse response, final IGroupPolicyCategoryCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
