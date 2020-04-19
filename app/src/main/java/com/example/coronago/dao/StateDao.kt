package com.example.coronago.dao

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import com.example.coronago.model.State

interface StateDao {
    
    @Insert
    fun insert(state: State)

    @Query("SELECT * FROM state")
    fun getAllStates(): List<State?>?

    @Query("SELECT * FROM state")
    fun getAllStatesLD(): LiveData<List<State?>?>?

    @Query("SELECT COUNT(*) FROM State")
    fun getTotalNoOfStatesLD(): LiveData<Int?>?
}