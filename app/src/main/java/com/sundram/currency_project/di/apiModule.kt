package com.sundram.currency_project.di

import com.sundram.currency_project.domain.ApiInterface
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {

    single {
        get<Retrofit>().create(ApiInterface::class.java)
    }
}