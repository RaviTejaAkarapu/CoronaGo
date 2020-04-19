package com.example.coronago.di.modules

import com.example.coronago.remote.CountryRemote
import com.example.coronago.remote.DistrictRemote
import com.example.coronago.remote.PatientRemote
import com.example.coronago.remote.StateRemote
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RemoteModule {

    @Singleton
    @Binds
    abstract fun bindPatientRemote(patientRemote: PatientRemote): PatientRemote

    @Singleton
    @Binds
    abstract fun bindDistrictRemote(districtRemote: DistrictRemote): DistrictRemote

    @Singleton
    @Binds
    abstract fun bindStateRemote(stateRemote: StateRemote): StateRemote

    @Singleton
    @Binds
    abstract fun bindCountryRemote(countryRemote: CountryRemote): CountryRemote

}