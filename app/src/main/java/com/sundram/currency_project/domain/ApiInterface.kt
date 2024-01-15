package com.sundram.currency_project.domain

import com.sundram.currency_project.ui.currency.datamodel.ConvertCurrencyDataModel
import com.sundram.currency_project.ui.currency.datamodel.CurrencySymbolDataModel
import com.sundram.currency_project.ui.spellchecker.datamodel.SpellCheckerDataModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("fixer/symbols")
    suspend fun getCurrencySymbol(): CurrencySymbolDataModel

    @GET("fixer/convert")
    suspend fun onConvertCurrency(@Query("to") to:String, @Query("from") from:String, @Query("amount") amount:String): ConvertCurrencyDataModel

    @GET("spell/spellchecker")
    suspend fun onSpellChecker(@Query("q") query:String): SpellCheckerDataModel
}