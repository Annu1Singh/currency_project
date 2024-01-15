package com.sundram.currency_project.ui.spellchecker.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sundram.currency_project.domain.SpellCheckerRepository
import com.sundram.currency_project.ui.currency.datamodel.ConvertCurrencyDataModel
import com.sundram.currency_project.ui.currency.datamodel.CurrencySymbolDataModel
import com.sundram.currency_project.ui.spellchecker.datamodel.SpellCheckerDataModel
import kotlinx.coroutines.launch

class SpellCheckerViewModel(private val spellCheckerRepository: SpellCheckerRepository) :
    ViewModel() {
    private val _response = MutableLiveData<SpellCheckerDataModel>()
    val response: LiveData<SpellCheckerDataModel> get() = _response

    fun onSpellCheck(query: String) {
        viewModelScope.launch {
            _response.value = spellCheckerRepository.onSpellCheck(query)
        }
    }
}