package com.example.coronago.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.coronago.model.Patient

@Dao
interface PatientDao {

    @Insert
    fun insert(patient: Patient)

    @Query("SELECT * FROM patient")
    fun getAllPatients(): List<Patient>

    @Query("SELECT * FROM patient")
    fun getAllPatientsLD(): LiveData<List<Patient>>

    @Query("SELECT COUNT(*) FROM patient")
    fun getTotalNoOfPatientsLD(): LiveData<Int>

    @Insert
    fun insertAll(patients: List<Patient>)

    @Insert
    fun delete(patient: Patient)

    @Update
    fun update(patient: Patient)

}