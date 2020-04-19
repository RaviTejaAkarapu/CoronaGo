package com.example.coronago.remote.apiLib

import com.example.coronago.LocalStorage
import com.example.coronago.model.District
import com.google.gson.JsonElement
import io.reactivex.Observable
import javax.inject.Inject

class WebService @Inject constructor(val apiService: ApiService, val localStorage: LocalStorage) {

    fun fetchRemotePatients() = apiService.getPatients()

    fun fetchDistrictWiseData(): MutableList<District> {
        var distList = mutableListOf<District>()
        val result: Observable<JsonElement> = apiService.getDistrictWiseData()
        result.map {
            distList.addAll(ApiResponseMapper.toDistrictWiseData(it))
        }
        return distList
    }

    fun fetchStateWiseData() = apiService.getStateWiseData()

    fun fetchDeceasedAndRecovered() = apiService.getDeceasedAndRecovered()

    fun fetchTotalPatientsCount() = apiService.getTotalCount()
}