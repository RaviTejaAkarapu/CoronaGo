package com.example.coronago.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    fun testmethod() {
        Log.d("MainActivityViewModel", "method called")
    }

}