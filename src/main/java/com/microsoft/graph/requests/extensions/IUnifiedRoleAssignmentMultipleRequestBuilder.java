// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import com.microsoft.graph.requests.extensions.IAppScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Assignment Multiple Request Builder.
 */
public interface IUnifiedRoleAssignmentMultipleRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUnifiedRoleAssignmentMultipleRequest instance
     */
    IUnifiedRoleAssignmentMultipleRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IUnifiedRoleAssignmentMultipleRequest instance
     */
    IUnifiedRoleAssignmentMultipleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAppScopeCollectionRequestBuilder appScopes();

    IAppScopeRequestBuilder appScopes(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder directoryScopes();

    IDirectoryObjectWithReferenceRequestBuilder directoryScopes(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder principals();

    IDirectoryObjectWithReferenceRequestBuilder principals(final String id);

    /**
     * Gets the request builder for UnifiedRoleDefinition
     *
     * @return the IUnifiedRoleDefinitionWithReferenceRequestBuilder instance
     */
    IUnifiedRoleDefinitionWithReferenceRequestBuilder roleDefinition();

}