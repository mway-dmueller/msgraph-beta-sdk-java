// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementSettingCategory;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Category Request.
 */
public class DeviceManagementSettingCategoryRequest extends BaseRequest implements IDeviceManagementSettingCategoryRequest {
	
    /**
     * The request for the DeviceManagementSettingCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceManagementSettingCategoryRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends DeviceManagementSettingCategory> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceManagementSettingCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementSettingCategoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementSettingCategory.class);
    }

    /**
     * Gets the DeviceManagementSettingCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementSettingCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementSettingCategory from the service
     *
     * @return the DeviceManagementSettingCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementSettingCategory> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementSettingCategory with a source
     *
     * @param sourceDeviceManagementSettingCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementSettingCategory sourceDeviceManagementSettingCategory, final ICallback<? super DeviceManagementSettingCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementSettingCategory);
    }

    /**
     * Patches this DeviceManagementSettingCategory with a source
     *
     * @param sourceDeviceManagementSettingCategory the source object with updates
     * @return the updated DeviceManagementSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingCategory patch(final DeviceManagementSettingCategory sourceDeviceManagementSettingCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementSettingCategory);
    }

    /**
     * Creates a DeviceManagementSettingCategory with a new object
     *
     * @param newDeviceManagementSettingCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementSettingCategory newDeviceManagementSettingCategory, final ICallback<? super DeviceManagementSettingCategory> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementSettingCategory);
    }

    /**
     * Creates a DeviceManagementSettingCategory with a new object
     *
     * @param newDeviceManagementSettingCategory the new object to create
     * @return the created DeviceManagementSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingCategory post(final DeviceManagementSettingCategory newDeviceManagementSettingCategory) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementSettingCategory);
    }

    /**
     * Creates a DeviceManagementSettingCategory with a new object
     *
     * @param newDeviceManagementSettingCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementSettingCategory newDeviceManagementSettingCategory, final ICallback<? super DeviceManagementSettingCategory> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementSettingCategory);
    }

    /**
     * Creates a DeviceManagementSettingCategory with a new object
     *
     * @param newDeviceManagementSettingCategory the object to create/update
     * @return the created DeviceManagementSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingCategory put(final DeviceManagementSettingCategory newDeviceManagementSettingCategory) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementSettingCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementSettingCategoryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementSettingCategoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementSettingCategoryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementSettingCategoryRequest)this;
     }

}

