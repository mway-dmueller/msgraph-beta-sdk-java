// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookTaskGroup;
import com.microsoft.graph.requests.extensions.IOutlookTaskFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Task Group Request.
 */
public class OutlookTaskGroupRequest extends BaseRequest implements IOutlookTaskGroupRequest {
	
    /**
     * The request for the OutlookTaskGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookTaskGroupRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutlookTaskGroup.class);
    }

    /**
     * Gets the OutlookTaskGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super OutlookTaskGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OutlookTaskGroup from the service
     *
     * @return the OutlookTaskGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OutlookTaskGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super OutlookTaskGroup> callback) {
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
     * Patches this OutlookTaskGroup with a source
     *
     * @param sourceOutlookTaskGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OutlookTaskGroup sourceOutlookTaskGroup, final ICallback<? super OutlookTaskGroup> callback) {
        send(HttpMethod.PATCH, callback, sourceOutlookTaskGroup);
    }

    /**
     * Patches this OutlookTaskGroup with a source
     *
     * @param sourceOutlookTaskGroup the source object with updates
     * @return the updated OutlookTaskGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OutlookTaskGroup patch(final OutlookTaskGroup sourceOutlookTaskGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceOutlookTaskGroup);
    }

    /**
     * Creates a OutlookTaskGroup with a new object
     *
     * @param newOutlookTaskGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OutlookTaskGroup newOutlookTaskGroup, final ICallback<? super OutlookTaskGroup> callback) {
        send(HttpMethod.POST, callback, newOutlookTaskGroup);
    }

    /**
     * Creates a OutlookTaskGroup with a new object
     *
     * @param newOutlookTaskGroup the new object to create
     * @return the created OutlookTaskGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OutlookTaskGroup post(final OutlookTaskGroup newOutlookTaskGroup) throws ClientException {
        return send(HttpMethod.POST, newOutlookTaskGroup);
    }

    /**
     * Creates a OutlookTaskGroup with a new object
     *
     * @param newOutlookTaskGroup the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final OutlookTaskGroup newOutlookTaskGroup, final ICallback<? super OutlookTaskGroup> callback) {
        send(HttpMethod.PUT, callback, newOutlookTaskGroup);
    }

    /**
     * Creates a OutlookTaskGroup with a new object
     *
     * @param newOutlookTaskGroup the object to create/update
     * @return the created OutlookTaskGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OutlookTaskGroup put(final OutlookTaskGroup newOutlookTaskGroup) throws ClientException {
        return send(HttpMethod.PUT, newOutlookTaskGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOutlookTaskGroupRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OutlookTaskGroupRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOutlookTaskGroupRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OutlookTaskGroupRequest)this;
     }

}

