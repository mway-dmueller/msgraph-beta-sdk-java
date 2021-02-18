// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.LegalHold;
import com.microsoft.graph.ediscovery.requests.extensions.ISiteSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ISiteSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.SiteSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.SiteSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IUnifiedGroupSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IUnifiedGroupSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.UnifiedGroupSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.UnifiedGroupSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IUserSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.IUserSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.UserSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.UserSourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Legal Hold Request.
 */
public class LegalHoldRequest extends BaseRequest implements ILegalHoldRequest {
	
    /**
     * The request for the LegalHold
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LegalHoldRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LegalHold.class);
    }

    /**
     * Gets the LegalHold from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super LegalHold> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the LegalHold from the service
     *
     * @return the LegalHold from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LegalHold get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super LegalHold> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this LegalHold with a source
     *
     * @param sourceLegalHold the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final LegalHold sourceLegalHold, final ICallback<? super LegalHold> callback) {
        send(HttpMethod.PATCH, callback, sourceLegalHold);
    }

    /**
     * Patches this LegalHold with a source
     *
     * @param sourceLegalHold the source object with updates
     * @return the updated LegalHold
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LegalHold patch(final LegalHold sourceLegalHold) throws ClientException {
        return send(HttpMethod.PATCH, sourceLegalHold);
    }

    /**
     * Creates a LegalHold with a new object
     *
     * @param newLegalHold the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final LegalHold newLegalHold, final ICallback<? super LegalHold> callback) {
        send(HttpMethod.POST, callback, newLegalHold);
    }

    /**
     * Creates a LegalHold with a new object
     *
     * @param newLegalHold the new object to create
     * @return the created LegalHold
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LegalHold post(final LegalHold newLegalHold) throws ClientException {
        return send(HttpMethod.POST, newLegalHold);
    }

    /**
     * Creates a LegalHold with a new object
     *
     * @param newLegalHold the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final LegalHold newLegalHold, final ICallback<? super LegalHold> callback) {
        send(HttpMethod.PUT, callback, newLegalHold);
    }

    /**
     * Creates a LegalHold with a new object
     *
     * @param newLegalHold the object to create/update
     * @return the created LegalHold
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LegalHold put(final LegalHold newLegalHold) throws ClientException {
        return send(HttpMethod.PUT, newLegalHold);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ILegalHoldRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (LegalHoldRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ILegalHoldRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (LegalHoldRequest)this;
     }

}
