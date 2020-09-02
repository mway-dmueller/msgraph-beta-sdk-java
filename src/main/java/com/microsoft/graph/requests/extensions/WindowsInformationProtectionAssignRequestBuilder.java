// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAssignRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAssignRequest;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Assign Request Builder.
 */
public class WindowsInformationProtectionAssignRequestBuilder extends BaseActionRequestBuilder implements IWindowsInformationProtectionAssignRequestBuilder {

    /**
     * The request builder for this WindowsInformationProtectionAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public WindowsInformationProtectionAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("assignments", assignments);
    }

    /**
     * Creates the IWindowsInformationProtectionAssignRequest
     *
     * @return the IWindowsInformationProtectionAssignRequest instance
     */
    public IWindowsInformationProtectionAssignRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWindowsInformationProtectionAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWindowsInformationProtectionAssignRequest instance
     */
    public IWindowsInformationProtectionAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WindowsInformationProtectionAssignRequest request = new WindowsInformationProtectionAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }

        return request;
    }
}