// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationValueText;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Presentation Value Text Request.
 */
public interface IGroupPolicyPresentationValueTextRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyPresentationValueText from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super GroupPolicyPresentationValueText> callback);

    /**
     * Gets the GroupPolicyPresentationValueText from the service
     *
     * @return the GroupPolicyPresentationValueText from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationValueText get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super GroupPolicyPresentationValueText> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyPresentationValueText with a source
     *
     * @param sourceGroupPolicyPresentationValueText the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyPresentationValueText sourceGroupPolicyPresentationValueText, final ICallback<? super GroupPolicyPresentationValueText> callback);

    /**
     * Patches this GroupPolicyPresentationValueText with a source
     *
     * @param sourceGroupPolicyPresentationValueText the source object with updates
     * @return the updated GroupPolicyPresentationValueText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationValueText patch(final GroupPolicyPresentationValueText sourceGroupPolicyPresentationValueText) throws ClientException;

    /**
     * Posts a GroupPolicyPresentationValueText with a new object
     *
     * @param newGroupPolicyPresentationValueText the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyPresentationValueText newGroupPolicyPresentationValueText, final ICallback<? super GroupPolicyPresentationValueText> callback);

    /**
     * Posts a GroupPolicyPresentationValueText with a new object
     *
     * @param newGroupPolicyPresentationValueText the new object to create
     * @return the created GroupPolicyPresentationValueText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationValueText post(final GroupPolicyPresentationValueText newGroupPolicyPresentationValueText) throws ClientException;

    /**
     * Posts a GroupPolicyPresentationValueText with a new object
     *
     * @param newGroupPolicyPresentationValueText the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupPolicyPresentationValueText newGroupPolicyPresentationValueText, final ICallback<? super GroupPolicyPresentationValueText> callback);

    /**
     * Posts a GroupPolicyPresentationValueText with a new object
     *
     * @param newGroupPolicyPresentationValueText the object to create/update
     * @return the created GroupPolicyPresentationValueText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationValueText put(final GroupPolicyPresentationValueText newGroupPolicyPresentationValueText) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyPresentationValueTextRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyPresentationValueTextRequest expand(final String value);

}

