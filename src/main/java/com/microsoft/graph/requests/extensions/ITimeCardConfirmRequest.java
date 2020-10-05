// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TimeCard;
import com.microsoft.graph.requests.extensions.ITimeCardConfirmRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Time Card Confirm Request.
 */
public interface ITimeCardConfirmRequest extends IHttpRequest {

    /**
     * Creates the TimeCardConfirm
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<? super TimeCard> callback);

    /**
     * Creates the TimeCardConfirm
     *
     * @return the TimeCard
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    TimeCard post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITimeCardConfirmRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITimeCardConfirmRequest expand(final String value);

}
