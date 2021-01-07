// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ExpressionInputObject;
import com.microsoft.graph.models.extensions.AttributeDefinition;
import com.microsoft.graph.models.extensions.ParseExpressionResponse;
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
 * The class for the Synchronization Schema Parse Expression Parameter Set.
 */
public class SynchronizationSchemaParseExpressionParameterSet {
    /**
     * The expression.
     * 
     */
    @SerializedName(value = "expression", alternate = {"Expression"})
    @Expose
	@Nullable
    public String expression;

    /**
     * The test Input Object.
     * 
     */
    @SerializedName(value = "testInputObject", alternate = {"TestInputObject"})
    @Expose
	@Nullable
    public ExpressionInputObject testInputObject;

    /**
     * The target Attribute Definition.
     * 
     */
    @SerializedName(value = "targetAttributeDefinition", alternate = {"TargetAttributeDefinition"})
    @Expose
	@Nullable
    public AttributeDefinition targetAttributeDefinition;


    /**
     * Instiaciates a new SynchronizationSchemaParseExpressionParameterSet
     */
    public SynchronizationSchemaParseExpressionParameterSet() {}
    /**
     * Instiaciates a new SynchronizationSchemaParseExpressionParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected SynchronizationSchemaParseExpressionParameterSet(@Nonnull final SynchronizationSchemaParseExpressionParameterSetBuilder builder) {
        this.expression = builder.expression;
        this.testInputObject = builder.testInputObject;
        this.targetAttributeDefinition = builder.targetAttributeDefinition;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static SynchronizationSchemaParseExpressionParameterSetBuilder newBuilder() {
        return new SynchronizationSchemaParseExpressionParameterSetBuilder();
    }
    /**
     * Fluent builder for the SynchronizationSchemaParseExpressionParameterSet
     */
    public static final class SynchronizationSchemaParseExpressionParameterSetBuilder {
        /**
         * The expression parameter value
         */
        @Nullable
        protected String expression;
        /**
         * Sets the Expression
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SynchronizationSchemaParseExpressionParameterSetBuilder withExpression(@Nullable final String val) {
            this.expression = val;
            return this;
        }
        /**
         * The testInputObject parameter value
         */
        @Nullable
        protected ExpressionInputObject testInputObject;
        /**
         * Sets the TestInputObject
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SynchronizationSchemaParseExpressionParameterSetBuilder withTestInputObject(@Nullable final ExpressionInputObject val) {
            this.testInputObject = val;
            return this;
        }
        /**
         * The targetAttributeDefinition parameter value
         */
        @Nullable
        protected AttributeDefinition targetAttributeDefinition;
        /**
         * Sets the TargetAttributeDefinition
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SynchronizationSchemaParseExpressionParameterSetBuilder withTargetAttributeDefinition(@Nullable final AttributeDefinition val) {
            this.targetAttributeDefinition = val;
            return this;
        }
        /**
         * Instanciates a new SynchronizationSchemaParseExpressionParameterSetBuilder
         */
        @Nullable
        protected SynchronizationSchemaParseExpressionParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public SynchronizationSchemaParseExpressionParameterSet build() {
            return new SynchronizationSchemaParseExpressionParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.expression != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("expression", expression));
        }
        if(this.testInputObject != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("testInputObject", testInputObject));
        }
        if(this.targetAttributeDefinition != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("targetAttributeDefinition", targetAttributeDefinition));
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