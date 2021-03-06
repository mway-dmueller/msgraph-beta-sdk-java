// Template Source: IBaseEntityReferenceRequest.java.tt
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
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Category Reference Request.
 */
public interface IGroupPolicyCategoryReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super GroupPolicyCategory> callback);

    GroupPolicyCategory delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyCategoryReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyCategoryReferenceRequest expand(final String value);

    /**
     * Puts the GroupPolicyCategory
     *
     * @param srcGroupPolicyCategory the GroupPolicyCategory to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(GroupPolicyCategory srcGroupPolicyCategory, final ICallback<? super GroupPolicyCategory> callback);

    /**
     * Puts the GroupPolicyCategory
     *
     * @param srcGroupPolicyCategory the GroupPolicyCategory to PUT
     * @return the GroupPolicyCategory
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    GroupPolicyCategory put(GroupPolicyCategory srcGroupPolicyCategory) throws ClientException;
}
