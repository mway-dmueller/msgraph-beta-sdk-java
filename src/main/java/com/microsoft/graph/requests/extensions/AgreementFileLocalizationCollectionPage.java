// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AgreementFileLocalization;
import com.microsoft.graph.requests.extensions.IAgreementFileLocalizationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AgreementFileLocalizationCollectionPage;
import com.microsoft.graph.requests.extensions.AgreementFileLocalizationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File Localization Collection Page.
 */
public class AgreementFileLocalizationCollectionPage extends BaseCollectionPage<AgreementFileLocalization, IAgreementFileLocalizationCollectionRequestBuilder> implements IAgreementFileLocalizationCollectionPage {

    /**
     * A collection page for AgreementFileLocalization
     *
     * @param response the serialized AgreementFileLocalizationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AgreementFileLocalizationCollectionPage(final AgreementFileLocalizationCollectionResponse response, final IAgreementFileLocalizationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
