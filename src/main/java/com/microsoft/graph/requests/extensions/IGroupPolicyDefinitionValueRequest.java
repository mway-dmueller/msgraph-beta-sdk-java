// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition Value Request.
 */
public interface IGroupPolicyDefinitionValueRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyDefinitionValue from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super GroupPolicyDefinitionValue> callback);

    /**
     * Gets the GroupPolicyDefinitionValue from the service
     *
     * @return the GroupPolicyDefinitionValue from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinitionValue get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super GroupPolicyDefinitionValue> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyDefinitionValue with a source
     *
     * @param sourceGroupPolicyDefinitionValue the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyDefinitionValue sourceGroupPolicyDefinitionValue, final ICallback<? super GroupPolicyDefinitionValue> callback);

    /**
     * Patches this GroupPolicyDefinitionValue with a source
     *
     * @param sourceGroupPolicyDefinitionValue the source object with updates
     * @return the updated GroupPolicyDefinitionValue
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinitionValue patch(final GroupPolicyDefinitionValue sourceGroupPolicyDefinitionValue) throws ClientException;

    /**
     * Posts a GroupPolicyDefinitionValue with a new object
     *
     * @param newGroupPolicyDefinitionValue the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyDefinitionValue newGroupPolicyDefinitionValue, final ICallback<? super GroupPolicyDefinitionValue> callback);

    /**
     * Posts a GroupPolicyDefinitionValue with a new object
     *
     * @param newGroupPolicyDefinitionValue the new object to create
     * @return the created GroupPolicyDefinitionValue
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinitionValue post(final GroupPolicyDefinitionValue newGroupPolicyDefinitionValue) throws ClientException;

    /**
     * Posts a GroupPolicyDefinitionValue with a new object
     *
     * @param newGroupPolicyDefinitionValue the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupPolicyDefinitionValue newGroupPolicyDefinitionValue, final ICallback<? super GroupPolicyDefinitionValue> callback);

    /**
     * Posts a GroupPolicyDefinitionValue with a new object
     *
     * @param newGroupPolicyDefinitionValue the object to create/update
     * @return the created GroupPolicyDefinitionValue
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinitionValue put(final GroupPolicyDefinitionValue newGroupPolicyDefinitionValue) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyDefinitionValueRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyDefinitionValueRequest expand(final String value);

}

