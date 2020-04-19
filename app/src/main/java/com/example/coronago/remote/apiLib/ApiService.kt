package com.example.coronago.remote.apiLib

import com.google.gson.JsonElement
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("api endpoint goes here")
    fun getPatients(): Observable<JsonElement>

    @GET("api endpoint goes here")
    fun getTotalCount(): Observable<JsonElement>

    @GET("api endpoint goes here")
    fun getDeceasedAndRecovered(): Observable<JsonElement>

    @GET("api endpoint goes here")
    fun getDistrictWiseData(): Observable<JsonElement>

}