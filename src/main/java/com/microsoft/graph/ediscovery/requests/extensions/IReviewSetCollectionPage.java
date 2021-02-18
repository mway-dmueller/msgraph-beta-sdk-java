// Template Source: IBaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.Case;
import com.microsoft.graph.ediscovery.models.extensions.ReviewSet;
import com.microsoft.graph.ediscovery.models.extensions.SourceCollection;
import com.microsoft.graph.ediscovery.models.generated.DataCollectionScope;
import java.util.EnumSet;
import com.microsoft.graph.ediscovery.models.generated.ExportOptions;
import com.microsoft.graph.ediscovery.models.generated.ExportFileStructure;
import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.microsoft.graph.ediscovery.requests.extensions.IReviewSetCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Review Set Collection Page.
 */
public interface IReviewSetCollectionPage extends IBaseCollectionPage<ReviewSet, IReviewSetCollectionRequestBuilder> {
}