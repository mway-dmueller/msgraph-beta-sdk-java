// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.MacOSTrustedRootCertificate;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSTrusted Root Certificate With Reference Request.
 */
public interface IMacOSTrustedRootCertificateWithReferenceRequest extends IHttpRequest {

    void post(final MacOSTrustedRootCertificate newMacOSTrustedRootCertificate, final IJsonBackedObject payload, final ICallback<? super MacOSTrustedRootCertificate> callback);

    MacOSTrustedRootCertificate post(final MacOSTrustedRootCertificate newMacOSTrustedRootCertificate, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super MacOSTrustedRootCertificate> callback);

    MacOSTrustedRootCertificate get() throws ClientException;

	void delete(final ICallback<? super MacOSTrustedRootCertificate> callback);

	void delete() throws ClientException;

	void patch(final MacOSTrustedRootCertificate sourceMacOSTrustedRootCertificate, final ICallback<? super MacOSTrustedRootCertificate> callback);

	MacOSTrustedRootCertificate patch(final MacOSTrustedRootCertificate sourceMacOSTrustedRootCertificate) throws ClientException;

    IMacOSTrustedRootCertificateWithReferenceRequest select(final String value);

    IMacOSTrustedRootCertificateWithReferenceRequest expand(final String value);

}
