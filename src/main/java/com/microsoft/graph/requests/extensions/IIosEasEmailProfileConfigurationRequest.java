// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IosEasEmailProfileConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Eas Email Profile Configuration Request.
 */
public interface IIosEasEmailProfileConfigurationRequest extends IHttpRequest {

    /**
     * Gets the IosEasEmailProfileConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super IosEasEmailProfileConfiguration> callback);

    /**
     * Gets the IosEasEmailProfileConfiguration from the service
     *
     * @return the IosEasEmailProfileConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEasEmailProfileConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super IosEasEmailProfileConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosEasEmailProfileConfiguration with a source
     *
     * @param sourceIosEasEmailProfileConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosEasEmailProfileConfiguration sourceIosEasEmailProfileConfiguration, final ICallback<? super IosEasEmailProfileConfiguration> callback);

    /**
     * Patches this IosEasEmailProfileConfiguration with a source
     *
     * @param sourceIosEasEmailProfileConfiguration the source object with updates
     * @return the updated IosEasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEasEmailProfileConfiguration patch(final IosEasEmailProfileConfiguration sourceIosEasEmailProfileConfiguration) throws ClientException;

    /**
     * Posts a IosEasEmailProfileConfiguration with a new object
     *
     * @param newIosEasEmailProfileConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosEasEmailProfileConfiguration newIosEasEmailProfileConfiguration, final ICallback<? super IosEasEmailProfileConfiguration> callback);

    /**
     * Posts a IosEasEmailProfileConfiguration with a new object
     *
     * @param newIosEasEmailProfileConfiguration the new object to create
     * @return the created IosEasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEasEmailProfileConfiguration post(final IosEasEmailProfileConfiguration newIosEasEmailProfileConfiguration) throws ClientException;

    /**
     * Posts a IosEasEmailProfileConfiguration with a new object
     *
     * @param newIosEasEmailProfileConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final IosEasEmailProfileConfiguration newIosEasEmailProfileConfiguration, final ICallback<? super IosEasEmailProfileConfiguration> callback);

    /**
     * Posts a IosEasEmailProfileConfiguration with a new object
     *
     * @param newIosEasEmailProfileConfiguration the object to create/update
     * @return the created IosEasEmailProfileConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosEasEmailProfileConfiguration put(final IosEasEmailProfileConfiguration newIosEasEmailProfileConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIosEasEmailProfileConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIosEasEmailProfileConfigurationRequest expand(final String value);

}
