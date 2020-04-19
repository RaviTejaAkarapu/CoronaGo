package com.example.coronago.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class District(
    @PrimaryKey
    val districtName: String,
    val confirmedCount: Int,
    val activeCount: Int,
    val recoveredCount: Int,
    val deceasedCount: Int
)