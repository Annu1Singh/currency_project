package com.sundram.currency_project.ui.currency.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sundram.currency_project.domain.CurrencyRepository
import com.sundram.currency_project.ui.currency.datamodel.ConvertCurrencyDataModel
import com.sundram.currency_project.ui.currency.datamodel.CurrencySymbolDataModel
import kotlinx.coroutines.launch

class CurrencyViewModel(private val myRepository: CurrencyRepository): ViewModel() {

    private val _posts = MutableLiveData<CurrencySymbolDataModel>()
    val posts: LiveData<CurrencySymbolDataModel> get() = _posts

    private val _conversion = MutableLiveData<ConvertCurrencyDataModel>()
    val conversion: LiveData<ConvertCurrencyDataModel> get() = _conversion

    fun getCurrencySymbol() {
        viewModelScope.launch {
            _posts.value = myRepository.getCurrencySymbol()
        }
    }

    fun onConvertCurrency(to:String,from:String,amount:String){
        viewModelScope.launch {
            _conversion.value=myRepository.onConvertCurrency(to,from,amount)
        }
    }
}