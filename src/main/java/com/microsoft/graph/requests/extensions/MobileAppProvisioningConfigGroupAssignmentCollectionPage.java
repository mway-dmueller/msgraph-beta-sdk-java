// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;
import com.microsoft.graph.requests.extensions.IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppProvisioningConfigGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppProvisioningConfigGroupAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Provisioning Config Group Assignment Collection Page.
 */
public class MobileAppProvisioningConfigGroupAssignmentCollectionPage extends BaseCollectionPage<MobileAppProvisioningConfigGroupAssignment, IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder> implements IMobileAppProvisioningConfigGroupAssignmentCollectionPage {

    /**
     * A collection page for MobileAppProvisioningConfigGroupAssignment
     *
     * @param response the serialized MobileAppProvisioningConfigGroupAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppProvisioningConfigGroupAssignmentCollectionPage(final MobileAppProvisioningConfigGroupAssignmentCollectionResponse response, final IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}