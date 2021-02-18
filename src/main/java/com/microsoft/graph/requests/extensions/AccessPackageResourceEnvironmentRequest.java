// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResourceEnvironment;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Environment Request.
 */
public class AccessPackageResourceEnvironmentRequest extends BaseRequest implements IAccessPackageResourceEnvironmentRequest {
	
    /**
     * The request for the AccessPackageResourceEnvironment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceEnvironmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResourceEnvironment.class);
    }

    /**
     * Gets the AccessPackageResourceEnvironment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AccessPackageResourceEnvironment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessPackageResourceEnvironment from the service
     *
     * @return the AccessPackageResourceEnvironment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceEnvironment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AccessPackageResourceEnvironment> callback) {
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
     * Patches this AccessPackageResourceEnvironment with a source
     *
     * @param sourceAccessPackageResourceEnvironment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessPackageResourceEnvironment sourceAccessPackageResourceEnvironment, final ICallback<? super AccessPackageResourceEnvironment> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessPackageResourceEnvironment);
    }

    /**
     * Patches this AccessPackageResourceEnvironment with a source
     *
     * @param sourceAccessPackageResourceEnvironment the source object with updates
     * @return the updated AccessPackageResourceEnvironment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceEnvironment patch(final AccessPackageResourceEnvironment sourceAccessPackageResourceEnvironment) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageResourceEnvironment);
    }

    /**
     * Creates a AccessPackageResourceEnvironment with a new object
     *
     * @param newAccessPackageResourceEnvironment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessPackageResourceEnvironment newAccessPackageResourceEnvironment, final ICallback<? super AccessPackageResourceEnvironment> callback) {
        send(HttpMethod.POST, callback, newAccessPackageResourceEnvironment);
    }

    /**
     * Creates a AccessPackageResourceEnvironment with a new object
     *
     * @param newAccessPackageResourceEnvironment the new object to create
     * @return the created AccessPackageResourceEnvironment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceEnvironment post(final AccessPackageResourceEnvironment newAccessPackageResourceEnvironment) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageResourceEnvironment);
    }

    /**
     * Creates a AccessPackageResourceEnvironment with a new object
     *
     * @param newAccessPackageResourceEnvironment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AccessPackageResourceEnvironment newAccessPackageResourceEnvironment, final ICallback<? super AccessPackageResourceEnvironment> callback) {
        send(HttpMethod.PUT, callback, newAccessPackageResourceEnvironment);
    }

    /**
     * Creates a AccessPackageResourceEnvironment with a new object
     *
     * @param newAccessPackageResourceEnvironment the object to create/update
     * @return the created AccessPackageResourceEnvironment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceEnvironment put(final AccessPackageResourceEnvironment newAccessPackageResourceEnvironment) throws ClientException {
        return send(HttpMethod.PUT, newAccessPackageResourceEnvironment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessPackageResourceEnvironmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessPackageResourceEnvironmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessPackageResourceEnvironmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessPackageResourceEnvironmentRequest)this;
     }

}
