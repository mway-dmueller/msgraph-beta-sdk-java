// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidWorkProfilePkcsCertificateProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Work Profile Pkcs Certificate Profile Request.
 */
public interface IAndroidWorkProfilePkcsCertificateProfileRequest extends IHttpRequest {

    /**
     * Gets the AndroidWorkProfilePkcsCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback);

    /**
     * Gets the AndroidWorkProfilePkcsCertificateProfile from the service
     *
     * @return the AndroidWorkProfilePkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfilePkcsCertificateProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidWorkProfilePkcsCertificateProfile with a source
     *
     * @param sourceAndroidWorkProfilePkcsCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidWorkProfilePkcsCertificateProfile sourceAndroidWorkProfilePkcsCertificateProfile, final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback);

    /**
     * Patches this AndroidWorkProfilePkcsCertificateProfile with a source
     *
     * @param sourceAndroidWorkProfilePkcsCertificateProfile the source object with updates
     * @return the updated AndroidWorkProfilePkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfilePkcsCertificateProfile patch(final AndroidWorkProfilePkcsCertificateProfile sourceAndroidWorkProfilePkcsCertificateProfile) throws ClientException;

    /**
     * Posts a AndroidWorkProfilePkcsCertificateProfile with a new object
     *
     * @param newAndroidWorkProfilePkcsCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidWorkProfilePkcsCertificateProfile newAndroidWorkProfilePkcsCertificateProfile, final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback);

    /**
     * Posts a AndroidWorkProfilePkcsCertificateProfile with a new object
     *
     * @param newAndroidWorkProfilePkcsCertificateProfile the new object to create
     * @return the created AndroidWorkProfilePkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfilePkcsCertificateProfile post(final AndroidWorkProfilePkcsCertificateProfile newAndroidWorkProfilePkcsCertificateProfile) throws ClientException;

    /**
     * Posts a AndroidWorkProfilePkcsCertificateProfile with a new object
     *
     * @param newAndroidWorkProfilePkcsCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidWorkProfilePkcsCertificateProfile newAndroidWorkProfilePkcsCertificateProfile, final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback);

    /**
     * Posts a AndroidWorkProfilePkcsCertificateProfile with a new object
     *
     * @param newAndroidWorkProfilePkcsCertificateProfile the object to create/update
     * @return the created AndroidWorkProfilePkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidWorkProfilePkcsCertificateProfile put(final AndroidWorkProfilePkcsCertificateProfile newAndroidWorkProfilePkcsCertificateProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidWorkProfilePkcsCertificateProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidWorkProfilePkcsCertificateProfileRequest expand(final String value);

}
