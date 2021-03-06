// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAuthenticationMethodsRootUsersRegisteredByMethodRequest;
import com.microsoft.graph.requests.extensions.AuthenticationMethodsRootUsersRegisteredByMethodRequest;
import com.microsoft.graph.models.extensions.UserRegistrationMethodSummary;
import com.microsoft.graph.models.generated.IncludedUserTypes;
import com.microsoft.graph.models.generated.IncludedUserRoles;
import com.microsoft.graph.models.extensions.UserRegistrationMethodSummary;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Root Users Registered By Method Request Builder.
 */
public class AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder extends BaseFunctionRequestBuilder implements IAuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder {

    /**
     * The request builder for this AuthenticationMethodsRootUsersRegisteredByMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this AuthenticationMethodsRootUsersRegisteredByMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param includedUserTypes the includedUserTypes
     * @param includedUserRoles the includedUserRoles
     */
    public AuthenticationMethodsRootUsersRegisteredByMethodRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final IncludedUserTypes includedUserTypes, final IncludedUserRoles includedUserRoles) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("includedUserTypes", includedUserTypes));
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("includedUserRoles", includedUserRoles));
    }

    /**
     * Creates the IAuthenticationMethodsRootUsersRegisteredByMethodRequest
     *
     * @param requestOptions the options for the request
     * @return the IAuthenticationMethodsRootUsersRegisteredByMethodRequest instance
     */
    public IAuthenticationMethodsRootUsersRegisteredByMethodRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IAuthenticationMethodsRootUsersRegisteredByMethodRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAuthenticationMethodsRootUsersRegisteredByMethodRequest instance
     */
    public IAuthenticationMethodsRootUsersRegisteredByMethodRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AuthenticationMethodsRootUsersRegisteredByMethodRequest request = new AuthenticationMethodsRootUsersRegisteredByMethodRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
