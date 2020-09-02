// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.AuditEvent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventCollectionRequest;
import com.microsoft.graph.requests.extensions.IAuditEventGetAuditCategoriesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventGetAuditActivityTypesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Event Collection Request Builder.
 */
public class AuditEventCollectionRequestBuilder extends BaseRequestBuilder implements IAuditEventCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditEventCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IAuditEventCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IAuditEventCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AuditEventCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAuditEventRequestBuilder byId(final String id) {
        return new AuditEventRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IAuditEventGetAuditCategoriesCollectionRequestBuilder getAuditCategories() {
        return new AuditEventGetAuditCategoriesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAuditCategories"), getClient(), null);
    }

    public IAuditEventGetAuditActivityTypesCollectionRequestBuilder getAuditActivityTypes(final String category) {
        return new AuditEventGetAuditActivityTypesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAuditActivityTypes"), getClient(), null, category);
    }
}