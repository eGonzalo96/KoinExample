package com.example.android.koinexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.android.koinexample.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val mainViewModel : MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainViewModel.listOfPhrases.observe(this, Observer {
            Snackbar.make(mainTextView,
                "Text just changed to: $it",
                Snackbar.LENGTH_SHORT).show()
            mainTextView.text = it
        })

        mainTextView.setOnClickListener {
            mainViewModel.getNewPhrase()
        }

    }
}
