// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.ManagementConditionExpressionString;
import com.microsoft.graph.models.generated.DevicePlatformType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionResponse;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Collection With References Page.
 */
public class ManagementConditionStatementCollectionWithReferencesPage extends BaseCollectionPage<ManagementConditionStatement, IManagementConditionStatementCollectionWithReferencesRequestBuilder> implements IManagementConditionStatementCollectionWithReferencesPage {

    /**
     * A collection page for ManagementConditionStatement
     *
     * @param response the serialized ManagementConditionStatementCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagementConditionStatementCollectionWithReferencesPage(final ManagementConditionStatementCollectionResponse response, final IManagementConditionStatementCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
