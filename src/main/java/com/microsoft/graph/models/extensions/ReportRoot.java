// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ApplicationSignInDetailedSummary;
import com.microsoft.graph.models.extensions.AuthenticationMethodsRoot;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationDetails;
import com.microsoft.graph.models.extensions.UserCredentialUsageDetails;
import com.microsoft.graph.models.extensions.PrintUsageByPrinter;
import com.microsoft.graph.models.extensions.PrintUsageByUser;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ApplicationSignInDetailedSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.UserCredentialUsageDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.PrintUsageByPrinterCollectionPage;
import com.microsoft.graph.requests.extensions.PrintUsageByUserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root.
 */
public class ReportRoot extends Entity implements IJsonBackedObject {


    /**
     * The Application Sign In Detailed Summary.
     * 
     */
    @SerializedName(value = "applicationSignInDetailedSummary", alternate = {"ApplicationSignInDetailedSummary"})
    @Expose
    public ApplicationSignInDetailedSummaryCollectionPage applicationSignInDetailedSummary;

    /**
     * The Authentication Methods.
     * 
     */
    @SerializedName(value = "authenticationMethods", alternate = {"AuthenticationMethods"})
    @Expose
    public AuthenticationMethodsRoot authenticationMethods;

    /**
     * The Credential User Registration Details.
     * 
     */
    @SerializedName(value = "credentialUserRegistrationDetails", alternate = {"CredentialUserRegistrationDetails"})
    @Expose
    public CredentialUserRegistrationDetailsCollectionPage credentialUserRegistrationDetails;

    /**
     * The User Credential Usage Details.
     * 
     */
    @SerializedName(value = "userCredentialUsageDetails", alternate = {"UserCredentialUsageDetails"})
    @Expose
    public UserCredentialUsageDetailsCollectionPage userCredentialUsageDetails;

    /**
     * The Daily Print Usage By Printer.
     * 
     */
    @SerializedName(value = "dailyPrintUsageByPrinter", alternate = {"DailyPrintUsageByPrinter"})
    @Expose
    public PrintUsageByPrinterCollectionPage dailyPrintUsageByPrinter;

    /**
     * The Daily Print Usage By User.
     * 
     */
    @SerializedName(value = "dailyPrintUsageByUser", alternate = {"DailyPrintUsageByUser"})
    @Expose
    public PrintUsageByUserCollectionPage dailyPrintUsageByUser;

    /**
     * The Daily Print Usage Summaries By Printer.
     * 
     */
    @SerializedName(value = "dailyPrintUsageSummariesByPrinter", alternate = {"DailyPrintUsageSummariesByPrinter"})
    @Expose
    public PrintUsageByPrinterCollectionPage dailyPrintUsageSummariesByPrinter;

    /**
     * The Daily Print Usage Summaries By User.
     * 
     */
    @SerializedName(value = "dailyPrintUsageSummariesByUser", alternate = {"DailyPrintUsageSummariesByUser"})
    @Expose
    public PrintUsageByUserCollectionPage dailyPrintUsageSummariesByUser;

    /**
     * The Monthly Print Usage By Printer.
     * 
     */
    @SerializedName(value = "monthlyPrintUsageByPrinter", alternate = {"MonthlyPrintUsageByPrinter"})
    @Expose
    public PrintUsageByPrinterCollectionPage monthlyPrintUsageByPrinter;

    /**
     * The Monthly Print Usage By User.
     * 
     */
    @SerializedName(value = "monthlyPrintUsageByUser", alternate = {"MonthlyPrintUsageByUser"})
    @Expose
    public PrintUsageByUserCollectionPage monthlyPrintUsageByUser;

    /**
     * The Monthly Print Usage Summaries By Printer.
     * 
     */
    @SerializedName(value = "monthlyPrintUsageSummariesByPrinter", alternate = {"MonthlyPrintUsageSummariesByPrinter"})
    @Expose
    public PrintUsageByPrinterCollectionPage monthlyPrintUsageSummariesByPrinter;

    /**
     * The Monthly Print Usage Summaries By User.
     * 
     */
    @SerializedName(value = "monthlyPrintUsageSummariesByUser", alternate = {"MonthlyPrintUsageSummariesByUser"})
    @Expose
    public PrintUsageByUserCollectionPage monthlyPrintUsageSummariesByUser;


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


        if (json.has("applicationSignInDetailedSummary")) {
            applicationSignInDetailedSummary = serializer.deserializeObject(json.get("applicationSignInDetailedSummary").toString(), ApplicationSignInDetailedSummaryCollectionPage.class);
        }

        if (json.has("credentialUserRegistrationDetails")) {
            credentialUserRegistrationDetails = serializer.deserializeObject(json.get("credentialUserRegistrationDetails").toString(), CredentialUserRegistrationDetailsCollectionPage.class);
        }

        if (json.has("userCredentialUsageDetails")) {
            userCredentialUsageDetails = serializer.deserializeObject(json.get("userCredentialUsageDetails").toString(), UserCredentialUsageDetailsCollectionPage.class);
        }

        if (json.has("dailyPrintUsageByPrinter")) {
            dailyPrintUsageByPrinter = serializer.deserializeObject(json.get("dailyPrintUsageByPrinter").toString(), PrintUsageByPrinterCollectionPage.class);
        }

        if (json.has("dailyPrintUsageByUser")) {
            dailyPrintUsageByUser = serializer.deserializeObject(json.get("dailyPrintUsageByUser").toString(), PrintUsageByUserCollectionPage.class);
        }

        if (json.has("dailyPrintUsageSummariesByPrinter")) {
            dailyPrintUsageSummariesByPrinter = serializer.deserializeObject(json.get("dailyPrintUsageSummariesByPrinter").toString(), PrintUsageByPrinterCollectionPage.class);
        }

        if (json.has("dailyPrintUsageSummariesByUser")) {
            dailyPrintUsageSummariesByUser = serializer.deserializeObject(json.get("dailyPrintUsageSummariesByUser").toString(), PrintUsageByUserCollectionPage.class);
        }

        if (json.has("monthlyPrintUsageByPrinter")) {
            monthlyPrintUsageByPrinter = serializer.deserializeObject(json.get("monthlyPrintUsageByPrinter").toString(), PrintUsageByPrinterCollectionPage.class);
        }

        if (json.has("monthlyPrintUsageByUser")) {
            monthlyPrintUsageByUser = serializer.deserializeObject(json.get("monthlyPrintUsageByUser").toString(), PrintUsageByUserCollectionPage.class);
        }

        if (json.has("monthlyPrintUsageSummariesByPrinter")) {
            monthlyPrintUsageSummariesByPrinter = serializer.deserializeObject(json.get("monthlyPrintUsageSummariesByPrinter").toString(), PrintUsageByPrinterCollectionPage.class);
        }

        if (json.has("monthlyPrintUsageSummariesByUser")) {
            monthlyPrintUsageSummariesByUser = serializer.deserializeObject(json.get("monthlyPrintUsageSummariesByUser").toString(), PrintUsageByUserCollectionPage.class);
        }
    }
}
