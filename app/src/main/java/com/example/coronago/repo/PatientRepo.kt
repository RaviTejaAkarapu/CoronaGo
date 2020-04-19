package com.example.coronago.repo

import androidx.lifecycle.LiveData
import com.example.coronago.cache.PatientCache
import com.example.coronago.model.Patient
import com.example.coronago.remote.PatientRemote
import javax.inject.Inject

class PatientRepo @Inject constructor(
    private val patientRemote: PatientRemote,
    private val patientCache: PatientCache
) {
    //Cache data access methods
    fun insert(patient: Patient) {
        patientCache.insert(patient)
    }

    fun insertPatients(Patients: List<Patient>) {
        patientCache.insertPatients(Patients)
    }

    fun update(patient: Patient) {
        patientCache.update(patient)
    }

    fun delete(patient: Patient) {
        patientCache.delete(patient)
    }

    fun getAllPatientsList() = patientCache.getAllPatientsList()

    fun getAllPatientsLiveData(): LiveData<List<Patient>> = patientCache.getAllPatientsLiveData()

    fun getTotalNoOfPatients() = patientCache.getTotalNoOfPatients()

    //Remote data access methods
    fun fetchRemotePatients() = patientRemote.fetchRemotePatients()

}