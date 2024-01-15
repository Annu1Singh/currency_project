package com.sundram.currency_project.di

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.sundram.currency_project.app.CurrencyApp
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

private const val READ_TIME_OUT = 60L
private const val CONNECTION_TIME_OUT = 60L

val netWorkModule = module {
    single { GsonBuilder().serializeNulls().create() }

    // Provide HttpLoggingInterceptor
    single {
        HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
    }

    // Provide OkHttpClient
    single {
        val cacheDir = File((get<Context>() as CurrencyApp).cacheDir, "http")
        val cache = Cache(cacheDir, 10 * 1024 * 1024)
        OkHttpClient.Builder()
            .cache(cache)
            .addInterceptor(get<HttpLoggingInterceptor>())
            .addInterceptor(Interceptor {
                val original = it.request()
                val builder = it.request().newBuilder().apply {
                    addHeader(
                        "apikey",
                        "F3pmDBLczHUsTjAS8ETFTry0rQd0pLk2"
                    )
                }
                builder.method(original.method, original.body)
                it.proceed(builder.build())
            }).readTimeout(READ_TIME_OUT, TimeUnit.SECONDS)
            .connectTimeout(CONNECTION_TIME_OUT, TimeUnit.SECONDS).build()

    }

    //that is retrofit factory if you need new retrofit object then use the factory
    factory {
        Retrofit.Builder().apply {
            client(get())
            baseUrl("https://api.apilayer.com/")
            addConverterFactory(GsonConverterFactory.create(get()))
        }
    }
    //that will provide retorfit instance
    single<Retrofit> { get<Retrofit.Builder>().build() }
}