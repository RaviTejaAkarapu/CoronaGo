package com.example.coronago.dao

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import com.example.coronago.model.Patient

interface PatientDao {

    @Insert
    fun insert(patient: Patient)

    @Query("SELECT * FROM patient")
    fun getAllPatients(): List<Patient?>?

    @Query("SELECT * FROM patient")
    fun getAllPatientsLD(): LiveData<List<Patient?>?>?

    @Query("SELECT COUNT(*) FROM patient")
    fun getTotalNoOfPatientsLD(): LiveData<Int?>?

}