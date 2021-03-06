// Template Source: BaseEntityReferenceRequest.java.tt
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
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IAddToReviewSetOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.AddToReviewSetOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IDataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.DataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IEstimateStatisticsOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.EstimateStatisticsOperationWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Source Collection Reference Request.
 */
public class SourceCollectionReferenceRequest extends BaseRequest implements ISourceCollectionReferenceRequest {

    /**
     * The request for the SourceCollection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SourceCollectionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SourceCollection.class);
    }

    public void delete(final ICallback<? super SourceCollection> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public SourceCollection delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISourceCollectionReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SourceCollectionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISourceCollectionReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SourceCollectionReferenceRequest)this;
    }
    /**
     * Puts the SourceCollection
     *
     * @param srcSourceCollection the SourceCollection reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(SourceCollection srcSourceCollection, final ICallback<? super SourceCollection> callback) {
        send(HttpMethod.PUT, callback, srcSourceCollection);
    }

    /**
     * Puts the SourceCollection
     *
     * @param srcSourceCollection the SourceCollection reference to PUT
     * @return the SourceCollection
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public SourceCollection put(SourceCollection srcSourceCollection) throws ClientException {
        return send(HttpMethod.PUT, srcSourceCollection);
    }
}
