// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InformationProtectionPolicy;
import com.microsoft.graph.models.extensions.InformationProtectionLabel;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.LabelingOptions;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import com.microsoft.graph.models.extensions.ClassificationResult;
import com.microsoft.graph.models.extensions.DowngradeJustification;
import com.microsoft.graph.models.extensions.InformationProtectionContentLabel;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Information Protection Label Collection Request.
 */
public interface IInformationProtectionLabelCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super IInformationProtectionLabelCollectionPage> callback);

    IInformationProtectionLabelCollectionPage get() throws ClientException;

    void post(final InformationProtectionLabel newInformationProtectionLabel, final ICallback<? super InformationProtectionLabel> callback);

    InformationProtectionLabel post(final InformationProtectionLabel newInformationProtectionLabel) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IInformationProtectionLabelCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IInformationProtectionLabelCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    IInformationProtectionLabelCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IInformationProtectionLabelCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IInformationProtectionLabelCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IInformationProtectionLabelCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IInformationProtectionLabelCollectionRequest skipToken(final String skipToken);
}
