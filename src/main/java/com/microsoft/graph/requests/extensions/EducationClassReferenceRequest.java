// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Reference Request.
 */
public class EducationClassReferenceRequest extends BaseRequest implements IEducationClassReferenceRequest {

    /**
     * The request for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationClass.class);
    }

    public void delete(final ICallback<EducationClass> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public EducationClass delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationClassReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (EducationClassReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationClassReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (EducationClassReferenceRequest)this;
    }
    /**
     * Puts the EducationClass
     *
     * @param srcEducationClass the EducationClass reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(EducationClass srcEducationClass, final ICallback<EducationClass> callback) {
        send(HttpMethod.PUT, callback, srcEducationClass);
    }

    /**
     * Puts the EducationClass
     *
     * @param srcEducationClass the EducationClass reference to PUT
     * @return the EducationClass
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public EducationClass put(EducationClass srcEducationClass) throws ClientException {
        return send(HttpMethod.PUT, srcEducationClass);
    }
}
