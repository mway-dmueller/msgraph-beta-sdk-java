// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Passwordless Microsoft Authenticator Authentication Method Target Request.
 */
public interface IPasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest extends IHttpRequest {

    /**
     * Gets the PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback);

    /**
     * Gets the PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget from the service
     *
     * @return the PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a source
     *
     * @param sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget, final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback);

    /**
     * Patches this PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a source
     *
     * @param sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the source object with updates
     * @return the updated PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget patch(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget sourcePasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget) throws ClientException;

    /**
     * Posts a PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget, final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback);

    /**
     * Posts a PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the new object to create
     * @return the created PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget post(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget) throws ClientException;

    /**
     * Posts a PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget, final ICallback<? super PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget> callback);

    /**
     * Posts a PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget with a new object
     *
     * @param newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget the object to create/update
     * @return the created PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget put(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget newPasswordlessMicrosoftAuthenticatorAuthenticationMethodTarget) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPasswordlessMicrosoftAuthenticatorAuthenticationMethodTargetRequest expand(final String value);

}

