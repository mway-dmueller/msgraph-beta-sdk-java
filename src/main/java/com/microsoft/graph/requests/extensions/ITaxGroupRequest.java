// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TaxGroup;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Tax Group Request.
 */
public interface ITaxGroupRequest extends IHttpRequest {

    /**
     * Gets the TaxGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TaxGroup> callback);

    /**
     * Gets the TaxGroup from the service
     *
     * @return the TaxGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TaxGroup get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TaxGroup> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TaxGroup with a source
     *
     * @param sourceTaxGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TaxGroup sourceTaxGroup, final ICallback<? super TaxGroup> callback);

    /**
     * Patches this TaxGroup with a source
     *
     * @param sourceTaxGroup the source object with updates
     * @return the updated TaxGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TaxGroup patch(final TaxGroup sourceTaxGroup) throws ClientException;

    /**
     * Posts a TaxGroup with a new object
     *
     * @param newTaxGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TaxGroup newTaxGroup, final ICallback<? super TaxGroup> callback);

    /**
     * Posts a TaxGroup with a new object
     *
     * @param newTaxGroup the new object to create
     * @return the created TaxGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TaxGroup post(final TaxGroup newTaxGroup) throws ClientException;

    /**
     * Posts a TaxGroup with a new object
     *
     * @param newTaxGroup the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TaxGroup newTaxGroup, final ICallback<? super TaxGroup> callback);

    /**
     * Posts a TaxGroup with a new object
     *
     * @param newTaxGroup the object to create/update
     * @return the created TaxGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TaxGroup put(final TaxGroup newTaxGroup) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITaxGroupRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITaxGroupRequest expand(final String value);

}

