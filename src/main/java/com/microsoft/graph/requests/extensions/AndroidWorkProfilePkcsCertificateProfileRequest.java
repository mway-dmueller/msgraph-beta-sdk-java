// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfilePkcsCertificateProfile;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Pkcs Certificate Profile Request.
 */
public class AndroidWorkProfilePkcsCertificateProfileRequest extends BaseRequest implements IAndroidWorkProfilePkcsCertificateProfileRequest {
	
    /**
     * The request for the AndroidWorkProfilePkcsCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfilePkcsCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfilePkcsCertificateProfile.class);
    }

    /**
     * Gets the AndroidWorkProfilePkcsCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidWorkProfilePkcsCertificateProfile from the service
     *
     * @return the AndroidWorkProfilePkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfilePkcsCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback) {
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
     * Patches this AndroidWorkProfilePkcsCertificateProfile with a source
     *
     * @param sourceAndroidWorkProfilePkcsCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidWorkProfilePkcsCertificateProfile sourceAndroidWorkProfilePkcsCertificateProfile, final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidWorkProfilePkcsCertificateProfile);
    }

    /**
     * Patches this AndroidWorkProfilePkcsCertificateProfile with a source
     *
     * @param sourceAndroidWorkProfilePkcsCertificateProfile the source object with updates
     * @return the updated AndroidWorkProfilePkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfilePkcsCertificateProfile patch(final AndroidWorkProfilePkcsCertificateProfile sourceAndroidWorkProfilePkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfilePkcsCertificateProfile);
    }

    /**
     * Creates a AndroidWorkProfilePkcsCertificateProfile with a new object
     *
     * @param newAndroidWorkProfilePkcsCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidWorkProfilePkcsCertificateProfile newAndroidWorkProfilePkcsCertificateProfile, final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newAndroidWorkProfilePkcsCertificateProfile);
    }

    /**
     * Creates a AndroidWorkProfilePkcsCertificateProfile with a new object
     *
     * @param newAndroidWorkProfilePkcsCertificateProfile the new object to create
     * @return the created AndroidWorkProfilePkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfilePkcsCertificateProfile post(final AndroidWorkProfilePkcsCertificateProfile newAndroidWorkProfilePkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfilePkcsCertificateProfile);
    }

    /**
     * Creates a AndroidWorkProfilePkcsCertificateProfile with a new object
     *
     * @param newAndroidWorkProfilePkcsCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidWorkProfilePkcsCertificateProfile newAndroidWorkProfilePkcsCertificateProfile, final ICallback<? super AndroidWorkProfilePkcsCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newAndroidWorkProfilePkcsCertificateProfile);
    }

    /**
     * Creates a AndroidWorkProfilePkcsCertificateProfile with a new object
     *
     * @param newAndroidWorkProfilePkcsCertificateProfile the object to create/update
     * @return the created AndroidWorkProfilePkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfilePkcsCertificateProfile put(final AndroidWorkProfilePkcsCertificateProfile newAndroidWorkProfilePkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfilePkcsCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidWorkProfilePkcsCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidWorkProfilePkcsCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidWorkProfilePkcsCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidWorkProfilePkcsCertificateProfileRequest)this;
     }

}

