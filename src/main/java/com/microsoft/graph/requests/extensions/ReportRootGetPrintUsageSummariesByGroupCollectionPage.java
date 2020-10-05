// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByGroupCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByGroupCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Print Usage Summaries By Group Collection Page.
 */
public class ReportRootGetPrintUsageSummariesByGroupCollectionPage extends BaseCollectionPage<GroupPrintUsageSummary, IReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder> implements IReportRootGetPrintUsageSummariesByGroupCollectionPage {

    /**
     * A collection page for GroupPrintUsageSummary.
     *
     * @param response The serialized ReportRootGetPrintUsageSummariesByGroupCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetPrintUsageSummariesByGroupCollectionPage(final ReportRootGetPrintUsageSummariesByGroupCollectionResponse response, final IReportRootGetPrintUsageSummariesByGroupCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
