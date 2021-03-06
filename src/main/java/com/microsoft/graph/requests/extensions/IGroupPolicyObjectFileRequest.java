// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyObjectFile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Object File Request.
 */
public interface IGroupPolicyObjectFileRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyObjectFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super GroupPolicyObjectFile> callback);

    /**
     * Gets the GroupPolicyObjectFile from the service
     *
     * @return the GroupPolicyObjectFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyObjectFile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super GroupPolicyObjectFile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyObjectFile with a source
     *
     * @param sourceGroupPolicyObjectFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyObjectFile sourceGroupPolicyObjectFile, final ICallback<? super GroupPolicyObjectFile> callback);

    /**
     * Patches this GroupPolicyObjectFile with a source
     *
     * @param sourceGroupPolicyObjectFile the source object with updates
     * @return the updated GroupPolicyObjectFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyObjectFile patch(final GroupPolicyObjectFile sourceGroupPolicyObjectFile) throws ClientException;

    /**
     * Posts a GroupPolicyObjectFile with a new object
     *
     * @param newGroupPolicyObjectFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyObjectFile newGroupPolicyObjectFile, final ICallback<? super GroupPolicyObjectFile> callback);

    /**
     * Posts a GroupPolicyObjectFile with a new object
     *
     * @param newGroupPolicyObjectFile the new object to create
     * @return the created GroupPolicyObjectFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyObjectFile post(final GroupPolicyObjectFile newGroupPolicyObjectFile) throws ClientException;

    /**
     * Posts a GroupPolicyObjectFile with a new object
     *
     * @param newGroupPolicyObjectFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupPolicyObjectFile newGroupPolicyObjectFile, final ICallback<? super GroupPolicyObjectFile> callback);

    /**
     * Posts a GroupPolicyObjectFile with a new object
     *
     * @param newGroupPolicyObjectFile the object to create/update
     * @return the created GroupPolicyObjectFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyObjectFile put(final GroupPolicyObjectFile newGroupPolicyObjectFile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyObjectFileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyObjectFileRequest expand(final String value);

}

