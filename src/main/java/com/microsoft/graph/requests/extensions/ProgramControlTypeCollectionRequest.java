// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ProgramControlType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IProgramControlTypeCollectionPage;
import com.microsoft.graph.requests.extensions.ProgramControlTypeCollectionResponse;
import com.microsoft.graph.requests.extensions.IProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeCollectionRequest;
import com.microsoft.graph.requests.extensions.ProgramControlTypeCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Program Control Type Collection Request.
 */
public class ProgramControlTypeCollectionRequest extends BaseCollectionRequest<ProgramControlTypeCollectionResponse, IProgramControlTypeCollectionPage> implements IProgramControlTypeCollectionRequest {

    /**
     * The request builder for this collection of ProgramControlType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProgramControlTypeCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ProgramControlTypeCollectionResponse.class, IProgramControlTypeCollectionPage.class);
    }

    public void get(final ICallback<? super IProgramControlTypeCollectionPage> callback) {
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

    public IProgramControlTypeCollectionPage get() throws ClientException {
        final ProgramControlTypeCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ProgramControlType newProgramControlType, final ICallback<? super ProgramControlType> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ProgramControlTypeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newProgramControlType, callback);
    }

    public ProgramControlType post(final ProgramControlType newProgramControlType) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ProgramControlTypeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newProgramControlType);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IProgramControlTypeCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ProgramControlTypeCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IProgramControlTypeCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ProgramControlTypeCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IProgramControlTypeCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ProgramControlTypeCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IProgramControlTypeCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ProgramControlTypeCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IProgramControlTypeCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ProgramControlTypeCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IProgramControlTypeCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ProgramControlTypeCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IProgramControlTypeCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IProgramControlTypeCollectionRequest)this;
    }
    public IProgramControlTypeCollectionPage buildFromResponse(final ProgramControlTypeCollectionResponse response) {
        final IProgramControlTypeCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ProgramControlTypeCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ProgramControlTypeCollectionPage page = new ProgramControlTypeCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
