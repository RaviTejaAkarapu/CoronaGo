package com.example.coronago.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.coronago.model.Country

@Dao
interface CountryDao {

    @Insert
    fun insert(country: Country)

    @Query("SELECT * FROM country")
    fun getAllCountries(): List<Country>

    @Query("SELECT * FROM country")
    fun getAllCountriesLD(): LiveData<List<Country>>

    @Query("SELECT COUNT(*) FROM country")
    fun getTotalNoOfCountriesLD(): LiveData<Int>

    @Insert
    fun insertAll(Countries: List<Country>)

    @Insert
    fun delete(country: Country)

    @Update
    fun update(country: Country)

}