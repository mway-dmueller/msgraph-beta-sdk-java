// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleDefinition;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Governance Role Definition Request Builder.
 */
public interface IGovernanceRoleDefinitionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGovernanceRoleDefinitionRequest instance
     */
    IGovernanceRoleDefinitionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGovernanceRoleDefinitionRequest instance
     */
    IGovernanceRoleDefinitionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for GovernanceResource
     *
     * @return the IGovernanceResourceRequestBuilder instance
     */
    IGovernanceResourceRequestBuilder resource();

    /**
     * Gets the request builder for GovernanceRoleSetting
     *
     * @return the IGovernanceRoleSettingRequestBuilder instance
     */
    IGovernanceRoleSettingRequestBuilder roleSetting();

}