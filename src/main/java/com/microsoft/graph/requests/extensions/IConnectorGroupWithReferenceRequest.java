// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Connector Group With Reference Request.
 */
public interface IConnectorGroupWithReferenceRequest extends IHttpRequest {

    void post(final ConnectorGroup newConnectorGroup, final IJsonBackedObject payload, final ICallback<? super ConnectorGroup> callback);

    ConnectorGroup post(final ConnectorGroup newConnectorGroup, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super ConnectorGroup> callback);

    ConnectorGroup get() throws ClientException;

	void delete(final ICallback<? super ConnectorGroup> callback);

	void delete() throws ClientException;

	void patch(final ConnectorGroup sourceConnectorGroup, final ICallback<? super ConnectorGroup> callback);

	ConnectorGroup patch(final ConnectorGroup sourceConnectorGroup) throws ClientException;

    IConnectorGroupWithReferenceRequest select(final String value);

    IConnectorGroupWithReferenceRequest expand(final String value);

}
