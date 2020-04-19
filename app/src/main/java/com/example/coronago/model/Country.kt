package com.example.coronago.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Country(
    @PrimaryKey
    val countryName: String,
    val statesCount: Int,
    val confirmedCount: Int,
    val activeCount: Int,
    val recoveredCount: Int,
    val deceasedCount: Int
)