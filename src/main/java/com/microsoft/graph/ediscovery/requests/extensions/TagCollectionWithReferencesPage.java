// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.ediscovery.requests.extensions.ITagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.ITagCollectionWithReferencesPage;
import com.microsoft.graph.ediscovery.requests.extensions.TagCollectionResponse;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tag Collection With References Page.
 */
public class TagCollectionWithReferencesPage extends BaseCollectionPage<Tag, ITagCollectionWithReferencesRequestBuilder> implements ITagCollectionWithReferencesPage {

    /**
     * A collection page for Tag
     *
     * @param response the serialized TagCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TagCollectionWithReferencesPage(final TagCollectionResponse response, final ITagCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
