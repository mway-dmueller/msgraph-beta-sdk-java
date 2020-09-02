// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementScript;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Collection Page.
 */
public class DeviceManagementScriptCollectionPage extends BaseCollectionPage<DeviceManagementScript, IDeviceManagementScriptCollectionRequestBuilder> implements IDeviceManagementScriptCollectionPage {

    /**
     * A collection page for DeviceManagementScript
     *
     * @param response the serialized DeviceManagementScriptCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementScriptCollectionPage(final DeviceManagementScriptCollectionResponse response, final IDeviceManagementScriptCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}