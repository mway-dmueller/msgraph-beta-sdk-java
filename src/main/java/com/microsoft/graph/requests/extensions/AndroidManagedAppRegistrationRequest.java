// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Registration Request.
 */
public class AndroidManagedAppRegistrationRequest extends BaseRequest implements IAndroidManagedAppRegistrationRequest {
	
    /**
     * The request for the AndroidManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedAppRegistrationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidManagedAppRegistration.class);
    }

    /**
     * Gets the AndroidManagedAppRegistration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidManagedAppRegistration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidManagedAppRegistration from the service
     *
     * @return the AndroidManagedAppRegistration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidManagedAppRegistration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidManagedAppRegistration> callback) {
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
     * Patches this AndroidManagedAppRegistration with a source
     *
     * @param sourceAndroidManagedAppRegistration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidManagedAppRegistration sourceAndroidManagedAppRegistration, final ICallback<? super AndroidManagedAppRegistration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidManagedAppRegistration);
    }

    /**
     * Patches this AndroidManagedAppRegistration with a source
     *
     * @param sourceAndroidManagedAppRegistration the source object with updates
     * @return the updated AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidManagedAppRegistration patch(final AndroidManagedAppRegistration sourceAndroidManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidManagedAppRegistration);
    }

    /**
     * Creates a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidManagedAppRegistration newAndroidManagedAppRegistration, final ICallback<? super AndroidManagedAppRegistration> callback) {
        send(HttpMethod.POST, callback, newAndroidManagedAppRegistration);
    }

    /**
     * Creates a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the new object to create
     * @return the created AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidManagedAppRegistration post(final AndroidManagedAppRegistration newAndroidManagedAppRegistration) throws ClientException {
        return send(HttpMethod.POST, newAndroidManagedAppRegistration);
    }

    /**
     * Creates a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidManagedAppRegistration newAndroidManagedAppRegistration, final ICallback<? super AndroidManagedAppRegistration> callback) {
        send(HttpMethod.PUT, callback, newAndroidManagedAppRegistration);
    }

    /**
     * Creates a AndroidManagedAppRegistration with a new object
     *
     * @param newAndroidManagedAppRegistration the object to create/update
     * @return the created AndroidManagedAppRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidManagedAppRegistration put(final AndroidManagedAppRegistration newAndroidManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidManagedAppRegistration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidManagedAppRegistrationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidManagedAppRegistrationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidManagedAppRegistrationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidManagedAppRegistrationRequest)this;
     }

}

