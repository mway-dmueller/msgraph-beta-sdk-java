// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleScheduleInstanceBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IRbacApplicationRoleScheduleInstancesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRbacApplicationRoleScheduleInstancesCollectionRequest;
import com.microsoft.graph.requests.extensions.RbacApplicationRoleScheduleInstancesCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Rbac Application Role Schedule Instances Collection Request Builder.
 */
public class RbacApplicationRoleScheduleInstancesCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IRbacApplicationRoleScheduleInstancesCollectionRequestBuilder {

    /**
     * The request builder for this collection of RbacApplication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param directoryScopeId the directoryScopeId
     * @param appScopeId the appScopeId
     * @param principalId the principalId
     * @param roleDefinitionId the roleDefinitionId
     */
    public RbacApplicationRoleScheduleInstancesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String directoryScopeId, final String appScopeId, final String principalId, final String roleDefinitionId) {
        super(requestUrl, client, requestOptions);
     	 if(directoryScopeId!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("directoryScopeId", directoryScopeId));
		}
       	 if(appScopeId!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("appScopeId", appScopeId));
		}
       	 if(principalId!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("principalId", principalId));
		}
       	 if(roleDefinitionId!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("roleDefinitionId", roleDefinitionId));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IRbacApplicationRoleScheduleInstancesCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IRbacApplicationRoleScheduleInstancesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        RbacApplicationRoleScheduleInstancesCollectionRequest request = new RbacApplicationRoleScheduleInstancesCollectionRequest(
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