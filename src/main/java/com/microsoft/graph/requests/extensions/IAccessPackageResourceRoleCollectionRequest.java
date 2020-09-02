// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResource;
import com.microsoft.graph.models.extensions.AccessPackageResourceRole;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Resource Role Collection Request.
 */
public interface IAccessPackageResourceRoleCollectionRequest {

    void get(final ICallback<IAccessPackageResourceRoleCollectionPage> callback);

    IAccessPackageResourceRoleCollectionPage get() throws ClientException;

    void post(final AccessPackageResourceRole newAccessPackageResourceRole, final ICallback<AccessPackageResourceRole> callback);

    AccessPackageResourceRole post(final AccessPackageResourceRole newAccessPackageResourceRole) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageResourceRoleCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageResourceRoleCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAccessPackageResourceRoleCollectionRequest top(final int value);

}