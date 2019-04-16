package com.example.android.koinexample.di

import com.example.android.koinexample.domain.database.PhrasesDatabase
import com.example.android.koinexample.domain.repositories.PhrasesRepository
import com.example.android.koinexample.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val phrasesDatabase = module {
    single { PhrasesDatabase() }
}

val phrasesRepository = module {
    single { PhrasesRepository(get()) }
}

val mainViewModel = module {
    viewModel { MainViewModel(get()) }
}