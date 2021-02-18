// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.EstimateStatisticsOperation;
import com.microsoft.graph.ediscovery.requests.extensions.ISourceCollectionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.ediscovery.models.extensions.EstimateStatisticsOperation;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Estimate Statistics Operation With Reference Request.
 */
public interface IEstimateStatisticsOperationWithReferenceRequest extends IHttpRequest {

    void post(final EstimateStatisticsOperation newEstimateStatisticsOperation, final IJsonBackedObject payload, final ICallback<? super EstimateStatisticsOperation> callback);

    EstimateStatisticsOperation post(final EstimateStatisticsOperation newEstimateStatisticsOperation, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super EstimateStatisticsOperation> callback);

    EstimateStatisticsOperation get() throws ClientException;

	void delete(final ICallback<? super EstimateStatisticsOperation> callback);

	void delete() throws ClientException;

	void patch(final EstimateStatisticsOperation sourceEstimateStatisticsOperation, final ICallback<? super EstimateStatisticsOperation> callback);

	EstimateStatisticsOperation patch(final EstimateStatisticsOperation sourceEstimateStatisticsOperation) throws ClientException;

    IEstimateStatisticsOperationWithReferenceRequest select(final String value);

    IEstimateStatisticsOperationWithReferenceRequest expand(final String value);

}