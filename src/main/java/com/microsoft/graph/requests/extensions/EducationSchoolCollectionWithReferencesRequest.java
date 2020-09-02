// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.EducationSchool;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Collection With References Request.
 */
public class EducationSchoolCollectionWithReferencesRequest extends BaseCollectionRequest<EducationSchoolCollectionResponse, IEducationSchoolCollectionPage> implements IEducationSchoolCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSchoolCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchoolCollectionResponse.class, IEducationSchoolCollectionPage.class);
    }

    public void get(final ICallback<IEducationSchoolCollectionWithReferencesPage> callback) {
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

    public IEducationSchoolCollectionWithReferencesPage get() throws ClientException {
        final EducationSchoolCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IEducationSchoolCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationSchoolCollectionWithReferencesRequest)this;
    }

    public IEducationSchoolCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationSchoolCollectionWithReferencesRequest)this;
    }

    public IEducationSchoolCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationSchoolCollectionWithReferencesRequest)this;
    }

    public IEducationSchoolCollectionWithReferencesPage buildFromResponse(final EducationSchoolCollectionResponse response) {
        final IEducationSchoolCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationSchoolCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationSchoolCollectionWithReferencesPage page = new EducationSchoolCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}