// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicy;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Assignment Collection Request.
 */
public class DeviceManagementConfigurationPolicyAssignmentCollectionRequest extends BaseCollectionRequest<DeviceManagementConfigurationPolicyAssignmentCollectionResponse, IDeviceManagementConfigurationPolicyAssignmentCollectionPage> implements IDeviceManagementConfigurationPolicyAssignmentCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementConfigurationPolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationPolicyAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationPolicyAssignmentCollectionResponse.class, IDeviceManagementConfigurationPolicyAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceManagementConfigurationPolicyAssignmentCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceManagementConfigurationPolicyAssignmentCollectionPage get() throws ClientException {
        final DeviceManagementConfigurationPolicyAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment, final ICallback<? super DeviceManagementConfigurationPolicyAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementConfigurationPolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementConfigurationPolicyAssignment, callback);
    }

    public DeviceManagementConfigurationPolicyAssignment post(final DeviceManagementConfigurationPolicyAssignment newDeviceManagementConfigurationPolicyAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementConfigurationPolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementConfigurationPolicyAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementConfigurationPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementConfigurationPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceManagementConfigurationPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementConfigurationPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementConfigurationPolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementConfigurationPolicyAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementConfigurationPolicyAssignmentCollectionRequest)this;
    }
    public IDeviceManagementConfigurationPolicyAssignmentCollectionPage buildFromResponse(final DeviceManagementConfigurationPolicyAssignmentCollectionResponse response) {
        final IDeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementConfigurationPolicyAssignmentCollectionPage page = new DeviceManagementConfigurationPolicyAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}