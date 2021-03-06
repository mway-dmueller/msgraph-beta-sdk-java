// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.SourceCollection;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IAddToReviewSetOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IEstimateStatisticsOperationWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.ediscovery.models.extensions.SourceCollection;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Source Collection With Reference Request.
 */
public interface ISourceCollectionWithReferenceRequest extends IHttpRequest {

    void post(final SourceCollection newSourceCollection, final IJsonBackedObject payload, final ICallback<? super SourceCollection> callback);

    SourceCollection post(final SourceCollection newSourceCollection, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super SourceCollection> callback);

    SourceCollection get() throws ClientException;

	void delete(final ICallback<? super SourceCollection> callback);

	void delete() throws ClientException;

	void patch(final SourceCollection sourceSourceCollection, final ICallback<? super SourceCollection> callback);

	SourceCollection patch(final SourceCollection sourceSourceCollection) throws ClientException;

    ISourceCollectionWithReferenceRequest select(final String value);

    ISourceCollectionWithReferenceRequest expand(final String value);

}
