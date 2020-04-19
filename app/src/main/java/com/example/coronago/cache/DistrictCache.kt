package com.example.coronago.cache

import androidx.lifecycle.LiveData
import com.example.coronago.AppDatabase
import com.example.coronago.dao.DistrictDao
import com.example.coronago.model.District

class DistrictCache(appDatabase: AppDatabase) {

    private val districtDao: DistrictDao = appDatabase.getDistrictDao()

    fun insert(district: District) {
        districtDao.insert(district)
    }

    fun insertCountries(Countries: List<District>) {
        districtDao.insertAll(Countries)
    }

    fun update(district: District) {
        districtDao.update(district)
    }

    fun delete(district: District) {
        districtDao.delete(district)
    }

    fun getAllCountriesList() = districtDao.getAllDistricts()

    fun getAllCountriesLiveData(): LiveData<List<District>> = districtDao.getAllDistrictsLD()

    fun getTotalNoOfCountries() = districtDao.getTotalNoOfDistrictsLD()

}