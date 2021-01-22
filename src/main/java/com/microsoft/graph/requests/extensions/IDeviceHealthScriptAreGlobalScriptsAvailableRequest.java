// Template Source: IBaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.generated.GlobalDeviceHealthScriptState;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAreGlobalScriptsAvailableRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Are Global Scripts Available Request.
 */
public interface IDeviceHealthScriptAreGlobalScriptsAvailableRequest extends IHttpRequest {

    /**
     * Gets the GlobalDeviceHealthScriptState
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super GlobalDeviceHealthScriptState> callback);

    /**
     * Gets the GlobalDeviceHealthScriptState
     *
     * @return the GlobalDeviceHealthScriptState
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    GlobalDeviceHealthScriptState get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceHealthScriptAreGlobalScriptsAvailableRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceHealthScriptAreGlobalScriptsAvailableRequest expand(final String value);

}