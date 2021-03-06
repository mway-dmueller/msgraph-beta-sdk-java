// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.RoleAssignmentScheduleFilterByCurrentUserOptions;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentSchedule;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Filter By Current User Collection Request Builder.
 */
public class UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IUnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder {

    /**
     * The request builder for this collection of UnifiedRoleAssignmentSchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param on the on
     */
    public UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final RoleAssignmentScheduleFilterByCurrentUserOptions on) {
        super(requestUrl, client, requestOptions);
     	 if(on!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("on", on));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest request = new UnifiedRoleAssignmentScheduleFilterByCurrentUserCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
