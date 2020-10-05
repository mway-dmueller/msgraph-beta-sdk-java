// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserInvalidateAllRefreshTokensRequest;
import com.microsoft.graph.requests.extensions.UserInvalidateAllRefreshTokensRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Invalidate All Refresh Tokens Request.
 */
public class UserInvalidateAllRefreshTokensRequest extends BaseRequest implements IUserInvalidateAllRefreshTokensRequest {

    /**
     * The request for this UserInvalidateAllRefreshTokens
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserInvalidateAllRefreshTokensRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Boolean.class);
    }

    /**
     * Creates the UserInvalidateAllRefreshTokens
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(final ICallback<? super Boolean> callback) {
        send(HttpMethod.POST, callback, null);
    }

    /**
     * Creates the UserInvalidateAllRefreshTokens
     *
     * @return the Boolean
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Boolean post() throws ClientException {
       return send(HttpMethod.POST, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserInvalidateAllRefreshTokensRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserInvalidateAllRefreshTokensRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserInvalidateAllRefreshTokensRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserInvalidateAllRefreshTokensRequest)this;
    }

}
