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

import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSharePointSiteUsageDetailCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Share Point Site Usage Detail Collection Page.
 */
public class ReportRootGetSharePointSiteUsageDetailCollectionPage extends BaseCollectionPage<SharePointSiteUsageDetail, IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder> implements IReportRootGetSharePointSiteUsageDetailCollectionPage {

    /**
     * A collection page for SharePointSiteUsageDetail.
     *
     * @param response The serialized ReportRootGetSharePointSiteUsageDetailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSharePointSiteUsageDetailCollectionPage(final ReportRootGetSharePointSiteUsageDetailCollectionResponse response, final IReportRootGetSharePointSiteUsageDetailCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
