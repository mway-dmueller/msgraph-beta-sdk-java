// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Definition Reference Request.
 */
public interface IUnifiedRoleDefinitionReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super UnifiedRoleDefinition> callback);

    UnifiedRoleDefinition delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleDefinitionReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleDefinitionReferenceRequest expand(final String value);

    /**
     * Puts the UnifiedRoleDefinition
     *
     * @param srcUnifiedRoleDefinition the UnifiedRoleDefinition to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(UnifiedRoleDefinition srcUnifiedRoleDefinition, final ICallback<? super UnifiedRoleDefinition> callback);

    /**
     * Puts the UnifiedRoleDefinition
     *
     * @param srcUnifiedRoleDefinition the UnifiedRoleDefinition to PUT
     * @return the UnifiedRoleDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    UnifiedRoleDefinition put(UnifiedRoleDefinition srcUnifiedRoleDefinition) throws ClientException;
}