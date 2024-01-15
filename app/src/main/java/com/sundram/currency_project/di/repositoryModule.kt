package com.sundram.currency_project.di

import com.sundram.currency_project.domain.CurrencyRepository
import com.sundram.currency_project.domain.SpellCheckerRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        CurrencyRepository(get())
    }
    single {
        SpellCheckerRepository(get())
    }
}