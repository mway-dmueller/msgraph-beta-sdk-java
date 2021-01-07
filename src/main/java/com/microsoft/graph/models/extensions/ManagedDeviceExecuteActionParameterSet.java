// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.generated.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.extensions.BulkManagedDeviceActionResult;
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
 * The class for the Managed Device Execute Action Parameter Set.
 */
public class ManagedDeviceExecuteActionParameterSet {
    /**
     * The action Name.
     * 
     */
    @SerializedName(value = "actionName", alternate = {"ActionName"})
    @Expose
	@Nullable
    public ManagedDeviceRemoteAction actionName;

    /**
     * The keep Enrollment Data.
     * 
     */
    @SerializedName(value = "keepEnrollmentData", alternate = {"KeepEnrollmentData"})
    @Expose
	@Nullable
    public Boolean keepEnrollmentData;

    /**
     * The keep User Data.
     * 
     */
    @SerializedName(value = "keepUserData", alternate = {"KeepUserData"})
    @Expose
	@Nullable
    public Boolean keepUserData;

    /**
     * The device Ids.
     * 
     */
    @SerializedName(value = "deviceIds", alternate = {"DeviceIds"})
    @Expose
	@Nullable
    public java.util.List<String> deviceIds;

    /**
     * The notification Title.
     * 
     */
    @SerializedName(value = "notificationTitle", alternate = {"NotificationTitle"})
    @Expose
	@Nullable
    public String notificationTitle;

    /**
     * The notification Body.
     * 
     */
    @SerializedName(value = "notificationBody", alternate = {"NotificationBody"})
    @Expose
	@Nullable
    public String notificationBody;

    /**
     * The device Name.
     * 
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;


    /**
     * Instiaciates a new ManagedDeviceExecuteActionParameterSet
     */
    public ManagedDeviceExecuteActionParameterSet() {}
    /**
     * Instiaciates a new ManagedDeviceExecuteActionParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagedDeviceExecuteActionParameterSet(@Nonnull final ManagedDeviceExecuteActionParameterSetBuilder builder) {
        this.actionName = builder.actionName;
        this.keepEnrollmentData = builder.keepEnrollmentData;
        this.keepUserData = builder.keepUserData;
        this.deviceIds = builder.deviceIds;
        this.notificationTitle = builder.notificationTitle;
        this.notificationBody = builder.notificationBody;
        this.deviceName = builder.deviceName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagedDeviceExecuteActionParameterSetBuilder newBuilder() {
        return new ManagedDeviceExecuteActionParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagedDeviceExecuteActionParameterSet
     */
    public static final class ManagedDeviceExecuteActionParameterSetBuilder {
        /**
         * The actionName parameter value
         */
        @Nullable
        protected ManagedDeviceRemoteAction actionName;
        /**
         * Sets the ActionName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceExecuteActionParameterSetBuilder withActionName(@Nullable final ManagedDeviceRemoteAction val) {
            this.actionName = val;
            return this;
        }
        /**
         * The keepEnrollmentData parameter value
         */
        @Nullable
        protected Boolean keepEnrollmentData;
        /**
         * Sets the KeepEnrollmentData
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceExecuteActionParameterSetBuilder withKeepEnrollmentData(@Nullable final Boolean val) {
            this.keepEnrollmentData = val;
            return this;
        }
        /**
         * The keepUserData parameter value
         */
        @Nullable
        protected Boolean keepUserData;
        /**
         * Sets the KeepUserData
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceExecuteActionParameterSetBuilder withKeepUserData(@Nullable final Boolean val) {
            this.keepUserData = val;
            return this;
        }
        /**
         * The deviceIds parameter value
         */
        @Nullable
        protected java.util.List<String> deviceIds;
        /**
         * Sets the DeviceIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceExecuteActionParameterSetBuilder withDeviceIds(@Nullable final java.util.List<String> val) {
            this.deviceIds = val;
            return this;
        }
        /**
         * The notificationTitle parameter value
         */
        @Nullable
        protected String notificationTitle;
        /**
         * Sets the NotificationTitle
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceExecuteActionParameterSetBuilder withNotificationTitle(@Nullable final String val) {
            this.notificationTitle = val;
            return this;
        }
        /**
         * The notificationBody parameter value
         */
        @Nullable
        protected String notificationBody;
        /**
         * Sets the NotificationBody
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceExecuteActionParameterSetBuilder withNotificationBody(@Nullable final String val) {
            this.notificationBody = val;
            return this;
        }
        /**
         * The deviceName parameter value
         */
        @Nullable
        protected String deviceName;
        /**
         * Sets the DeviceName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagedDeviceExecuteActionParameterSetBuilder withDeviceName(@Nullable final String val) {
            this.deviceName = val;
            return this;
        }
        /**
         * Instanciates a new ManagedDeviceExecuteActionParameterSetBuilder
         */
        @Nullable
        protected ManagedDeviceExecuteActionParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagedDeviceExecuteActionParameterSet build() {
            return new ManagedDeviceExecuteActionParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.actionName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("actionName", actionName));
        }
        if(this.keepEnrollmentData != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("keepEnrollmentData", keepEnrollmentData));
        }
        if(this.keepUserData != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("keepUserData", keepUserData));
        }
        if(this.deviceIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceIds", deviceIds));
        }
        if(this.notificationTitle != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("notificationTitle", notificationTitle));
        }
        if(this.notificationBody != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("notificationBody", notificationBody));
        }
        if(this.deviceName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceName", deviceName));
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