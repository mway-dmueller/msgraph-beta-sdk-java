// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Defender Application Control Supplemental Policy Deployment Status Request.
 */
public interface IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest extends IHttpRequest {

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback);

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the service
     *
     * @return the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback);

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the source object with updates
     * @return the updated WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus patch(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException;

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback);

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the new object to create
     * @return the created WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus post(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException;

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback);

    /**
     * Posts a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the object to create/update
     * @return the created WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus put(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest expand(final String value);

}

