// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUnifiedRoleEligibilityRequestCancelRequest;
import com.microsoft.graph.requests.extensions.UnifiedRoleEligibilityRequestCancelRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Request Cancel Request Builder.
 */
public class UnifiedRoleEligibilityRequestCancelRequestBuilder extends BaseActionRequestBuilder implements IUnifiedRoleEligibilityRequestCancelRequestBuilder {

    /**
     * The request builder for this UnifiedRoleEligibilityRequestCancel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleEligibilityRequestCancelRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IUnifiedRoleEligibilityRequestCancelRequest
     *
     * @param requestOptions the options for the request
     * @return the IUnifiedRoleEligibilityRequestCancelRequest instance
     */
    public IUnifiedRoleEligibilityRequestCancelRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IUnifiedRoleEligibilityRequestCancelRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUnifiedRoleEligibilityRequestCancelRequest instance
     */
    public IUnifiedRoleEligibilityRequestCancelRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UnifiedRoleEligibilityRequestCancelRequest request = new UnifiedRoleEligibilityRequestCancelRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}