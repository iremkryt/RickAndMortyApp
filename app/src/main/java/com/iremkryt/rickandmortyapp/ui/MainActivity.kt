package com.iremkryt.rickandmortyapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.iremkryt.rickandmortyapp.RickAndMortyApplication
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RickAndMortyApp()
        }
    }
}