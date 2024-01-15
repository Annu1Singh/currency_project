package com.sundram.currency_project.domain

import com.sundram.currency_project.ui.currency.datamodel.ConvertCurrencyDataModel
import com.sundram.currency_project.ui.currency.datamodel.CurrencySymbolDataModel

class CurrencyRepository(private val apiService: ApiInterface) {
    suspend fun getCurrencySymbol(): CurrencySymbolDataModel {
        return apiService.getCurrencySymbol()
    }

    suspend fun onConvertCurrency(to:String, from:String, amount:String): ConvertCurrencyDataModel {
        return apiService.onConvertCurrency(to,from,amount)
    }
}
