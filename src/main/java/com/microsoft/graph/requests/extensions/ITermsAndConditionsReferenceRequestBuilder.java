// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.TermsAndConditions;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Terms And Conditions Reference Request Builder.
 */
public interface ITermsAndConditionsReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITermsAndConditionsReferenceRequest instance
     */
    ITermsAndConditionsReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ITermsAndConditionsReferenceRequest instance
     */
    ITermsAndConditionsReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}