package com.example.coronago.remote

import com.example.coronago.remote.apiLib.WebService
import javax.inject.Inject

class CountryRemote @Inject constructor(private val webService: WebService) {

    fun fetchDeceasedAndRecovered() = webService.fetchDeceasedAndRecovered()

}