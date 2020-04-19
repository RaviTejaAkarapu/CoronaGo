package com.example.coronago.di.modules

import com.example.coronago.cache.CountryCache
import com.example.coronago.cache.DistrictCache
import com.example.coronago.cache.PatientCache
import com.example.coronago.cache.StateCache
import dagger.Binds
import dagger.Module

@Module
abstract class CacheModule {

    @Binds
    abstract fun bindPatientCache(patientCache: PatientCache): PatientCache

    @Binds
    abstract fun bindDistrictCache(districtCache: DistrictCache): DistrictCache

    @Binds
    abstract fun bindStateCache(stateCache: StateCache): StateCache

    @Binds
    abstract fun bindCountryCache(countryCache: CountryCache): CountryCache
}