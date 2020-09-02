// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Role Scope Tag Collection Request.
 */
public interface IRoleScopeTagCollectionRequest {

    void get(final ICallback<IRoleScopeTagCollectionPage> callback);

    IRoleScopeTagCollectionPage get() throws ClientException;

    void post(final RoleScopeTag newRoleScopeTag, final ICallback<RoleScopeTag> callback);

    RoleScopeTag post(final RoleScopeTag newRoleScopeTag) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRoleScopeTagCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRoleScopeTagCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IRoleScopeTagCollectionRequest top(final int value);

}