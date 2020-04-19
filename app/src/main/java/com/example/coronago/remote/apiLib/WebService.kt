package com.example.coronago.remote.apiLib

import com.example.coronago.LocalStorage
import javax.inject.Inject

class WebService @Inject constructor(val apiService: ApiService, val localStorage: LocalStorage) {

    fun fetchRemotePatients() = apiService.getPatients()

    fun fetchDistrictWiseData() = apiService.getDistrictWiseData()

    fun fetchDeceasedAndRecovered() = apiService.getDeceasedAndRecovered()

    fun fetchTotalPatientsCount() = apiService.getTotalCount()
}