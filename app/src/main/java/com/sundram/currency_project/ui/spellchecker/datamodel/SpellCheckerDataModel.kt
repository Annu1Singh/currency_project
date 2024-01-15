package com.sundram.currency_project.ui.spellchecker.datamodel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SpellCheckerDataModel(
    @SerializedName("corrections")
    @Expose
    var corrections:ArrayList<Correction>,
    @SerializedName("original_text")
    @Expose
    var originalText:String
)

data class Correction(
    @SerializedName("best_candidate")
    @Expose
    var bestCandidate:String,

    @SerializedName("candidates")
    @Expose
    var candidates:ArrayList<String>,
    @SerializedName("text")
    @Expose
    var textStr:String,
)
