// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedDefinitionFile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Uploaded Definition File Request.
 */
public interface IGroupPolicyUploadedDefinitionFileRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyUploadedDefinitionFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super GroupPolicyUploadedDefinitionFile> callback);

    /**
     * Gets the GroupPolicyUploadedDefinitionFile from the service
     *
     * @return the GroupPolicyUploadedDefinitionFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyUploadedDefinitionFile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super GroupPolicyUploadedDefinitionFile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyUploadedDefinitionFile with a source
     *
     * @param sourceGroupPolicyUploadedDefinitionFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyUploadedDefinitionFile sourceGroupPolicyUploadedDefinitionFile, final ICallback<? super GroupPolicyUploadedDefinitionFile> callback);

    /**
     * Patches this GroupPolicyUploadedDefinitionFile with a source
     *
     * @param sourceGroupPolicyUploadedDefinitionFile the source object with updates
     * @return the updated GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyUploadedDefinitionFile patch(final GroupPolicyUploadedDefinitionFile sourceGroupPolicyUploadedDefinitionFile) throws ClientException;

    /**
     * Posts a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile, final ICallback<? super GroupPolicyUploadedDefinitionFile> callback);

    /**
     * Posts a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the new object to create
     * @return the created GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyUploadedDefinitionFile post(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) throws ClientException;

    /**
     * Posts a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile, final ICallback<? super GroupPolicyUploadedDefinitionFile> callback);

    /**
     * Posts a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the object to create/update
     * @return the created GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyUploadedDefinitionFile put(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyUploadedDefinitionFileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyUploadedDefinitionFileRequest expand(final String value);

}
