// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365GroupsActivityStorage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityStorageCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityStorageCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity Storage Collection Page.
 */
public class ReportRootGetOffice365GroupsActivityStorageCollectionPage extends BaseCollectionPage<Office365GroupsActivityStorage, IReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder> implements IReportRootGetOffice365GroupsActivityStorageCollectionPage {

    /**
     * A collection page for Office365GroupsActivityStorage.
     *
     * @param response The serialized ReportRootGetOffice365GroupsActivityStorageCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOffice365GroupsActivityStorageCollectionPage(final ReportRootGetOffice365GroupsActivityStorageCollectionResponse response, final IReportRootGetOffice365GroupsActivityStorageCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
