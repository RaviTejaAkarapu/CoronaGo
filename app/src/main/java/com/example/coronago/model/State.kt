package com.example.coronago.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class State(
    @PrimaryKey
    val stateName: String,
    val DistrictsCount: Int,
    val confirmedCount: Int,
    val activeCount: Int,
    val recoveredCount: Int,
    val deceasedCount: Int
)