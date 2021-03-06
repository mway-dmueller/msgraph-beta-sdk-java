// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Category With Reference Request Builder.
 */
public class GroupPolicyCategoryWithReferenceRequestBuilder extends BaseRequestBuilder implements IGroupPolicyCategoryWithReferenceRequestBuilder {

    /**
     * The request builder for the GroupPolicyCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyCategoryWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyCategoryWithReferenceRequest instance
     */
    public IGroupPolicyCategoryWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyCategoryWithReferenceRequest instance
     */
    public IGroupPolicyCategoryWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new GroupPolicyCategoryWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IGroupPolicyCategoryReferenceRequestBuilder reference(){
        return new GroupPolicyCategoryReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
