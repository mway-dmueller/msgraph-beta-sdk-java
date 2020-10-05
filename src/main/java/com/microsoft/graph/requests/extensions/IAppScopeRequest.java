// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppScope;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Scope Request.
 */
public interface IAppScopeRequest extends IHttpRequest {

    /**
     * Gets the AppScope from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AppScope> callback);

    /**
     * Gets the AppScope from the service
     *
     * @return the AppScope from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppScope get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AppScope> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AppScope with a source
     *
     * @param sourceAppScope the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AppScope sourceAppScope, final ICallback<? super AppScope> callback);

    /**
     * Patches this AppScope with a source
     *
     * @param sourceAppScope the source object with updates
     * @return the updated AppScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppScope patch(final AppScope sourceAppScope) throws ClientException;

    /**
     * Posts a AppScope with a new object
     *
     * @param newAppScope the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AppScope newAppScope, final ICallback<? super AppScope> callback);

    /**
     * Posts a AppScope with a new object
     *
     * @param newAppScope the new object to create
     * @return the created AppScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppScope post(final AppScope newAppScope) throws ClientException;

    /**
     * Posts a AppScope with a new object
     *
     * @param newAppScope the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AppScope newAppScope, final ICallback<? super AppScope> callback);

    /**
     * Posts a AppScope with a new object
     *
     * @param newAppScope the object to create/update
     * @return the created AppScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppScope put(final AppScope newAppScope) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAppScopeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAppScopeRequest expand(final String value);

}

