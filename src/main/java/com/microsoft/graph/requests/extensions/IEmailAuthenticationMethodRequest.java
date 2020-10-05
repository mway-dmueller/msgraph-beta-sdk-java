// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EmailAuthenticationMethod;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Email Authentication Method Request.
 */
public interface IEmailAuthenticationMethodRequest extends IHttpRequest {

    /**
     * Gets the EmailAuthenticationMethod from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EmailAuthenticationMethod> callback);

    /**
     * Gets the EmailAuthenticationMethod from the service
     *
     * @return the EmailAuthenticationMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAuthenticationMethod get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EmailAuthenticationMethod> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EmailAuthenticationMethod with a source
     *
     * @param sourceEmailAuthenticationMethod the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EmailAuthenticationMethod sourceEmailAuthenticationMethod, final ICallback<? super EmailAuthenticationMethod> callback);

    /**
     * Patches this EmailAuthenticationMethod with a source
     *
     * @param sourceEmailAuthenticationMethod the source object with updates
     * @return the updated EmailAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAuthenticationMethod patch(final EmailAuthenticationMethod sourceEmailAuthenticationMethod) throws ClientException;

    /**
     * Posts a EmailAuthenticationMethod with a new object
     *
     * @param newEmailAuthenticationMethod the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EmailAuthenticationMethod newEmailAuthenticationMethod, final ICallback<? super EmailAuthenticationMethod> callback);

    /**
     * Posts a EmailAuthenticationMethod with a new object
     *
     * @param newEmailAuthenticationMethod the new object to create
     * @return the created EmailAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAuthenticationMethod post(final EmailAuthenticationMethod newEmailAuthenticationMethod) throws ClientException;

    /**
     * Posts a EmailAuthenticationMethod with a new object
     *
     * @param newEmailAuthenticationMethod the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EmailAuthenticationMethod newEmailAuthenticationMethod, final ICallback<? super EmailAuthenticationMethod> callback);

    /**
     * Posts a EmailAuthenticationMethod with a new object
     *
     * @param newEmailAuthenticationMethod the object to create/update
     * @return the created EmailAuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EmailAuthenticationMethod put(final EmailAuthenticationMethod newEmailAuthenticationMethod) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEmailAuthenticationMethodRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEmailAuthenticationMethodRequest expand(final String value);

}

