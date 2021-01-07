// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.PasswordResetResponse;
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
 * The class for the Authentication Method Reset Password Parameter Set.
 */
public class AuthenticationMethodResetPasswordParameterSet {
    /**
     * The new Password.
     * 
     */
    @SerializedName(value = "newPassword", alternate = {"NewPassword"})
    @Expose
	@Nullable
    public String newPassword;

    /**
     * The require Change On Next Sign In.
     * 
     */
    @SerializedName(value = "requireChangeOnNextSignIn", alternate = {"RequireChangeOnNextSignIn"})
    @Expose
	@Nullable
    public Boolean requireChangeOnNextSignIn;


    /**
     * Instiaciates a new AuthenticationMethodResetPasswordParameterSet
     */
    public AuthenticationMethodResetPasswordParameterSet() {}
    /**
     * Instiaciates a new AuthenticationMethodResetPasswordParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected AuthenticationMethodResetPasswordParameterSet(@Nonnull final AuthenticationMethodResetPasswordParameterSetBuilder builder) {
        this.newPassword = builder.newPassword;
        this.requireChangeOnNextSignIn = builder.requireChangeOnNextSignIn;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static AuthenticationMethodResetPasswordParameterSetBuilder newBuilder() {
        return new AuthenticationMethodResetPasswordParameterSetBuilder();
    }
    /**
     * Fluent builder for the AuthenticationMethodResetPasswordParameterSet
     */
    public static final class AuthenticationMethodResetPasswordParameterSetBuilder {
        /**
         * The newPassword parameter value
         */
        @Nullable
        protected String newPassword;
        /**
         * Sets the NewPassword
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AuthenticationMethodResetPasswordParameterSetBuilder withNewPassword(@Nullable final String val) {
            this.newPassword = val;
            return this;
        }
        /**
         * The requireChangeOnNextSignIn parameter value
         */
        @Nullable
        protected Boolean requireChangeOnNextSignIn;
        /**
         * Sets the RequireChangeOnNextSignIn
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AuthenticationMethodResetPasswordParameterSetBuilder withRequireChangeOnNextSignIn(@Nullable final Boolean val) {
            this.requireChangeOnNextSignIn = val;
            return this;
        }
        /**
         * Instanciates a new AuthenticationMethodResetPasswordParameterSetBuilder
         */
        @Nullable
        protected AuthenticationMethodResetPasswordParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public AuthenticationMethodResetPasswordParameterSet build() {
            return new AuthenticationMethodResetPasswordParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.newPassword != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("newPassword", newPassword));
        }
        if(this.requireChangeOnNextSignIn != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("requireChangeOnNextSignIn", requireChangeOnNextSignIn));
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