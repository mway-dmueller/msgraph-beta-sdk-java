// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrganizationalBranding;
import com.microsoft.graph.models.extensions.OrganizationalBrandingLocalization;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingLocalizationCollectionPage;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingLocalizationCollectionResponse;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingLocalizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingLocalizationCollectionRequest;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingLocalizationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organizational Branding Localization Collection Request.
 */
public class OrganizationalBrandingLocalizationCollectionRequest extends BaseCollectionRequest<OrganizationalBrandingLocalizationCollectionResponse, IOrganizationalBrandingLocalizationCollectionPage> implements IOrganizationalBrandingLocalizationCollectionRequest {

    /**
     * The request builder for this collection of OrganizationalBrandingLocalization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrganizationalBrandingLocalizationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OrganizationalBrandingLocalizationCollectionResponse.class, IOrganizationalBrandingLocalizationCollectionPage.class);
    }

    public void get(final ICallback<IOrganizationalBrandingLocalizationCollectionPage> callback) {
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

    public IOrganizationalBrandingLocalizationCollectionPage get() throws ClientException {
        final OrganizationalBrandingLocalizationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OrganizationalBrandingLocalization newOrganizationalBrandingLocalization, final ICallback<OrganizationalBrandingLocalization> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OrganizationalBrandingLocalizationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOrganizationalBrandingLocalization, callback);
    }

    public OrganizationalBrandingLocalization post(final OrganizationalBrandingLocalization newOrganizationalBrandingLocalization) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OrganizationalBrandingLocalizationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOrganizationalBrandingLocalization);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOrganizationalBrandingLocalizationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OrganizationalBrandingLocalizationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IOrganizationalBrandingLocalizationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (OrganizationalBrandingLocalizationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOrganizationalBrandingLocalizationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OrganizationalBrandingLocalizationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOrganizationalBrandingLocalizationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (OrganizationalBrandingLocalizationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IOrganizationalBrandingLocalizationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (OrganizationalBrandingLocalizationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IOrganizationalBrandingLocalizationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IOrganizationalBrandingLocalizationCollectionRequest)this;
    }
    public IOrganizationalBrandingLocalizationCollectionPage buildFromResponse(final OrganizationalBrandingLocalizationCollectionResponse response) {
        final IOrganizationalBrandingLocalizationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OrganizationalBrandingLocalizationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OrganizationalBrandingLocalizationCollectionPage page = new OrganizationalBrandingLocalizationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}