// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosEduDeviceConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Edu Device Configuration Request.
 */
public interface IIosEduDeviceConfigurationRequest extends IHttpRequest {

    /**
     * Gets the IosEduDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super IosEduDeviceConfiguration> callback);

    /**
     * Gets the IosEduDeviceConfiguration from the service
     *
     * @return the IosEduDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEduDeviceConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super IosEduDeviceConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosEduDeviceConfiguration with a source
     *
     * @param sourceIosEduDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosEduDeviceConfiguration sourceIosEduDeviceConfiguration, final ICallback<? super IosEduDeviceConfiguration> callback);

    /**
     * Patches this IosEduDeviceConfiguration with a source
     *
     * @param sourceIosEduDeviceConfiguration the source object with updates
     * @return the updated IosEduDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEduDeviceConfiguration patch(final IosEduDeviceConfiguration sourceIosEduDeviceConfiguration) throws ClientException;

    /**
     * Posts a IosEduDeviceConfiguration with a new object
     *
     * @param newIosEduDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosEduDeviceConfiguration newIosEduDeviceConfiguration, final ICallback<? super IosEduDeviceConfiguration> callback);

    /**
     * Posts a IosEduDeviceConfiguration with a new object
     *
     * @param newIosEduDeviceConfiguration the new object to create
     * @return the created IosEduDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEduDeviceConfiguration post(final IosEduDeviceConfiguration newIosEduDeviceConfiguration) throws ClientException;

    /**
     * Posts a IosEduDeviceConfiguration with a new object
     *
     * @param newIosEduDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final IosEduDeviceConfiguration newIosEduDeviceConfiguration, final ICallback<? super IosEduDeviceConfiguration> callback);

    /**
     * Posts a IosEduDeviceConfiguration with a new object
     *
     * @param newIosEduDeviceConfiguration the object to create/update
     * @return the created IosEduDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEduDeviceConfiguration put(final IosEduDeviceConfiguration newIosEduDeviceConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosEduDeviceConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosEduDeviceConfigurationRequest expand(final String value);

}
