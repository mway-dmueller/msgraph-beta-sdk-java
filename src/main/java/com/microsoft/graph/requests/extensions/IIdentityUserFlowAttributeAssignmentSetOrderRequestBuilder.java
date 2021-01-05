// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentSetOrderRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity User Flow Attribute Assignment Set Order Request Builder.
 */
public interface IIdentityUserFlowAttributeAssignmentSetOrderRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IIdentityUserFlowAttributeAssignmentSetOrderRequest
     *
     * @param requestOptions the options for the request
     * @return the IIdentityUserFlowAttributeAssignmentSetOrderRequest instance
     */
    IIdentityUserFlowAttributeAssignmentSetOrderRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IIdentityUserFlowAttributeAssignmentSetOrderRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IIdentityUserFlowAttributeAssignmentSetOrderRequest instance
     */
    IIdentityUserFlowAttributeAssignmentSetOrderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}