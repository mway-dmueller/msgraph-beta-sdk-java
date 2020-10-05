// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicy;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mdm Windows Information Protection Policy Collection Page.
 */
public class MdmWindowsInformationProtectionPolicyCollectionPage extends BaseCollectionPage<MdmWindowsInformationProtectionPolicy, IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder> implements IMdmWindowsInformationProtectionPolicyCollectionPage {

    /**
     * A collection page for MdmWindowsInformationProtectionPolicy
     *
     * @param response the serialized MdmWindowsInformationProtectionPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MdmWindowsInformationProtectionPolicyCollectionPage(final MdmWindowsInformationProtectionPolicyCollectionResponse response, final IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
