// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationPolicySetItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Mobile App Configuration Policy Set Item Request.
 */
public interface IManagedDeviceMobileAppConfigurationPolicySetItemRequest extends IHttpRequest {

    /**
     * Gets the ManagedDeviceMobileAppConfigurationPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback);

    /**
     * Gets the ManagedDeviceMobileAppConfigurationPolicySetItem from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfigurationPolicySetItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ManagedDeviceMobileAppConfigurationPolicySetItem with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ManagedDeviceMobileAppConfigurationPolicySetItem sourceManagedDeviceMobileAppConfigurationPolicySetItem, final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback);

    /**
     * Patches this ManagedDeviceMobileAppConfigurationPolicySetItem with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationPolicySetItem the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfigurationPolicySetItem patch(final ManagedDeviceMobileAppConfigurationPolicySetItem sourceManagedDeviceMobileAppConfigurationPolicySetItem) throws ClientException;

    /**
     * Posts a ManagedDeviceMobileAppConfigurationPolicySetItem with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ManagedDeviceMobileAppConfigurationPolicySetItem newManagedDeviceMobileAppConfigurationPolicySetItem, final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback);

    /**
     * Posts a ManagedDeviceMobileAppConfigurationPolicySetItem with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationPolicySetItem the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfigurationPolicySetItem post(final ManagedDeviceMobileAppConfigurationPolicySetItem newManagedDeviceMobileAppConfigurationPolicySetItem) throws ClientException;

    /**
     * Posts a ManagedDeviceMobileAppConfigurationPolicySetItem with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ManagedDeviceMobileAppConfigurationPolicySetItem newManagedDeviceMobileAppConfigurationPolicySetItem, final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback);

    /**
     * Posts a ManagedDeviceMobileAppConfigurationPolicySetItem with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationPolicySetItem the object to create/update
     * @return the created ManagedDeviceMobileAppConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ManagedDeviceMobileAppConfigurationPolicySetItem put(final ManagedDeviceMobileAppConfigurationPolicySetItem newManagedDeviceMobileAppConfigurationPolicySetItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IManagedDeviceMobileAppConfigurationPolicySetItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IManagedDeviceMobileAppConfigurationPolicySetItemRequest expand(final String value);

}

