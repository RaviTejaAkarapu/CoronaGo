package com.example.coronago.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.coronago.AppDatabase
import com.example.coronago.dummydata.DummyDataProvider
import com.example.coronago.dummydata.DummyModel
import com.example.coronago.repo.DistrictRepo
import java.text.FieldPosition
import javax.inject.Inject

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val districtRepo = DistrictRepo()

    fun loadData(position: Int) : List<DummyModel> {
        districtRepo.fetchDistrictWiseData()
        return DummyDataProvider.prepareDummyModelData()
    }

}