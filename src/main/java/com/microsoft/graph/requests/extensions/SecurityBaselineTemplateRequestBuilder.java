// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityBaselineTemplate;
import com.microsoft.graph.requests.extensions.ISecurityBaselineDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineCategoryStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineCategoryStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineCategoryStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineCategoryStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Template Request Builder.
 */
public class SecurityBaselineTemplateRequestBuilder extends BaseRequestBuilder implements ISecurityBaselineTemplateRequestBuilder {

    /**
     * The request builder for the SecurityBaselineTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineTemplateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ISecurityBaselineTemplateRequest instance
     */
    public ISecurityBaselineTemplateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISecurityBaselineTemplateRequest instance
     */
    public ISecurityBaselineTemplateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SecurityBaselineTemplateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementSettingInstanceCollectionRequestBuilder settings() {
        return new DeviceManagementSettingInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    public IDeviceManagementSettingInstanceRequestBuilder settings(final String id) {
        return new DeviceManagementSettingInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }
    public IDeviceManagementTemplateSettingCategoryCollectionRequestBuilder categories() {
        return new DeviceManagementTemplateSettingCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    public IDeviceManagementTemplateSettingCategoryRequestBuilder categories(final String id) {
        return new DeviceManagementTemplateSettingCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    public IDeviceManagementTemplateCollectionRequestBuilder migratableTo() {
        return new DeviceManagementTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("migratableTo"), getClient(), null);
    }

    public IDeviceManagementTemplateRequestBuilder migratableTo(final String id) {
        return new DeviceManagementTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("migratableTo") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for SecurityBaselineStateSummary
     *
     * @return the ISecurityBaselineStateSummaryRequestBuilder instance
     */
    public ISecurityBaselineStateSummaryRequestBuilder deviceStateSummary() {
        return new SecurityBaselineStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStateSummary"), getClient(), null);
    }
    public ISecurityBaselineDeviceStateCollectionRequestBuilder deviceStates() {
        return new SecurityBaselineDeviceStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates"), getClient(), null);
    }

    public ISecurityBaselineDeviceStateRequestBuilder deviceStates(final String id) {
        return new SecurityBaselineDeviceStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates") + "/" + id, getClient(), null);
    }
    public ISecurityBaselineCategoryStateSummaryCollectionRequestBuilder categoryDeviceStateSummaries() {
        return new SecurityBaselineCategoryStateSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categoryDeviceStateSummaries"), getClient(), null);
    }

    public ISecurityBaselineCategoryStateSummaryRequestBuilder categoryDeviceStateSummaries(final String id) {
        return new SecurityBaselineCategoryStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("categoryDeviceStateSummaries") + "/" + id, getClient(), null);
    }
}