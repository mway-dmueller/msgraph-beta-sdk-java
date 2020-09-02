// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Request Builder.
 */
public class RoleScopeTagRequestBuilder extends BaseRequestBuilder implements IRoleScopeTagRequestBuilder {

    /**
     * The request builder for the RoleScopeTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleScopeTagRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IRoleScopeTagRequest instance
     */
    public IRoleScopeTagRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IRoleScopeTagRequest instance
     */
    public IRoleScopeTagRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.RoleScopeTagRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IRoleScopeTagAutoAssignmentCollectionRequestBuilder assignments() {
        return new RoleScopeTagAutoAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IRoleScopeTagAutoAssignmentRequestBuilder assignments(final String id) {
        return new RoleScopeTagAutoAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IRoleScopeTagAssignCollectionRequestBuilder assign(final java.util.List<RoleScopeTagAutoAssignment> assignments) {
        return new RoleScopeTagAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}