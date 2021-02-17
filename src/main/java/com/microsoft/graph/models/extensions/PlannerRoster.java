// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PlannerRosterMember;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PlannerRosterMemberCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Roster.
 */
public class PlannerRoster extends Entity implements IJsonBackedObject {


    /**
     * The Members.
     * Retrieves the members of the plannerRoster.
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
    public PlannerRosterMemberCollectionPage members;

    /**
     * The Plans.
     * Retrieves the plans contained by the plannerRoster.
     */
    public PlannerPlanCollectionPage plans;


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


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), PlannerRosterMemberCollectionPage.class);
        }

        if (json.has("plans")) {
            plans = serializer.deserializeObject(json.get("plans").toString(), PlannerPlanCollectionPage.class);
        }
    }
}
