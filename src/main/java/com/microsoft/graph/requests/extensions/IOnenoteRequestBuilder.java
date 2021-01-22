// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.requests.extensions.INotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Request Builder.
 */
public interface IOnenoteRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteRequest instance
     */
    IOnenoteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteRequest instance
     */
    IOnenoteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    INotebookCollectionRequestBuilder notebooks();

    INotebookRequestBuilder notebooks(final String id);

    IOnenoteOperationCollectionRequestBuilder operations();

    IOnenoteOperationRequestBuilder operations(final String id);

    IOnenotePageCollectionRequestBuilder pages();

    IOnenotePageRequestBuilder pages(final String id);

    IOnenoteResourceCollectionRequestBuilder resources();

    IOnenoteResourceRequestBuilder resources(final String id);

    ISectionGroupCollectionRequestBuilder sectionGroups();

    ISectionGroupRequestBuilder sectionGroups(final String id);

    IOnenoteSectionCollectionRequestBuilder sections();

    IOnenoteSectionRequestBuilder sections(final String id);

}