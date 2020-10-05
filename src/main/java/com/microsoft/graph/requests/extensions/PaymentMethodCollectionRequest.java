// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.PaymentMethod;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPaymentMethodCollectionPage;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.IPaymentMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodCollectionRequest;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Payment Method Collection Request.
 */
public class PaymentMethodCollectionRequest extends BaseCollectionRequest<PaymentMethodCollectionResponse, IPaymentMethodCollectionPage> implements IPaymentMethodCollectionRequest {

    /**
     * The request builder for this collection of PaymentMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PaymentMethodCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PaymentMethodCollectionResponse.class, IPaymentMethodCollectionPage.class);
    }

    public void get(final ICallback<? super IPaymentMethodCollectionPage> callback) {
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

    public IPaymentMethodCollectionPage get() throws ClientException {
        final PaymentMethodCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PaymentMethod newPaymentMethod, final ICallback<? super PaymentMethod> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PaymentMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPaymentMethod, callback);
    }

    public PaymentMethod post(final PaymentMethod newPaymentMethod) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PaymentMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPaymentMethod);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPaymentMethodCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PaymentMethodCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPaymentMethodCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PaymentMethodCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IPaymentMethodCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (PaymentMethodCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPaymentMethodCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PaymentMethodCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPaymentMethodCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PaymentMethodCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPaymentMethodCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PaymentMethodCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPaymentMethodCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPaymentMethodCollectionRequest)this;
    }
    public IPaymentMethodCollectionPage buildFromResponse(final PaymentMethodCollectionResponse response) {
        final IPaymentMethodCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PaymentMethodCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PaymentMethodCollectionPage page = new PaymentMethodCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
