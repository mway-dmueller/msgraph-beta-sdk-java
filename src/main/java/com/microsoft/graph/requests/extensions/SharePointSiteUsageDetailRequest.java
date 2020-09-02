// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharePointSiteUsageDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Share Point Site Usage Detail Request.
 */
public class SharePointSiteUsageDetailRequest extends BaseRequest implements ISharePointSiteUsageDetailRequest {
	
    /**
     * The request for the SharePointSiteUsageDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharePointSiteUsageDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SharePointSiteUsageDetail.class);
    }

    /**
     * Gets the SharePointSiteUsageDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SharePointSiteUsageDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SharePointSiteUsageDetail from the service
     *
     * @return the SharePointSiteUsageDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointSiteUsageDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SharePointSiteUsageDetail> callback) {
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
     * Patches this SharePointSiteUsageDetail with a source
     *
     * @param sourceSharePointSiteUsageDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SharePointSiteUsageDetail sourceSharePointSiteUsageDetail, final ICallback<SharePointSiteUsageDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceSharePointSiteUsageDetail);
    }

    /**
     * Patches this SharePointSiteUsageDetail with a source
     *
     * @param sourceSharePointSiteUsageDetail the source object with updates
     * @return the updated SharePointSiteUsageDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointSiteUsageDetail patch(final SharePointSiteUsageDetail sourceSharePointSiteUsageDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceSharePointSiteUsageDetail);
    }

    /**
     * Creates a SharePointSiteUsageDetail with a new object
     *
     * @param newSharePointSiteUsageDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SharePointSiteUsageDetail newSharePointSiteUsageDetail, final ICallback<SharePointSiteUsageDetail> callback) {
        send(HttpMethod.POST, callback, newSharePointSiteUsageDetail);
    }

    /**
     * Creates a SharePointSiteUsageDetail with a new object
     *
     * @param newSharePointSiteUsageDetail the new object to create
     * @return the created SharePointSiteUsageDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharePointSiteUsageDetail post(final SharePointSiteUsageDetail newSharePointSiteUsageDetail) throws ClientException {
        return send(HttpMethod.POST, newSharePointSiteUsageDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISharePointSiteUsageDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SharePointSiteUsageDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISharePointSiteUsageDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SharePointSiteUsageDetailRequest)this;
     }

}
