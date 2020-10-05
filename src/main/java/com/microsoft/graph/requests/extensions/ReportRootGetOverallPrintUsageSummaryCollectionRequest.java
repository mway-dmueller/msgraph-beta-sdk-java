// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OverallPrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOverallPrintUsageSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOverallPrintUsageSummaryCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Overall Print Usage Summary Collection Request.
 */
public class ReportRootGetOverallPrintUsageSummaryCollectionRequest extends BaseCollectionRequest<ReportRootGetOverallPrintUsageSummaryCollectionResponse, IReportRootGetOverallPrintUsageSummaryCollectionPage> implements IReportRootGetOverallPrintUsageSummaryCollectionRequest {


    /**
     * The request for this ReportRootGetOverallPrintUsageSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOverallPrintUsageSummaryCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOverallPrintUsageSummaryCollectionResponse.class, IReportRootGetOverallPrintUsageSummaryCollectionPage.class);
    }


    public void get(final ICallback<? super IReportRootGetOverallPrintUsageSummaryCollectionPage> callback) {
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

    public IReportRootGetOverallPrintUsageSummaryCollectionPage get() throws ClientException {
        final ReportRootGetOverallPrintUsageSummaryCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetOverallPrintUsageSummaryCollectionPage buildFromResponse(final ReportRootGetOverallPrintUsageSummaryCollectionResponse response) {
        final IReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetOverallPrintUsageSummaryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.Calendar) null, (java.util.Calendar) null, (Integer) null);
        } else {
            builder = null;
        }
        final IReportRootGetOverallPrintUsageSummaryCollectionPage page = new ReportRootGetOverallPrintUsageSummaryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOverallPrintUsageSummaryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetOverallPrintUsageSummaryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetOverallPrintUsageSummaryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetOverallPrintUsageSummaryCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOverallPrintUsageSummaryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetOverallPrintUsageSummaryCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetOverallPrintUsageSummaryCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetOverallPrintUsageSummaryCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetOverallPrintUsageSummaryCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IReportRootGetOverallPrintUsageSummaryCollectionRequest)this;
    }

}
