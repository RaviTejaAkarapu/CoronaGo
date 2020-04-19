package com.example.coronago.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.coronago.model.District

@Dao
interface DistrictDao {

    @Insert(onConflict = REPLACE)
    fun insert(district: District)

    @Query("SELECT * FROM district")
    fun getAllDistricts(): List<District>

    @Query("SELECT * FROM district")
    fun getAllDistrictsLD(): LiveData<List<District>>

    @Query("SELECT COUNT(*) FROM district")
    fun getTotalNoOfDistrictsLD(): LiveData<Int>

    @Insert(onConflict = REPLACE)
    fun insertAll(districts: List<District>)

    @Delete
    fun delete(district: District)

    @Update
    fun update(district: District)


}