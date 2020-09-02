// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkEnrollmentProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Enrollment Profile Request.
 */
public interface IAndroidForWorkEnrollmentProfileRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkEnrollmentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidForWorkEnrollmentProfile> callback);

    /**
     * Gets the AndroidForWorkEnrollmentProfile from the service
     *
     * @return the AndroidForWorkEnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEnrollmentProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidForWorkEnrollmentProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkEnrollmentProfile with a source
     *
     * @param sourceAndroidForWorkEnrollmentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkEnrollmentProfile sourceAndroidForWorkEnrollmentProfile, final ICallback<AndroidForWorkEnrollmentProfile> callback);

    /**
     * Patches this AndroidForWorkEnrollmentProfile with a source
     *
     * @param sourceAndroidForWorkEnrollmentProfile the source object with updates
     * @return the updated AndroidForWorkEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEnrollmentProfile patch(final AndroidForWorkEnrollmentProfile sourceAndroidForWorkEnrollmentProfile) throws ClientException;

    /**
     * Posts a AndroidForWorkEnrollmentProfile with a new object
     *
     * @param newAndroidForWorkEnrollmentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkEnrollmentProfile newAndroidForWorkEnrollmentProfile, final ICallback<AndroidForWorkEnrollmentProfile> callback);

    /**
     * Posts a AndroidForWorkEnrollmentProfile with a new object
     *
     * @param newAndroidForWorkEnrollmentProfile the new object to create
     * @return the created AndroidForWorkEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEnrollmentProfile post(final AndroidForWorkEnrollmentProfile newAndroidForWorkEnrollmentProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkEnrollmentProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkEnrollmentProfileRequest expand(final String value);

}
