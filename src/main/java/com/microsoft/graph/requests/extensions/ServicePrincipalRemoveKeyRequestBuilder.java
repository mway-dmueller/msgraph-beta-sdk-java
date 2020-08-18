// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalRemoveKeyRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalRemoveKeyRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Remove Key Request Builder.
 */
public class ServicePrincipalRemoveKeyRequestBuilder extends BaseActionRequestBuilder implements IServicePrincipalRemoveKeyRequestBuilder {

    /**
     * The request builder for this ServicePrincipalRemoveKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keyId the keyId
     * @param proof the proof
     */
    public ServicePrincipalRemoveKeyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.UUID keyId, final String proof) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keyId", keyId);
        bodyParams.put("proof", proof);
    }

    /**
     * Creates the IServicePrincipalRemoveKeyRequest
     *
     * @return the IServicePrincipalRemoveKeyRequest instance
     */
    public IServicePrincipalRemoveKeyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IServicePrincipalRemoveKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalRemoveKeyRequest instance
     */
    public IServicePrincipalRemoveKeyRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ServicePrincipalRemoveKeyRequest request = new ServicePrincipalRemoveKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("keyId")) {
            request.body.keyId = getParameter("keyId");
        }

        if (hasParameter("proof")) {
            request.body.proof = getParameter("proof");
        }

        return request;
    }
}
