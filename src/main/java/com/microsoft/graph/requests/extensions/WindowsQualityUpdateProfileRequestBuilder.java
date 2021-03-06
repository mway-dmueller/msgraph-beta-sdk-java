// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsQualityUpdateProfile;
import com.microsoft.graph.models.extensions.WindowsQualityUpdateProfileAssignment;
import com.microsoft.graph.requests.extensions.IWindowsQualityUpdateProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsQualityUpdateProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsQualityUpdateProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsQualityUpdateProfileAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Profile Request Builder.
 */
public class WindowsQualityUpdateProfileRequestBuilder extends BaseRequestBuilder implements IWindowsQualityUpdateProfileRequestBuilder {

    /**
     * The request builder for the WindowsQualityUpdateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsQualityUpdateProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsQualityUpdateProfileRequest instance
     */
    public IWindowsQualityUpdateProfileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsQualityUpdateProfileRequest instance
     */
    public IWindowsQualityUpdateProfileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WindowsQualityUpdateProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWindowsQualityUpdateProfileAssignmentCollectionRequestBuilder assignments() {
        return new WindowsQualityUpdateProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IWindowsQualityUpdateProfileAssignmentRequestBuilder assignments(final String id) {
        return new WindowsQualityUpdateProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IWindowsQualityUpdateProfileAssignRequestBuilder assign(final java.util.List<WindowsQualityUpdateProfileAssignment> assignments) {
        return new WindowsQualityUpdateProfileAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}
