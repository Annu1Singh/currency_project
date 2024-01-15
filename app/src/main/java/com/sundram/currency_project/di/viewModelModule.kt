package com.sundram.currency_project.di

import com.sundram.currency_project.ui.currency.viewmodel.CurrencyViewModel
import com.sundram.currency_project.ui.spellchecker.viewmodel.SpellCheckerViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        CurrencyViewModel(get())
    }
    viewModel {
        SpellCheckerViewModel(get())
    }

}