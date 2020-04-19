package com.example.coronago.dao

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import com.example.coronago.model.Country

interface CountryDao {

    @Insert
    fun insert(country: Country)

    @Query("SELECT * FROM country")
    fun getAllCountrys(): List<Country?>?

    @Query("SELECT * FROM country")
    fun getAllCountrysLD(): LiveData<List<Country?>?>?

    @Query("SELECT COUNT(*) FROM country")
    fun getTotalNoOfCountriesLD(): LiveData<Int?>?
}