package com.sundram.currency_project.domain

import androidx.lifecycle.ViewModel
import com.sundram.currency_project.ui.spellchecker.datamodel.SpellCheckerDataModel

class SpellCheckerRepository(private val apiInterface: ApiInterface){

    suspend fun onSpellCheck(q:String): SpellCheckerDataModel {
        return apiInterface.onSpellChecker(q)
    }

}