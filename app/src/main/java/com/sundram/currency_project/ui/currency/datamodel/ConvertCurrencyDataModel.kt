package com.sundram.currency_project.ui.currency.datamodel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ConvertCurrencyDataModel(
    @SerializedName("date")
    @Expose
    var date: String,
    @SerializedName("result")
    @Expose
    var result: String,
    @SerializedName("success")
    @Expose
    var success: Boolean,

    @SerializedName("query")
    @Expose
    var query: Query,

    @SerializedName("info")
    @Expose
    var info: Info,

    @SerializedName("error")
    @Expose
    var error: Error
)

data class Query(
    @SerializedName("amount")
    @Expose
    var amount: String,
    @SerializedName("from")
    @Expose
    var from: String,
    @SerializedName("to")
    @Expose
    var to: String,
)

data class Info(
    @SerializedName("rate")
    @Expose
    var rate: String,
    @SerializedName("timestamp")
    @Expose
    var timestamp: String
)

data class Error(
    @SerializedName("code")
    var code:String,
    @SerializedName("type")
    var type:String,
    @SerializedName("info")
    var info:String,
)