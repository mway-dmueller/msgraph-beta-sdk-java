// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IInformationProtectionEvaluateLabelsAndPoliciesRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Information Protection Evaluate Labels And Policies Request Builder.
 */
public interface IInformationProtectionEvaluateLabelsAndPoliciesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IInformationProtectionEvaluateLabelsAndPoliciesRequest
     *
     * @param requestOptions the options for the request
     * @return the IInformationProtectionEvaluateLabelsAndPoliciesRequest instance
     */
    IInformationProtectionEvaluateLabelsAndPoliciesRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IInformationProtectionEvaluateLabelsAndPoliciesRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IInformationProtectionEvaluateLabelsAndPoliciesRequest instance
     */
    IInformationProtectionEvaluateLabelsAndPoliciesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}