package com.example.android.koinexample.domain.repositories

import com.example.android.koinexample.domain.database.PhrasesDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PhrasesRepository(private val db : PhrasesDatabase) {

    suspend fun getPhraseFromDb() = withContext(Dispatchers.IO) {
        db.getSinglePhrase()
    }

}