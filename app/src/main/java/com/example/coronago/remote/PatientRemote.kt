package com.example.coronago.remote

import com.example.coronago.remote.apiLib.WebService
import javax.inject.Inject

class PatientRemote @Inject constructor(private val webService: WebService) {

    fun fetchRemotePatients() = webService.fetchRemotePatients()

}