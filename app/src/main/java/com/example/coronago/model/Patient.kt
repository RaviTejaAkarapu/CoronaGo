package com.example.coronago.model

import androidx.room.Entity

@Entity
data class Patient(
    val cityName: String,
    val districtName: String,
    val patientStatus: String
)