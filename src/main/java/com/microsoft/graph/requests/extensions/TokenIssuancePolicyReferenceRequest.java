// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Reference Request.
 */
public class TokenIssuancePolicyReferenceRequest extends BaseRequest implements ITokenIssuancePolicyReferenceRequest {

    /**
     * The request for the TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenIssuancePolicyReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicy.class);
    }

    public void delete(final ICallback<TokenIssuancePolicy> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public TokenIssuancePolicy delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITokenIssuancePolicyReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (TokenIssuancePolicyReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITokenIssuancePolicyReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (TokenIssuancePolicyReferenceRequest)this;
    }
    /**
     * Puts the TokenIssuancePolicy
     *
     * @param srcTokenIssuancePolicy the TokenIssuancePolicy reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(TokenIssuancePolicy srcTokenIssuancePolicy, final ICallback<TokenIssuancePolicy> callback) {
        send(HttpMethod.PUT, callback, srcTokenIssuancePolicy);
    }

    /**
     * Puts the TokenIssuancePolicy
     *
     * @param srcTokenIssuancePolicy the TokenIssuancePolicy reference to PUT
     * @return the TokenIssuancePolicy
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public TokenIssuancePolicy put(TokenIssuancePolicy srcTokenIssuancePolicy) throws ClientException {
        return send(HttpMethod.PUT, srcTokenIssuancePolicy);
    }
}
