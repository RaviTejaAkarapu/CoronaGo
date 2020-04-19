package com.example.coronago.di.modules

import com.example.coronago.ApplicationContext
import com.example.coronago.LocalStorage
import com.example.coronago.remote.CountryRemote
import com.example.coronago.remote.DistrictRemote
import com.example.coronago.remote.PatientRemote
import com.example.coronago.remote.StateRemote
import com.example.coronago.remote.apiLib.ApiServiceFactory
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class RemoteModule {

    @Singleton
    @Provides
    open fun provideApiService(localStorage: LocalStorage, applicationContext: ApplicationContext) =
        ApiServiceFactory.generateApiService(localStorage, applicationContext)

    @Binds
    abstract fun bindPatientRemote(patientRemote: PatientRemote): PatientRemote

    @Binds
    abstract fun bindDistrictRemote(districtRemote: DistrictRemote): DistrictRemote

    @Binds
    abstract fun bindStateRemote(stateRemote: StateRemote): StateRemote

    @Binds
    abstract fun bindCountryRemote(countryRemote: CountryRemote): CountryRemote
}