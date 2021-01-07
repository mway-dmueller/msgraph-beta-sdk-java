// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ArchivedPrintJob;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get User Archived Print Jobs Parameter Set.
 */
public class ReportRootGetUserArchivedPrintJobsParameterSet {
    /**
     * The user Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The period Start.
     * 
     */
    @SerializedName(value = "periodStart", alternate = {"PeriodStart"})
    @Expose
	@Nullable
    public java.util.Calendar periodStart;

    /**
     * The period End.
     * 
     */
    @SerializedName(value = "periodEnd", alternate = {"PeriodEnd"})
    @Expose
	@Nullable
    public java.util.Calendar periodEnd;


    /**
     * Instiaciates a new ReportRootGetUserArchivedPrintJobsParameterSet
     */
    public ReportRootGetUserArchivedPrintJobsParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetUserArchivedPrintJobsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetUserArchivedPrintJobsParameterSet(@Nonnull final ReportRootGetUserArchivedPrintJobsParameterSetBuilder builder) {
        this.userId = builder.userId;
        this.periodStart = builder.periodStart;
        this.periodEnd = builder.periodEnd;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetUserArchivedPrintJobsParameterSetBuilder newBuilder() {
        return new ReportRootGetUserArchivedPrintJobsParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetUserArchivedPrintJobsParameterSet
     */
    public static final class ReportRootGetUserArchivedPrintJobsParameterSetBuilder {
        /**
         * The userId parameter value
         */
        @Nullable
        protected String userId;
        /**
         * Sets the UserId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetUserArchivedPrintJobsParameterSetBuilder withUserId(@Nullable final String val) {
            this.userId = val;
            return this;
        }
        /**
         * The periodStart parameter value
         */
        @Nullable
        protected java.util.Calendar periodStart;
        /**
         * Sets the PeriodStart
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetUserArchivedPrintJobsParameterSetBuilder withPeriodStart(@Nullable final java.util.Calendar val) {
            this.periodStart = val;
            return this;
        }
        /**
         * The periodEnd parameter value
         */
        @Nullable
        protected java.util.Calendar periodEnd;
        /**
         * Sets the PeriodEnd
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetUserArchivedPrintJobsParameterSetBuilder withPeriodEnd(@Nullable final java.util.Calendar val) {
            this.periodEnd = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetUserArchivedPrintJobsParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetUserArchivedPrintJobsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetUserArchivedPrintJobsParameterSet build() {
            return new ReportRootGetUserArchivedPrintJobsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.userId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("userId", userId));
        }
        if(this.periodStart != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
        }
        if(this.periodEnd != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}