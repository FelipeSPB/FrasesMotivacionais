package com.example.frasesmotivadoras.viewmodel

import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.Intent.*
import android.util.Log
import android.view.Gravity.apply
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.GravityCompat.apply
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.frasesmotivadoras.model.JSONRepository
import com.example.frasesmotivadoras.model.Phrase
import com.google.android.material.button.MaterialButton
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import android.view.Gravity.apply
import kotlin.random.Random.Default.nextInt

class ViewModelPhrase(application: Application): AndroidViewModel(application) {

    val context: Context = getApplication<Application>().applicationContext
    val repository: JSONRepository = JSONRepository(context)

    fun setCamps(phrase: TextView, thinker: TextView) {
        var len = repository.phrases.size
        var chosenPhrase = repository.phrases.get(nextInt(0, len))
        var phraseOfTheDay = chosenPhrase.phrase.toString()
        var thinkerOfTheDay = chosenPhrase.nameThinker.toString()
        phrase.text = phraseOfTheDay
        thinker.text = thinkerOfTheDay
    }

}





