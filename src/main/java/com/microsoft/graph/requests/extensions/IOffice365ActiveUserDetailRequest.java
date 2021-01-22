// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Office365ActiveUserDetail;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office365Active User Detail Request.
 */
public interface IOffice365ActiveUserDetailRequest extends IHttpRequest {

    /**
     * Gets the Office365ActiveUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Office365ActiveUserDetail> callback);

    /**
     * Gets the Office365ActiveUserDetail from the service
     *
     * @return the Office365ActiveUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ActiveUserDetail get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Office365ActiveUserDetail> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Office365ActiveUserDetail with a source
     *
     * @param sourceOffice365ActiveUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Office365ActiveUserDetail sourceOffice365ActiveUserDetail, final ICallback<? super Office365ActiveUserDetail> callback);

    /**
     * Patches this Office365ActiveUserDetail with a source
     *
     * @param sourceOffice365ActiveUserDetail the source object with updates
     * @return the updated Office365ActiveUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ActiveUserDetail patch(final Office365ActiveUserDetail sourceOffice365ActiveUserDetail) throws ClientException;

    /**
     * Posts a Office365ActiveUserDetail with a new object
     *
     * @param newOffice365ActiveUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Office365ActiveUserDetail newOffice365ActiveUserDetail, final ICallback<? super Office365ActiveUserDetail> callback);

    /**
     * Posts a Office365ActiveUserDetail with a new object
     *
     * @param newOffice365ActiveUserDetail the new object to create
     * @return the created Office365ActiveUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ActiveUserDetail post(final Office365ActiveUserDetail newOffice365ActiveUserDetail) throws ClientException;

    /**
     * Posts a Office365ActiveUserDetail with a new object
     *
     * @param newOffice365ActiveUserDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Office365ActiveUserDetail newOffice365ActiveUserDetail, final ICallback<? super Office365ActiveUserDetail> callback);

    /**
     * Posts a Office365ActiveUserDetail with a new object
     *
     * @param newOffice365ActiveUserDetail the object to create/update
     * @return the created Office365ActiveUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Office365ActiveUserDetail put(final Office365ActiveUserDetail newOffice365ActiveUserDetail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOffice365ActiveUserDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOffice365ActiveUserDetailRequest expand(final String value);

}
