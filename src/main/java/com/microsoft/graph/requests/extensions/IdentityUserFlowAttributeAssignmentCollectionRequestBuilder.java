// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.B2xIdentityUserFlow;
import com.microsoft.graph.models.extensions.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.models.extensions.AssignmentOrder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentSetOrderRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentGetOrderRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Assignment Collection Request Builder.
 */
public class IdentityUserFlowAttributeAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IIdentityUserFlowAttributeAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of B2xIdentityUserFlow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityUserFlowAttributeAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IIdentityUserFlowAttributeAssignmentCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IIdentityUserFlowAttributeAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new IdentityUserFlowAttributeAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IIdentityUserFlowAttributeAssignmentRequestBuilder byId(final String id) {
        return new IdentityUserFlowAttributeAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IIdentityUserFlowAttributeAssignmentSetOrderRequestBuilder setOrder(final AssignmentOrder newAssignmentOrder) {
        return new IdentityUserFlowAttributeAssignmentSetOrderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setOrder"), getClient(), null, newAssignmentOrder);
    }

    public IIdentityUserFlowAttributeAssignmentGetOrderRequestBuilder getOrder() {
        return new IdentityUserFlowAttributeAssignmentGetOrderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOrder"), getClient(), null);
    }
}