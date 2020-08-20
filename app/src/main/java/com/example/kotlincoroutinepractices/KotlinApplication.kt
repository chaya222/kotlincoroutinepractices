package com.example.kotlincoroutinepractices

import android.app.Application
import timber.log.Timber

class KotlinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupLogging()
    }

    private fun setupLogging(){
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}