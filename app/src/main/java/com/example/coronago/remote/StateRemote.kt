package com.example.coronago.remote

import com.example.coronago.remote.apiLib.WebService
import javax.inject.Inject

class StateRemote @Inject constructor(private val webService: WebService) {

    fun fetchStateWiseData() = webService.fetchStateWiseData()

}