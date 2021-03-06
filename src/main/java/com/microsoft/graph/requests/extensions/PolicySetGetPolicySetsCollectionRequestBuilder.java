// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicySet;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPolicySetGetPolicySetsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetGetPolicySetsCollectionRequest;
import com.microsoft.graph.requests.extensions.PolicySetGetPolicySetsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Get Policy Sets Collection Request Builder.
 */
public class PolicySetGetPolicySetsCollectionRequestBuilder extends BaseActionRequestBuilder implements IPolicySetGetPolicySetsCollectionRequestBuilder {

    /**
     * The request builder for this collection of PolicySet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param policySetIds the policySetIds
     */
    public PolicySetGetPolicySetsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> policySetIds) {
        super(requestUrl, client, requestOptions);
  	 if(policySetIds!=null){
			bodyParams.put("policySetIds", policySetIds);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPolicySetGetPolicySetsCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPolicySetGetPolicySetsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PolicySetGetPolicySetsCollectionRequest request = new PolicySetGetPolicySetsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("policySetIds")) {
            request.body.policySetIds = getParameter("policySetIds");
        }
  
        return request;
    }
}
