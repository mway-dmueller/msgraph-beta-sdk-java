// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedLanguageFile;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File Update Language Files Request Builder.
 */
public class GroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequestBuilder extends BaseActionRequestBuilder implements IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequestBuilder {

    /**
     * The request builder for this GroupPolicyUploadedDefinitionFileUpdateLanguageFiles
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupPolicyUploadedLanguageFiles the groupPolicyUploadedLanguageFiles
     */
    public GroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("groupPolicyUploadedLanguageFiles", groupPolicyUploadedLanguageFiles);
    }

    /**
     * Creates the IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest
     *
     * @return the IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest instance
     */
    public IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest instance
     */
    public IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest request = new GroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupPolicyUploadedLanguageFiles")) {
            request.body.groupPolicyUploadedLanguageFiles = getParameter("groupPolicyUploadedLanguageFiles");
        }

        return request;
    }
}