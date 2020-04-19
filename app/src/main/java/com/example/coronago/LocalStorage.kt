package com.example.coronago

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

class LocalStorage(context: Context) {
    private lateinit var sharedPref: SharedPreferences

    fun LocalStorage(context: Context) {
        sharedPref = initialize(context)
    }

    fun LocalStorage(sharedPref: SharedPreferences) {
        this.sharedPref = sharedPref
    }

    private fun initialize(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}