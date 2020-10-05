// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.NetworkManagementCondition;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network IPv6Configuration Management Condition.
 */
public class NetworkIPv6ConfigurationManagementCondition extends NetworkManagementCondition implements IJsonBackedObject {


    /**
     * The Dns Suffix List.
     * Valid DNS suffixes for the current network. e.g. seattle.contoso.com
     */
    @SerializedName("dnsSuffixList")
    @Expose
    public java.util.List<String> dnsSuffixList;

    /**
     * The Ip V6DNSServer List.
     * An IPv6 DNS servers configured for the adapter.
     */
    @SerializedName("ipV6DNSServerList")
    @Expose
    public java.util.List<String> ipV6DNSServerList;

    /**
     * The Ip V6Gateway.
     * The IPv6 gateway address to. e.g 2001:db8::1
     */
    @SerializedName("ipV6Gateway")
    @Expose
    public String ipV6Gateway;

    /**
     * The Ip V6Prefix.
     * The IPv6 subnet to be connected to. e.g. 2001:db8::/32
     */
    @SerializedName("ipV6Prefix")
    @Expose
    public String ipV6Prefix;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
