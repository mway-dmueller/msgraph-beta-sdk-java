// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsCertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Certificate Profile Base Reference Request.
 */
public class WindowsCertificateProfileBaseReferenceRequest extends BaseRequest implements IWindowsCertificateProfileBaseReferenceRequest {

    /**
     * The request for the WindowsCertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsCertificateProfileBaseReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsCertificateProfileBase.class);
    }

    public void delete(final ICallback<WindowsCertificateProfileBase> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public WindowsCertificateProfileBase delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsCertificateProfileBaseReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsCertificateProfileBaseReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsCertificateProfileBaseReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsCertificateProfileBaseReferenceRequest)this;
    }
    /**
     * Puts the WindowsCertificateProfileBase
     *
     * @param srcWindowsCertificateProfileBase the WindowsCertificateProfileBase reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WindowsCertificateProfileBase srcWindowsCertificateProfileBase, final ICallback<WindowsCertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, srcWindowsCertificateProfileBase);
    }

    /**
     * Puts the WindowsCertificateProfileBase
     *
     * @param srcWindowsCertificateProfileBase the WindowsCertificateProfileBase reference to PUT
     * @return the WindowsCertificateProfileBase
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WindowsCertificateProfileBase put(WindowsCertificateProfileBase srcWindowsCertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, srcWindowsCertificateProfileBase);
    }
}