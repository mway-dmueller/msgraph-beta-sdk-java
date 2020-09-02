// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Value Reference Request.
 */
public class GroupPolicyDefinitionValueReferenceRequest extends BaseRequest implements IGroupPolicyDefinitionValueReferenceRequest {

    /**
     * The request for the GroupPolicyDefinitionValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionValueReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinitionValue.class);
    }

    public void delete(final ICallback<GroupPolicyDefinitionValue> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public GroupPolicyDefinitionValue delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupPolicyDefinitionValueReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionValueReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyDefinitionValueReferenceRequest)this;
    }
    /**
     * Puts the GroupPolicyDefinitionValue
     *
     * @param srcGroupPolicyDefinitionValue the GroupPolicyDefinitionValue reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(GroupPolicyDefinitionValue srcGroupPolicyDefinitionValue, final ICallback<GroupPolicyDefinitionValue> callback) {
        send(HttpMethod.PUT, callback, srcGroupPolicyDefinitionValue);
    }

    /**
     * Puts the GroupPolicyDefinitionValue
     *
     * @param srcGroupPolicyDefinitionValue the GroupPolicyDefinitionValue reference to PUT
     * @return the GroupPolicyDefinitionValue
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public GroupPolicyDefinitionValue put(GroupPolicyDefinitionValue srcGroupPolicyDefinitionValue) throws ClientException {
        return send(HttpMethod.PUT, srcGroupPolicyDefinitionValue);
    }
}