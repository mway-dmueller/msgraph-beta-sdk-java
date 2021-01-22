// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MeetingActivityStatistics;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Meeting Activity Statistics Request.
 */
public interface IMeetingActivityStatisticsRequest extends IHttpRequest {

    /**
     * Gets the MeetingActivityStatistics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MeetingActivityStatistics> callback);

    /**
     * Gets the MeetingActivityStatistics from the service
     *
     * @return the MeetingActivityStatistics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MeetingActivityStatistics get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MeetingActivityStatistics> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MeetingActivityStatistics with a source
     *
     * @param sourceMeetingActivityStatistics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MeetingActivityStatistics sourceMeetingActivityStatistics, final ICallback<? super MeetingActivityStatistics> callback);

    /**
     * Patches this MeetingActivityStatistics with a source
     *
     * @param sourceMeetingActivityStatistics the source object with updates
     * @return the updated MeetingActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MeetingActivityStatistics patch(final MeetingActivityStatistics sourceMeetingActivityStatistics) throws ClientException;

    /**
     * Posts a MeetingActivityStatistics with a new object
     *
     * @param newMeetingActivityStatistics the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MeetingActivityStatistics newMeetingActivityStatistics, final ICallback<? super MeetingActivityStatistics> callback);

    /**
     * Posts a MeetingActivityStatistics with a new object
     *
     * @param newMeetingActivityStatistics the new object to create
     * @return the created MeetingActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MeetingActivityStatistics post(final MeetingActivityStatistics newMeetingActivityStatistics) throws ClientException;

    /**
     * Posts a MeetingActivityStatistics with a new object
     *
     * @param newMeetingActivityStatistics the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MeetingActivityStatistics newMeetingActivityStatistics, final ICallback<? super MeetingActivityStatistics> callback);

    /**
     * Posts a MeetingActivityStatistics with a new object
     *
     * @param newMeetingActivityStatistics the object to create/update
     * @return the created MeetingActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MeetingActivityStatistics put(final MeetingActivityStatistics newMeetingActivityStatistics) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMeetingActivityStatisticsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMeetingActivityStatisticsRequest expand(final String value);

}
