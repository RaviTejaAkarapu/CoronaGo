package com.example.coronago.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Patient(
    @PrimaryKey
    val serialNo: Long,
    val cityName: String,
    val districtName: String,
    val patientStatus: String,
    val stateName: String,
    val countryName:String,
    val gender: String
)