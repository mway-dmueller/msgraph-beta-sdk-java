// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceWithoutCloudIdentity;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Without Cloud Identity Request.
 */
public class UserExperienceAnalyticsDeviceWithoutCloudIdentityRequest extends BaseRequest implements IUserExperienceAnalyticsDeviceWithoutCloudIdentityRequest {
	
    /**
     * The request for the UserExperienceAnalyticsDeviceWithoutCloudIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsDeviceWithoutCloudIdentityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsDeviceWithoutCloudIdentity.class);
    }

    /**
     * Gets the UserExperienceAnalyticsDeviceWithoutCloudIdentity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsDeviceWithoutCloudIdentity from the service
     *
     * @return the UserExperienceAnalyticsDeviceWithoutCloudIdentity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDeviceWithoutCloudIdentity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsDeviceWithoutCloudIdentity with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsDeviceWithoutCloudIdentity sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity, final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity);
    }

    /**
     * Patches this UserExperienceAnalyticsDeviceWithoutCloudIdentity with a source
     *
     * @param sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity the source object with updates
     * @return the updated UserExperienceAnalyticsDeviceWithoutCloudIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDeviceWithoutCloudIdentity patch(final UserExperienceAnalyticsDeviceWithoutCloudIdentity sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsDeviceWithoutCloudIdentity);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceWithoutCloudIdentity with a new object
     *
     * @param newUserExperienceAnalyticsDeviceWithoutCloudIdentity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsDeviceWithoutCloudIdentity newUserExperienceAnalyticsDeviceWithoutCloudIdentity, final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsDeviceWithoutCloudIdentity);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceWithoutCloudIdentity with a new object
     *
     * @param newUserExperienceAnalyticsDeviceWithoutCloudIdentity the new object to create
     * @return the created UserExperienceAnalyticsDeviceWithoutCloudIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDeviceWithoutCloudIdentity post(final UserExperienceAnalyticsDeviceWithoutCloudIdentity newUserExperienceAnalyticsDeviceWithoutCloudIdentity) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsDeviceWithoutCloudIdentity);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceWithoutCloudIdentity with a new object
     *
     * @param newUserExperienceAnalyticsDeviceWithoutCloudIdentity the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserExperienceAnalyticsDeviceWithoutCloudIdentity newUserExperienceAnalyticsDeviceWithoutCloudIdentity, final ICallback<? super UserExperienceAnalyticsDeviceWithoutCloudIdentity> callback) {
        send(HttpMethod.PUT, callback, newUserExperienceAnalyticsDeviceWithoutCloudIdentity);
    }

    /**
     * Creates a UserExperienceAnalyticsDeviceWithoutCloudIdentity with a new object
     *
     * @param newUserExperienceAnalyticsDeviceWithoutCloudIdentity the object to create/update
     * @return the created UserExperienceAnalyticsDeviceWithoutCloudIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsDeviceWithoutCloudIdentity put(final UserExperienceAnalyticsDeviceWithoutCloudIdentity newUserExperienceAnalyticsDeviceWithoutCloudIdentity) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsDeviceWithoutCloudIdentity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsDeviceWithoutCloudIdentityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsDeviceWithoutCloudIdentityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsDeviceWithoutCloudIdentityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsDeviceWithoutCloudIdentityRequest)this;
     }

}
