// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.models.extensions.MessageRule;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.UserConfiguration;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.MailFolderCollectionPage;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.UserConfigurationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder.
 */
public class MailFolder extends Entity implements IJsonBackedObject {


    /**
     * The Child Folder Count.
     * The number of immediate child mailFolders in the current mailFolder.
     */
    @SerializedName("childFolderCount")
    @Expose
    public Integer childFolderCount;

    /**
     * The Display Name.
     * The mailFolder's display name.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Parent Folder Id.
     * The unique identifier for the mailFolder's parent mailFolder.
     */
    @SerializedName("parentFolderId")
    @Expose
    public String parentFolderId;

    /**
     * The Total Item Count.
     * The number of items in the mailFolder.
     */
    @SerializedName("totalItemCount")
    @Expose
    public Integer totalItemCount;

    /**
     * The Unread Item Count.
     * The number of items in the mailFolder marked as unread.
     */
    @SerializedName("unreadItemCount")
    @Expose
    public Integer unreadItemCount;

    /**
     * The Well Known Name.
     * 
     */
    @SerializedName("wellKnownName")
    @Expose
    public String wellKnownName;

    /**
     * The Child Folders.
     * The collection of child folders in the mailFolder.
     */
    @SerializedName("childFolders")
    @Expose
    public MailFolderCollectionPage childFolders;

    /**
     * The Message Rules.
     * The collection of rules that apply to the user's Inbox folder.
     */
    @SerializedName("messageRules")
    @Expose
    public MessageRuleCollectionPage messageRules;

    /**
     * The Messages.
     * The collection of messages in the mailFolder.
     */
    @SerializedName("messages")
    @Expose
    public MessageCollectionPage messages;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
     */
    @SerializedName("multiValueExtendedProperties")
    @Expose
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
     */
    @SerializedName("singleValueExtendedProperties")
    @Expose
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The User Configurations.
     * 
     */
    @SerializedName("userConfigurations")
    @Expose
    public UserConfigurationCollectionPage userConfigurations;


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


        if (json.has("childFolders")) {
            childFolders = serializer.deserializeObject(json.get("childFolders").toString(), MailFolderCollectionPage.class);
        }

        if (json.has("messageRules")) {
            messageRules = serializer.deserializeObject(json.get("messageRules").toString(), MessageRuleCollectionPage.class);
        }

        if (json.has("messages")) {
            messages = serializer.deserializeObject(json.get("messages").toString(), MessageCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("userConfigurations")) {
            userConfigurations = serializer.deserializeObject(json.get("userConfigurations").toString(), UserConfigurationCollectionPage.class);
        }
    }
}
