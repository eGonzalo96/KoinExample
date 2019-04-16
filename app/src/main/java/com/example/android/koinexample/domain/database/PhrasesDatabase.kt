package com.example.android.koinexample.domain.database

import java.util.Random

//  Class used to emulate a remote access to data
class PhrasesDatabase {

    private var actualIndex = 0
    private val listOfPhrases = listOf(
        "Welcome to android!",
        "Hello, Kotlin!",
        "I am using Kotlin Coroutines!",
        "This is what being programmer means.",
        "I love algorithms.",
        "I am using Koin!",
        "I am using ViewModel!",
        "I am using LiveData!"
    )

    fun getSinglePhrase() : String {

        val random = Random()
        val randomNum = random.nextInt(listOfPhrases.size-1)

       return listOfPhrases[randomNum]
    }
}