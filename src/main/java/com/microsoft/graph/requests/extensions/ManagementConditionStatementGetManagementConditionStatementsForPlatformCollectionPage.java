// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionPage;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Get Management Condition Statements For Platform Collection Page.
 */
public class ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionPage extends BaseCollectionPage<ManagementConditionStatement, IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder> implements IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionPage {

    /**
     * A collection page for ManagementConditionStatement.
     *
     * @param response The serialized ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionPage(final ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionResponse response, final IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
