// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsCertificateProfileBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Certificate Profile Base Request.
 */
public interface IWindowsCertificateProfileBaseRequest extends IHttpRequest {

    /**
     * Gets the WindowsCertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsCertificateProfileBase> callback);

    /**
     * Gets the WindowsCertificateProfileBase from the service
     *
     * @return the WindowsCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsCertificateProfileBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsCertificateProfileBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsCertificateProfileBase with a source
     *
     * @param sourceWindowsCertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsCertificateProfileBase sourceWindowsCertificateProfileBase, final ICallback<? super WindowsCertificateProfileBase> callback);

    /**
     * Patches this WindowsCertificateProfileBase with a source
     *
     * @param sourceWindowsCertificateProfileBase the source object with updates
     * @return the updated WindowsCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsCertificateProfileBase patch(final WindowsCertificateProfileBase sourceWindowsCertificateProfileBase) throws ClientException;

    /**
     * Posts a WindowsCertificateProfileBase with a new object
     *
     * @param newWindowsCertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsCertificateProfileBase newWindowsCertificateProfileBase, final ICallback<? super WindowsCertificateProfileBase> callback);

    /**
     * Posts a WindowsCertificateProfileBase with a new object
     *
     * @param newWindowsCertificateProfileBase the new object to create
     * @return the created WindowsCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsCertificateProfileBase post(final WindowsCertificateProfileBase newWindowsCertificateProfileBase) throws ClientException;

    /**
     * Posts a WindowsCertificateProfileBase with a new object
     *
     * @param newWindowsCertificateProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsCertificateProfileBase newWindowsCertificateProfileBase, final ICallback<? super WindowsCertificateProfileBase> callback);

    /**
     * Posts a WindowsCertificateProfileBase with a new object
     *
     * @param newWindowsCertificateProfileBase the object to create/update
     * @return the created WindowsCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsCertificateProfileBase put(final WindowsCertificateProfileBase newWindowsCertificateProfileBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsCertificateProfileBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsCertificateProfileBaseRequest expand(final String value);

}

