// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ProxiedDomain;
import com.microsoft.graph.models.extensions.IpRange;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Network Isolation Policy.
 */
public class WindowsNetworkIsolationPolicy implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Enterprise Cloud Resources.
     * Contains a list of enterprise resource domains hosted in the cloud that need to be protected. Connections to these resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this purpose must also be configured using the EnterpriseInternalProxyServers policy. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("enterpriseCloudResources")
    @Expose
    public java.util.List<ProxiedDomain> enterpriseCloudResources;

    /**
     * The Enterprise Internal Proxy Servers.
     * This is the comma-separated list of internal proxy servers. For example, "157.54.14.28, 157.54.11.118, 10.202.14.167, 157.53.14.163, 157.69.210.59". These proxies have been configured by the admin to connect to specific resources on the Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the EnterpriseCloudResources policy to force traffic to the matched cloud resources through these proxies.
     */
    @SerializedName("enterpriseInternalProxyServers")
    @Expose
    public java.util.List<String> enterpriseInternalProxyServers;

    /**
     * The Enterprise IPRanges.
     * Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers will be considered part of the enterprise and protected. These locations will be considered a safe destination for enterprise data to be shared to. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("enterpriseIPRanges")
    @Expose
    public java.util.List<IpRange> enterpriseIPRanges;

    /**
     * The Enterprise IPRanges Are Authoritative.
     * Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other subnets. Default is false.
     */
    @SerializedName("enterpriseIPRangesAreAuthoritative")
    @Expose
    public Boolean enterpriseIPRangesAreAuthoritative;

    /**
     * The Enterprise Network Domain Names.
     * This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent to a device will be considered enterprise data and protected. These locations will be considered a safe destination for enterprise data to be shared to.
     */
    @SerializedName("enterpriseNetworkDomainNames")
    @Expose
    public java.util.List<String> enterpriseNetworkDomainNames;

    /**
     * The Enterprise Proxy Servers.
     * This is a list of proxy servers. Any server not on this list is considered non-enterprise.
     */
    @SerializedName("enterpriseProxyServers")
    @Expose
    public java.util.List<String> enterpriseProxyServers;

    /**
     * The Enterprise Proxy Servers Are Authoritative.
     * Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies. Default is false
     */
    @SerializedName("enterpriseProxyServersAreAuthoritative")
    @Expose
    public Boolean enterpriseProxyServersAreAuthoritative;

    /**
     * The Neutral Domain Resources.
     * List of domain names that can used for work or personal resource.
     */
    @SerializedName("neutralDomainResources")
    @Expose
    public java.util.List<String> neutralDomainResources;


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
