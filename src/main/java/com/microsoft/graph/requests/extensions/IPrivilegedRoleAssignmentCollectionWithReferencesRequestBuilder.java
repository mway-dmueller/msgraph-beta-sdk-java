// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRole;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Collection With References Request Builder.
 */
public interface IPrivilegedRoleAssignmentCollectionWithReferencesRequestBuilder extends IRequestBuilder {

    IPrivilegedRoleAssignmentCollectionWithReferencesRequest buildRequest();

    IPrivilegedRoleAssignmentCollectionWithReferencesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IPrivilegedRoleAssignmentWithReferenceRequestBuilder byId(final String id);

    IPrivilegedRoleAssignmentCollectionReferenceRequestBuilder references();
}