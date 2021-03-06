// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.ClassificationResult;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IInformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateClassificationResultsCollectionPage;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateClassificationResultsCollectionResponse;
import com.microsoft.graph.models.extensions.InformationProtectionLabelEvaluateClassificationResultsBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Evaluate Classification Results Collection Request.
 */
public class InformationProtectionLabelEvaluateClassificationResultsCollectionRequest extends BaseCollectionRequest<InformationProtectionLabelEvaluateClassificationResultsCollectionResponse, IInformationProtectionLabelEvaluateClassificationResultsCollectionPage> implements IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest {


    protected final InformationProtectionLabelEvaluateClassificationResultsBody body;


    /**
     * The request for this InformationProtectionLabelEvaluateClassificationResults
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InformationProtectionLabelEvaluateClassificationResultsCollectionResponse.class, IInformationProtectionLabelEvaluateClassificationResultsCollectionPage.class);
        body = new InformationProtectionLabelEvaluateClassificationResultsBody();
    }


    public void post(final ICallback<? super IInformationProtectionLabelEvaluateClassificationResultsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IInformationProtectionLabelEvaluateClassificationResultsCollectionPage post() throws ClientException {
        final InformationProtectionLabelEvaluateClassificationResultsCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IInformationProtectionLabelEvaluateClassificationResultsCollectionPage buildFromResponse(final InformationProtectionLabelEvaluateClassificationResultsCollectionResponse response) {
        final IInformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new InformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (ContentInfo) null, (java.util.List<ClassificationResult>) null);
        } else {
            builder = null;
        }
        final IInformationProtectionLabelEvaluateClassificationResultsCollectionPage page = new InformationProtectionLabelEvaluateClassificationResultsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IInformationProtectionLabelEvaluateClassificationResultsCollectionRequest)this;
    }

}
