// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.AssignmentFilterEvaluationStatusDetails;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAssignmentFilterEvaluationStatusDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAssignmentFilterEvaluationStatusDetailsCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Assignment Filter Evaluation Status Details Collection Request Builder.
 */
public class AssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder extends BaseRequestBuilder implements IAssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder {

    /**
     * The request builder for this collection of ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AssignmentFilterEvaluationStatusDetailsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAssignmentFilterEvaluationStatusDetailsCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAssignmentFilterEvaluationStatusDetailsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AssignmentFilterEvaluationStatusDetailsCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAssignmentFilterEvaluationStatusDetailsRequestBuilder byId(final String id) {
        return new AssignmentFilterEvaluationStatusDetailsRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}