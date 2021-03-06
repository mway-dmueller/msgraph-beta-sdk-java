// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import com.microsoft.graph.ediscovery.requests.extensions.ITagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ITagWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.ediscovery.models.extensions.Tag;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Tag With Reference Request.
 */
public interface ITagWithReferenceRequest extends IHttpRequest {

    void post(final Tag newTag, final IJsonBackedObject payload, final ICallback<? super Tag> callback);

    Tag post(final Tag newTag, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super Tag> callback);

    Tag get() throws ClientException;

	void delete(final ICallback<? super Tag> callback);

	void delete() throws ClientException;

	void patch(final Tag sourceTag, final ICallback<? super Tag> callback);

	Tag patch(final Tag sourceTag) throws ClientException;

    ITagWithReferenceRequest select(final String value);

    ITagWithReferenceRequest expand(final String value);

}
