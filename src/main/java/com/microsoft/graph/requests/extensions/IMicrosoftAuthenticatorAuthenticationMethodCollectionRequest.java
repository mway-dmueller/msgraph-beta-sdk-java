// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.MicrosoftAuthenticatorAuthenticationMethod;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Microsoft Authenticator Authentication Method Collection Request.
 */
public interface IMicrosoftAuthenticatorAuthenticationMethodCollectionRequest {

    void get(final ICallback<IMicrosoftAuthenticatorAuthenticationMethodCollectionPage> callback);

    IMicrosoftAuthenticatorAuthenticationMethodCollectionPage get() throws ClientException;

    void post(final MicrosoftAuthenticatorAuthenticationMethod newMicrosoftAuthenticatorAuthenticationMethod, final ICallback<MicrosoftAuthenticatorAuthenticationMethod> callback);

    MicrosoftAuthenticatorAuthenticationMethod post(final MicrosoftAuthenticatorAuthenticationMethod newMicrosoftAuthenticatorAuthenticationMethod) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMicrosoftAuthenticatorAuthenticationMethodCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMicrosoftAuthenticatorAuthenticationMethodCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IMicrosoftAuthenticatorAuthenticationMethodCollectionRequest top(final int value);

}