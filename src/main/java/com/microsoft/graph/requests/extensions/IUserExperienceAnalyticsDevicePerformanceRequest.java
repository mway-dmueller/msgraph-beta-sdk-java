// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Device Performance Request.
 */
public interface IUserExperienceAnalyticsDevicePerformanceRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsDevicePerformance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback);

    /**
     * Gets the UserExperienceAnalyticsDevicePerformance from the service
     *
     * @return the UserExperienceAnalyticsDevicePerformance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDevicePerformance get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsDevicePerformance with a source
     *
     * @param sourceUserExperienceAnalyticsDevicePerformance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsDevicePerformance sourceUserExperienceAnalyticsDevicePerformance, final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback);

    /**
     * Patches this UserExperienceAnalyticsDevicePerformance with a source
     *
     * @param sourceUserExperienceAnalyticsDevicePerformance the source object with updates
     * @return the updated UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDevicePerformance patch(final UserExperienceAnalyticsDevicePerformance sourceUserExperienceAnalyticsDevicePerformance) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance, final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback);

    /**
     * Posts a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the new object to create
     * @return the created UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDevicePerformance post(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance, final ICallback<? super UserExperienceAnalyticsDevicePerformance> callback);

    /**
     * Posts a UserExperienceAnalyticsDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsDevicePerformance the object to create/update
     * @return the created UserExperienceAnalyticsDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDevicePerformance put(final UserExperienceAnalyticsDevicePerformance newUserExperienceAnalyticsDevicePerformance) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDevicePerformanceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDevicePerformanceRequest expand(final String value);

}

