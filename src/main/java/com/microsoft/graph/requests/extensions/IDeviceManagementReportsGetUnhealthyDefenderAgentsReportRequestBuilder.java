// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Unhealthy Defender Agents Report Request Builder.
 */
public interface IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest instance
     */
    IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest instance
     */
    IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}