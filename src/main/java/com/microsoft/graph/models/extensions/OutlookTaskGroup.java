// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.OutlookTaskFolder;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Task Group.
 */
public class OutlookTaskGroup extends Entity implements IJsonBackedObject {


    /**
     * The Change Key.
     * The version of the task group.
     */
    @SerializedName(value = "changeKey", alternate = {"ChangeKey"})
    @Expose
    public String changeKey;

    /**
     * The Group Key.
     * The unique GUID identifier for the task group.
     */
    @SerializedName(value = "groupKey", alternate = {"GroupKey"})
    @Expose
    public java.util.UUID groupKey;

    /**
     * The Is Default Group.
     * True if the task group is the default task group.
     */
    @SerializedName(value = "isDefaultGroup", alternate = {"IsDefaultGroup"})
    @Expose
    public Boolean isDefaultGroup;

    /**
     * The Name.
     * The name of the task group.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Task Folders.
     * The collection of task folders in the task group. Read-only. Nullable.
     */
    @SerializedName(value = "taskFolders", alternate = {"TaskFolders"})
    @Expose
    public OutlookTaskFolderCollectionPage taskFolders;


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


        if (json.has("taskFolders")) {
            taskFolders = serializer.deserializeObject(json.get("taskFolders").toString(), OutlookTaskFolderCollectionPage.class);
        }
    }
}
