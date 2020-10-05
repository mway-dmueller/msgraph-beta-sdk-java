// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptGroupAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Group Assignment Collection Page.
 */
public class DeviceManagementScriptGroupAssignmentCollectionPage extends BaseCollectionPage<DeviceManagementScriptGroupAssignment, IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder> implements IDeviceManagementScriptGroupAssignmentCollectionPage {

    /**
     * A collection page for DeviceManagementScriptGroupAssignment
     *
     * @param response the serialized DeviceManagementScriptGroupAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementScriptGroupAssignmentCollectionPage(final DeviceManagementScriptGroupAssignmentCollectionResponse response, final IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
