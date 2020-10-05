// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSCertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSCertificate Profile Base Reference Request.
 */
public class MacOSCertificateProfileBaseReferenceRequest extends BaseRequest implements IMacOSCertificateProfileBaseReferenceRequest {

    /**
     * The request for the MacOSCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSCertificateProfileBaseReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSCertificateProfileBase.class);
    }

    public void delete(final ICallback<? super MacOSCertificateProfileBase> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public MacOSCertificateProfileBase delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMacOSCertificateProfileBaseReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MacOSCertificateProfileBaseReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMacOSCertificateProfileBaseReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MacOSCertificateProfileBaseReferenceRequest)this;
    }
    /**
     * Puts the MacOSCertificateProfileBase
     *
     * @param srcMacOSCertificateProfileBase the MacOSCertificateProfileBase reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(MacOSCertificateProfileBase srcMacOSCertificateProfileBase, final ICallback<? super MacOSCertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, srcMacOSCertificateProfileBase);
    }

    /**
     * Puts the MacOSCertificateProfileBase
     *
     * @param srcMacOSCertificateProfileBase the MacOSCertificateProfileBase reference to PUT
     * @return the MacOSCertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public MacOSCertificateProfileBase put(MacOSCertificateProfileBase srcMacOSCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, srcMacOSCertificateProfileBase);
    }
}
