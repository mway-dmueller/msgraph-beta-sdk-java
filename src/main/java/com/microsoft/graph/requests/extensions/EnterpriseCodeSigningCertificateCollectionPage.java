// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EnterpriseCodeSigningCertificate;
import com.microsoft.graph.requests.extensions.IEnterpriseCodeSigningCertificateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.EnterpriseCodeSigningCertificateCollectionPage;
import com.microsoft.graph.requests.extensions.EnterpriseCodeSigningCertificateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enterprise Code Signing Certificate Collection Page.
 */
public class EnterpriseCodeSigningCertificateCollectionPage extends BaseCollectionPage<EnterpriseCodeSigningCertificate, IEnterpriseCodeSigningCertificateCollectionRequestBuilder> implements IEnterpriseCodeSigningCertificateCollectionPage {

    /**
     * A collection page for EnterpriseCodeSigningCertificate
     *
     * @param response the serialized EnterpriseCodeSigningCertificateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EnterpriseCodeSigningCertificateCollectionPage(final EnterpriseCodeSigningCertificateCollectionResponse response, final IEnterpriseCodeSigningCertificateCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
