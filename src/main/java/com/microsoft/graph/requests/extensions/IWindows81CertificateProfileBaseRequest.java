// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows81CertificateProfileBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows81Certificate Profile Base Request.
 */
public interface IWindows81CertificateProfileBaseRequest extends IHttpRequest {

    /**
     * Gets the Windows81CertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows81CertificateProfileBase> callback);

    /**
     * Gets the Windows81CertificateProfileBase from the service
     *
     * @return the Windows81CertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81CertificateProfileBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows81CertificateProfileBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows81CertificateProfileBase with a source
     *
     * @param sourceWindows81CertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows81CertificateProfileBase sourceWindows81CertificateProfileBase, final ICallback<? super Windows81CertificateProfileBase> callback);

    /**
     * Patches this Windows81CertificateProfileBase with a source
     *
     * @param sourceWindows81CertificateProfileBase the source object with updates
     * @return the updated Windows81CertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81CertificateProfileBase patch(final Windows81CertificateProfileBase sourceWindows81CertificateProfileBase) throws ClientException;

    /**
     * Posts a Windows81CertificateProfileBase with a new object
     *
     * @param newWindows81CertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows81CertificateProfileBase newWindows81CertificateProfileBase, final ICallback<? super Windows81CertificateProfileBase> callback);

    /**
     * Posts a Windows81CertificateProfileBase with a new object
     *
     * @param newWindows81CertificateProfileBase the new object to create
     * @return the created Windows81CertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81CertificateProfileBase post(final Windows81CertificateProfileBase newWindows81CertificateProfileBase) throws ClientException;

    /**
     * Posts a Windows81CertificateProfileBase with a new object
     *
     * @param newWindows81CertificateProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows81CertificateProfileBase newWindows81CertificateProfileBase, final ICallback<? super Windows81CertificateProfileBase> callback);

    /**
     * Posts a Windows81CertificateProfileBase with a new object
     *
     * @param newWindows81CertificateProfileBase the object to create/update
     * @return the created Windows81CertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81CertificateProfileBase put(final Windows81CertificateProfileBase newWindows81CertificateProfileBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows81CertificateProfileBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows81CertificateProfileBaseRequest expand(final String value);

}
