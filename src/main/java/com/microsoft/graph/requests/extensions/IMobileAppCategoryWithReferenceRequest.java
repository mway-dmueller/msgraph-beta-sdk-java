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
 * The interface for the Mobile App Category With Reference Request.
 */
public interface IMobileAppCategoryWithReferenceRequest extends IHttpRequest {

    void post(final MobileAppCategory newMobileAppCategory, final IJsonBackedObject payload, final ICallback<MobileAppCategory> callback);

    MobileAppCategory post(final MobileAppCategory newMobileAppCategory, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<MobileAppCategory> callback);

    MobileAppCategory get() throws ClientException;

	void delete(final ICallback<MobileAppCategory> callback);

	void delete() throws ClientException;

	void patch(final MobileAppCategory sourceMobileAppCategory, final ICallback<MobileAppCategory> callback);

	MobileAppCategory patch(final MobileAppCategory sourceMobileAppCategory) throws ClientException;

    IMobileAppCategoryWithReferenceRequest select(final String value);

    IMobileAppCategoryWithReferenceRequest expand(final String value);

}
