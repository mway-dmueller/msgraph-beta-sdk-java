// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationSubmissionUnsubmitRequest;
import com.microsoft.graph.requests.extensions.EducationSubmissionUnsubmitRequest;
import com.microsoft.graph.models.extensions.EducationSubmission;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Submission Unsubmit Request Builder.
 */
public class EducationSubmissionUnsubmitRequestBuilder extends BaseActionRequestBuilder implements IEducationSubmissionUnsubmitRequestBuilder {

    /**
     * The request builder for this EducationSubmissionUnsubmit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSubmissionUnsubmitRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IEducationSubmissionUnsubmitRequest
     *
     * @return the IEducationSubmissionUnsubmitRequest instance
     */
    public IEducationSubmissionUnsubmitRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEducationSubmissionUnsubmitRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEducationSubmissionUnsubmitRequest instance
     */
    public IEducationSubmissionUnsubmitRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EducationSubmissionUnsubmitRequest request = new EducationSubmissionUnsubmitRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}