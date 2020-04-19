package com.example.coronago.dao

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import com.example.coronago.model.District

interface DistrictDao {
    
    @Insert
    fun insert(district: District)

    @Query("SELECT * FROM district")
    fun getAllDistricts(): List<District?>?

    @Query("SELECT * FROM district")
    fun getAllDistrictsLD(): LiveData<List<District?>?>?

    @Query("SELECT COUNT(*) FROM district")
    fun getTotalNoOfDistrictsLD(): LiveData<Int?>?

}