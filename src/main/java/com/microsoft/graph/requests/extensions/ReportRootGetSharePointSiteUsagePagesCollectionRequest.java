// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharePointSiteUsagePages;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsagePagesCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsagePagesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Site Usage Pages Collection Request.
 */
public class ReportRootGetSharePointSiteUsagePagesCollectionRequest extends BaseCollectionRequest<ReportRootGetSharePointSiteUsagePagesCollectionResponse, IReportRootGetSharePointSiteUsagePagesCollectionPage> implements IReportRootGetSharePointSiteUsagePagesCollectionRequest {


    /**
     * The request for this ReportRootGetSharePointSiteUsagePages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSharePointSiteUsagePagesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetSharePointSiteUsagePagesCollectionResponse.class, IReportRootGetSharePointSiteUsagePagesCollectionPage.class);
    }


    public void get(final ICallback<? super IReportRootGetSharePointSiteUsagePagesCollectionPage> callback) {
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

    public IReportRootGetSharePointSiteUsagePagesCollectionPage get() throws ClientException {
        final ReportRootGetSharePointSiteUsagePagesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetSharePointSiteUsagePagesCollectionPage buildFromResponse(final ReportRootGetSharePointSiteUsagePagesCollectionResponse response) {
        final IReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetSharePointSiteUsagePagesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetSharePointSiteUsagePagesCollectionPage page = new ReportRootGetSharePointSiteUsagePagesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetSharePointSiteUsagePagesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetSharePointSiteUsagePagesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetSharePointSiteUsagePagesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetSharePointSiteUsagePagesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetSharePointSiteUsagePagesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetSharePointSiteUsagePagesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetSharePointSiteUsagePagesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetSharePointSiteUsagePagesCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetSharePointSiteUsagePagesCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IReportRootGetSharePointSiteUsagePagesCollectionRequest)this;
    }

}
