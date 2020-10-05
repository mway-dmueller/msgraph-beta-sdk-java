// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignCollectionResponse;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Assign Collection Request.
 */
public class DeviceCompliancePolicyAssignCollectionRequest extends BaseCollectionRequest<DeviceCompliancePolicyAssignCollectionResponse, IDeviceCompliancePolicyAssignCollectionPage> implements IDeviceCompliancePolicyAssignCollectionRequest {


    protected final DeviceCompliancePolicyAssignBody body;


    /**
     * The request for this DeviceCompliancePolicyAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyAssignCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyAssignCollectionResponse.class, IDeviceCompliancePolicyAssignCollectionPage.class);
        body = new DeviceCompliancePolicyAssignBody();
    }


    public void post(final ICallback<? super IDeviceCompliancePolicyAssignCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceCompliancePolicyAssignCollectionPage post() throws ClientException {
        final DeviceCompliancePolicyAssignCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IDeviceCompliancePolicyAssignCollectionPage buildFromResponse(final DeviceCompliancePolicyAssignCollectionResponse response) {
        final IDeviceCompliancePolicyAssignCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceCompliancePolicyAssignCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<DeviceCompliancePolicyAssignment>) null);
        } else {
            builder = null;
        }
        final IDeviceCompliancePolicyAssignCollectionPage page = new DeviceCompliancePolicyAssignCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyAssignCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceCompliancePolicyAssignCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceCompliancePolicyAssignCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IDeviceCompliancePolicyAssignCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyAssignCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IDeviceCompliancePolicyAssignCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyAssignCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IDeviceCompliancePolicyAssignCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyAssignCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IDeviceCompliancePolicyAssignCollectionRequest)this;
    }

}
