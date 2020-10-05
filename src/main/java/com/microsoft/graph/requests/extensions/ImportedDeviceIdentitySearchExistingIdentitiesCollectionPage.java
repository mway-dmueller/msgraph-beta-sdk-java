// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ImportedDeviceIdentity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentitySearchExistingIdentitiesCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentitySearchExistingIdentitiesCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Device Identity Search Existing Identities Collection Page.
 */
public class ImportedDeviceIdentitySearchExistingIdentitiesCollectionPage extends BaseCollectionPage<ImportedDeviceIdentity, IImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder> implements IImportedDeviceIdentitySearchExistingIdentitiesCollectionPage {

    /**
     * A collection page for ImportedDeviceIdentity.
     *
     * @param response The serialized ImportedDeviceIdentitySearchExistingIdentitiesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ImportedDeviceIdentitySearchExistingIdentitiesCollectionPage(final ImportedDeviceIdentitySearchExistingIdentitiesCollectionResponse response, final IImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
