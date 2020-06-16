package com.example.frasesmotivadoras.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.frasesmotivadoras.R
import com.example.frasesmotivadoras.model.Phrase
import com.example.frasesmotivadoras.viewmodel.ViewModelPhrase

class PhraseActivity  : AppCompatActivity() {
    private lateinit var viewModelPhrase: ViewModelPhrase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrase)
        viewModelPhrase = ViewModelProviders.of(this).get(ViewModelPhrase::class.java)
        viewModelPhrase.setCamps(phrase = findViewById<TextView>(R.id.phrase_famous),
                thinker = findViewById<TextView>(R.id.writer_famous));}

}