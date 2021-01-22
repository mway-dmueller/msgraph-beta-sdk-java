// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepIOSEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DepIOSEnrollmentProfile;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dep IOSEnrollment Profile With Reference Request.
 */
public interface IDepIOSEnrollmentProfileWithReferenceRequest extends IHttpRequest {

    void post(final DepIOSEnrollmentProfile newDepIOSEnrollmentProfile, final IJsonBackedObject payload, final ICallback<? super DepIOSEnrollmentProfile> callback);

    DepIOSEnrollmentProfile post(final DepIOSEnrollmentProfile newDepIOSEnrollmentProfile, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super DepIOSEnrollmentProfile> callback);

    DepIOSEnrollmentProfile get() throws ClientException;

	void delete(final ICallback<? super DepIOSEnrollmentProfile> callback);

	void delete() throws ClientException;

	void patch(final DepIOSEnrollmentProfile sourceDepIOSEnrollmentProfile, final ICallback<? super DepIOSEnrollmentProfile> callback);

	DepIOSEnrollmentProfile patch(final DepIOSEnrollmentProfile sourceDepIOSEnrollmentProfile) throws ClientException;

    IDepIOSEnrollmentProfileWithReferenceRequest select(final String value);

    IDepIOSEnrollmentProfileWithReferenceRequest expand(final String value);

}