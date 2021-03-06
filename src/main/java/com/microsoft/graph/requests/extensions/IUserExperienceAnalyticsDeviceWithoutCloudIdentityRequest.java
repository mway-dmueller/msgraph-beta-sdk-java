// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceWithoutCloudIdentity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Device Without Cloud Identity Request.
 */
public interface IUserExperienceAnalyticsDeviceWithoutCloudIdentityRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsDeviceWithoutCloudIdentity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback);

    /**
     * Gets the UserExperienceAnalyticsDeviceWithoutCloudIdentity from the service
     *
     * @return the UserExperienceAnalyticsDeviceWithoutCloudIdentity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceWithoutCloudIdentity get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsDeviceWithoutCloudIdentity with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsDeviceWithoutCloudIdentity sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity, final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback);

    /**
     * Patches this UserExperienceAnalyticsDeviceWithoutCloudIdentity with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity the source object with updates
     * @return the updated UserExperienceAnalyticsDeviceWithoutCloudIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceWithoutCloudIdentity patch(final UserExperienceAnalyticsDeviceWithoutCloudIdentity sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDeviceWithoutCloudIdentity with a new object
     *
     * @param newUserExperienceAnalyticsDeviceWithoutCloudIdentity the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsDeviceWithoutCloudIdentity newUserExperienceAnalyticsDeviceWithoutCloudIdentity, final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback);

    /**
     * Posts a UserExperienceAnalyticsDeviceWithoutCloudIdentity with a new object
     *
     * @param newUserExperienceAnalyticsDeviceWithoutCloudIdentity the new object to create
     * @return the created UserExperienceAnalyticsDeviceWithoutCloudIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceWithoutCloudIdentity post(final UserExperienceAnalyticsDeviceWithoutCloudIdentity newUserExperienceAnalyticsDeviceWithoutCloudIdentity) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsDeviceWithoutCloudIdentity with a new object
     *
     * @param newUserExperienceAnalyticsDeviceWithoutCloudIdentity the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsDeviceWithoutCloudIdentity newUserExperienceAnalyticsDeviceWithoutCloudIdentity, final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback);

    /**
     * Posts a UserExperienceAnalyticsDeviceWithoutCloudIdentity with a new object
     *
     * @param newUserExperienceAnalyticsDeviceWithoutCloudIdentity the object to create/update
     * @return the created UserExperienceAnalyticsDeviceWithoutCloudIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsDeviceWithoutCloudIdentity put(final UserExperienceAnalyticsDeviceWithoutCloudIdentity newUserExperienceAnalyticsDeviceWithoutCloudIdentity) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDeviceWithoutCloudIdentityRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsDeviceWithoutCloudIdentityRequest expand(final String value);

}

