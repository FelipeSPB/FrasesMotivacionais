package com.example.frasesmotivadoras.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.frasesmotivadoras.R
import com.example.frasesmotivadoras.model.Phrase
import com.example.frasesmotivadoras.viewmodel.ViewModelPhrase
import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.activity_phrase.*

class PhraseActivity  : AppCompatActivity() {
    private lateinit var viewModelPhrase: ViewModelPhrase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrase)
        viewModelPhrase = ViewModelProviders.of(this).get(ViewModelPhrase::class.java)
        val phrase = findViewById<TextView>(R.id.phrase_famous)
        val thinker = findViewById<TextView>(R.id.writer_famous)
        viewModelPhrase.setCamps(phrase, thinker);
        button_share.setOnClickListener() {
            val sharePhrase: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "${phrase.text} \n \n                       ${thinker.text} \n \n${getString(R.string.share_phrase)}")
                type = "text/plain"

            }
            val shareIntent = Intent.createChooser(sharePhrase, "Compartilhe sua frase motivadora !")
            startActivity(shareIntent)
        }


    }



}


