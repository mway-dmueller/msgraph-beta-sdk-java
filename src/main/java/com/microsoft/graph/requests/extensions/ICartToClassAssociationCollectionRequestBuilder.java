// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.CartToClassAssociation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ICartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Cart To Class Association Collection Request Builder.
 */
public interface ICartToClassAssociationCollectionRequestBuilder extends IRequestBuilder {

    ICartToClassAssociationCollectionRequest buildRequest();

    ICartToClassAssociationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ICartToClassAssociationRequestBuilder byId(final String id);

}