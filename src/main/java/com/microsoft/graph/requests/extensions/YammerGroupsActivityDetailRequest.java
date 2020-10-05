// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerGroupsActivityDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Yammer Groups Activity Detail Request.
 */
public class YammerGroupsActivityDetailRequest extends BaseRequest implements IYammerGroupsActivityDetailRequest {
	
    /**
     * The request for the YammerGroupsActivityDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public YammerGroupsActivityDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, YammerGroupsActivityDetail.class);
    }

    /**
     * Gets the YammerGroupsActivityDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super YammerGroupsActivityDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the YammerGroupsActivityDetail from the service
     *
     * @return the YammerGroupsActivityDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerGroupsActivityDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super YammerGroupsActivityDetail> callback) {
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
     * Patches this YammerGroupsActivityDetail with a source
     *
     * @param sourceYammerGroupsActivityDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final YammerGroupsActivityDetail sourceYammerGroupsActivityDetail, final ICallback<? super YammerGroupsActivityDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceYammerGroupsActivityDetail);
    }

    /**
     * Patches this YammerGroupsActivityDetail with a source
     *
     * @param sourceYammerGroupsActivityDetail the source object with updates
     * @return the updated YammerGroupsActivityDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerGroupsActivityDetail patch(final YammerGroupsActivityDetail sourceYammerGroupsActivityDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceYammerGroupsActivityDetail);
    }

    /**
     * Creates a YammerGroupsActivityDetail with a new object
     *
     * @param newYammerGroupsActivityDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final YammerGroupsActivityDetail newYammerGroupsActivityDetail, final ICallback<? super YammerGroupsActivityDetail> callback) {
        send(HttpMethod.POST, callback, newYammerGroupsActivityDetail);
    }

    /**
     * Creates a YammerGroupsActivityDetail with a new object
     *
     * @param newYammerGroupsActivityDetail the new object to create
     * @return the created YammerGroupsActivityDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerGroupsActivityDetail post(final YammerGroupsActivityDetail newYammerGroupsActivityDetail) throws ClientException {
        return send(HttpMethod.POST, newYammerGroupsActivityDetail);
    }

    /**
     * Creates a YammerGroupsActivityDetail with a new object
     *
     * @param newYammerGroupsActivityDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final YammerGroupsActivityDetail newYammerGroupsActivityDetail, final ICallback<? super YammerGroupsActivityDetail> callback) {
        send(HttpMethod.PUT, callback, newYammerGroupsActivityDetail);
    }

    /**
     * Creates a YammerGroupsActivityDetail with a new object
     *
     * @param newYammerGroupsActivityDetail the object to create/update
     * @return the created YammerGroupsActivityDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerGroupsActivityDetail put(final YammerGroupsActivityDetail newYammerGroupsActivityDetail) throws ClientException {
        return send(HttpMethod.PUT, newYammerGroupsActivityDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IYammerGroupsActivityDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (YammerGroupsActivityDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IYammerGroupsActivityDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (YammerGroupsActivityDetailRequest)this;
     }

}

