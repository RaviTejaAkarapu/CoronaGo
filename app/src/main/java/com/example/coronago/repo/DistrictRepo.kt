package com.example.coronago.repo

import androidx.lifecycle.LiveData
import com.example.coronago.cache.DistrictCache
import com.example.coronago.model.District
import com.example.coronago.remote.DistrictRemote
import javax.inject.Inject

class DistrictRepo @Inject constructor(
    private val districtRemote: DistrictRemote,
    private val districtCache: DistrictCache
) {
    //Cache data access methods
    fun insert(district: District) {
        districtCache.insert(district)
    }

    fun insertDistricts(Districts: List<District>) {
        districtCache.insertDistricts(Districts)
    }

    fun update(district: District) {
        districtCache.update(district)
    }

    fun delete(district: District) {
        districtCache.delete(district)
    }

    fun getAllDistrictsList() = districtCache.getAllDistrictsList()

    fun getAllDistrictsLiveData(): LiveData<List<District>> = districtCache.getAllDistrictsLiveData()

    fun getTotalNoOfDistricts() = districtCache.getTotalNoOfDistricts()

    //Remote data access methods
    fun fetchDistrictWiseData() = districtRemote.fetchDistrictWiseData()

}