// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Configuration Policy Non Compliance Summary Report Request Builder.
 */
public interface IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest instance
     */
    IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest instance
     */
    IDeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}