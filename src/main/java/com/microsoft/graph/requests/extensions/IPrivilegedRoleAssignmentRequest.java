// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Request.
 */
public interface IPrivilegedRoleAssignmentRequest extends IHttpRequest {

    /**
     * Gets the PrivilegedRoleAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PrivilegedRoleAssignment> callback);

    /**
     * Gets the PrivilegedRoleAssignment from the service
     *
     * @return the PrivilegedRoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PrivilegedRoleAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrivilegedRoleAssignment with a source
     *
     * @param sourcePrivilegedRoleAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrivilegedRoleAssignment sourcePrivilegedRoleAssignment, final ICallback<? super PrivilegedRoleAssignment> callback);

    /**
     * Patches this PrivilegedRoleAssignment with a source
     *
     * @param sourcePrivilegedRoleAssignment the source object with updates
     * @return the updated PrivilegedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleAssignment patch(final PrivilegedRoleAssignment sourcePrivilegedRoleAssignment) throws ClientException;

    /**
     * Posts a PrivilegedRoleAssignment with a new object
     *
     * @param newPrivilegedRoleAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrivilegedRoleAssignment newPrivilegedRoleAssignment, final ICallback<? super PrivilegedRoleAssignment> callback);

    /**
     * Posts a PrivilegedRoleAssignment with a new object
     *
     * @param newPrivilegedRoleAssignment the new object to create
     * @return the created PrivilegedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleAssignment post(final PrivilegedRoleAssignment newPrivilegedRoleAssignment) throws ClientException;

    /**
     * Posts a PrivilegedRoleAssignment with a new object
     *
     * @param newPrivilegedRoleAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrivilegedRoleAssignment newPrivilegedRoleAssignment, final ICallback<? super PrivilegedRoleAssignment> callback);

    /**
     * Posts a PrivilegedRoleAssignment with a new object
     *
     * @param newPrivilegedRoleAssignment the object to create/update
     * @return the created PrivilegedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleAssignment put(final PrivilegedRoleAssignment newPrivilegedRoleAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrivilegedRoleAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrivilegedRoleAssignmentRequest expand(final String value);

}

