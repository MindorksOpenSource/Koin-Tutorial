package com.mindorks.framework.mvvm

import android.app.Application
import com.mindorks.framework.mvvm.di.module.appModule
import com.mindorks.framework.mvvm.di.module.repoModule
import com.mindorks.framework.mvvm.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}
