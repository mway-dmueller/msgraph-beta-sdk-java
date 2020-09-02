// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsUnbindRequest;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsUnbindRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Settings Unbind Request Builder.
 */
public class AndroidForWorkSettingsUnbindRequestBuilder extends BaseActionRequestBuilder implements IAndroidForWorkSettingsUnbindRequestBuilder {

    /**
     * The request builder for this AndroidForWorkSettingsUnbind
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkSettingsUnbindRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IAndroidForWorkSettingsUnbindRequest
     *
     * @return the IAndroidForWorkSettingsUnbindRequest instance
     */
    public IAndroidForWorkSettingsUnbindRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IAndroidForWorkSettingsUnbindRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsUnbindRequest instance
     */
    public IAndroidForWorkSettingsUnbindRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AndroidForWorkSettingsUnbindRequest request = new AndroidForWorkSettingsUnbindRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}