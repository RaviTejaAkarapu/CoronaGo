package com.example.coronago.di.modules

import com.example.coronago.repo.CountryRepo
import com.example.coronago.repo.DistrictRepo
import com.example.coronago.repo.PatientRepo
import com.example.coronago.repo.StateRepo
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun bindPatientRepo(patientRepo: PatientRepo): PatientRepo

    @Binds
    abstract fun bindDistrictRepo(districtRepo: DistrictRepo): DistrictRepo

    @Binds
    abstract fun bindStateRepo(stateRepo: StateRepo): StateRepo

    @Binds
    abstract fun bindCountryRepo(countryRepo: CountryRepo): CountryRepo
}
