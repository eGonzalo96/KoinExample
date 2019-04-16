package com.example.android.koinexample.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.koinexample.domain.repositories.PhrasesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val repo : PhrasesRepository) : ViewModel() {

    private val _listOfPhrases= MutableLiveData<String>()
    val listOfPhrases: LiveData<String> = _listOfPhrases

    fun getNewPhrase() = GlobalScope.launch {
        val newPhrase = repo.getPhraseFromDb()

        withContext(Dispatchers.Main) {
            _listOfPhrases.postValue(newPhrase)
        }
    }

}