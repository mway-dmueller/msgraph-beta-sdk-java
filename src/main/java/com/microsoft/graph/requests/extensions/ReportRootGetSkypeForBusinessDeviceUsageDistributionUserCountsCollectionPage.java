// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageDistributionUserCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Device Usage Distribution User Counts Collection Page.
 */
public class ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionPage extends BaseCollectionPage<SkypeForBusinessDeviceUsageDistributionUserCounts, IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder> implements IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionPage {

    /**
     * A collection page for SkypeForBusinessDeviceUsageDistributionUserCounts.
     *
     * @param response The serialized ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionPage(final ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionResponse response, final IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}