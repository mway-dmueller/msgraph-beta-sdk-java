// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCertificateProfileBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile Certificate Profile Base Request.
 */
public interface IAndroidWorkProfileCertificateProfileBaseRequest extends IHttpRequest {

    /**
     * Gets the AndroidWorkProfileCertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback);

    /**
     * Gets the AndroidWorkProfileCertificateProfileBase from the service
     *
     * @return the AndroidWorkProfileCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCertificateProfileBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidWorkProfileCertificateProfileBase with a source
     *
     * @param sourceAndroidWorkProfileCertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidWorkProfileCertificateProfileBase sourceAndroidWorkProfileCertificateProfileBase, final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback);

    /**
     * Patches this AndroidWorkProfileCertificateProfileBase with a source
     *
     * @param sourceAndroidWorkProfileCertificateProfileBase the source object with updates
     * @return the updated AndroidWorkProfileCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCertificateProfileBase patch(final AndroidWorkProfileCertificateProfileBase sourceAndroidWorkProfileCertificateProfileBase) throws ClientException;

    /**
     * Posts a AndroidWorkProfileCertificateProfileBase with a new object
     *
     * @param newAndroidWorkProfileCertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase, final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback);

    /**
     * Posts a AndroidWorkProfileCertificateProfileBase with a new object
     *
     * @param newAndroidWorkProfileCertificateProfileBase the new object to create
     * @return the created AndroidWorkProfileCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCertificateProfileBase post(final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase) throws ClientException;

    /**
     * Posts a AndroidWorkProfileCertificateProfileBase with a new object
     *
     * @param newAndroidWorkProfileCertificateProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase, final ICallback<? super AndroidWorkProfileCertificateProfileBase> callback);

    /**
     * Posts a AndroidWorkProfileCertificateProfileBase with a new object
     *
     * @param newAndroidWorkProfileCertificateProfileBase the object to create/update
     * @return the created AndroidWorkProfileCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfileCertificateProfileBase put(final AndroidWorkProfileCertificateProfileBase newAndroidWorkProfileCertificateProfileBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfileCertificateProfileBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfileCertificateProfileBaseRequest expand(final String value);

}
