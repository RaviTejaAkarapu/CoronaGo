package com.example.coronago.remote

import com.example.coronago.remote.apiLib.WebService
import javax.inject.Inject

class DistrictRemote @Inject constructor(private val webService: WebService) {

    fun fetchDistrictWiseData() = webService.fetchDistrictWiseData()

}