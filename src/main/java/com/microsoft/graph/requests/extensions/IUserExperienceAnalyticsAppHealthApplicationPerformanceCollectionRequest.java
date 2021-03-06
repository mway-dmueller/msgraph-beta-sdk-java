// Template Source: IBaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthApplicationPerformance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics App Health Application Performance Collection Request.
 */
public interface IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest extends IHttpRequest {

    void get(final ICallback<? super IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage> callback);

    IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionPage get() throws ClientException;

    void post(final UserExperienceAnalyticsAppHealthApplicationPerformance newUserExperienceAnalyticsAppHealthApplicationPerformance, final ICallback<? super UserExperienceAnalyticsAppHealthApplicationPerformance> callback);

    UserExperienceAnalyticsAppHealthApplicationPerformance post(final UserExperienceAnalyticsAppHealthApplicationPerformance newUserExperienceAnalyticsAppHealthApplicationPerformance) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest filter(final String value);

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest orderBy(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IUserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequest skipToken(final String skipToken);
}
