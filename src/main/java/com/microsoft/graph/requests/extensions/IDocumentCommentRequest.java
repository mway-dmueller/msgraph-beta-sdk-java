// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DocumentComment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Document Comment Request.
 */
public interface IDocumentCommentRequest extends IHttpRequest {

    /**
     * Gets the DocumentComment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DocumentComment> callback);

    /**
     * Gets the DocumentComment from the service
     *
     * @return the DocumentComment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DocumentComment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DocumentComment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DocumentComment with a source
     *
     * @param sourceDocumentComment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DocumentComment sourceDocumentComment, final ICallback<? super DocumentComment> callback);

    /**
     * Patches this DocumentComment with a source
     *
     * @param sourceDocumentComment the source object with updates
     * @return the updated DocumentComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DocumentComment patch(final DocumentComment sourceDocumentComment) throws ClientException;

    /**
     * Posts a DocumentComment with a new object
     *
     * @param newDocumentComment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DocumentComment newDocumentComment, final ICallback<? super DocumentComment> callback);

    /**
     * Posts a DocumentComment with a new object
     *
     * @param newDocumentComment the new object to create
     * @return the created DocumentComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DocumentComment post(final DocumentComment newDocumentComment) throws ClientException;

    /**
     * Posts a DocumentComment with a new object
     *
     * @param newDocumentComment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DocumentComment newDocumentComment, final ICallback<? super DocumentComment> callback);

    /**
     * Posts a DocumentComment with a new object
     *
     * @param newDocumentComment the object to create/update
     * @return the created DocumentComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DocumentComment put(final DocumentComment newDocumentComment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDocumentCommentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDocumentCommentRequest expand(final String value);

}

