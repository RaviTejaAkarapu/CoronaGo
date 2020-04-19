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

     var caseData: MutableLiveData<List<DummyModel>> = MutableLiveData()

    fun loadData(elsementId: String?)  {
        if (elsementId == null)
            caseData.postValue(DummyDataProvider.prepareDummyModelData())   // need to load countrywise data here
        else
            caseData.postValue(DummyDataProvider.prepareDummyModelData())  // need to load statewise data here
//        return DummyDataProvider.prepareDummyModelData()
    }

}