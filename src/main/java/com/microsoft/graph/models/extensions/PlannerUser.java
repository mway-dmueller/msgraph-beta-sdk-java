// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PlannerFavoritePlanReferenceCollection;
import com.microsoft.graph.models.extensions.PlannerRecentPlanReferenceCollection;
import com.microsoft.graph.models.extensions.PlannerDelta;
import com.microsoft.graph.models.extensions.PlannerPlan;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.requests.extensions.PlannerDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionPage;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner User.
 */
public class PlannerUser extends PlannerDelta implements IJsonBackedObject {


    /**
     * The Favorite Plan References.
     * A collection containing the references to the plans that the user has marked as favorites.
     */
    @SerializedName(value = "favoritePlanReferences", alternate = {"FavoritePlanReferences"})
    @Expose
    public PlannerFavoritePlanReferenceCollection favoritePlanReferences;

    /**
     * The Recent Plan References.
     * A collection containing references to the plans that were viewed recently by the user in apps that support recent plans.
     */
    @SerializedName(value = "recentPlanReferences", alternate = {"RecentPlanReferences"})
    @Expose
    public PlannerRecentPlanReferenceCollection recentPlanReferences;

    /**
     * The All.
     * 
     */
    @SerializedName(value = "all", alternate = {"All"})
    @Expose
    public PlannerDeltaCollectionPage all;

    /**
     * The Favorite Plans.
     * Read-only. Nullable. Returns the plannerPlans that the user marked as favorites.
     */
    public PlannerPlanCollectionPage favoritePlans;

    /**
     * The Plans.
     * Read-only. Nullable. Returns the plannerTasks assigned to the user.
     */
    @SerializedName(value = "plans", alternate = {"Plans"})
    @Expose
    public PlannerPlanCollectionPage plans;

    /**
     * The Recent Plans.
     * Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans.
     */
    public PlannerPlanCollectionPage recentPlans;

    /**
     * The Roster Plans.
     * Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member.
     */
    public PlannerPlanCollectionPage rosterPlans;

    /**
     * The Tasks.
     * Read-only. Nullable. Returns the plannerTasks assigned to the user.
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
    public PlannerTaskCollectionPage tasks;


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


        if (json.has("all")) {
            all = serializer.deserializeObject(json.get("all").toString(), PlannerDeltaCollectionPage.class);
        }

        if (json.has("favoritePlans")) {
            favoritePlans = serializer.deserializeObject(json.get("favoritePlans").toString(), PlannerPlanCollectionPage.class);
        }

        if (json.has("plans")) {
            plans = serializer.deserializeObject(json.get("plans").toString(), PlannerPlanCollectionPage.class);
        }

        if (json.has("recentPlans")) {
            recentPlans = serializer.deserializeObject(json.get("recentPlans").toString(), PlannerPlanCollectionPage.class);
        }

        if (json.has("rosterPlans")) {
            rosterPlans = serializer.deserializeObject(json.get("rosterPlans").toString(), PlannerPlanCollectionPage.class);
        }

        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks").toString(), PlannerTaskCollectionPage.class);
        }
    }
}
