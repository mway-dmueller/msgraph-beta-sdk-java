// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Trusted Root Certificate Reference Request.
 */
public class AndroidWorkProfileTrustedRootCertificateReferenceRequest extends BaseRequest implements IAndroidWorkProfileTrustedRootCertificateReferenceRequest {

    /**
     * The request for the AndroidWorkProfileTrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileTrustedRootCertificateReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileTrustedRootCertificate.class);
    }

    public void delete(final ICallback<? super AndroidWorkProfileTrustedRootCertificate> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public AndroidWorkProfileTrustedRootCertificate delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidWorkProfileTrustedRootCertificateReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AndroidWorkProfileTrustedRootCertificateReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidWorkProfileTrustedRootCertificateReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidWorkProfileTrustedRootCertificateReferenceRequest)this;
    }
    /**
     * Puts the AndroidWorkProfileTrustedRootCertificate
     *
     * @param srcAndroidWorkProfileTrustedRootCertificate the AndroidWorkProfileTrustedRootCertificate reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(AndroidWorkProfileTrustedRootCertificate srcAndroidWorkProfileTrustedRootCertificate, final ICallback<? super AndroidWorkProfileTrustedRootCertificate> callback) {
        send(HttpMethod.PUT, callback, srcAndroidWorkProfileTrustedRootCertificate);
    }

    /**
     * Puts the AndroidWorkProfileTrustedRootCertificate
     *
     * @param srcAndroidWorkProfileTrustedRootCertificate the AndroidWorkProfileTrustedRootCertificate reference to PUT
     * @return the AndroidWorkProfileTrustedRootCertificate
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public AndroidWorkProfileTrustedRootCertificate put(AndroidWorkProfileTrustedRootCertificate srcAndroidWorkProfileTrustedRootCertificate) throws ClientException {
        return send(HttpMethod.PUT, srcAndroidWorkProfileTrustedRootCertificate);
    }
}
