// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.generated.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.models.extensions.DeviceLogCollectionRequest;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import com.microsoft.graph.models.extensions.ConfigurationManagerAction;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.models.generated.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.extensions.BulkManagedDeviceActionResult;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Collection With References Request.
 */
public class ManagedDeviceCollectionWithReferencesRequest extends BaseCollectionRequest<ManagedDeviceCollectionResponse, IManagedDeviceCollectionPage> implements IManagedDeviceCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceCollectionResponse.class, IManagedDeviceCollectionPage.class);
    }

    public void get(final ICallback<? super IManagedDeviceCollectionWithReferencesPage> callback) {
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

    public IManagedDeviceCollectionWithReferencesPage get() throws ClientException {
        final ManagedDeviceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IManagedDeviceCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public IManagedDeviceCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public IManagedDeviceCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public IManagedDeviceCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public IManagedDeviceCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    public IManagedDeviceCollectionWithReferencesPage buildFromResponse(final ManagedDeviceCollectionResponse response) {
        final IManagedDeviceCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedDeviceCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedDeviceCollectionWithReferencesPage page = new ManagedDeviceCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
