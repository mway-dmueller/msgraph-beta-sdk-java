// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppConsentApprovalRoute;
import com.microsoft.graph.requests.extensions.IAppConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.AppConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppConsentRequestRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Consent Approval Route Request.
 */
public class AppConsentApprovalRouteRequest extends BaseRequest implements IAppConsentApprovalRouteRequest {
	
    /**
     * The request for the AppConsentApprovalRoute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppConsentApprovalRouteRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppConsentApprovalRoute.class);
    }

    /**
     * Gets the AppConsentApprovalRoute from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AppConsentApprovalRoute> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AppConsentApprovalRoute from the service
     *
     * @return the AppConsentApprovalRoute from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppConsentApprovalRoute get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AppConsentApprovalRoute> callback) {
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
     * Patches this AppConsentApprovalRoute with a source
     *
     * @param sourceAppConsentApprovalRoute the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AppConsentApprovalRoute sourceAppConsentApprovalRoute, final ICallback<? super AppConsentApprovalRoute> callback) {
        send(HttpMethod.PATCH, callback, sourceAppConsentApprovalRoute);
    }

    /**
     * Patches this AppConsentApprovalRoute with a source
     *
     * @param sourceAppConsentApprovalRoute the source object with updates
     * @return the updated AppConsentApprovalRoute
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppConsentApprovalRoute patch(final AppConsentApprovalRoute sourceAppConsentApprovalRoute) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppConsentApprovalRoute);
    }

    /**
     * Creates a AppConsentApprovalRoute with a new object
     *
     * @param newAppConsentApprovalRoute the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AppConsentApprovalRoute newAppConsentApprovalRoute, final ICallback<? super AppConsentApprovalRoute> callback) {
        send(HttpMethod.POST, callback, newAppConsentApprovalRoute);
    }

    /**
     * Creates a AppConsentApprovalRoute with a new object
     *
     * @param newAppConsentApprovalRoute the new object to create
     * @return the created AppConsentApprovalRoute
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppConsentApprovalRoute post(final AppConsentApprovalRoute newAppConsentApprovalRoute) throws ClientException {
        return send(HttpMethod.POST, newAppConsentApprovalRoute);
    }

    /**
     * Creates a AppConsentApprovalRoute with a new object
     *
     * @param newAppConsentApprovalRoute the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AppConsentApprovalRoute newAppConsentApprovalRoute, final ICallback<? super AppConsentApprovalRoute> callback) {
        send(HttpMethod.PUT, callback, newAppConsentApprovalRoute);
    }

    /**
     * Creates a AppConsentApprovalRoute with a new object
     *
     * @param newAppConsentApprovalRoute the object to create/update
     * @return the created AppConsentApprovalRoute
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppConsentApprovalRoute put(final AppConsentApprovalRoute newAppConsentApprovalRoute) throws ClientException {
        return send(HttpMethod.PUT, newAppConsentApprovalRoute);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAppConsentApprovalRouteRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AppConsentApprovalRouteRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAppConsentApprovalRouteRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AppConsentApprovalRouteRequest)this;
     }

}
