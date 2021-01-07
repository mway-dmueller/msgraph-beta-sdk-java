// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.EvaluateSensitivityLabelsRequest;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesRequest;
import com.microsoft.graph.models.extensions.TextClassificationRequest;
import com.microsoft.graph.models.extensions.EvaluateLabelsAndPoliciesJobResponse;
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
 * The class for the Information Protection Evaluate Labels And Policies Parameter Set.
 */
public class InformationProtectionEvaluateLabelsAndPoliciesParameterSet {
    /**
     * The evaluate Sensitivity Labels.
     * 
     */
    @SerializedName(value = "evaluateSensitivityLabels", alternate = {"EvaluateSensitivityLabels"})
    @Expose
	@Nullable
    public EvaluateSensitivityLabelsRequest evaluateSensitivityLabels;

    /**
     * The evaluate Data Loss Prevention Policies.
     * 
     */
    @SerializedName(value = "evaluateDataLossPreventionPolicies", alternate = {"EvaluateDataLossPreventionPolicies"})
    @Expose
	@Nullable
    public DlpEvaluatePoliciesRequest evaluateDataLossPreventionPolicies;

    /**
     * The classify Text.
     * 
     */
    @SerializedName(value = "classifyText", alternate = {"ClassifyText"})
    @Expose
	@Nullable
    public TextClassificationRequest classifyText;


    /**
     * Instiaciates a new InformationProtectionEvaluateLabelsAndPoliciesParameterSet
     */
    public InformationProtectionEvaluateLabelsAndPoliciesParameterSet() {}
    /**
     * Instiaciates a new InformationProtectionEvaluateLabelsAndPoliciesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected InformationProtectionEvaluateLabelsAndPoliciesParameterSet(@Nonnull final InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder builder) {
        this.evaluateSensitivityLabels = builder.evaluateSensitivityLabels;
        this.evaluateDataLossPreventionPolicies = builder.evaluateDataLossPreventionPolicies;
        this.classifyText = builder.classifyText;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder newBuilder() {
        return new InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder();
    }
    /**
     * Fluent builder for the InformationProtectionEvaluateLabelsAndPoliciesParameterSet
     */
    public static final class InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder {
        /**
         * The evaluateSensitivityLabels parameter value
         */
        @Nullable
        protected EvaluateSensitivityLabelsRequest evaluateSensitivityLabels;
        /**
         * Sets the EvaluateSensitivityLabels
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder withEvaluateSensitivityLabels(@Nullable final EvaluateSensitivityLabelsRequest val) {
            this.evaluateSensitivityLabels = val;
            return this;
        }
        /**
         * The evaluateDataLossPreventionPolicies parameter value
         */
        @Nullable
        protected DlpEvaluatePoliciesRequest evaluateDataLossPreventionPolicies;
        /**
         * Sets the EvaluateDataLossPreventionPolicies
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder withEvaluateDataLossPreventionPolicies(@Nullable final DlpEvaluatePoliciesRequest val) {
            this.evaluateDataLossPreventionPolicies = val;
            return this;
        }
        /**
         * The classifyText parameter value
         */
        @Nullable
        protected TextClassificationRequest classifyText;
        /**
         * Sets the ClassifyText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder withClassifyText(@Nullable final TextClassificationRequest val) {
            this.classifyText = val;
            return this;
        }
        /**
         * Instanciates a new InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder
         */
        @Nullable
        protected InformationProtectionEvaluateLabelsAndPoliciesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public InformationProtectionEvaluateLabelsAndPoliciesParameterSet build() {
            return new InformationProtectionEvaluateLabelsAndPoliciesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.evaluateSensitivityLabels != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("evaluateSensitivityLabels", evaluateSensitivityLabels));
        }
        if(this.evaluateDataLossPreventionPolicies != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("evaluateDataLossPreventionPolicies", evaluateDataLossPreventionPolicies));
        }
        if(this.classifyText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("classifyText", classifyText));
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