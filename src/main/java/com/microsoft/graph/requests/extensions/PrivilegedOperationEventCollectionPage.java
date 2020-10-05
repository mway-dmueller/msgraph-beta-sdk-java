// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedOperationEvent;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedOperationEventCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedOperationEventCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Operation Event Collection Page.
 */
public class PrivilegedOperationEventCollectionPage extends BaseCollectionPage<PrivilegedOperationEvent, IPrivilegedOperationEventCollectionRequestBuilder> implements IPrivilegedOperationEventCollectionPage {

    /**
     * A collection page for PrivilegedOperationEvent
     *
     * @param response the serialized PrivilegedOperationEventCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedOperationEventCollectionPage(final PrivilegedOperationEventCollectionResponse response, final IPrivilegedOperationEventCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
