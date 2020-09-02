// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Compliance Policy Request.
 */
public class AndroidWorkProfileCompliancePolicyRequest extends BaseRequest implements IAndroidWorkProfileCompliancePolicyRequest {
	
    /**
     * The request for the AndroidWorkProfileCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileCompliancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileCompliancePolicy.class);
    }

    /**
     * Gets the AndroidWorkProfileCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidWorkProfileCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidWorkProfileCompliancePolicy from the service
     *
     * @return the AndroidWorkProfileCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidWorkProfileCompliancePolicy> callback) {
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
     * Patches this AndroidWorkProfileCompliancePolicy with a source
     *
     * @param sourceAndroidWorkProfileCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidWorkProfileCompliancePolicy sourceAndroidWorkProfileCompliancePolicy, final ICallback<AndroidWorkProfileCompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Patches this AndroidWorkProfileCompliancePolicy with a source
     *
     * @param sourceAndroidWorkProfileCompliancePolicy the source object with updates
     * @return the updated AndroidWorkProfileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileCompliancePolicy patch(final AndroidWorkProfileCompliancePolicy sourceAndroidWorkProfileCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Creates a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy, final ICallback<AndroidWorkProfileCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Creates a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the new object to create
     * @return the created AndroidWorkProfileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileCompliancePolicy post(final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidWorkProfileCompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidWorkProfileCompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidWorkProfileCompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidWorkProfileCompliancePolicyRequest)this;
     }

}
