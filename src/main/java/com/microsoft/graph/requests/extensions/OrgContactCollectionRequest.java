// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Collection Request.
 */
public class OrgContactCollectionRequest extends BaseCollectionRequest<OrgContactCollectionResponse, IOrgContactCollectionPage> implements IOrgContactCollectionRequest {

    /**
     * The request builder for this collection of OrgContact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrgContactCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, OrgContactCollectionResponse.class, IOrgContactCollectionPage.class);
    }

    public void get(final ICallback<IOrgContactCollectionPage> callback) {
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

    public IOrgContactCollectionPage get() throws ClientException {
        final OrgContactCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OrgContact newOrgContact, final ICallback<OrgContact> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OrgContactRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newOrgContact, callback);
    }

    public OrgContact post(final OrgContact newOrgContact) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OrgContactRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newOrgContact);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOrgContactCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (OrgContactCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOrgContactCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (OrgContactCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOrgContactCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (OrgContactCollectionRequest)this;
    }

    public IOrgContactCollectionPage buildFromResponse(final OrgContactCollectionResponse response) {
        final IOrgContactCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OrgContactCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OrgContactCollectionPage page = new OrgContactCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
