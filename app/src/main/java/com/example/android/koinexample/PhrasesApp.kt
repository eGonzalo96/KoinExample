package com.example.android.koinexample

import android.app.Application
import com.example.android.koinexample.di.mainViewModel
import com.example.android.koinexample.di.phrasesDatabase
import com.example.android.koinexample.di.phrasesRepository
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class PhrasesApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@PhrasesApp)
            modules(phrasesDatabase, phrasesRepository, mainViewModel)
        }
    }
}
