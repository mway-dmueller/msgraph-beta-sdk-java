// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationOutcome;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Outcome Request.
 */
public class EducationOutcomeRequest extends BaseRequest implements IEducationOutcomeRequest {
	
    /**
     * The request for the EducationOutcome
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public EducationOutcomeRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends EducationOutcome> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the EducationOutcome
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationOutcomeRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationOutcome.class);
    }

    /**
     * Gets the EducationOutcome from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EducationOutcome> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationOutcome from the service
     *
     * @return the EducationOutcome from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationOutcome get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EducationOutcome> callback) {
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
     * Patches this EducationOutcome with a source
     *
     * @param sourceEducationOutcome the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationOutcome sourceEducationOutcome, final ICallback<? super EducationOutcome> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationOutcome);
    }

    /**
     * Patches this EducationOutcome with a source
     *
     * @param sourceEducationOutcome the source object with updates
     * @return the updated EducationOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationOutcome patch(final EducationOutcome sourceEducationOutcome) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationOutcome);
    }

    /**
     * Creates a EducationOutcome with a new object
     *
     * @param newEducationOutcome the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationOutcome newEducationOutcome, final ICallback<? super EducationOutcome> callback) {
        send(HttpMethod.POST, callback, newEducationOutcome);
    }

    /**
     * Creates a EducationOutcome with a new object
     *
     * @param newEducationOutcome the new object to create
     * @return the created EducationOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationOutcome post(final EducationOutcome newEducationOutcome) throws ClientException {
        return send(HttpMethod.POST, newEducationOutcome);
    }

    /**
     * Creates a EducationOutcome with a new object
     *
     * @param newEducationOutcome the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EducationOutcome newEducationOutcome, final ICallback<? super EducationOutcome> callback) {
        send(HttpMethod.PUT, callback, newEducationOutcome);
    }

    /**
     * Creates a EducationOutcome with a new object
     *
     * @param newEducationOutcome the object to create/update
     * @return the created EducationOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationOutcome put(final EducationOutcome newEducationOutcome) throws ClientException {
        return send(HttpMethod.PUT, newEducationOutcome);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationOutcomeRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationOutcomeRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationOutcomeRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationOutcomeRequest)this;
     }

}

