// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsQualityUpdateProfileAssignment;
import com.microsoft.graph.requests.extensions.IWindowsQualityUpdateProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsQualityUpdateProfileAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsQualityUpdateProfileAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Profile Assignment Collection Page.
 */
public class WindowsQualityUpdateProfileAssignmentCollectionPage extends BaseCollectionPage<WindowsQualityUpdateProfileAssignment, IWindowsQualityUpdateProfileAssignmentCollectionRequestBuilder> implements IWindowsQualityUpdateProfileAssignmentCollectionPage {

    /**
     * A collection page for WindowsQualityUpdateProfileAssignment
     *
     * @param response the serialized WindowsQualityUpdateProfileAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsQualityUpdateProfileAssignmentCollectionPage(final WindowsQualityUpdateProfileAssignmentCollectionResponse response, final IWindowsQualityUpdateProfileAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}