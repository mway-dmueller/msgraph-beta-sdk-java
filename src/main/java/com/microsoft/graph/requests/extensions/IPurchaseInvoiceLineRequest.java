// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PurchaseInvoiceLine;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Purchase Invoice Line Request.
 */
public interface IPurchaseInvoiceLineRequest extends IHttpRequest {

    /**
     * Gets the PurchaseInvoiceLine from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PurchaseInvoiceLine> callback);

    /**
     * Gets the PurchaseInvoiceLine from the service
     *
     * @return the PurchaseInvoiceLine from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PurchaseInvoiceLine get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PurchaseInvoiceLine> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PurchaseInvoiceLine with a source
     *
     * @param sourcePurchaseInvoiceLine the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PurchaseInvoiceLine sourcePurchaseInvoiceLine, final ICallback<? super PurchaseInvoiceLine> callback);

    /**
     * Patches this PurchaseInvoiceLine with a source
     *
     * @param sourcePurchaseInvoiceLine the source object with updates
     * @return the updated PurchaseInvoiceLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PurchaseInvoiceLine patch(final PurchaseInvoiceLine sourcePurchaseInvoiceLine) throws ClientException;

    /**
     * Posts a PurchaseInvoiceLine with a new object
     *
     * @param newPurchaseInvoiceLine the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PurchaseInvoiceLine newPurchaseInvoiceLine, final ICallback<? super PurchaseInvoiceLine> callback);

    /**
     * Posts a PurchaseInvoiceLine with a new object
     *
     * @param newPurchaseInvoiceLine the new object to create
     * @return the created PurchaseInvoiceLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PurchaseInvoiceLine post(final PurchaseInvoiceLine newPurchaseInvoiceLine) throws ClientException;

    /**
     * Posts a PurchaseInvoiceLine with a new object
     *
     * @param newPurchaseInvoiceLine the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PurchaseInvoiceLine newPurchaseInvoiceLine, final ICallback<? super PurchaseInvoiceLine> callback);

    /**
     * Posts a PurchaseInvoiceLine with a new object
     *
     * @param newPurchaseInvoiceLine the object to create/update
     * @return the created PurchaseInvoiceLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PurchaseInvoiceLine put(final PurchaseInvoiceLine newPurchaseInvoiceLine) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPurchaseInvoiceLineRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPurchaseInvoiceLineRequest expand(final String value);

}
