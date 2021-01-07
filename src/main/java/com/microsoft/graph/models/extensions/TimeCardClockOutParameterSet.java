// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.TimeCard;
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
 * The class for the Time Card Clock Out Parameter Set.
 */
public class TimeCardClockOutParameterSet {
    /**
     * The at Approved Location.
     * 
     */
    @SerializedName(value = "atApprovedLocation", alternate = {"AtApprovedLocation"})
    @Expose
	@Nullable
    public Boolean atApprovedLocation;

    /**
     * The notes.
     * 
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public ItemBody notes;


    /**
     * Instiaciates a new TimeCardClockOutParameterSet
     */
    public TimeCardClockOutParameterSet() {}
    /**
     * Instiaciates a new TimeCardClockOutParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TimeCardClockOutParameterSet(@Nonnull final TimeCardClockOutParameterSetBuilder builder) {
        this.atApprovedLocation = builder.atApprovedLocation;
        this.notes = builder.notes;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TimeCardClockOutParameterSetBuilder newBuilder() {
        return new TimeCardClockOutParameterSetBuilder();
    }
    /**
     * Fluent builder for the TimeCardClockOutParameterSet
     */
    public static final class TimeCardClockOutParameterSetBuilder {
        /**
         * The atApprovedLocation parameter value
         */
        @Nullable
        protected Boolean atApprovedLocation;
        /**
         * Sets the AtApprovedLocation
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TimeCardClockOutParameterSetBuilder withAtApprovedLocation(@Nullable final Boolean val) {
            this.atApprovedLocation = val;
            return this;
        }
        /**
         * The notes parameter value
         */
        @Nullable
        protected ItemBody notes;
        /**
         * Sets the Notes
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TimeCardClockOutParameterSetBuilder withNotes(@Nullable final ItemBody val) {
            this.notes = val;
            return this;
        }
        /**
         * Instanciates a new TimeCardClockOutParameterSetBuilder
         */
        @Nullable
        protected TimeCardClockOutParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TimeCardClockOutParameterSet build() {
            return new TimeCardClockOutParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.atApprovedLocation != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("atApprovedLocation", atApprovedLocation));
        }
        if(this.notes != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("notes", notes));
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