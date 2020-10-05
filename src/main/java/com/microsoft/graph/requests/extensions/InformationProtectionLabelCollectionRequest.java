// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InformationProtectionPolicy;
import com.microsoft.graph.models.extensions.InformationProtectionLabel;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.LabelingOptions;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import com.microsoft.graph.models.extensions.ClassificationResult;
import com.microsoft.graph.models.extensions.DowngradeJustification;
import com.microsoft.graph.models.extensions.InformationProtectionContentLabel;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IInformationProtectionLabelCollectionPage;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelCollectionResponse;
import com.microsoft.graph.requests.extensions.IInformationProtectionLabelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionLabelCollectionRequest;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Collection Request.
 */
public class InformationProtectionLabelCollectionRequest extends BaseCollectionRequest<InformationProtectionLabelCollectionResponse, IInformationProtectionLabelCollectionPage> implements IInformationProtectionLabelCollectionRequest {

    /**
     * The request builder for this collection of InformationProtectionLabel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionLabelCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InformationProtectionLabelCollectionResponse.class, IInformationProtectionLabelCollectionPage.class);
    }

    public void get(final ICallback<? super IInformationProtectionLabelCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IInformationProtectionLabelCollectionPage get() throws ClientException {
        final InformationProtectionLabelCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final InformationProtectionLabel newInformationProtectionLabel, final ICallback<? super InformationProtectionLabel> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new InformationProtectionLabelRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newInformationProtectionLabel, callback);
    }

    public InformationProtectionLabel post(final InformationProtectionLabel newInformationProtectionLabel) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new InformationProtectionLabelRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newInformationProtectionLabel);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IInformationProtectionLabelCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (InformationProtectionLabelCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IInformationProtectionLabelCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (InformationProtectionLabelCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IInformationProtectionLabelCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (InformationProtectionLabelCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IInformationProtectionLabelCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (InformationProtectionLabelCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IInformationProtectionLabelCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (InformationProtectionLabelCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IInformationProtectionLabelCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (InformationProtectionLabelCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IInformationProtectionLabelCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IInformationProtectionLabelCollectionRequest)this;
    }
    public IInformationProtectionLabelCollectionPage buildFromResponse(final InformationProtectionLabelCollectionResponse response) {
        final IInformationProtectionLabelCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new InformationProtectionLabelCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final InformationProtectionLabelCollectionPage page = new InformationProtectionLabelCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
