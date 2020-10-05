// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.InformationProtectionLabel;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Information Protection Label Request.
 */
public interface IInformationProtectionLabelRequest extends IHttpRequest {

    /**
     * Gets the InformationProtectionLabel from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super InformationProtectionLabel> callback);

    /**
     * Gets the InformationProtectionLabel from the service
     *
     * @return the InformationProtectionLabel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    InformationProtectionLabel get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super InformationProtectionLabel> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this InformationProtectionLabel with a source
     *
     * @param sourceInformationProtectionLabel the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final InformationProtectionLabel sourceInformationProtectionLabel, final ICallback<? super InformationProtectionLabel> callback);

    /**
     * Patches this InformationProtectionLabel with a source
     *
     * @param sourceInformationProtectionLabel the source object with updates
     * @return the updated InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    InformationProtectionLabel patch(final InformationProtectionLabel sourceInformationProtectionLabel) throws ClientException;

    /**
     * Posts a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final InformationProtectionLabel newInformationProtectionLabel, final ICallback<? super InformationProtectionLabel> callback);

    /**
     * Posts a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the new object to create
     * @return the created InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    InformationProtectionLabel post(final InformationProtectionLabel newInformationProtectionLabel) throws ClientException;

    /**
     * Posts a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final InformationProtectionLabel newInformationProtectionLabel, final ICallback<? super InformationProtectionLabel> callback);

    /**
     * Posts a InformationProtectionLabel with a new object
     *
     * @param newInformationProtectionLabel the object to create/update
     * @return the created InformationProtectionLabel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    InformationProtectionLabel put(final InformationProtectionLabel newInformationProtectionLabel) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IInformationProtectionLabelRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IInformationProtectionLabelRequest expand(final String value);

}

