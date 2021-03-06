// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodsRootUsersRegisteredByFeatureRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Authentication Methods Root Users Registered By Feature Request Builder.
 */
public interface IAuthenticationMethodsRootUsersRegisteredByFeatureRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAuthenticationMethodsRootUsersRegisteredByFeatureRequest
     *
     * @param requestOptions the options for the request
     * @return the IAuthenticationMethodsRootUsersRegisteredByFeatureRequest instance
     */
    IAuthenticationMethodsRootUsersRegisteredByFeatureRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IAuthenticationMethodsRootUsersRegisteredByFeatureRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAuthenticationMethodsRootUsersRegisteredByFeatureRequest instance
     */
    IAuthenticationMethodsRootUsersRegisteredByFeatureRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
