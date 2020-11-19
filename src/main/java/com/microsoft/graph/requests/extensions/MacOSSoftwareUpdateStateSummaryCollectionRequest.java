// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateCategorySummary;
import com.microsoft.graph.models.extensions.MacOSSoftwareUpdateStateSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateStateSummaryCollectionResponse;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSSoftwareUpdateStateSummaryCollectionRequest;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateStateSummaryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update State Summary Collection Request.
 */
public class MacOSSoftwareUpdateStateSummaryCollectionRequest extends BaseCollectionRequest<MacOSSoftwareUpdateStateSummaryCollectionResponse, IMacOSSoftwareUpdateStateSummaryCollectionPage> implements IMacOSSoftwareUpdateStateSummaryCollectionRequest {

    /**
     * The request builder for this collection of MacOSSoftwareUpdateStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSSoftwareUpdateStateSummaryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSSoftwareUpdateStateSummaryCollectionResponse.class, IMacOSSoftwareUpdateStateSummaryCollectionPage.class);
    }

    public void get(final ICallback<? super IMacOSSoftwareUpdateStateSummaryCollectionPage> callback) {
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

    public IMacOSSoftwareUpdateStateSummaryCollectionPage get() throws ClientException {
        final MacOSSoftwareUpdateStateSummaryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary, final ICallback<? super MacOSSoftwareUpdateStateSummary> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MacOSSoftwareUpdateStateSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMacOSSoftwareUpdateStateSummary, callback);
    }

    public MacOSSoftwareUpdateStateSummary post(final MacOSSoftwareUpdateStateSummary newMacOSSoftwareUpdateStateSummary) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MacOSSoftwareUpdateStateSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMacOSSoftwareUpdateStateSummary);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MacOSSoftwareUpdateStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (MacOSSoftwareUpdateStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (MacOSSoftwareUpdateStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MacOSSoftwareUpdateStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MacOSSoftwareUpdateStateSummaryCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (MacOSSoftwareUpdateStateSummaryCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IMacOSSoftwareUpdateStateSummaryCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IMacOSSoftwareUpdateStateSummaryCollectionRequest)this;
    }
    public IMacOSSoftwareUpdateStateSummaryCollectionPage buildFromResponse(final MacOSSoftwareUpdateStateSummaryCollectionResponse response) {
        final IMacOSSoftwareUpdateStateSummaryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MacOSSoftwareUpdateStateSummaryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MacOSSoftwareUpdateStateSummaryCollectionPage page = new MacOSSoftwareUpdateStateSummaryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}