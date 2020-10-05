// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentResourceRole;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Resource Role Collection Page.
 */
public class AccessPackageAssignmentResourceRoleCollectionPage extends BaseCollectionPage<AccessPackageAssignmentResourceRole, IAccessPackageAssignmentResourceRoleCollectionRequestBuilder> implements IAccessPackageAssignmentResourceRoleCollectionPage {

    /**
     * A collection page for AccessPackageAssignmentResourceRole
     *
     * @param response the serialized AccessPackageAssignmentResourceRoleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessPackageAssignmentResourceRoleCollectionPage(final AccessPackageAssignmentResourceRoleCollectionResponse response, final IAccessPackageAssignmentResourceRoleCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
