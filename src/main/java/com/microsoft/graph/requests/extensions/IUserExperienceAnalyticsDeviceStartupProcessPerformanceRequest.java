// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformance;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Device Startup Process Performance Request.
 */
public interface IUserExperienceAnalyticsDeviceStartupProcessPerformanceRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsDeviceStartupProcessPerformance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsDeviceStartupProcessPerformance> callback);

    /**
     * Gets the UserExperienceAnalyticsDeviceStartupProcessPerformance from the service
     *
     * @return the UserExperienceAnalyticsDeviceStartupProcessPerformance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupProcessPerformance get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsDeviceStartupProcessPerformance> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsDeviceStartupProcessPerformance with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceStartupProcessPerformance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsDeviceStartupProcessPerformance sourceUserExperienceAnalyticsDeviceStartupProcessPerformance, final ICallback<? super UserExperienceAnalyticsDeviceStartupProcessPerformance> callback);

    /**
     * Patches this UserExperienceAnalyticsDeviceStartupProcessPerformance with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceStartupProcessPerformance the source object with updates
     * @return the updated UserExperienceAnalyticsDeviceStartupProcessPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupProcessPerformance patch(final UserExperienceAnalyticsDeviceStartupProcessPerformance sourceUserExperienceAnalyticsDeviceStartupProcessPerformance) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupProcessPerformance with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupProcessPerformance the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsDeviceStartupProcessPerformance newUserExperienceAnalyticsDeviceStartupProcessPerformance, final ICallback<? super UserExperienceAnalyticsDeviceStartupProcessPerformance> callback);

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupProcessPerformance with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupProcessPerformance the new object to create
     * @return the created UserExperienceAnalyticsDeviceStartupProcessPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupProcessPerformance post(final UserExperienceAnalyticsDeviceStartupProcessPerformance newUserExperienceAnalyticsDeviceStartupProcessPerformance) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupProcessPerformance with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupProcessPerformance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsDeviceStartupProcessPerformance newUserExperienceAnalyticsDeviceStartupProcessPerformance, final ICallback<? super UserExperienceAnalyticsDeviceStartupProcessPerformance> callback);

    /**
     * Posts a UserExperienceAnalyticsDeviceStartupProcessPerformance with a new object
     *
     * @param newUserExperienceAnalyticsDeviceStartupProcessPerformance the object to create/update
     * @return the created UserExperienceAnalyticsDeviceStartupProcessPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceStartupProcessPerformance put(final UserExperienceAnalyticsDeviceStartupProcessPerformance newUserExperienceAnalyticsDeviceStartupProcessPerformance) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDeviceStartupProcessPerformanceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDeviceStartupProcessPerformanceRequest expand(final String value);

}
