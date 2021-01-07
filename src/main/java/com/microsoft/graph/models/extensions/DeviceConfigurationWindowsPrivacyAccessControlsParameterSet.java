// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
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
 * The class for the Device Configuration Windows Privacy Access Controls Parameter Set.
 */
public class DeviceConfigurationWindowsPrivacyAccessControlsParameterSet {
    /**
     * The windows Privacy Access Controls.
     * 
     */
    @SerializedName(value = "windowsPrivacyAccessControls", alternate = {"WindowsPrivacyAccessControls"})
    @Expose
	@Nullable
    public java.util.List<WindowsPrivacyDataAccessControlItem> windowsPrivacyAccessControls;


    /**
     * Instiaciates a new DeviceConfigurationWindowsPrivacyAccessControlsParameterSet
     */
    public DeviceConfigurationWindowsPrivacyAccessControlsParameterSet() {}
    /**
     * Instiaciates a new DeviceConfigurationWindowsPrivacyAccessControlsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceConfigurationWindowsPrivacyAccessControlsParameterSet(@Nonnull final DeviceConfigurationWindowsPrivacyAccessControlsParameterSetBuilder builder) {
        this.windowsPrivacyAccessControls = builder.windowsPrivacyAccessControls;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceConfigurationWindowsPrivacyAccessControlsParameterSetBuilder newBuilder() {
        return new DeviceConfigurationWindowsPrivacyAccessControlsParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceConfigurationWindowsPrivacyAccessControlsParameterSet
     */
    public static final class DeviceConfigurationWindowsPrivacyAccessControlsParameterSetBuilder {
        /**
         * The windowsPrivacyAccessControls parameter value
         */
        @Nullable
        protected java.util.List<WindowsPrivacyDataAccessControlItem> windowsPrivacyAccessControls;
        /**
         * Sets the WindowsPrivacyAccessControls
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceConfigurationWindowsPrivacyAccessControlsParameterSetBuilder withWindowsPrivacyAccessControls(@Nullable final java.util.List<WindowsPrivacyDataAccessControlItem> val) {
            this.windowsPrivacyAccessControls = val;
            return this;
        }
        /**
         * Instanciates a new DeviceConfigurationWindowsPrivacyAccessControlsParameterSetBuilder
         */
        @Nullable
        protected DeviceConfigurationWindowsPrivacyAccessControlsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceConfigurationWindowsPrivacyAccessControlsParameterSet build() {
            return new DeviceConfigurationWindowsPrivacyAccessControlsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.windowsPrivacyAccessControls != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("windowsPrivacyAccessControls", windowsPrivacyAccessControls));
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