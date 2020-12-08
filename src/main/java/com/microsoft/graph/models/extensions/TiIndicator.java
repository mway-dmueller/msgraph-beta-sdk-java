// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.TiAction;
import com.microsoft.graph.models.generated.DiamondModel;
import com.microsoft.graph.models.generated.FileHashType;
import com.microsoft.graph.models.generated.TlpLevel;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator.
 */
public class TiIndicator extends Entity implements IJsonBackedObject {


    /**
     * The Action.
     * 
     */
    @SerializedName(value = "action", alternate = {"Action"})
    @Expose
    public TiAction action;

    /**
     * The Activity Group Names.
     * 
     */
    @SerializedName(value = "activityGroupNames", alternate = {"ActivityGroupNames"})
    @Expose
    public java.util.List<String> activityGroupNames;

    /**
     * The Additional Information.
     * 
     */
    @SerializedName(value = "additionalInformation", alternate = {"AdditionalInformation"})
    @Expose
    public String additionalInformation;

    /**
     * The Azure Tenant Id.
     * 
     */
    @SerializedName(value = "azureTenantId", alternate = {"AzureTenantId"})
    @Expose
    public String azureTenantId;

    /**
     * The Confidence.
     * 
     */
    @SerializedName(value = "confidence", alternate = {"Confidence"})
    @Expose
    public Integer confidence;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Diamond Model.
     * 
     */
    @SerializedName(value = "diamondModel", alternate = {"DiamondModel"})
    @Expose
    public DiamondModel diamondModel;

    /**
     * The Domain Name.
     * 
     */
    @SerializedName(value = "domainName", alternate = {"DomainName"})
    @Expose
    public String domainName;

    /**
     * The Email Encoding.
     * 
     */
    @SerializedName(value = "emailEncoding", alternate = {"EmailEncoding"})
    @Expose
    public String emailEncoding;

    /**
     * The Email Language.
     * 
     */
    @SerializedName(value = "emailLanguage", alternate = {"EmailLanguage"})
    @Expose
    public String emailLanguage;

    /**
     * The Email Recipient.
     * 
     */
    @SerializedName(value = "emailRecipient", alternate = {"EmailRecipient"})
    @Expose
    public String emailRecipient;

    /**
     * The Email Sender Address.
     * 
     */
    @SerializedName(value = "emailSenderAddress", alternate = {"EmailSenderAddress"})
    @Expose
    public String emailSenderAddress;

    /**
     * The Email Sender Name.
     * 
     */
    @SerializedName(value = "emailSenderName", alternate = {"EmailSenderName"})
    @Expose
    public String emailSenderName;

    /**
     * The Email Source Domain.
     * 
     */
    @SerializedName(value = "emailSourceDomain", alternate = {"EmailSourceDomain"})
    @Expose
    public String emailSourceDomain;

    /**
     * The Email Source Ip Address.
     * 
     */
    @SerializedName(value = "emailSourceIpAddress", alternate = {"EmailSourceIpAddress"})
    @Expose
    public String emailSourceIpAddress;

    /**
     * The Email Subject.
     * 
     */
    @SerializedName(value = "emailSubject", alternate = {"EmailSubject"})
    @Expose
    public String emailSubject;

    /**
     * The Email XMailer.
     * 
     */
    @SerializedName(value = "emailXMailer", alternate = {"EmailXMailer"})
    @Expose
    public String emailXMailer;

    /**
     * The Expiration Date Time.
     * 
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The External Id.
     * 
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
    public String externalId;

    /**
     * The File Compile Date Time.
     * 
     */
    @SerializedName(value = "fileCompileDateTime", alternate = {"FileCompileDateTime"})
    @Expose
    public java.util.Calendar fileCompileDateTime;

    /**
     * The File Created Date Time.
     * 
     */
    @SerializedName(value = "fileCreatedDateTime", alternate = {"FileCreatedDateTime"})
    @Expose
    public java.util.Calendar fileCreatedDateTime;

    /**
     * The File Hash Type.
     * 
     */
    @SerializedName(value = "fileHashType", alternate = {"FileHashType"})
    @Expose
    public FileHashType fileHashType;

    /**
     * The File Hash Value.
     * 
     */
    @SerializedName(value = "fileHashValue", alternate = {"FileHashValue"})
    @Expose
    public String fileHashValue;

    /**
     * The File Mutex Name.
     * 
     */
    @SerializedName(value = "fileMutexName", alternate = {"FileMutexName"})
    @Expose
    public String fileMutexName;

    /**
     * The File Name.
     * 
     */
    @SerializedName(value = "fileName", alternate = {"FileName"})
    @Expose
    public String fileName;

    /**
     * The File Packer.
     * 
     */
    @SerializedName(value = "filePacker", alternate = {"FilePacker"})
    @Expose
    public String filePacker;

    /**
     * The File Path.
     * 
     */
    @SerializedName(value = "filePath", alternate = {"FilePath"})
    @Expose
    public String filePath;

    /**
     * The File Size.
     * 
     */
    @SerializedName(value = "fileSize", alternate = {"FileSize"})
    @Expose
    public Long fileSize;

    /**
     * The File Type.
     * 
     */
    @SerializedName(value = "fileType", alternate = {"FileType"})
    @Expose
    public String fileType;

    /**
     * The Ingested Date Time.
     * 
     */
    @SerializedName(value = "ingestedDateTime", alternate = {"IngestedDateTime"})
    @Expose
    public java.util.Calendar ingestedDateTime;

