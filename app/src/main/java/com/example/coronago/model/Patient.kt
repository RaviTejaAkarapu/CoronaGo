package com.example.coronago.model

import androidx.room.Entity

@Entity
data class Patient(
    val cityName: String,
    val districtName: String,
    val patientStatus: String,
    val stateName: String,
    val countryName:String,
    val gender: Gender
)

public enum class Gender(gender: String) {
    MALE("MALE"),
    FEMALE("FEMALE")
}