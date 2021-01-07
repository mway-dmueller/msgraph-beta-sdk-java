// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.DlpEvaluationInput;
import com.microsoft.graph.models.extensions.DlpNotification;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesJobResponse;
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
 * The class for the Data Loss Prevention Policy Evaluate Parameter Set.
 */
public class DataLossPreventionPolicyEvaluateParameterSet {
    /**
     * The target.
     * 
     */
    @SerializedName(value = "target", alternate = {"Target"})
    @Expose
	@Nullable
    public String target;

    /**
     * The evaluation Input.
     * 
     */
    @SerializedName(value = "evaluationInput", alternate = {"EvaluationInput"})
    @Expose
	@Nullable
    public DlpEvaluationInput evaluationInput;

    /**
     * The notification Info.
     * 
     */
    @SerializedName(value = "notificationInfo", alternate = {"NotificationInfo"})
    @Expose
	@Nullable
    public DlpNotification notificationInfo;


    /**
     * Instiaciates a new DataLossPreventionPolicyEvaluateParameterSet
     */
    public DataLossPreventionPolicyEvaluateParameterSet() {}
    /**
     * Instiaciates a new DataLossPreventionPolicyEvaluateParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DataLossPreventionPolicyEvaluateParameterSet(@Nonnull final DataLossPreventionPolicyEvaluateParameterSetBuilder builder) {
        this.target = builder.target;
        this.evaluationInput = builder.evaluationInput;
        this.notificationInfo = builder.notificationInfo;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DataLossPreventionPolicyEvaluateParameterSetBuilder newBuilder() {
        return new DataLossPreventionPolicyEvaluateParameterSetBuilder();
    }
    /**
     * Fluent builder for the DataLossPreventionPolicyEvaluateParameterSet
     */
    public static final class DataLossPreventionPolicyEvaluateParameterSetBuilder {
        /**
         * The target parameter value
         */
        @Nullable
        protected String target;
        /**
         * Sets the Target
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DataLossPreventionPolicyEvaluateParameterSetBuilder withTarget(@Nullable final String val) {
            this.target = val;
            return this;
        }
        /**
         * The evaluationInput parameter value
         */
        @Nullable
        protected DlpEvaluationInput evaluationInput;
        /**
         * Sets the EvaluationInput
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DataLossPreventionPolicyEvaluateParameterSetBuilder withEvaluationInput(@Nullable final DlpEvaluationInput val) {
            this.evaluationInput = val;
            return this;
        }
        /**
         * The notificationInfo parameter value
         */
        @Nullable
        protected DlpNotification notificationInfo;
        /**
         * Sets the NotificationInfo
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DataLossPreventionPolicyEvaluateParameterSetBuilder withNotificationInfo(@Nullable final DlpNotification val) {
            this.notificationInfo = val;
            return this;
        }
        /**
         * Instanciates a new DataLossPreventionPolicyEvaluateParameterSetBuilder
         */
        @Nullable
        protected DataLossPreventionPolicyEvaluateParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DataLossPreventionPolicyEvaluateParameterSet build() {
            return new DataLossPreventionPolicyEvaluateParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.target != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("target", target));
        }
        if(this.evaluationInput != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("evaluationInput", evaluationInput));
        }
        if(this.notificationInfo != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("notificationInfo", notificationInfo));
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