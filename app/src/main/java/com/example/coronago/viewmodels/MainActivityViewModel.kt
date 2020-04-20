package com.example.coronago.viewmodels

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coronago.dummydata.DummyDataProvider
import com.example.coronago.dummydata.DummyModel
import com.example.coronago.repo.CountryRepo
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    private val countryRepo: CountryRepo
) : ViewModel() {

    var caseData: MutableLiveData<List<DummyModel>> = MutableLiveData()
    fun loadData(elsementId: String?)  {
        val count = countryRepo.getTotalNoOfCountries()
        if (elsementId == null)
            caseData.postValue(DummyDataProvider.prepareDummyModelData())   // need to load countrywise data here
        else
            caseData.postValue(DummyDataProvider.prepareDummyModelData())  // need to load statewise data here
//        return DummyDataProvider.prepareDummyModelData()
    }

}