// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRegressionSummary;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Regression Summary Request Builder.
 */
public interface IUserExperienceAnalyticsRegressionSummaryRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserExperienceAnalyticsRegressionSummaryRequest instance
     */
    IUserExperienceAnalyticsRegressionSummaryRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IUserExperienceAnalyticsRegressionSummaryRequest instance
     */
    IUserExperienceAnalyticsRegressionSummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IUserExperienceAnalyticsMetricCollectionRequestBuilder manufacturerRegression();

    IUserExperienceAnalyticsMetricRequestBuilder manufacturerRegression(final String id);

    IUserExperienceAnalyticsMetricCollectionRequestBuilder modelRegression();

    IUserExperienceAnalyticsMetricRequestBuilder modelRegression(final String id);

    IUserExperienceAnalyticsMetricCollectionRequestBuilder operatingSystemRegression();

    IUserExperienceAnalyticsMetricRequestBuilder operatingSystemRegression(final String id);
    IUserExperienceAnalyticsRegressionSummarySummarizeDeviceRegressionPerformanceRequestBuilder summarizeDeviceRegressionPerformance(final UserExperienceAnalyticsSummarizedBy summarizeBy);

}