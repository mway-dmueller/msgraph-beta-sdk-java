// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserConsentRequest;
import com.microsoft.graph.requests.extensions.IApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Consent Request Request.
 */
public class UserConsentRequestRequest extends BaseRequest implements IUserConsentRequestRequest {
	
    /**
     * The request for the UserConsentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserConsentRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserConsentRequest.class);
    }

    /**
     * Gets the UserConsentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserConsentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserConsentRequest from the service
     *
     * @return the UserConsentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserConsentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserConsentRequest> callback) {
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
     * Patches this UserConsentRequest with a source
     *
     * @param sourceUserConsentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserConsentRequest sourceUserConsentRequest, final ICallback<? super UserConsentRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceUserConsentRequest);
    }

    /**
     * Patches this UserConsentRequest with a source
     *
     * @param sourceUserConsentRequest the source object with updates
     * @return the updated UserConsentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserConsentRequest patch(final UserConsentRequest sourceUserConsentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserConsentRequest);
    }

    /**
     * Creates a UserConsentRequest with a new object
     *
     * @param newUserConsentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserConsentRequest newUserConsentRequest, final ICallback<? super UserConsentRequest> callback) {
        send(HttpMethod.POST, callback, newUserConsentRequest);
    }

    /**
     * Creates a UserConsentRequest with a new object
     *
     * @param newUserConsentRequest the new object to create
     * @return the created UserConsentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserConsentRequest post(final UserConsentRequest newUserConsentRequest) throws ClientException {
        return send(HttpMethod.POST, newUserConsentRequest);
    }

    /**
     * Creates a UserConsentRequest with a new object
     *
     * @param newUserConsentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserConsentRequest newUserConsentRequest, final ICallback<? super UserConsentRequest> callback) {
        send(HttpMethod.PUT, callback, newUserConsentRequest);
    }

    /**
     * Creates a UserConsentRequest with a new object
     *
     * @param newUserConsentRequest the object to create/update
     * @return the created UserConsentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserConsentRequest put(final UserConsentRequest newUserConsentRequest) throws ClientException {
        return send(HttpMethod.PUT, newUserConsentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserConsentRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserConsentRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserConsentRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserConsentRequestRequest)this;
     }

}

