// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.models.extensions.Connector;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.Connector;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Connector Collection Reference Request.
 */
public interface IConnectorCollectionReferenceRequest {

    void post(final Connector newConnector, final ICallback<? super Connector> callback);

    Connector post(final Connector newConnector) throws ClientException;

    IConnectorCollectionReferenceRequest select(final String value);

    IConnectorCollectionReferenceRequest top(final int value);

}
