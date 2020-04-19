package com.example.coronago.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.coronago.dummydata.DummyDataProvider
import com.example.coronago.dummydata.DummyModel
import java.text.FieldPosition

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    fun loadData(position: Int) : List<DummyModel> {
        return DummyDataProvider.prepareDummyModelData()
    }

}