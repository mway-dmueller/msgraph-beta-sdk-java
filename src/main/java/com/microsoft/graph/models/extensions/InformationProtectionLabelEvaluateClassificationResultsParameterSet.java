// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.ClassificationResult;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
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
 * The class for the Information Protection Label Evaluate Classification Results Parameter Set.
 */
public class InformationProtectionLabelEvaluateClassificationResultsParameterSet {
    /**
     * The content Info.
     * 
     */
    @SerializedName(value = "contentInfo", alternate = {"ContentInfo"})
    @Expose
	@Nullable
    public ContentInfo contentInfo;

    /**
     * The classification Results.
     * 
     */
    @SerializedName(value = "classificationResults", alternate = {"ClassificationResults"})
    @Expose
	@Nullable
    public java.util.List<ClassificationResult> classificationResults;


    /**
     * Instiaciates a new InformationProtectionLabelEvaluateClassificationResultsParameterSet
     */
    public InformationProtectionLabelEvaluateClassificationResultsParameterSet() {}
    /**
     * Instiaciates a new InformationProtectionLabelEvaluateClassificationResultsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected InformationProtectionLabelEvaluateClassificationResultsParameterSet(@Nonnull final InformationProtectionLabelEvaluateClassificationResultsParameterSetBuilder builder) {
        this.contentInfo = builder.contentInfo;
        this.classificationResults = builder.classificationResults;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static InformationProtectionLabelEvaluateClassificationResultsParameterSetBuilder newBuilder() {
        return new InformationProtectionLabelEvaluateClassificationResultsParameterSetBuilder();
    }
    /**
     * Fluent builder for the InformationProtectionLabelEvaluateClassificationResultsParameterSet
     */
    public static final class InformationProtectionLabelEvaluateClassificationResultsParameterSetBuilder {
        /**
         * The contentInfo parameter value
         */
        @Nullable
        protected ContentInfo contentInfo;
        /**
         * Sets the ContentInfo
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionLabelEvaluateClassificationResultsParameterSetBuilder withContentInfo(@Nullable final ContentInfo val) {
            this.contentInfo = val;
            return this;
        }
        /**
         * The classificationResults parameter value
         */
        @Nullable
        protected java.util.List<ClassificationResult> classificationResults;
        /**
         * Sets the ClassificationResults
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public InformationProtectionLabelEvaluateClassificationResultsParameterSetBuilder withClassificationResults(@Nullable final java.util.List<ClassificationResult> val) {
            this.classificationResults = val;
            return this;
        }
        /**
         * Instanciates a new InformationProtectionLabelEvaluateClassificationResultsParameterSetBuilder
         */
        @Nullable
        protected InformationProtectionLabelEvaluateClassificationResultsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public InformationProtectionLabelEvaluateClassificationResultsParameterSet build() {
            return new InformationProtectionLabelEvaluateClassificationResultsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.contentInfo != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("contentInfo", contentInfo));
        }
        if(this.classificationResults != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("classificationResults", classificationResults));
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