    /**
     * The Is Active.
     * 
     */
    @SerializedName(value = "isActive", alternate = {"IsActive"})
    @Expose
    public Boolean isActive;

    /**
     * The Kill Chain.
     * 
     */
    @SerializedName(value = "killChain", alternate = {"KillChain"})
    @Expose
    public java.util.List<String> killChain;

    /**
     * The Known False Positives.
     * 
     */
    @SerializedName(value = "knownFalsePositives", alternate = {"KnownFalsePositives"})
    @Expose
    public String knownFalsePositives;

    /**
     * The Last Reported Date Time.
     * 
     */
    @SerializedName(value = "lastReportedDateTime", alternate = {"LastReportedDateTime"})
    @Expose
    public java.util.Calendar lastReportedDateTime;

    /**
     * The Malware Family Names.
     * 
     */
    @SerializedName(value = "malwareFamilyNames", alternate = {"MalwareFamilyNames"})
    @Expose
    public java.util.List<String> malwareFamilyNames;

    /**
     * The Network Cidr Block.
     * 
     */
    @SerializedName(value = "networkCidrBlock", alternate = {"NetworkCidrBlock"})
    @Expose
    public String networkCidrBlock;

    /**
     * The Network Destination Asn.
     * 
     */
    @SerializedName(value = "networkDestinationAsn", alternate = {"NetworkDestinationAsn"})
    @Expose
    public Long networkDestinationAsn;

    /**
     * The Network Destination Cidr Block.
     * 
     */
    @SerializedName(value = "networkDestinationCidrBlock", alternate = {"NetworkDestinationCidrBlock"})
    @Expose
    public String networkDestinationCidrBlock;

    /**
     * The Network Destination IPv4.
     * 
     */
    @SerializedName(value = "networkDestinationIPv4", alternate = {"NetworkDestinationIPv4"})
    @Expose
    public String networkDestinationIPv4;

    /**
     * The Network Destination IPv6.
     * 
     */
    @SerializedName(value = "networkDestinationIPv6", alternate = {"NetworkDestinationIPv6"})
    @Expose
    public String networkDestinationIPv6;

    /**
     * The Network Destination Port.
     * 
     */
    @SerializedName(value = "networkDestinationPort", alternate = {"NetworkDestinationPort"})
    @Expose
    public Integer networkDestinationPort;

    /**
     * The Network IPv4.
     * 
     */
    @SerializedName(value = "networkIPv4", alternate = {"NetworkIPv4"})
    @Expose
    public String networkIPv4;

    /**
     * The Network IPv6.
     * 
     */
    @SerializedName(value = "networkIPv6", alternate = {"NetworkIPv6"})
    @Expose
    public String networkIPv6;

    /**
     * The Network Port.
     * 
     */
    @SerializedName(value = "networkPort", alternate = {"NetworkPort"})
    @Expose
    public Integer networkPort;

    /**
     * The Network Protocol.
     * 
     */
    @SerializedName(value = "networkProtocol", alternate = {"NetworkProtocol"})
    @Expose
    public Integer networkProtocol;

    /**
     * The Network Source Asn.
     * 
     */
    @SerializedName(value = "networkSourceAsn", alternate = {"NetworkSourceAsn"})
    @Expose
    public Long networkSourceAsn;

    /**
     * The Network Source Cidr Block.
     * 
     */
    @SerializedName(value = "networkSourceCidrBlock", alternate = {"NetworkSourceCidrBlock"})
    @Expose
    public String networkSourceCidrBlock;

    /**
     * The Network Source IPv4.
     * 
     */
    @SerializedName(value = "networkSourceIPv4", alternate = {"NetworkSourceIPv4"})
    @Expose
    public String networkSourceIPv4;

    /**
     * The Network Source IPv6.
     * 
     */
    @SerializedName(value = "networkSourceIPv6", alternate = {"NetworkSourceIPv6"})
    @Expose
    public String networkSourceIPv6;

    /**
     * The Network Source Port.
     * 
     */
    @SerializedName(value = "networkSourcePort", alternate = {"NetworkSourcePort"})
    @Expose
    public Integer networkSourcePort;

    /**
     * The Passive Only.
     * 
     */
    @SerializedName(value = "passiveOnly", alternate = {"PassiveOnly"})
    @Expose
    public Boolean passiveOnly;

    /**
     * The Severity.
     * 
     */
    @SerializedName(value = "severity", alternate = {"Severity"})
    @Expose
    public Integer severity;

    /**
     * The Tags.
     * 
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
    public java.util.List<String> tags;

    /**
     * The Target Product.
     * 
     */
    @SerializedName(value = "targetProduct", alternate = {"TargetProduct"})
    @Expose
    public String targetProduct;

    /**
     * The Threat Type.
     * 
     */
    @SerializedName(value = "threatType", alternate = {"ThreatType"})
    @Expose
    public String threatType;

    /**
     * The Tlp Level.
     * 
     */
    @SerializedName(value = "tlpLevel", alternate = {"TlpLevel"})
    @Expose
    public TlpLevel tlpLevel;

    /**
     * The Url.
     * 
     */
    @SerializedName(value = "url", alternate = {"Url"})
    @Expose
    public String url;

    /**
     * The User Agent.
     * 
     */
    @SerializedName(value = "userAgent", alternate = {"UserAgent"})
    @Expose
    public String userAgent;


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
