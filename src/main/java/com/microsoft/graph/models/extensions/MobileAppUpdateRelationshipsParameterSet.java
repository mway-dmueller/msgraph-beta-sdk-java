// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.MobileAppRelationship;
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
 * The class for the Mobile App Update Relationships Parameter Set.
 */
public class MobileAppUpdateRelationshipsParameterSet {
    /**
     * The relationships.
     * 
     */
    @SerializedName(value = "relationships", alternate = {"Relationships"})
    @Expose
	@Nullable
    public java.util.List<MobileAppRelationship> relationships;


    /**
     * Instiaciates a new MobileAppUpdateRelationshipsParameterSet
     */
    public MobileAppUpdateRelationshipsParameterSet() {}
    /**
     * Instiaciates a new MobileAppUpdateRelationshipsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected MobileAppUpdateRelationshipsParameterSet(@Nonnull final MobileAppUpdateRelationshipsParameterSetBuilder builder) {
        this.relationships = builder.relationships;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static MobileAppUpdateRelationshipsParameterSetBuilder newBuilder() {
        return new MobileAppUpdateRelationshipsParameterSetBuilder();
    }
    /**
     * Fluent builder for the MobileAppUpdateRelationshipsParameterSet
     */
    public static final class MobileAppUpdateRelationshipsParameterSetBuilder {
        /**
         * The relationships parameter value
         */
        @Nullable
        protected java.util.List<MobileAppRelationship> relationships;
        /**
         * Sets the Relationships
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MobileAppUpdateRelationshipsParameterSetBuilder withRelationships(@Nullable final java.util.List<MobileAppRelationship> val) {
            this.relationships = val;
            return this;
        }
        /**
         * Instanciates a new MobileAppUpdateRelationshipsParameterSetBuilder
         */
        @Nullable
        protected MobileAppUpdateRelationshipsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public MobileAppUpdateRelationshipsParameterSet build() {
            return new MobileAppUpdateRelationshipsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.relationships != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("relationships", relationships));
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