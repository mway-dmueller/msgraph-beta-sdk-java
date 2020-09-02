// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementGetRoleScopeTagsByResourceCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementGetRoleScopeTagsByResourceCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Get Role Scope Tags By Resource Collection Page.
 */
public class DeviceManagementGetRoleScopeTagsByResourceCollectionPage extends BaseCollectionPage<RoleScopeTag, IDeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder> implements IDeviceManagementGetRoleScopeTagsByResourceCollectionPage {

    /**
     * A collection page for RoleScopeTag.
     *
     * @param response The serialized DeviceManagementGetRoleScopeTagsByResourceCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceManagementGetRoleScopeTagsByResourceCollectionPage(final DeviceManagementGetRoleScopeTagsByResourceCollectionResponse response, final IDeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}