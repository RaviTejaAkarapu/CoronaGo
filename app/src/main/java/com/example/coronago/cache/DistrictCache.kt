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

    fun insertDistricts(Districts: List<District>) {
        districtDao.insertAll(Districts)
    }

    fun update(district: District) {
        districtDao.update(district)
    }

    fun delete(district: District) {
        districtDao.delete(district)
    }

    fun getAllDistrictsList() = districtDao.getAllDistricts()

    fun getAllDistrictsLiveData(): LiveData<List<District>> = districtDao.getAllDistrictsLD()

    fun getTotalNoOfDistricts() = districtDao.getTotalNoOfDistrictsLD()

}