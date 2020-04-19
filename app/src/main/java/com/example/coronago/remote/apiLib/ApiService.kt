package com.example.coronago.remote.apiLib

import com.google.gson.JsonElement
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {

    @GET("https://api.covid19india.org/v2/state_district_wise.json")
    fun getPatients(): Observable<JsonElement>

    @GET("api endpoint goes here")
    fun getTotalCount(): Observable<JsonElement>

    @GET("api endpoint goes here")
    fun getDeceasedAndRecovered(): Observable<JsonElement>

    @GET("https://api.covid19india.org/v2/state_district_wise.json")
    fun getDistrictWiseData(): Observable<JsonElement>

    @GET("api endpoint goes here")
    fun getStateWiseData(): Observable<JsonElement>

}