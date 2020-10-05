// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.requests.extensions.IAndroidTrustedRootCertificateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Certificate Profile Base With Reference Request.
 */
public interface IAndroidCertificateProfileBaseWithReferenceRequest extends IHttpRequest {

    void post(final AndroidCertificateProfileBase newAndroidCertificateProfileBase, final IJsonBackedObject payload, final ICallback<? super AndroidCertificateProfileBase> callback);

    AndroidCertificateProfileBase post(final AndroidCertificateProfileBase newAndroidCertificateProfileBase, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super AndroidCertificateProfileBase> callback);

    AndroidCertificateProfileBase get() throws ClientException;

	void delete(final ICallback<? super AndroidCertificateProfileBase> callback);

	void delete() throws ClientException;

	void patch(final AndroidCertificateProfileBase sourceAndroidCertificateProfileBase, final ICallback<? super AndroidCertificateProfileBase> callback);

	AndroidCertificateProfileBase patch(final AndroidCertificateProfileBase sourceAndroidCertificateProfileBase) throws ClientException;

    IAndroidCertificateProfileBaseWithReferenceRequest select(final String value);

    IAndroidCertificateProfileBaseWithReferenceRequest expand(final String value);

}
