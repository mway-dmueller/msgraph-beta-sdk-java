// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsQualityUpdateProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Profile Assignment Request.
 */
public class WindowsQualityUpdateProfileAssignmentRequest extends BaseRequest implements IWindowsQualityUpdateProfileAssignmentRequest {
	
    /**
     * The request for the WindowsQualityUpdateProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsQualityUpdateProfileAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsQualityUpdateProfileAssignment.class);
    }

    /**
     * Gets the WindowsQualityUpdateProfileAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsQualityUpdateProfileAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsQualityUpdateProfileAssignment from the service
     *
     * @return the WindowsQualityUpdateProfileAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsQualityUpdateProfileAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsQualityUpdateProfileAssignment> callback) {
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
     * Patches this WindowsQualityUpdateProfileAssignment with a source
     *
     * @param sourceWindowsQualityUpdateProfileAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsQualityUpdateProfileAssignment sourceWindowsQualityUpdateProfileAssignment, final ICallback<? super WindowsQualityUpdateProfileAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Patches this WindowsQualityUpdateProfileAssignment with a source
     *
     * @param sourceWindowsQualityUpdateProfileAssignment the source object with updates
     * @return the updated WindowsQualityUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsQualityUpdateProfileAssignment patch(final WindowsQualityUpdateProfileAssignment sourceWindowsQualityUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsQualityUpdateProfileAssignment with a new object
     *
     * @param newWindowsQualityUpdateProfileAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsQualityUpdateProfileAssignment newWindowsQualityUpdateProfileAssignment, final ICallback<? super WindowsQualityUpdateProfileAssignment> callback) {
        send(HttpMethod.POST, callback, newWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsQualityUpdateProfileAssignment with a new object
     *
     * @param newWindowsQualityUpdateProfileAssignment the new object to create
     * @return the created WindowsQualityUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsQualityUpdateProfileAssignment post(final WindowsQualityUpdateProfileAssignment newWindowsQualityUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.POST, newWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsQualityUpdateProfileAssignment with a new object
     *
     * @param newWindowsQualityUpdateProfileAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsQualityUpdateProfileAssignment newWindowsQualityUpdateProfileAssignment, final ICallback<? super WindowsQualityUpdateProfileAssignment> callback) {
        send(HttpMethod.PUT, callback, newWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Creates a WindowsQualityUpdateProfileAssignment with a new object
     *
     * @param newWindowsQualityUpdateProfileAssignment the object to create/update
     * @return the created WindowsQualityUpdateProfileAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsQualityUpdateProfileAssignment put(final WindowsQualityUpdateProfileAssignment newWindowsQualityUpdateProfileAssignment) throws ClientException {
        return send(HttpMethod.PUT, newWindowsQualityUpdateProfileAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsQualityUpdateProfileAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsQualityUpdateProfileAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsQualityUpdateProfileAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsQualityUpdateProfileAssignmentRequest)this;
     }

}

