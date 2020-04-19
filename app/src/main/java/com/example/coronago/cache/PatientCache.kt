package com.example.coronago.cache

import androidx.lifecycle.LiveData
import com.example.coronago.AppDatabase
import com.example.coronago.dao.PatientDao
import com.example.coronago.model.Patient

class PatientCache(appDatabase: AppDatabase) {

    private val patientDao: PatientDao = appDatabase.getPatientDao()

    fun insert(patient: Patient) {
        patientDao.insert(patient)
    }

    fun insertPatients(patients: List<Patient>) {
        patientDao.insertAll(patients)
    }

    fun update(Patient: Patient) {
        patientDao.update(Patient)
    }

    fun delete(Patient: Patient) {
        patientDao.delete(Patient)
    }

    fun getAllPatientsList() = patientDao.getAllPatients()

    fun getAllPatientsLiveData(): LiveData<List<Patient>> = patientDao.getAllPatientsLD()

    fun getTotalNoOfPatients() = patientDao.getTotalNoOfPatientsLD()

}