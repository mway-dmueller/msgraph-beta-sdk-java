// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailboxUsageStorage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageStorageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageStorageCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageStorageCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Mailbox Usage Storage Collection Page.
 */
public class ReportRootGetMailboxUsageStorageCollectionPage extends BaseCollectionPage<MailboxUsageStorage, IReportRootGetMailboxUsageStorageCollectionRequestBuilder> implements IReportRootGetMailboxUsageStorageCollectionPage {

    /**
     * A collection page for MailboxUsageStorage.
     *
     * @param response The serialized ReportRootGetMailboxUsageStorageCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetMailboxUsageStorageCollectionPage(final ReportRootGetMailboxUsageStorageCollectionResponse response, final IReportRootGetMailboxUsageStorageCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
