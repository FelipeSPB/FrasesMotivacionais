package com.example.frasesmotivadoras.model

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.io.InputStream

class JSONRepository(context: Context) {

    fun getJSONFile(context: Context, fileName: String): String?{
        val json: String
        try{
            json = context.assets.open(fileName).bufferedReader().use{ it.readText()}
    } catch (ioException: IOException){
        ioException.printStackTrace()
        return null
        }
        return json
    }

    val jsonFile = getJSONFile(context,"phrase.json")
    val gson = Gson()
    var listPhrases = object: TypeToken<ArrayList<Phrase>>() {}.type
    var phrases : ArrayList<Phrase> = gson.fromJson(jsonFile,listPhrases)



}