// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;
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
 * The class for the Imported Windows Autopilot Device Identity Import Parameter Set.
 */
public class ImportedWindowsAutopilotDeviceIdentityImportParameterSet {
    /**
     * The imported Windows Autopilot Device Identities.
     * 
     */
    @SerializedName(value = "importedWindowsAutopilotDeviceIdentities", alternate = {"ImportedWindowsAutopilotDeviceIdentities"})
    @Expose
	@Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities;


    /**
     * Instiaciates a new ImportedWindowsAutopilotDeviceIdentityImportParameterSet
     */
    public ImportedWindowsAutopilotDeviceIdentityImportParameterSet() {}
    /**
     * Instiaciates a new ImportedWindowsAutopilotDeviceIdentityImportParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ImportedWindowsAutopilotDeviceIdentityImportParameterSet(@Nonnull final ImportedWindowsAutopilotDeviceIdentityImportParameterSetBuilder builder) {
        this.importedWindowsAutopilotDeviceIdentities = builder.importedWindowsAutopilotDeviceIdentities;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ImportedWindowsAutopilotDeviceIdentityImportParameterSetBuilder newBuilder() {
        return new ImportedWindowsAutopilotDeviceIdentityImportParameterSetBuilder();
    }
    /**
     * Fluent builder for the ImportedWindowsAutopilotDeviceIdentityImportParameterSet
     */
    public static final class ImportedWindowsAutopilotDeviceIdentityImportParameterSetBuilder {
        /**
         * The importedWindowsAutopilotDeviceIdentities parameter value
         */
        @Nullable
        protected java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities;
        /**
         * Sets the ImportedWindowsAutopilotDeviceIdentities
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ImportedWindowsAutopilotDeviceIdentityImportParameterSetBuilder withImportedWindowsAutopilotDeviceIdentities(@Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> val) {
            this.importedWindowsAutopilotDeviceIdentities = val;
            return this;
        }
        /**
         * Instanciates a new ImportedWindowsAutopilotDeviceIdentityImportParameterSetBuilder
         */
        @Nullable
        protected ImportedWindowsAutopilotDeviceIdentityImportParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ImportedWindowsAutopilotDeviceIdentityImportParameterSet build() {
            return new ImportedWindowsAutopilotDeviceIdentityImportParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.importedWindowsAutopilotDeviceIdentities != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("importedWindowsAutopilotDeviceIdentities", importedWindowsAutopilotDeviceIdentities));
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