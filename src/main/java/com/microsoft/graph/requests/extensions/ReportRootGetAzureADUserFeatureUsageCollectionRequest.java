// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AzureADUserFeatureUsage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetAzureADUserFeatureUsageCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetAzureADUserFeatureUsageCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Azure ADUser Feature Usage Collection Request.
 */
public class ReportRootGetAzureADUserFeatureUsageCollectionRequest extends BaseCollectionRequest<ReportRootGetAzureADUserFeatureUsageCollectionResponse, IReportRootGetAzureADUserFeatureUsageCollectionPage> implements IReportRootGetAzureADUserFeatureUsageCollectionRequest {


    /**
     * The request for this ReportRootGetAzureADUserFeatureUsage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetAzureADUserFeatureUsageCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetAzureADUserFeatureUsageCollectionResponse.class, IReportRootGetAzureADUserFeatureUsageCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetAzureADUserFeatureUsageCollectionPage> callback) {
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

    public IReportRootGetAzureADUserFeatureUsageCollectionPage get() throws ClientException {
        final ReportRootGetAzureADUserFeatureUsageCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetAzureADUserFeatureUsageCollectionPage buildFromResponse(final ReportRootGetAzureADUserFeatureUsageCollectionResponse response) {
        final IReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetAzureADUserFeatureUsageCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IReportRootGetAzureADUserFeatureUsageCollectionPage page = new ReportRootGetAzureADUserFeatureUsageCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetAzureADUserFeatureUsageCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetAzureADUserFeatureUsageCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetAzureADUserFeatureUsageCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetAzureADUserFeatureUsageCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetAzureADUserFeatureUsageCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetAzureADUserFeatureUsageCollectionRequest)this;
    }

}