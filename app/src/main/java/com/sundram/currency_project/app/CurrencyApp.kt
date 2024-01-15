package com.sundram.currency_project.app

import android.app.Application
import com.sundram.currency_project.di.apiModule
import com.sundram.currency_project.di.netWorkModule
import com.sundram.currency_project.di.repositoryModule
import com.sundram.currency_project.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CurrencyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        init(this)
        startKoin {
            androidContext(this@CurrencyApp)
            modules(
                listOf(
                    apiModule, netWorkModule, viewModelModule, repositoryModule
                )
            )
        }
    }

    companion object {
        lateinit var application: Application
        fun init(app: Application) {
            application = app
        }
    }
}