// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsFeatureUpdateProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Feature Update Profile Assignment Request.
 */
public class WindowsFeatureUpdateProfileAssignmentRequest extends BaseRequest implements IWindowsFeatureUpdateProfileAssignmentRequest {
	
    /**
     * The request for the WindowsFeatureUpdateProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsFeatureUpdateProfileAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsFeatureUpdateProfileAssignment.class);
    }

    /**
     * Gets the WindowsFeatureUpdateProfileAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsFeatureUpdateProfileAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsFeatureUpdateProfileAssignment from the service
     *
     * @return the WindowsFeatureUpdateProfileAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsFeatureUpdateProfileAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsFeatureUpdateProfileAssignment> callback) {
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
     * Patches this WindowsFeatureUpdateProfileAssignment with a source
     *
     * @param sourceWindowsFeatureUpdateProfileAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsFeatureUpdateProfileAssignment sourceWindowsFeatureUpdateProfileAssignment, final ICallback<? super WindowsFeatureUpdateProfileAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsFeatureUpdateProfileAssignment);
    }

    /**
     * Patches this WindowsFeatureUpdateProfileAssignment with a source
     *
     * @param sourceWindowsFeatureUpdateProfileAssignment the source object with updates
     * @return the updated WindowsFeatureUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsFeatureUpdateProfileAssignment patch(final WindowsFeatureUpdateProfileAssignment sourceWindowsFeatureUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsFeatureUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsFeatureUpdateProfileAssignment with a new object
     *
     * @param newWindowsFeatureUpdateProfileAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsFeatureUpdateProfileAssignment newWindowsFeatureUpdateProfileAssignment, final ICallback<? super WindowsFeatureUpdateProfileAssignment> callback) {
        send(HttpMethod.POST, callback, newWindowsFeatureUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsFeatureUpdateProfileAssignment with a new object
     *
     * @param newWindowsFeatureUpdateProfileAssignment the new object to create
     * @return the created WindowsFeatureUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsFeatureUpdateProfileAssignment post(final WindowsFeatureUpdateProfileAssignment newWindowsFeatureUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.POST, newWindowsFeatureUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsFeatureUpdateProfileAssignment with a new object
     *
     * @param newWindowsFeatureUpdateProfileAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsFeatureUpdateProfileAssignment newWindowsFeatureUpdateProfileAssignment, final ICallback<? super WindowsFeatureUpdateProfileAssignment> callback) {
        send(HttpMethod.PUT, callback, newWindowsFeatureUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsFeatureUpdateProfileAssignment with a new object
     *
     * @param newWindowsFeatureUpdateProfileAssignment the object to create/update
     * @return the created WindowsFeatureUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsFeatureUpdateProfileAssignment put(final WindowsFeatureUpdateProfileAssignment newWindowsFeatureUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.PUT, newWindowsFeatureUpdateProfileAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsFeatureUpdateProfileAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsFeatureUpdateProfileAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsFeatureUpdateProfileAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsFeatureUpdateProfileAssignmentRequest)this;
     }

}

