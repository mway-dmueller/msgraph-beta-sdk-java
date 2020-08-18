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
 * The class for the Item Activity Stat With Reference Request.
 */
public class ItemActivityStatWithReferenceRequest extends BaseRequest implements IItemActivityStatWithReferenceRequest {

    /**
     * The request for the ItemActivityStat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityStatWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemActivityStat.class);
    }

    public void post(final ItemActivityStat newItemActivityStat, final IJsonBackedObject payload, final ICallback<ItemActivityStat> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public ItemActivityStat post(final ItemActivityStat newItemActivityStat, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newItemActivityStat;
        }
        return null;
    }

    public void get(final ICallback<ItemActivityStat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public ItemActivityStat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<ItemActivityStat> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final ItemActivityStat sourceItemActivityStat, final ICallback<ItemActivityStat> callback) {
		send(HttpMethod.PATCH, callback, sourceItemActivityStat);
	}

	public ItemActivityStat patch(final ItemActivityStat sourceItemActivityStat) throws ClientException {
		return send(HttpMethod.PATCH, sourceItemActivityStat);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemActivityStatWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (IItemActivityStatWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemActivityStatWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ItemActivityStatWithReferenceRequest)this;
    }
}
