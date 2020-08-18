// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIdentitySecurityDefaultsEnforcementPolicyRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity Security Defaults Enforcement Policy Request Builder.
 */
public interface IIdentitySecurityDefaultsEnforcementPolicyRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IIdentitySecurityDefaultsEnforcementPolicyRequest instance
     */
    IIdentitySecurityDefaultsEnforcementPolicyRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IIdentitySecurityDefaultsEnforcementPolicyRequest instance
     */
    IIdentitySecurityDefaultsEnforcementPolicyRequest buildRequest(final java.util.List<? extends Option> requestOptions);


}
