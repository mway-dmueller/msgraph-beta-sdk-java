// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CloudPcProvisioningPolicyAssignment;
import com.microsoft.graph.requests.extensions.ICloudPcProvisioningPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CloudPcProvisioningPolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.CloudPcProvisioningPolicyAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Provisioning Policy Assignment Collection Page.
 */
public class CloudPcProvisioningPolicyAssignmentCollectionPage extends BaseCollectionPage<CloudPcProvisioningPolicyAssignment, ICloudPcProvisioningPolicyAssignmentCollectionRequestBuilder> implements ICloudPcProvisioningPolicyAssignmentCollectionPage {

    /**
     * A collection page for CloudPcProvisioningPolicyAssignment
     *
     * @param response the serialized CloudPcProvisioningPolicyAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CloudPcProvisioningPolicyAssignmentCollectionPage(final CloudPcProvisioningPolicyAssignmentCollectionResponse response, final ICloudPcProvisioningPolicyAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}